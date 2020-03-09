import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class App
{
    public static void main(String[] args)
    {
        List personas = new ArrayList(); 

        personas.add(new Persona("11111A", "Luis", 22));
        personas.add(new Persona("22222A", "Miguel", 33));
        personas.add(new Persona("33333A", "Jaime", 28));

        Persona p = new Persona("44444A", "Lucas", 23);
        personas.add(p);

        personas.add(new Persona("33333A", "Jaime", 28));

        System.out.println(personas.contains(new Persona("11111A")));

        personas.remove(0);
        personas.remove(new Persona("33333A", "Jaime", 28));
        p = (Persona) personas.get(2);

        Collection personasAsCollection = personas;     
        
        //personasAsCollection.get(0);
        /* App.java:26: error: cannot find symbol
        personasAsCollection.get(0);
                            ^
        symbol:   method get(int) */

        System.out.println(personas);

        for(int i=0;i<personas.size();i++)
            System.out.println("1.- " + personas.get(i));    


        personasAsCollection.remove(0); //¿Por qué no da error? 
        //Java hace Autoboxing de 0 a new Integer(0) e intentará borrar el objeto de la colección que devuelva true en equals con ese 0

        personas.add("Hola");      
        personas.add(new Integer(10));
    }    
}
