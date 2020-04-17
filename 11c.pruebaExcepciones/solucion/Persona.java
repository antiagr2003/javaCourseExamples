public class Persona
{
    public static int CODIGO_MIN = 28000;
    public static int CODIGO_MAX = 28999;

    private String nombre;
    private int codigoPostal;

    public Persona(String nombre, int codigoPostal) throws CPNoValidoException
    {
        this.nombre = nombre;
        this.setCodigoPostal(codigoPostal);
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getCodigoPostal()
    {
        return codigoPostal;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCodigoPostal(int codigoPostal) throws CPNoValidoException
    {
        if(codigoPostal>=CODIGO_MIN && codigoPostal<=CODIGO_MAX)
       	    this.codigoPostal = codigoPostal;
        else
            throw new CPNoValidoException(codigoPostal);
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " CP: " + codigoPostal;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona)
        {
            Persona p = (Persona) obj;
            if (nombre.equals(p.getNombre()))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}