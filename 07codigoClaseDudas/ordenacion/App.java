import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

/* Ordenación por edad e igualdad por NIF */

public class App
{
    public static void main(String[] args)
    {
        TreeSet personas = new TreeSet();

        personas.add(new Persona("11111A", "Luis", 22));
        personas.add(new Persona("22222A", "Miguel", 33));
        personas.add(new Persona("33333A", "Jaime", 28));

        System.out.println(personas);
    }    
}
