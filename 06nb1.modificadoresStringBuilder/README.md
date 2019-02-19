
# Modificadores de acceso

¿Qué ocurre si programamos las clases haciendo caso omiso a la recomendación de David de manipulación de atributos en las clases?


```Java
public class Persona
{
    private String nombre;
    private int edad;
    
    //Aparece para solucionar los errores
    public Persona() {}

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    @Override
    public String toString()
    {
        return nombre + "(" + edad + ")"; 
    }
}

public class Trabajador extends Persona
{
    private String profesion;

    public Trabajador(String nombre, int edad, String profesion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getProfesion()
    {
        return profesion;
    }

    @Override
    public String toString()
    {
        return nombre + 
        "(" + 
        edad +
        ")" + 
        profesion;
    }
}
```


    |           this.nombre = nombre;

    nombre has private access in Persona

    

    |           this.edad = edad;

    edad has private access in Persona

    

    |           return nombre + 

    nombre has private access in Persona

    

    |           edad +

    edad has private access in Persona

    



```Java
public class Persona
{
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    @Override
    public String toString()
    {
        //return nombre + "(" + edad + ")"; 
        StringBuilder sb = new StringBuilder();
        
        //Opción 1: 
        sb.append(nombre);
        sb.append("(");
        sb.append(edad);
        sb.append(")");
        
        //Opción 2: 
        //sb.append(nombre).append("(").append(edad).append(")");
        
        //Opción 3 (estético): 
        /* 
        sb.append(nombre)
          .append("(")
          .append(edad)
          .append(")");
        */
        return sb.toString();
    }
}

public class Trabajador extends Persona
{
    private String profesion;

    public Trabajador(String nombre, int edad, String profesion)
    {
        super(nombre, edad);
        this.profesion = profesion;
    }

    public String getProfesion()
    {
        return profesion;
    }

    @Override
    public String toString()
    {
        return super.toString() + profesion;
    }
}
```
