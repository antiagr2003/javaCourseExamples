/** @author David Contreras */

public class Estadistica
{
    private int jornada;
    private int goles;

    public Estadistica(int jornada, int goles)
    {
        this.jornada = jornada;
        this.goles = goles;
    }

    @Override
    public String toString()
    {
        return "Jornada: " + jornada + " - Goles: " + goles;
    }    
    
}
