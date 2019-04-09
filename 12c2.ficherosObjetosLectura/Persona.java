public class Persona implements java.io.Serializable
{
    public static final int EDAD_MIN = 0;
    public static final int EDAD_MAX = 120;

    private String nombre;    
    private int edad;

    public Persona(String nombre, int edad) throws EdadNoValidaException
    {
        this.nombre = nombre;
        this.setEdad(edad);
    }

    public void setEdad(int edad) throws EdadNoValidaException
    {
        if(edad >= EDAD_MIN && edad <= EDAD_MAX)
            this.edad = edad;
        else
            throw new EdadNoValidaException();
    }

    @Override
    public String toString()
    {
    	return new StringBuilder("Nombre: ").append(nombre).append(" Edad: ").append(edad).toString();
    }

}