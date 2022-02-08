public class App
{
	public static void main(String[] args) 
	{
		//Persona persona = new Persona("Luis", 22,"Calle del Pez");
		Trabajador trabajador = new Trabajador("Manolo" , 32, "Calle del Gato", "Teleco" , 25000.45);

		//System.out.println(persona.getInfo());
		System.out.println(trabajador.getInfo());
	}
}
