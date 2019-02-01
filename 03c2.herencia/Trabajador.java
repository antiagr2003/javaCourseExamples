//Trabajador es una Persona
public class Trabajador extends Persona
{
    String profesion;

          //Persona(String nombre, int edad)
    public Trabajador(String nombre, int edad, String profesion)
    {
        super(nombre, edad); //Dos funciones: no utilizar atts e indicar a Java qué consustructor utilizar.y
        this.profesion = profesion;
    }

/*
    @Override
    public void setEdad(int edad)
    {   
        if(edad > 18)
            super.setEdad(edad);
    }
*/

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
    {  //clase padre - arriba ^
        return super.getInfo() +  
        "\nProfesion: " + this.formatear(profesion);
    }
}