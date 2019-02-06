//Trabajador es una Persona
public class TrabajadorFixed extends PersonaFixed
{
    String profesion;

    public TrabajadorFixed(String nombre, int edad, String profesion)
    {
        super(nombre, edad);
        this.profesion = profesion;
    }

    String getProfesion()
    {
        return profesion;
    }

    void setProfesion(String profesion)
    {
        this.profesion = profesion;
    }    

   @Override
    public String getInfo()
    {
        return super.getInfo() +  "\nProfesion: " + this.formatear(profesion);
    }
}