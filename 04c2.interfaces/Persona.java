//Definición de la clase que construirán futuros objetos del tipo Persona
public abstract class Persona
{
    //Atributos de clase
    static String CIUDAD;
    //Atributos de instancia
    String nombre;
    int edad;

    //Constructor
    public Persona(String nombre, int edad)
    {
        this(edad, nombre);
    }

    public Persona(int edad, String nombre)
    {
        this.nombre = nombre;
        //this.setNombre(nombre);
        this.setEdad(edad);
    }    

    public Persona(String nombre)
    {
        this(18, nombre);
        //Si solo se quiere inicializar la edad: this.nombre = nombre;
    }    

    //Métodos
    public static String getCIUDAD()
    {
        return CIUDAD;
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

    public String formatear(String atributo)
    {
        return "<b>" + atributo + "</b>";
    }

    public String formatear(int atributo)
    {
        return this.formatear(""+atributo);
    }

    public String getInfo()
    {
    	return "Nombre............" + this.formatear(nombre) + "\nEdad..........." +
         this.formatear(edad) + "\nCiudad........." + CIUDAD + "<br />"; 
    }

}