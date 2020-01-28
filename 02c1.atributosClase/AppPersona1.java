public class AppPersona1
{
	public static void main(String args[])
	{
		System.out.println(Persona.EDAD_MIN);
		//Persona.EDAD_MIN = -55;
		//persona1.edad = -44;

		Persona.setCIUDAD("Madrid");
		
		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);

		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());

	}
}