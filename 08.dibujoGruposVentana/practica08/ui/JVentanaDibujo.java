package practica08.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import practica08.dominio.Figura;
import practica08.dominio.Circulo;
import practica08.dominio.Cuadrado;
import practica08.dominio.Dibujo;

import practica08.util.Util;


/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint 2018");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		JTextField txtX = new JTextField("30", 4);
		JTextField txtY = new JTextField("30", 4);
		JTextField txtLadoRadio = new JTextField("200", 4);
		pnlNorte.add(new JLabel("x:"));
		pnlNorte.add(txtX);
		pnlNorte.add(new JLabel("y:"));
		pnlNorte.add(txtY);
		pnlNorte.add(new JLabel("lado/radio:"));
		pnlNorte.add(txtLadoRadio);		
		pnlNorte.add(new JButton("Círculo"));
		pnlNorte.add(new JButton("Cuadrado"));

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
		lienzo.setSize(800,600);
		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint 2018");
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

		//Se inicializa la aplicación con un dibujo estático ya que no tenemos gestión de eventos.
		this.initDibujo();
	}


	private void initDibujo()
	{
		Cuadrado c1 = new Cuadrado(500, 50, true, Color.RED, 200);		
		dibujo.pintar("Grupo Rojo", c1);
		lienzo.repaint();
		Util.wait(0.4);
		dibujo.pintar("Grupo Rojo", new Circulo(100, 20, true, Color.RED, 200));
		lienzo.repaint();
		Util.wait(0.4);
		dibujo.pintar("Grupo Azul", new Cuadrado(100, 350, false, Color.BLUE, 200));
		lienzo.repaint();
		Util.wait(0.4);
		dibujo.pintar("Grupo Azul", new Circulo(500, 350, true, Color.BLUE, 200));
		lienzo.repaint();
		Util.wait(0.4);
		dibujo.pintar("Grupo Verde", new Cuadrado(10, 10, true, Color.GREEN, 70));
		lienzo.repaint();

		Util.wait(0.7);
		dibujo.setVisibleGrupo("Grupo Azul", false);
		lienzo.repaint();
		Util.wait(0.7);
		dibujo.setVisibleGrupo("Grupo Rojo", false);
		lienzo.repaint();
		Util.wait(0.7);
		dibujo.setVisibleGrupo("Grupo Verde", false);
		lienzo.repaint();
		Util.wait(0.7);

		dibujo.setVisibleTodasFiguras(true);		
		lienzo.repaint();
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

}