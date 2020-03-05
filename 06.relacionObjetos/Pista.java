package practica11.obj;

public class Pista 
{
	private String nombre; 
	private String color;
	private int kms;
	
	public Pista(String _nombre, String _color, int _kms)
	{
		nombre = _nombre; 
		color = _color;
		kms = _kms;
	}

	public boolean equals(Object o)
	{
		return nombre.equals(((Pista)o).getNombre());
	}
	
	private String getNombre() 
	{
		return nombre;
	}

	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(nombre);
		sb.append(" (");
		sb.append(color);
		sb.append(")");
		sb.append(" - ");
		sb.append(kms);
		sb.append("km");
		return sb.toString();
	}

	public int getKms() 
	{
		return kms;
	}

	
}
