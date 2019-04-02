public class Persona
{
    public static final int EDAD_MIN = 0;
    public static final int EDAD_MAX = 120;
    
    private int edad;

    public Persona(int edad) throws EdadNoValidaException
    {
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
    	return "Edad: " + edad;
    }

}