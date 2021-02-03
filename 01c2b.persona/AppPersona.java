public class AppPersona
{
	public static void main(String args[])
	{
		//Objetos, ocurrencias o instancias de la clase Persona
		Persona persona1 = new Persona("Luis", 44);
		System.out.println(persona1.getInfo());

		int a;
		String b;
		Persona p;
		p = new Persona("XXXX", 1);

		persona1.setNombre("Ana");
		


		persona1.setEdad(9999);
		System.out.println(persona1.getInfo());

		System.out.println("------");

	/*	Persona persona2 = new Persona();
		System.out.println(persona2.getInfo());
		persona2.setNombre("Miguel");
		persona2.setEdad(33);

		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());
		*/
	}
}