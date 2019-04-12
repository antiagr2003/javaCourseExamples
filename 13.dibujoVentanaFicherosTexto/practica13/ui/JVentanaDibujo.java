package practica13.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import practica13.dominio.Figura;
import practica13.dominio.Circulo;
import practica13.dominio.Cuadrado;
import practica13.dominio.Dibujo;
import practica13.dominio.FiguraNoValidaException;

import practica13.util.RGBConversionException;
import practica13.util.Util;

import practica13.io.IODibujo;


/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private JButton btnCirculo;
	private JButton btnCuadrado;

	private JPanel pnlNorteColor;

	private JTextField txtR;
	private JTextField txtG;
	private JTextField txtB;

	private int xInicial = 0;
	private int yInicial = 0;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint 2018");

		this.dibujo = IODibujo.leer();
		if(this.dibujo==null)
			this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		txtR = new JTextField(3);
		txtG = new JTextField(3);
		txtB = new JTextField(3);

		this.asignarColoresRandom();


		pnlNorteColor = new JPanel(new FlowLayout());
		pnlNorteColor.add(new JLabel("Rojo:"));
		pnlNorteColor.add(txtR);
		pnlNorteColor.add(new JLabel("Verde:"));
		pnlNorteColor.add(txtG);
		pnlNorteColor.add(new JLabel("Azul:"));
		pnlNorteColor.add(txtB);
		pnlNorteColor.setVisible(false);

		btnCirculo = new JButton("Círculo", new ImageIcon("images/circulo.jpg"));
		btnCirculo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					btnCirculo.setEnabled(false);
					btnCuadrado.setEnabled(false);

					Color color = JVentanaDibujo.this.validarColores();

					lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

					lienzo.addMouseListener(new MouseAdapter()
					{
						public void mousePressed(MouseEvent me)
						{
							if(xInicial==0 && yInicial ==0)
							{
								JVentanaDibujo.this.inicializarCreacionFigura(me);						
							}
							else
							{
								int x = me.getX();
								int y = me.getY();
								//System.out.println("x:" + xInicial + "y:" + yInicial + "dif:" + (x - xInicial) );
								int radio = x - xInicial;
								Circulo c = new Circulo(xInicial, yInicial, true, color, radio);	
								JVentanaDibujo.this.pintarFigura(c, this);	
							}
						}
					});
				}
				catch(NumberFormatException exc)
				{
					JOptionPane.showMessageDialog(JVentanaDibujo.this, "El color debe ser un número");
				}
				catch(RGBConversionException exc)
				{
					JOptionPane.showMessageDialog(JVentanaDibujo.this, exc.toString());	
				}
			}	
		});

		btnCuadrado = new JButton("Cuadrado", new ImageIcon("images/cuadrado.jpg"));
		btnCuadrado.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					btnCirculo.setEnabled(false);
					btnCuadrado.setEnabled(false);

					Color color = JVentanaDibujo.this.validarColores();

					lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

					lienzo.addMouseListener(new MouseAdapter()
					{
						public void mousePressed(MouseEvent me)
						{
							if(xInicial==0 && yInicial ==0)
							{
								JVentanaDibujo.this.inicializarCreacionFigura(me);
							}
							else
							{
								int x = me.getX();
								int y = me.getY();
								//System.out.println("x:" + xInicial + "y:" + yInicial + "dif:" + (x - xInicial) );
								int lado = x - xInicial;
								try
								{
									Cuadrado c = new Cuadrado(xInicial, yInicial, true, color, lado);	
									JVentanaDibujo.this.pintarFigura(c, this);		
								}
								catch(FiguraNoValidaException e)
								{
									JOptionPane.showMessageDialog(JVentanaDibujo.this, e.toString());
									xInicial = 0;
									yInicial= 0;
									lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
								}
							}
						}
					});
				}
				catch(NumberFormatException exc)
				{
					JOptionPane.showMessageDialog(JVentanaDibujo.this, "El color debe ser un número");
				}
				catch(RGBConversionException exc)
				{
					JOptionPane.showMessageDialog(JVentanaDibujo.this, exc.toString());	
				}
			}
		});

		pnlNorte.add(pnlNorteColor);
		JButton btnColor = new JButton(new ImageIcon("images/colores.jpg"));
		btnColor.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(pnlNorteColor.isVisible())
					pnlNorteColor.setVisible(false);
				else
					pnlNorteColor.setVisible(true);
			}
		});
		
		pnlNorte.add(btnColor);
		pnlNorte.add(btnCirculo);
		pnlNorte.add(btnCuadrado);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
		lienzo.setBackground(Color.WHITE);
		lienzo.setSize(800,600);
		pnlCentro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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

		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				IODibujo.guardar(dibujo);
				IODibujo.exportarATexto(dibujo);
				try
				{
					Runtime.getRuntime().exec("cmd /c " + dibujo.getNombre() + ".html");
				}
				catch(java.io.IOException exc)
				{
					System.out.println("No se pudo iniciar el navegador");
				}
				
				System.exit(0);
			}
		});
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);

	}

	private void pintarFigura(Figura f, MouseListener ml)
	{
		dibujo.pintar("Grupo Rojo", f);
		lienzo.repaint();
		lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		lienzo.removeMouseListener(ml);
		xInicial = 0;
		yInicial = 0;
		this.asignarColoresRandom();
		btnCirculo.setEnabled(true);
		btnCuadrado.setEnabled(true);
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

	public Color validarColores() throws NumberFormatException, RGBConversionException
	{
		int r = Integer.parseInt(txtR.getText());
		int g = Integer.parseInt(txtG.getText());
		int b = Integer.parseInt(txtB.getText());
		return Util.rgbToColor(r, g, b);							
	}

	public void inicializarCreacionFigura(MouseEvent me)
	{
		xInicial = me.getX();
		yInicial= me.getY();
		lienzo.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
	}

	private void asignarColoresRandom()
	{
		txtR.setText(String.valueOf(Util.getColorRGBRandom()));
		txtG.setText(String.valueOf(Util.getColorRGBRandom()));
		txtB.setText(String.valueOf(Util.getColorRGBRandom()));
	}

}