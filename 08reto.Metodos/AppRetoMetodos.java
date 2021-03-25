import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class AppRetoMetodos
{
    public static void main(String[] args)
    {
        Persona p1 = new Persona();
        p1.setNombre("Luis").setEdad(22).setDireccion("Calle de la otra esquina, 34");
        System.out.println(p1);
        
        Persona p2 = new Persona();
        p2.setNombre("Manué")
          .setEdad(23)
          .setDireccion("Calle de la manita relajá, 12");
        System.out.println(p2);        
    } 
}

class Persona
{ 
    private String nombre;
    private int edad;
    private String direccion;

    public Persona() 
    {

    }

    public Persona(String nombre, int edad, String direccion) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() 
    {
        return nombre;
    } 

    public int getEdad() 
    {
        return edad;
    }   

    public String getDireccion() 
    {
        return direccion;
    }    

    public Persona setNombre(String nombre) 
    {
        this.nombre = nombre;
        return this;
    }     

    public Persona setEdad(int edad) 
    {
        this.edad = edad;
        return this;
    }   

    public Persona setDireccion(String direccion) 
    {
        this.direccion = direccion;
        return this;
    }   
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ")
          .append(nombre)
          .append(" Edad: ")
          .append(edad)
          .append(" Direccion: ")
          .append(direccion);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona) 
        {
            Persona p = (Persona) obj; 
            return nombre.equals(p.getNombre());
        }
        else
            return false;
    }
}
