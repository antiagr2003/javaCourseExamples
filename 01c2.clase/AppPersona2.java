public class AppPersona2
{
	public static void main(String args[])
	{
		int i = 4;

		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		//Persona persona3 = new Persona();

		//persona1.setEdad(23);

		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());

	}
}