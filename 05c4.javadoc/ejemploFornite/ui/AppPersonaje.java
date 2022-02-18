package ejemploFornite.ui;


import ejemploFornite.domain.Personaje;
import ejemploFornite.domain.Casa;
import ejemploFornite.domain.Arbol;
import ejemploFornite.domain.Material;


public class AppPersonaje
{
	public static void main(String args[]) 
	{

		Personaje.setMundo("Mundo 2022");
		System.out.println(Personaje.VIDA_MAX);

		Personaje personajes[] = new Personaje[10];
		personajes[0] = new Personaje("The Grefg", 90, 50);
		personajes[1] = new Personaje("Ampeter", 100, 0);

		Personaje p1 = personajes[0];

		//p1.vida = -999999;



		personajes[0].picar(new Arbol(100, 20));
		personajes[1].picar(new Arbol(60, 10));

		personajes[0].picar(new Casa(100, Material.MADERA));
		personajes[1].picar(new Casa(100, Material.LADRILLO));

		for(int i=0;i<personajes.length;i++)
			if(personajes[i] != null)
				System.out.println("Personaje" + (i+1) + ": " + personajes[i]);	
	}
}