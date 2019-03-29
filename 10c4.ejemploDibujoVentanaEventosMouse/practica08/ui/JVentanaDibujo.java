package practica08.ui;

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

	private JButton btnCirculo;
	private JButton btnCuadrado;

	private int x = -1;
	private int y = -1;

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
		/*JTextField txtX = new JTextField("30", 4);
		JTextField txtY = new JTextField("30", 4);
		JTextField txtLadoRadio = new JTextField("200", 4);
		pnlNorte.add(new JLabel("x:"));
		pnlNorte.add(txtX);
		pnlNorte.add(new JLabel("y:"));
		pnlNorte.add(txtY);
		pnlNorte.add(new JLabel("lado/radio:"));
		pnlNorte.add(txtLadoRadio);		
	*/
		btnCirculo = new JButton("Círculo");
		btnCirculo.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					/*int lado = Integer.parseInt(txtLadoRadio.getText());
					int x = Integer.parseInt(txtX.getText());
					int y = Integer.parseInt(txtY.getText());
					Circulo c = new Circulo(x, y, true, Color.RED, lado);		
					dibujo.pintar("Grupo Rojo", c);
					lienzo.repaint();*/
				}
			});




		btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					btnCuadrado.setEnabled(false);
					btnCirculo.setEnabled(false);

					lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

					lienzo.addMouseListener(new MouseAdapter()
					{
						//Ejemplo con clicked: no tan suave

						/*@Override
						public void mouseClicked(MouseEvent me)
						{
							if(x==-1 && y==-1)
							{
								x = me.getX();
								y = me.getY();
							}
							else
							{
								int lado = me.getX()-x;
								Cuadrado c = new Cuadrado(x, y, true, Color.RED, lado);	
								dibujo.pintar("Grupo Rojo", c);
								lienzo.repaint();
								lienzo.removeMouseListener(this);		
								btnCuadrado.setEnabled(true);
								x = -1;
								y = -1;		
								lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));				
							}

							
						}*/

						//Ejemplo con presión y liberación del ratón
						@Override
						public void mousePressed(MouseEvent me)
						{
							if(x==-1 && y==-1)
							{
								x = me.getX();
								y = me.getY();
							}
						}

						@Override
						public void mouseReleased(MouseEvent me)
						{
							int lado = me.getX()-x;
							Cuadrado c = new Cuadrado(x, y, true, Color.RED, lado);	
							dibujo.pintar("Grupo Rojo", c);
							lienzo.repaint();
							lienzo.removeMouseListener(this);		
							btnCuadrado.setEnabled(true);
							x = -1;
							y = -1;		
							lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));				
						}						
					});

					/*int lado = Integer.parseInt(txtLadoRadio.getText());
					int x = Integer.parseInt(txtX.getText());
					int y = Integer.parseInt(txtY.getText());
					*/
					
					//Cuadrado c = new Cuadrado(x, y, true, Color.RED, lado);		

				}
			});
		pnlNorte.add(btnCirculo);
		pnlNorte.add(btnCuadrado);

		JPanel pnlCentro = new JPanel(new FlowLayout(FlowLayout.CENTER, 0,0));
		//pnlCentro.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK));
		//pnlCentro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
		lienzo = new Lienzo(this);
		lienzo.setSize(800,600);
		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint 2018");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");
		//JLabel lblMensaje3 = new JLabel("por David Contreras", JLabel.RIGHT);
		//lblMensaje3.setFont(new java.awt.Font("Arial", java.awt.Font.ITALIC, 12));
		//lblMensaje3.setForeground(Color.GRAY);
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);
		
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

}