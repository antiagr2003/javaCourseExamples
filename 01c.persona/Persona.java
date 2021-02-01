public class Persona
{
    String nombre; //or defecto null
    int edad; //por defecto 0

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
        if (edad > 0 && edad < 140)
        {
            this.edad = edad;
        }
        else 
        {
            this.edad = 20;
        }
    }

    int getEdad()
    {
        return edad;
    }
}