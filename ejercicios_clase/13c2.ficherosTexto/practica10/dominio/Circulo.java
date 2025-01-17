package practica10.dominio;

public class Circulo extends Figura
{
	public static long serialVersionUID = 1L;
	public static final String TIPO_OBJETO = "circulo";

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
	public String toCSV()
	{
		return TIPO_OBJETO + ", " + super.toCSV() + ", " + radio ; 
	}

	@Override
	public String toString()
	{
		return "Círculo:\n" + "x: " + x + "y: " + y;
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
