package practica08.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Color;
import java.awt.Cursor;
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

	private int x1=-1;
	private int y1=-1;

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
		lienzo.setForeground(Color.WHITE);
		lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		lienzo.setSize(800,600);
		lienzo.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent e)
				{
					System.out.println(e.getX() + ", " + e.getY());
					int x2;
					int y2;

					if(x1 == -1 && y1 == -1)
					{
						x1 = e.getX();
						y1 = e.getY();
					}
					else
					{
						x2 = e.getX();
						y2 = e.getY();
						int lado = Math.abs(x2-x1);
						dibujo.pintar("Grupo Rojo", new Cuadrado(x1, y1, true, Color.RED, lado));
						lienzo.repaint();						
						x1 = -1;
						y1 = -1;
					}
				}
			});

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
		
	
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

}