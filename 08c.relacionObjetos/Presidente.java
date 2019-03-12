/** @author David Contreras */

public class Presidente
{
    private String nombre;
    private String profesion;


    public Presidente(String nombre, String profesion)
    {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " - Profesion: " + profesion;
    }    
    
}
