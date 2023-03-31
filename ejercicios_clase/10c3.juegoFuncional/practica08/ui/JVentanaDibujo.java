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
import practica08.dominio.Dibujo;

public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private Circulo circulo;

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
		JButton btnPlay = new JButton("Play");
		
		btnPlay.addActionListener(evento -> lienzo.requestFocus());
        pnlNorte.add(btnPlay);

        this.add(pnlNorte, BorderLayout.NORTH);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
			
		circulo = new Circulo(40, 40, true, Color.BLUE, 25);
		dibujo.pintar("A", circulo);

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

	public Dibujo getDibujo()
	{
		return dibujo;
	}

	public Circulo getCirculo() 
	{
        return circulo;
    }
}