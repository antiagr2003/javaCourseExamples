import java.util.ArrayList;

public class App
{

	public static void main(String[] args) 
	{
		System.out.println("Con arrays...");
		App.trabajandoConArrays();
		System.out.println("\nCon ArrayList...");
		App.trabajandoConArrayLists();
	}

	private static void trabajandoConArrays()
	{
		Persona personas[] = new Persona[10];
		personas[0] = new Persona("Luis", "1A", 22);
		personas[1] = new Persona("Ana", "2A", 33);
		personas[2] = new Persona("Raquel", "3A", 44);

		for(Persona persona : personas)
			if (persona != null)
				System.out.println(persona);

		Persona persona = new Persona("2A");
		int pos = -1;
		for(int i=0; i<personas.length; i++)
	    {
	        if(personas[i] != null && personas[i].equals(persona))
            {
                pos = i;
                i = personas.length;
            }
	    }

	    if (pos == -1)
	    	System.out.println("Persona no encontrada");
	   	else
	   		System.out.println("Persona encontrada en posición " + pos);

	   	personas[1] = null;  //Eliminar una posición. Estructura mellada.

	}

	private static void trabajandoConArrayLists()
	{	
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Luis", "1A", 22));
		personas.add(new Persona("Ana", "2A", 33));
		personas.add(new Persona("Raquel", "3A", 44));

		for(Persona persona : personas)
			System.out.println(persona);

		Persona persona = new Persona("2A");
		int pos = personas.indexOf(persona);

		if (pos == -1)
	    	System.out.println("Persona no encontrada");
	   	else
	   		System.out.println("Persona encontrada en posición " + pos);

	   	personas.remove(1);  //Eliminar una posición. Estructura compacta.
	}
}
