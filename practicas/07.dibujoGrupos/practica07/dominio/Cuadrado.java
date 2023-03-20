package practica07.dominio;

public class Cuadrado extends Figura
{ 
	public static final int LADO_MIN = 2; 
	public static final int LADO_MAX = 600; 

	private int lado;

	/** 
		Inicializa todos los atributos del objeto 
		@param lado Tamaño del cuadrado en pixels
	*/
	public Cuadrado(int x, int y, boolean relleno, java.awt.Color color, int lado)
	{
		super(x, y, relleno, color);
		this.setLado(lado);
	}

	public void setLado(int lado)
	{
		if(x >= LADO_MIN && x < LADO_MAX)
			this.lado = lado;
		else
			this.lado = LADO_MIN;
	}

	public int getLado()
	{
		return lado;
	}

	@Override
	public void pintar(java.awt.Graphics g)
	{
		super.pintar(g);
		if(relleno)
			g.fillRect(x, y, lado, lado); 
		else
			g.drawRect(x, y, lado, lado); 
	}
}