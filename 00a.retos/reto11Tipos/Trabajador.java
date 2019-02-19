public class Trabajador extends Persona
{
    private String profesion;

    public Trabajador(String nombre, int edad, String profesion)
    {
        super(nombre, edad); 
        this.profesion = profesion;
    }

    @Override
    public String toString()
    {  
        return super.toString() + "\nProfesion: " + this.formatear(profesion);
    }
}