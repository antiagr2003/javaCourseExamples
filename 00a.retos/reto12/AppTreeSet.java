/* RETO 12: Ordena a las personas por edad.
OJO: no puede haber dos personas con el mismo NIF */

/** @author David Contreras */
import java.util.TreeSet;

public class AppTreeSet
{
	public static void main(String args[])
	{
		TreeSet miTreeSet = new TreeSet();
		miTreeSet.add(new Persona("1111A", 12));
		miTreeSet.add(new Persona("2222B", 29));
		miTreeSet.add(new Persona("3333C", 20));
		miTreeSet.add(new Persona("4444D", 25));
		miTreeSet.add(new Persona("5555E", 29));
		System.out.println(miTreeSet);
	}
}	