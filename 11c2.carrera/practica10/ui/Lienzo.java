package practica10.ui;

import practica10.dominio.Figura;
import practica10.dominio.Circulo;
import practica10.dominio.Cuadrado;
import practica10.dominio.Dibujo;
import practica10.dominio.FiguraNoValidaException;

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

	private Figura figuraPintando;

	public Lienzo(JVentanaDibujo ventanaDibujo)
	{
		this.ventanaDibujo = ventanaDibujo;
		this.dibujo = ventanaDibujo.getDibujo();

		this.setBackground(Color.WHITE);
		this.setPreferredSize(new java.awt.Dimension(800, 600));
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		Collection<Figura> figuras = dibujo.getTodasFiguras();
		for(Figura figura:figuras)
			figura.pintar(g);
	}
}
