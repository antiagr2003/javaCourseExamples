package practica13.ui;

import practica13.dominio.Figura;
import practica13.dominio.Dibujo;

import java.awt.Canvas;
import java.awt.Graphics;

import java.util.Collection;


public class Lienzo extends Canvas
{
	private JVentanaDibujo ventana;

	public Lienzo(JVentanaDibujo ventana)
	{
		this.ventana = ventana;
	}

	@Override
	public void paint(Graphics g)
	{
		Dibujo dibujo = ventana.getDibujo();
		Collection<Figura> figuras = dibujo.getTodasFiguras();
		for(Figura figura:figuras)
			figura.pintar(g);
	}
}
