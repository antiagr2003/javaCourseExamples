/** @author David Contreras */

import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashSet;

public class Equipo
{
    public final static int MIN_JUGADORES = 17;
    public final static int MAX_JUGADORES = 22;

    private String nombre;
    private float presupuesto;
    private Collection jugadores;
    private Presidente presidente;

    public Equipo(String nombre, float presupuesto)
    {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.jugadores = new HashSet();
    }

    public Collection getJugadores()
    {
        return jugadores;
    }

    public void removeJugador(Jugador jugador)
    {
        jugadores.remove(jugador);
    }    
    
    public void addJugador(Jugador jugador)
    {
        if(jugadores.size()<MAX_JUGADORES)
            jugadores.add(jugador);
    }

    public boolean isValido()
    {
        return jugadores.size()>=MIN_JUGADORES && jugadores.size()<=MAX_JUGADORES;
    }
    
    public Presidente getPresidente()
    {
        return presidente;
    }

    public void setPresidente(Presidente presidente)
    {
        this.presidente = presidente;
    }

    @Override
    public String toString()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "Nombre: " + nombre + "\nPresupuesto: " + nf.format(presupuesto) + "\nJugadores: " + jugadores
                + "\nPresidente: " + presidente;
    }
    
}
