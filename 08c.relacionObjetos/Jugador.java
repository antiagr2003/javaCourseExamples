/** @author David Contreras */

import java.util.ArrayList;
import java.util.Collection;

public class Jugador
{
    private String nombre;
    private int dorsal;
    private Collection estadisticas;

    public Jugador(String nombre, int dorsal)
    {
        this.nombre = nombre;
        this.dorsal = dorsal;
        estadisticas = new ArrayList();
    }

    public String getNombre()
    {
        return nombre;
    }    
    
    public Collection getEstadisticas()
    {
        return estadisticas;
    }

    public void addEstadisticas(Estadistica e)
    {
        estadisticas.add(e);
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Jugador)
        {
            Jugador jugador = (Jugador) o;
            return nombre.equals(jugador.getNombre());
        }
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        return dorsal%5;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + nombre + " - Dorsal: " + dorsal + " Estadisticas: " + estadisticas;
    }    
}
