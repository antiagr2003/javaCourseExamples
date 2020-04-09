package practica10.ui;

import practica10.dominio.Figura;
import practica10.dominio.Dibujo;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.*;

import java.util.Collection;


public class Lienzo extends javax.swing.JPanel
{
	private JVentanaDibujo ventana;

	public Lienzo(JVentanaDibujo ventana)
	{
		this.ventana = ventana;
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		Dibujo dibujo = ventana.getDibujo();
		Collection<Figura> figuras = dibujo.getTodasFiguras();
		for(Figura figura:figuras)
			figura.pintar(g);
	}
}
