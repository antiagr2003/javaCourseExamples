public class Persona
{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    protected String formatear(String atributo)
    {
        return "<b>" + atributo + "</b>";
    }

    protected String formatear(int atributo)
    {
        return this.formatear(""+atributo);
    }

    @Override
    public String toString()
    {
    	return "Nombre" + this.formatear(nombre) + "\nEdad" +
         this.formatear(edad) + "<br />"; 
    }
}