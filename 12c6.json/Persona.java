public class Persona
{
    private String nombre; 
    private int edad;

    public Persona(String nombre, int edad)
    {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setEdad(int edad)
    {
        if (edad > 0 && edad < 130)
        {
            this.edad = edad;
        }
    }

    public int getEdad()
    {
        return edad;
    }

    public String toString()
    {
        return nombre + " (" + edad + ")";
    }
}