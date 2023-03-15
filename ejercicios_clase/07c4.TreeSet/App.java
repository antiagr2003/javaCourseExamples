import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

/*
Q1: ¿Por qué Javier no se inserta?
Q2: ¿Por qué no se puede recorrer el arbol?
*/

public class App
{
    public static void main(String[] args)
    {
        TreeSet personas = new TreeSet();

        personas.add(new Persona("11111A", "Luis", 22));
        personas.add(new Persona("22222A", "Miguel", 33));
        personas.add(new Persona("33333A", "Jaime", 28));

        personas.add(new Persona("33333A", "Javier", 38));

        System.out.println(personas);
    }    
}
