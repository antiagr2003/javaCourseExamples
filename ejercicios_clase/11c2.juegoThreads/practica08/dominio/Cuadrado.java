package practica08.dominio;

public class Cuadrado extends Figura
{ 
	private int lado;

	/** 
		Inicializa todos los atributos del objeto 
		@param lado Tamaño del cuadrado en pixels
	*/
	public Cuadrado(int x, int y, boolean relleno, java.awt.Color color, int lado)
	{
		super(x, y, relleno, color);
		this.velocidad = OFFSET;
		this.setLado(lado);
	}

	public void setLado(int lado)
	{
		if(x>1 && x<600)
			this.lado = lado;
		else
			this.lado = 2;
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