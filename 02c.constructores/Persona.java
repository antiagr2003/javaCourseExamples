//Definición de la clase que construirán futuros objetos del tipo Persona
public class Persona
{
    //Atributos
    String nombre;
    String apellidos;
    int edad;

    //Constructor
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        //this.setNombre(nombre);
        this.setEdad(edad);
    }
/*
    public Persona(String apellids, int edad)
    {
        this.apellids = apellids;
        //this.setNombre(nombre);
        this.setEdad(edad);
    }
*/
    public Persona(int edad, String apellidos)
    {
        this.apellidos = apellidos;
        //this.setNombre(nombre);
        this.setEdad(edad);
    }
    public Persona(String nombre)
    {
        this.nombre = nombre;
        //this.setNombre(nombre);
        this.edad = 18;
    }    

/*
    public Persona(String apellidos)
    {
        this.apellidos = apellidos;
        //this.setNombre(nombre);
        this.edad = 18;
    }    
*/

/*    public Persona()
    {
        nombre = "sin nombre";
        edad = 18;    
    }
    */

    //Métodos
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre  = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if(edad > 0 && edad < 120)
            this.edad  = edad;
    }

    String getInfo()
    {
    	return "Nombre: " + nombre + "\nEdad: " + edad;
    }

}