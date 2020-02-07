//Definición de la clase que construirán futuros objetos del tipo Persona
class Persona
{
    //Atributos de clase
    static String CIUDAD;
    //Atributos de instancia
    String nombre;
    int edad;

    Persona(int edad, String nombre)
    {
        this.nombre = nombre;
        //this.setNombre(nombre);
        this.setEdad(edad);
    }    

    //Métodos
    static String getCIUDAD()
    {
        return CIUDAD;
    }

    static void setCIUDAD(int ciudad)
    {
        CIUDAD = ciudad;
    }

    String getNombre()
    {
        return nombre;
    }

    setNombre(String nombre)
    {
        this.nombre  = nombre;
    }

    int getEdad()
    {
        return edad;
    }

    void setEdad(int edad)
    {
        if(edad > 0 && edad < 120)
            this.edad  = edad;
    }

    String formatear(String atributo)
    {
        return "<b>" + atributo + "</b>";
    }

    String formatear(int atributo)
    {
        return this.formatear(""+atributo);
    }


    String getInfo()
    {
    	return "Nombre............" + this.formatear(nombre) + "\nEdad..........." +
         this.formatear(edad) "\nCiudad........." + CIUDAD + "<br />"; 
    }

}