public class App
{
	public static void main(String args[]) 
	{
		Personaje miPersonaje1 = new Personaje("The Greft", 100, "Escopeta");
		Personaje miPersonaje2 = new Personaje("Ampeter");
		Personaje miPersonaje3 = new Personaje("Cobra", 80, "Pistola");

		/*System.out.println(miPersonaje1.getInfo());
		System.out.println(miPersonaje2.getInfo());
		System.out.println(miPersonaje3.getInfo());*/

		Personaje personajes[] = new Personaje[10];
		personajes[0] = miPersonaje1;
		personajes[1] = miPersonaje2;
		personajes[2] = miPersonaje3;
		personajes[3] = new Personaje("Gemita");

		for(Personaje personaje:personajes)
			if(personaje != null) 
				System.out.println(personaje.getInfo());

		//ARRAY --> arreglos

		/*
		1 2 3
		4 5 6


		1 2 3
		*/
		int lista[] = new int[3];

		lista[0] = 1;
		lista[1] = 2;
		lista[2] = 3;




	}
}