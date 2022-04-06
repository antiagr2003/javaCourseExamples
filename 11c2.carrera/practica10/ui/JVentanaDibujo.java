package practica10.ui;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import practica10.dominio.Figura;
import practica10.dominio.Circulo;
import practica10.dominio.Dibujo;

/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class JVentanaDibujo extends JFrame 
{
	private Dibujo dibujo;
	private Lienzo lienzo;


	//...lo siguiente:
	//public final static int FIGURA_CUADRADO = 1;
	//public final static int FIGURA_CIRCULO = 2;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint ICAI");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		JButton btnCarrera = new JButton("Comenzar carrera");

		btnCarrera.addActionListener(e ->
					{
						for(int i=1;i<5;i++)
						{
							Coche coche = new Coche(i, JVentanaDibujo.this);
							coche.start();
						}
					});

		pnlNorte.add(btnCarrera);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);

		pnlCentro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");
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

	public Lienzo getLienzo()
	{
		return lienzo;
	}	

}