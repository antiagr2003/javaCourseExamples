/** @author David Contreras */
public class Persona implements java.io.Serializable
{
    public static final long serialVersionUID = 1L;

    public final static int EDAD_MAXIMA = 110;
    public final static int EDAD_MINIMA = 10;

    private String nombre;
    private int edad;
    private String nif;
    private String direccion;

    public Persona(String nombre, String nif, int edad)
    {
        this.nombre = nombre;
        this.nif = nif;
        this.setEdad(edad);     
    }

    public Persona(String nombre, String nif)
    {
        this.nombre = nombre;
        this.nif = nif;
    }

    /* Contructor de búsqueda: equals */
    public Persona(String nif)
    {
        this.nif = nif;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getNif()
    {
        return nif;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad)
    {
        if(edad > EDAD_MINIMA && edad < EDAD_MAXIMA)
            this.edad = edad;       
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ")
          .append(nombre)
          .append(" Edad: ")
          .append(edad)
          .append(" NIF: ")
          .append(nif);
        return sb.toString();
    }

    //GSON
    public String toJSON()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("{nombre: \"")
          .append(nombre)
          .append("\", edad: ")
          .append(edad)
          .append(", nif: \"")
          .append(nif)
          .append("\"}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona)
        {
            Persona p = (Persona) obj;
            if (nif.equals(p.getNif()))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}