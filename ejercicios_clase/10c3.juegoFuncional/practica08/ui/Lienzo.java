package practica08.ui;

import practica08.dominio.Circulo;
import practica08.dominio.Dibujo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_LEFT -> circulo.moverIzda();
					case KeyEvent.VK_RIGHT -> circulo.moverDrcha();
					case KeyEvent.VK_UP -> circulo.moverArriba();
					case KeyEvent.VK_DOWN -> circulo.moverAbajo();
					case KeyEvent.VK_Z -> circulo.rotar(-1);
					case KeyEvent.VK_X -> circulo.rotar(1);
				}
				Lienzo.this.repaint();
			}
		});
	}


	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        //Graphics2D g2d = (Graphics2D) g;
		Dibujo dibujo = ventana.getDibujo();
		dibujo.pintar(g);
	}
}
