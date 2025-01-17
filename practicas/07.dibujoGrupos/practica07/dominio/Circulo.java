package practica07.dominio;

public class Circulo extends Figura
{
	public static final int RADIO_MIN = 2; 
	public static final int RADIO_MAX = 600; 
	
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
		if(x > RADIO_MIN && x < RADIO_MAX)
			this.radio = radio;
		else
			this.radio = RADIO_MIN;
	}

	public int getRadio()
	{
		return radio;
	}

	 @Override
	public void pintar(java.awt.Graphics g)
	{
		super.pintar(g);
		if(relleno)
			g.fillOval(x, y, radio, radio); 
		else
			g.drawOval(x, y, radio, radio); 
	}

}