package practica08.ui;

import practica08.dominio.Figura;
import practica08.dominio.Circulo;
import practica08.dominio.Dibujo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;

import javax.swing.JPanel;


public class Lienzo extends JPanel
{
	private JVentanaDibujo ventana;

	public Lienzo(JVentanaDibujo ventana)
	{
		this.ventana = ventana;

		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(800,600));
        this.setFocusable(true);
		this.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent e)
				{
					System.out.println(e.getX() + ", " + e.getY());
				}
			});

		this.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				Circulo circulo = ventana.getCirculo();
				if(e.getKeyCode() == 37)
					circulo.moverIzda();
				else if(e.getKeyCode() == 39)
					circulo.moverDrcha();

				Lienzo.this.repaint();
			}
		});
	}


	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
		Dibujo dibujo = ventana.getDibujo();
		Collection<Figura> figuras = dibujo.getTodasFiguras();
		for(Figura figura:figuras)
			figura.pintar(g);
	}
}
