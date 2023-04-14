package practica08.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import practica08.dominio.Circulo;
import practica08.dominio.Cuadrado;
import practica08.dominio.Dibujo;
import practica08.dominio.Figura;

public class JVentanaDibujo extends JFrame
{
	public static int FPS = 60;

	private Dibujo dibujo;
	private Lienzo lienzo;

	private Cuadrado nave;

	JButton btnPlay;
	JButton btnGenerarEnemigo;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		btnPlay = new JButton("Play");
		btnGenerarEnemigo = new JButton("Generar enemigo");
		
		btnPlay.addActionListener(evento -> JVentanaDibujo.this.play());
		btnGenerarEnemigo.addActionListener(evento -> JVentanaDibujo.this.generarEnemigos());

        pnlNorte.add(btnPlay);
		pnlNorte.add(btnGenerarEnemigo);

        this.add(pnlNorte, BorderLayout.NORTH);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
			
		nave = new Cuadrado(500, 250, true, Color.BLUE, 25);
		dibujo.pintar(Dibujo.NAVE, nave);

		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("Juego");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");

		lblMensaje1.setHorizontalAlignment(JLabel.CENTER);
		lblMensaje1.setFont(new Font("Arial", Font.BOLD, 20));
		lblMensaje1.setForeground(new Color(255, 0, 0));
		lblMensaje1.setForeground(Color.RED);

		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);

		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void play() 
	{
		/* 
		Thread hilo = new Thread(new Runnable() {
			@Override
			public void run()
			{
				JVentanaDibujo.this.animacion();
			}
		});
		hilo.start();
		*/

		btnGenerarEnemigo.setEnabled(false);
		btnPlay.setEnabled(false);
		//Interface Funcional:
		new Thread(() -> JVentanaDibujo.this.animacion()).start();
		lienzo.requestFocus();
	}


	public void animacion()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000/FPS);
				for(Figura enemigo : dibujo.getEnemigos())
				{
					enemigo.moverDrcha();
					//nave.insersect(enemigo);
				}

				lienzo.repaint();
			}
			catch(InterruptedException e)
			{

			}
		}
			
	}

	private void generarEnemigos() 
	{
		int x = (int) (Math.random()*Lienzo.ANCHO);
		int y = (int) (Math.random()*Lienzo.ALTO);
		dibujo.pintar(Dibujo.ENEMIGOS, new Circulo(x, y, true, Color.RED, 15));
		lienzo.repaint();
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

	public Cuadrado getNave() 
	{
        return nave;
    }
}