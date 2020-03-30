package practica09.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;

import practica09.dominio.Figura;
import practica09.dominio.Circulo;
import practica09.dominio.Cuadrado;
import practica09.dominio.Dibujo;

import practica09.util.Util;


/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private JButton btnCirculo;
	private JButton btnCuadrado;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint 2018");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		//
		// Creación de los Paneles
		//

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

		btnCirculo = new JButton("Círculo");
		btnCuadrado = new JButton("Cuadrado");
		
		pnlNorte.add(btnCirculo);
		pnlNorte.add(btnCuadrado);

		// ----------

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
		lienzo.setSize(800,600);
		pnlCentro.add(lienzo);

		// ----------

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint 2018");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		//
		// Gestión de Eventos
		//

		btnCirculo.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					int lado = Integer.parseInt(txtLadoRadio.getText());
					int x = Integer.parseInt(txtX.getText());
					int y = Integer.parseInt(txtY.getText());
					Circulo c = new Circulo(x, y, true, Color.RED, lado);		
					dibujo.addFigura("Grupo Rojo", c);
					lienzo.repaint();
				}
			});

		btnCuadrado.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					int lado = Integer.parseInt(txtLadoRadio.getText());
					int x = Integer.parseInt(txtX.getText());
					int y = Integer.parseInt(txtY.getText());
					Cuadrado c = new Cuadrado(x, y, true, Color.RED, lado);		
					dibujo.addFigura("Grupo Rojo", c);
					lienzo.repaint();
				}
			});

		//
		// Composición y personalización de la Ventana
		//

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

}