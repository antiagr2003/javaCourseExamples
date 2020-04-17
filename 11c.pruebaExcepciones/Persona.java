public class Persona
{
    private String nombre;
    private int codigoPostal;

    public Persona(String nombre, int codigoPostal)
    {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
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

    public void setEdad(int codigoPostal)
    {
       	this.codigoPostal = codigoPostal;
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