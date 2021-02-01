public class AppPersona
{
	public static void main(String args[])
	{
		int numero = 3;
		Persona persona1 = new Persona();
		persona1.setNombre("Luis");
		persona1.setEdad(44);
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());

		Persona persona2 = new Persona();
		persona2.setNombre("Miguel");
		persona2.setEdad(33);
		String nombre = persona2.getNombre();
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + persona2.getEdad());
	}
}