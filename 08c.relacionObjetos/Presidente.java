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

    public String getProfesion()
    {
        return profesion;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre)
            .append(" (")
            .append(profesion)
            .append(")");

        return sb.toString();        
    }    
    
}
