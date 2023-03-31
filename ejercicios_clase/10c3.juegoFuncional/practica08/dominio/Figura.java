package practica08.dominio;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Figura
{
	public static final int OFFSET = 5;

	protected int x;
	protected int y;
	protected boolean relleno;
	private java.awt.Color color;

	private int rotacion = 0;

	private Image imagen;

	protected boolean visible = true;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param relleno Lo pinta transparente u opaco
		@param color Color de la figura
		
	*/
	public Figura(int x, int y, boolean relleno, java.awt.Color color)
	{
		this.setX(x);
		this.setY(y);
		this.relleno = relleno;
		this.color = color;
        this.loadImage();
    }

    protected void loadImage()
    {
        java.io.File file = new java.io.File("imagen.jpg");
        if(!file.exists())
            System.out.println("No se encontró el fichero: " + file);
        imagen = new ImageIcon("imagen.jpg").getImage();
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int x)
	{
		if(x > 0 && x < 800)
			this.x = x;
	}

	public void setY(int y)
	{
		if(y > 0 && y < 600)
			this.y = y;
	}

	public void moverIzda()
	{
		this.setX(x - OFFSET);
	}

	public void moverDrcha()
	{
		this.setX(x + OFFSET);
	}

	public void moverArriba()
	{
		this.setY(y - OFFSET);
	}

	public void moverAbajo()
	{
		this.setY(y + OFFSET);
	}

	public void setRelleno(boolean relleno)
	{
		this.relleno = relleno;
	}

	public boolean getRelleno()
	{
		return relleno;
	}

	public void setColor(java.awt.Color color)
	{
		this.color = color;
	}

	public java.awt.Color getColor()
	{
		return color;
	}	

	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}

	public boolean isVisible()
	{
		return visible;
	}

	public void rotar(int grados)
	{
		rotacion += grados; 
	}

	public void pintar(java.awt.Graphics g)
	{
		g.setColor(color);
		Graphics2D g2d = (Graphics2D) g;
		g2d.rotate(Math.toRadians(rotacion), x, y);
        g2d.drawImage(imagen, x, y, null);
	}
}