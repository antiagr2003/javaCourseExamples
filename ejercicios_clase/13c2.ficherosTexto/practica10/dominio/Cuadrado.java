package practica10.dominio;

public class Cuadrado extends Figura
{ 
	public static long serialVersionUID = 1L;
	public static final String TIPO_OBJETO = "cuadrado";

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
		this.lado = Math.abs(lado);
	}

	@Override
	public void setDimension(int dimension)
	{
		this.setLado(dimension);
	}	

	public int getLado()
	{
		return lado;
	}

	@Override
	public String toCSV()
	{
		return TIPO_OBJETO + ", " + super.toCSV() + ", " + lado ; 
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
