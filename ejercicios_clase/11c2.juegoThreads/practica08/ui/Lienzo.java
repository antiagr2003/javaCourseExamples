package practica08.ui;

import practica08.dominio.Cuadrado;
import practica08.dominio.Dibujo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Lienzo extends JPanel
{
	public static final int ANCHO = 800;
	public static final int ALTO = 600;

	private JVentanaDibujo ventana;

	public Lienzo(JVentanaDibujo ventana)
	{
		this.ventana = ventana;

		//this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(ANCHO, ALTO));
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
				Cuadrado nave = ventana.getNave();
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_LEFT -> nave.moverIzda();
					case KeyEvent.VK_RIGHT -> nave.moverDrcha();
					case KeyEvent.VK_UP -> nave.moverArriba();
					case KeyEvent.VK_DOWN -> nave.moverAbajo();
					case KeyEvent.VK_Z -> nave.rotar(-1);
					case KeyEvent.VK_X -> nave.rotar(1);
				}
	
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
		/*this.setLayout(null);
		JButton btn = new JButton("Botón");
		btn.setBounds(10, 10, 100, 30);
		this.add(btn);*/
	}
}
