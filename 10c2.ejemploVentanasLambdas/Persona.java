public class Persona
{
    private int edad;

    public Persona(int edad)
    {
        this.edad = edad;
    }

    @Override
    public String toString()
    {
    	return "Edad: " + edad;
    }

}