package practica07.dominio;

public abstract class Figura
{
	public static final int X_MIN = 1; 
	public static final int X_MAX = 800; 
	public static final int Y_MIN = 1; 
	public static final int Y_MAX = 600; 

	protected int x;
	protected int y;
	protected boolean relleno;
	private java.awt.Color color;

	private boolean visible = true;

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
		if(x >= X_MIN && x <= X_MAX)
			this.x = x;
	}

	public void setY(int y)
	{
		if(y >= Y_MIN && y <= Y_MAX)
			this.y = y;
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

	public void pintar(java.awt.Graphics g)
	{
		g.setColor(color);
	}
}