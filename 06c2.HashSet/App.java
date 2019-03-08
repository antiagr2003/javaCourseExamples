import java.util.HashSet;
import java.util.Collection;

public class App
{
    public static void main(String[] args)
    {
        HashSet personas = new HashSet();

        personas.add(new Persona("11111A", "Ana", 22));
        personas.add(new Persona("22222A", "Cristina", 33));
        personas.add(new Persona("33333A", "Jaime", 28));

		personas.add(new Persona("11112B", "Lara", 28));
		personas.add(new Persona("11113X", "Daniela", 28));

        System.out.println(personas);

        System.out.println(new Persona("11111A").hashCode());

        System.out.println(personas.contains(new Persona("11111A")));


    }    
}
