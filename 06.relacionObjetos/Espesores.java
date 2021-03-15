package practica11.obj;

public class Espesores 
{
	private int cota;
	private int min;
	private int max;
	
	public Espesores(int _cota, int _min, int _max)
	{
		cota = _cota;
		min = _min;
		max = _max;		
	}
	
	public String toString()
	{
		return "Cota " + cota + " (" + min + "-" + max + ")"; 
	}

}
