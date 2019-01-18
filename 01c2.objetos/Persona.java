//Definición de la clase que construirán futuros objetos del tipo Persona
public class Persona
{
    //Atributos
    String nombre;
    int edad;

    //Métodos
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String s)
    {
        nombre  = s;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int e)
    {
        if(e > 0 && e < 120)
            edad  = e;
    }

    String getInfo()
    {
    	return "Nombre: " + nombre + "\nEdad: " + (edad + 4);
    }

}