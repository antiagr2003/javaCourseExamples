//Definición de la clase que construirán futuros objetos del tipo Persona
public class PersonaFixed
{
    static String CIUDAD; //Todas las personas viven en la misma ciudad
    String nombre;
    int edad;

    public PersonaFixed(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void setCIUDAD(String ciudad)
    {
        CIUDAD = ciudad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if(edad>0 && edad<120)
            this.edad = edad;
    }

    String estadistica()
    {
        return "La mitad de la edad en " + CIUDAD + " es: " + edad/2;
    }

    String getInfo()
    {
    	return "Nombre: " + nombre + "\nEdad: " + edad + "Ciudad" + CIUDAD;
    }

}