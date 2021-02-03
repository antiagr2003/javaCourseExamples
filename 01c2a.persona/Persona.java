public class Persona
{
    //Atributos
    String nombre; //or defecto null
    int edad; //por defecto 0

    //Métodos
    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    String getNombre()
    {
        return nombre;
    }

    void setEdad(int edad)
    {
        if (edad > 0 && edad < 130)
        {
            this.edad = edad;
        }
    }

    int getEdad()
    {
        return edad;
    }

    String getInfo()
    {
        //return nombre + edad;
        return nombre + " (" + edad + ")";
    }

    String getEdadAsString()
    {
        //NOOOOOOO: return "edad";
        return "" + edad;
    }    
}