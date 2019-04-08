package practica08.dominio;

public class Cuadrado extends Figura
{ 
	private int lado;

	/** 
		Inicializa todos los atributos del objeto 
		@param lado Tamaño del cuadrado en pixels
	*/
	public Cuadrado(int x, int y, boolean relleno, java.awt.Color color, int lado) throws FiguraNoValidaException
	{
		super(x, y, relleno, color);
		this.setLado(lado);
	}

	public void setLado(int lado) throws FiguraNoValidaException
	{
		if(lado > 10)
			this.lado = lado;
		else
			throw new FiguraNoValidaException(lado, "Lado");
	}

	public int getLado()
	{
		return lado;
	}

	@Override
	public void pintar(java.awt.Graphics g)
	{
		if(visible)
		{
			super.pintar(g);
			if(relleno)
				g.fillRect(x, y, lado, lado); 
			else
				g.drawRect(x, y, lado, lado); 
		}
	}
}