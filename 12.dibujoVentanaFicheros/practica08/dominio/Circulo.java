package practica08.dominio;

public class Circulo extends Figura implements java.io.Serializable
{
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
		if(radio > 10)
			this.radio = radio;
		else
			this.radio = 10;
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
		}
	}

}