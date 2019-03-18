/** @author David Contreras */
package practica05.negocio;

import practica05.dominio.Persona;
import java.util.ArrayList;

public class Agenda
{
    private ArrayList personas;
    private String nombre;

    public Agenda(String nombre)
    {
    	this.nombre = nombre;
    	personas = new ArrayList();
    }

    public String getNombre()
    {
    	return nombre;
    }

    public int size()
    {
    	return personas.size();
    }    

    public boolean isFull()
    {
    	return false;
    }    

    public boolean add(Persona persona)
    {
    	personas.add(persona);
        return true;
	}

	public Persona get(int posicion)
    {
    	return (Persona)personas.get(posicion);
	}

	public boolean contains(Persona persona)
    {
    	return personas.contains(persona);
	}

	public int indexOf(Persona persona)
    {
    	return personas.indexOf(persona);
	}

	private int buscar(Persona persona)
    {
        return this.indexOf(persona);
    }    

    public boolean remove(int posicion)
    {
    	return personas.remove(posicion)!=null;
    }

    public boolean remove(Persona persona)
    {
        return personas.remove(persona);
    }    

	public String toString()
    {
    	StringBuilder sb = new StringBuilder();
        for(int i=0;i<personas.size();i++)
            sb.append(String.valueOf(i) + ".- " + personas.get(i) + "\n");
        return sb.toString();
    }    
    
}
