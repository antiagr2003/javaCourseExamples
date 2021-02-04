public class AppPersona
{
	public static void main(String args[])
	{
		//Objetos, ocurrencias o instancias de la clase Persona
		Persona persona1 = new Persona("Luis", 44);

		Persona persona2 = new Persona(23, "Miguel");
		
		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());

		Persona p3 = new Persona("David");
		Persona p4 = new Persona(44, "Paula", 28008);

		System.out.println(p3.getInfo());
		System.out.println(p4.getInfo());
		System.out.println("------");

		System.out.println(p4.getEdadAsString());
		System.out.println(p4.getEdadAsString("****"));

/*
		KISS:
		String m = p1.m().getEdad();
		Objeto a = m.toInt().tttt();
		int resultado = a.dsadas();	
		*/
	}
}