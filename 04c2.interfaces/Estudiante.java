//Trabajador es una Persona
public class Estudiante extends Persona
{
    String titulo;

          //Persona(String nombre, int edad)
    public Estudiante(String nombre, int edad, String titulo)
    {
        super(nombre, edad); //Dos funciones: no utilizar atts e indicar a Java qué consustructor utilizar.y
        this.titulo = titulo;
    }

/*
    @Override
    public void setEdad(int edad)
    {   
        if(edad > 18)
            super.setEdad(edad);
    }
*/

    String getTitulo()
    {
        return titulo;
    }

    void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }    

   @Override
    public String getInfo()
    {  //clase padre - arriba ^
        return super.getInfo() +  
        "\nTitulo: " + this.formatear(titulo);
    }

}