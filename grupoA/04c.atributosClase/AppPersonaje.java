public class AppPersonaje
{
	public static void main(String args[]) 
	{

		Personaje.setMundo("Mundo 2022");
		//Personaje.VIDA_MAX = 500;   ERROR
		System.out.println(Personaje.VIDA_MAX);

		//Personaje personaje1 = new Personaje("The Grefg", 9999999, 50);

		//ARRAY
		Personaje personajes[] = new Personaje[10];
		//personajes[0] = personaje1;
		personajes[0] = new Personaje("The Grefg", 9999999, 50);
		personajes[1] = new Personaje("Ampeter", 100, 0);

		//personaje1.vida = 9999999; //No se debe acceder nunca directamente a un atributo
		personajes[0].setVida(99999999); 

		Arbol arbol1 = new Arbol(100, 20);
		personajes[0].picar(arbol1);

		personajes[1].picar(new Arbol(60, 10));	//En este caso, me gusta más esto.


		for(int i=0;i<personajes.length;i++)
		{
			if(personajes[i] != null)
				System.out.println("Personaje" + (i+1) + ": " + personajes[i].getInfo());	
		}

		for(Personaje personaje:personajes)
		{
			if(personaje != null)
				System.out.println("Personaje: " + personaje.getInfo());	
		}


		System.out.println("Arbol: " + arbol1.getInfo());

		//Personaje.getMundo();
	}
}