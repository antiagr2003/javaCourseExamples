public class App
{
	public static void main(String[] args) 
	{
		Premiable premiables[] = new Premiable[10];

		premiables[0] = new Trabajador("Manolo" , 32, "Calle del Gato, 15", "Teleco" , 25000.45);
		premiables[1] = new Estudiante("Javier" , 18, "Calle de la Ballena, 44", 20210001, "GITT" );
		premiables[2] = new Universidad("Comillas" , "MADRID");


		//Error: Aunque todos los objetos tienen getInfo(), los Premiables no.
		/*
		System.out.println("Toda la info");
		System.out.println("============");
		for(Premiable p:premiables)
			if(p != null)
				System.out.println(p.getInfo());
		*/

		System.out.println("Premiando a premiables");
		System.out.println("===================");
		for(Premiable p:premiables)
			if(p != null)
				System.out.println(p.premiar("Premios sostenibilidad 2022"));

	}
}
