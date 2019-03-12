/** @author David Contreras */
public class Persona implements Comparable
{
	private int edad;
	private String nif;
	
	public Persona(String nif, int edad)
	{
		this.nif = nif;	
		this.edad = edad;
	}	

	public int getEdad()
	{
		return edad;
	}

	public String getNif()
	{
		return nif;
	}	

	public String toString()
	{
		return nif + " (" + edad + ") ";
	}

	public boolean equals(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;
			return nif.equals(p.getNif());
		}
		else
			return false;
	
	}

	public int compareTo(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;
			int comparacion = edad - p.getEdad();
			if(comparacion==0)
				if(this.equals(o))
					return 0;
				else
					return +1; //Por ejemplo 
			else
				return comparacion;
		}
		else
			return -1; //Por ejemplo		
		
	}
}

