package practica12.ui;

import practica12.dominio.Figura;
import practica12.dominio.Circulo;
import practica12.dominio.Cuadrado;
import practica12.dominio.Dibujo;
import practica12.dominio.FiguraNoValidaException;

import practica12.util.RGBConversionException;
import practica12.util.Util;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Point;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JOptionPane;

import java.util.Collection;


public class Lienzo extends javax.swing.JPanel
{
	private JVentanaDibujo ventanaDibujo;
	private Dibujo dibujo;

	private Point puntoInicial;

	public Lienzo(JVentanaDibujo ventanaDibujo)
	{
		this.ventanaDibujo = ventanaDibujo;
		this.dibujo = ventanaDibujo.getDibujo();

		this.setBackground(Color.WHITE);
		this.setPreferredSize(new java.awt.Dimension(800, 600));
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent me)
				{
					Lienzo.this.gestionarEventoMouse(me);
				}
			});		
	}

	public void updateDibujo()
	{
		this.dibujo = ventanaDibujo.getDibujo();
		this.repaint();
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		Collection<Figura> figuras = dibujo.getTodasFiguras();
		for(Figura figura:figuras)
			figura.pintar(g);
	}

	private void gestionarEventoMouse(MouseEvent me)
	{
		try
		{
			Color color = ventanaDibujo.validarColores();
			if(puntoInicial == null)
			{
				puntoInicial = new Point(me.getX(), me.getY());
				Lienzo.this.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));						
			}
			else
			{
				Point puntoFinal = new Point(me.getX(), me.getY());
				int dimension = puntoFinal.x - puntoInicial.x;
				if(dimension<0)
				{
					puntoInicial = puntoFinal;
					dimension = Math.abs(dimension);
				}

				Figura figura = null;
				if(ventanaDibujo.getTipoFiguraAPintar()==JVentanaDibujo.TipoFiguras.CIRCULO)
					figura = new Circulo(puntoInicial.x, puntoInicial.y, true, color, dimension);	
				else
					figura = new Cuadrado(puntoInicial.x, puntoInicial.y, true, color, dimension);	

				dibujo.addFigura("Grupo Global", figura);
				Lienzo.this.repaint();
				puntoInicial = null;
				Lienzo.this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				ventanaDibujo.asignarColoresRandom();
			}
		}
		catch(NumberFormatException exc)
		{
			JOptionPane.showMessageDialog(Lienzo.this, "El color debe ser un número");
		}
		catch(RGBConversionException exc)
		{
			JOptionPane.showMessageDialog(Lienzo.this, exc.toString());	
		}
	}

}
