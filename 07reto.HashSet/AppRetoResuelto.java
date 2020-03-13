import java.util.HashSet;

/*

Q1: ¿Por qué el orden de salida no coincide con el de inserción?
A1: Porque viene determinado por el valor devuelto por hashCode(). Como no se encuentra, toma la implementación de Object genérica.

Q2: ¿Por qué no se encuentra a Ana?
A1: Porque no estaba implementado el método hashCode()

*/
public class AppRetoResuelto
{
    public static void main(String[] args)
    {
        HashSet personas = new HashSet();

        personas.add(new Persona("22222A", "Cristina", 33)); 
        personas.add(new Persona("33333A", "Jaime", 22));
        personas.add(new Persona("11111A", "Ana", 27));        
    

        System.out.println(personas);
    }    
}

class Persona
{ 
    private String nif;
    private String nombre;
    private int edad;
    
    public Persona(String nif, String nombre, int edad) 
    {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nif) 
    {
        this.nif = nif;
    }

    public String getNif()
    {
        return nif;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: ")
          .append(nif)
          .append("\nNombre: ")
          .append(nombre)
          .append("\nEdad: ")
          .append(edad);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj) //Upcasting, el objeto que recibe lo vemos como un Objeto
    {
        if(obj instanceof Persona) //Si la instancia del objeto es una Persona...
        {
            Persona p = (Persona) obj; //Hacemos un downcasting (explícito) y bajamos el inyerfaz
            if (nif.equals(p.getNif())) //Llama al equals de String, que funciona correctamente
                return true;
            else
                return false;
        }
        else
            return false;
    }


    @Override
    public int hashCode()
    {
        return edad/10; //Aproximación de esta "ordenación artificial" para la JDK 11. 
        //Recordamos que esta implementación para la ordenación es algo meramente pedagógico y no 100% funcional. 
        //Siempre utilizaremos TreeSet.
    }

}
