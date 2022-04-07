package practica12.dominio;

import java.awt.image.BufferedImage;

public class Circulo extends Figura
{
	//Todos los círculos tendrán la misma imagen de logo.
	public static BufferedImage icono;
	private int radio;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	public Circulo(int x, int y, boolean relleno, java.awt.Color color, int radio)
	{
		super(x, y, relleno, color);
		this.setRadio(radio);
	}

	public void setRadio(int radio) 
	{
		this.radio = Math.abs(radio);
	}

	@Override
	public void setDimension(int dimension)
	{
		this.setRadio(dimension);
	}		

	public int getRadio()
	{
		return radio;
	}

	 @Override
	public void pintar(java.awt.Graphics g)
	{
		if(visible)
		{
			super.pintar(g);
			if(relleno)
				g.fillOval(x, y, radio, radio); 
			else
				g.drawOval(x, y, radio, radio); 

			try
			{
				if(this.icono==null)
				{
					java.net.URL urlImagen = this.getClass().getResource("/imagenes/iconoCirculo.jpg");
					//Icon img = new ImageIcon(urlImagen); //Este objeto que le pasamos a las JLabel, no es una Image, es un Icon.
					icono = javax.imageio.ImageIO.read(urlImagen);
				}
				g.drawImage(icono, (int) (x+(radio/2-(icono.getWidth()/2))), (int)(y+(radio/2-(icono.getHeight()/2))), null);		
			}
			catch(java.io.IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toCSV()
	{
		return "Circulo, " + super.toCSV() + radio;
	}	

}