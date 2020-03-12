import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/*
Q1: ¿Qué pasa cuándo tenemos dos claves iguales?
Q2: ¿Tendría sentido tener una clave igual a null?
Q3: ¿Y un un valor igual a null?
Q4: Reto:
    ¿Cómo calcularías el número de personas que tienen un coche en concreto? 
        Golf: 2
        A3: 1
        Mini: 1
        Ibiza: 1
*/    

public class App
{
    public static void main(String[] args)
    {
        Map personas;

        if(true)
            personas = new HashMap();
        else
            personas = new TreeMap();

        personas.put(new Persona("11111A", "Ana", 22), new Coche("VW", "Golf"));
        personas.put(new Persona("22222A", "Cristina", 33), new Coche("Audi", "A3"));
        personas.put(new Persona("33333A", "Jaime", 28), new Coche("VW", "Golf"));

		personas.put(new Persona("11112B", "Lara", 28), new Coche("Seat", "Ibiza"));
		personas.put(new Persona("11113X", "Daniela", 28), new Coche("Mini", "Cooper"));

        System.out.println(personas);

        Coche coche = (Coche) personas.get(new Persona("11111A", "Ana"));
        
        System.out.println("\nEl coche de 11111A es: " + coche);

        System.out.println("\nExiste 11112B: " + personas.containsKey(new Persona("11112B", "Lara")));        
        
        
        System.out.println("\nListado de Personas");
        System.out.println("===============");
        Set personasSet = personas.keySet();
        Iterator it = personasSet.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            System.out.println(o);
            Persona p = (Persona) o;
            System.out.println(p.getNombre());
        }
            
        System.out.println("\nListado de coches");
        System.out.println("===============");
        Collection personasValues = personas.values();
        it = personasValues.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            System.out.println(o);
            Coche c = (Coche) o;
            System.out.println(c.getMarca());
        }

        
        System.out.println("\nListado de los dos objetos (clave+valor) del Map");
        System.out.println("===============");
        Set personasEntrySet = personas.entrySet();
        it = personasEntrySet.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println("- La clave:\n" + entry.getKey() + "\n- El valor:\n" + entry.getValue());     
        }
        

        System.out.println("\nListado con la necesidad de realizar DOWNCASTING del Map");
        System.out.println("===============");
        it = personasEntrySet.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println("- La clave: " + entry.getKey() + "\n- El valor: " + entry.getValue());     

            Persona p = (Persona) entry.getKey();
            Coche c = (Coche) entry.getValue();            
            System.out.println(p.getNombre() + " tiene un " + c.getMarca());     
        }

    }    
}
