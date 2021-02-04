public class Persona
{
    //Atributos de clase
    static String CIUDAD;

    //Atributos de instancia
    String nombre; //or defecto null
    int edad; //por defecto 0
    int cp;

    Persona(String nombre, int edad)
    {
        //this.nombre = nombre;
        this.setNombre(nombre);
       /* if (edad > 0 && edad < 130)
        {
            this.edad = edad;
        }*/
        this.setEdad(edad);
    }

    Persona(int edad, String nombre)
    {
       this(nombre, edad);
    }

    Persona(String nombre)
    {
       this(nombre, 20);
    }

    Persona(int edad, String nombre, int cp)
    {
       this(nombre, edad);
       this.cp = cp;
    }    

    //Métodos
    void setNombre(String nombre)
    {
        this.nombre = nombre.toUpperCase();
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

		//Nótese que cuando un if solo tiene una sentencia, se pueden suprimir las llaves:        
        /*
        if (edad > 0 && edad < 130)
            this.edad = edad;
		*/
    }

    int getEdad()
    {
        return edad;
    }

    int getCp()
    {
    	return cp;
    }

    void setCp(int cp)
    {
    	//Nótese que cuando un if solo tiene una sentencia, se pueden suprimir las llaves:
    	if(cp > 9999 && cp < 99999)
    		this.cp = cp;
    }

    String getInfo()
    {
        //return nombre + edad;
        return nombre + " (" + edad + ")" + cp;
    }

    String getEdadAsString()
    {
        //NOOOOOOO: return "edad";
        return "" + edad;
    }  

    String getEdadAsString(String adornos)
    {
        return adornos + edad + adornos;
    }  

    String getEdadAsString(int adornos)
    {
        return this.getEdadAsString(""+adornos);
    }        
}