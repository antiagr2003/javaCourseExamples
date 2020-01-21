public class AppPersona1
{
	public static void main(String args[])
	{
		int i = 4;
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();

		persona1.setNombre("Luis");
		persona2.setNombre("Manuel");

		persona1.setEdad(22);
		persona2.setEdad(21);

		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());

		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());

	}
}