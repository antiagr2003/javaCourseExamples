public class App
{
	public static void main(String[] args) 
	{
		Persona personas[] = new Persona[10];

		personas[0] = new Trabajador("Manolo" , 32, "Calle del Gato, 15", "Teleco" , 25000.45);
		personas[1] = new Estudiante("Javier" , 18, "Calle de la Ballena, 44", 20210001, "GITT" );

		System.out.println("Toda la info");
		System.out.println("============");
		for(Persona p:personas)
			if(p != null)
				System.out.println(p.getInfo());

		System.out.println("Confinando personas");
		System.out.println("===================");
		for(Persona p:personas)
			if(p != null)
				System.out.println(p.confinar());

	}
}
