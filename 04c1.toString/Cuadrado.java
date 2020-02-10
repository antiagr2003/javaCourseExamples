import java.awt.Color;

public class Cuadrado extends Figura
{ 
	int lado;

	/** 
		Inicializa todos los atributos del objeto 
		@param lado Tamaño del cuadrado en pixels
	*/
	Cuadrado(int x, int y, boolean relleno, Color color, int lado)
	{
		super(x, y, relleno, color);
		this.setLado(lado);
	}

	void setLado(int lado)
	{
		if(x>1 && x<600)
			this.lado = lado;
		else
			this.lado = 2;
	}

	int getLado()
	{
		return lado;
	}

	@Override
	public String toString()
	{
		String s = "Información del cuadrado: ";
		s += super.toString();
		s += " Lado: "+ lado;
		return s;
	} 
}