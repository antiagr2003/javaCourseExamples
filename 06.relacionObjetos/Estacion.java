package practica11.obj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Estacion 
{
	private String nombre;
	private Collection pistas;
    private Collection espesores;

	public Estacion(String _nombre)
	{
		nombre = _nombre;
		pistas = new ArrayList();
	}

    public Collection getEspesores()
    {
        return espesores;
    }
    
    public void setEspesores(Collection _espesores)
    {
        espesores = _espesores;
    }    
    
	public void addPista(Pista p)
	{
		pistas.add(p);
	}
	
	public void removePista(Pista p)
	{
		pistas.remove(p);
	}	
	
	public Collection getPistas()
	{
		return pistas;
	}
    
    private String getNombre() 
    {
        return nombre;
    }
    
    public int hashcode()
    {
        return nombre.hashCode();
    }
    
    public boolean equals(Object o)
    {
        return nombre.equals(((Estacion)o).getNombre());
    }
    
	
	public String toString()
	{
	//	return nombre + pistas.toString();
		
		StringBuffer sb = new StringBuffer();
		sb.append("Información de la estación: ");
		sb.append(nombre);
		Iterator it = pistas.iterator();
		int numPistas = 0;
		int totalKms = 0;
        
        if(espesores!=null)
            sb.append("\nEspesores: " + espesores.toString());
        
		while(it.hasNext())
		{
			Object o = it.next();
			sb.append("\n\t- ");
			sb.append(o.toString());
			numPistas++;
			totalKms+=((Pista)o).getKms();
		}
		sb.append("\nLa estación tiene un total de " + totalKms);
		sb.append(" kms en " + numPistas + " pistas");
		return sb.toString();
	}

}
