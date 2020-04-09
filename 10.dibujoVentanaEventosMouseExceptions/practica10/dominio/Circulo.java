package practica10.dominio;

public class Circulo extends Figura
{
	private int radio;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	public Circulo(int x, int y, boolean relleno, java.awt.Color color, int radio) throws FiguraNoValidaException
	{
		super(x, y, relleno, color);
		this.setRadio(radio);
	}

	public void setRadio(int radio) throws FiguraNoValidaException
	{
		if(radio > 10)
			this.radio = radio;
		else
			throw new FiguraNoValidaException(radio, "Radio");
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