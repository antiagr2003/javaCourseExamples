package ejemploFornite.ui;

import ejemploFornite.domain.Personaje;

import ejemploFornite.domain.armamento.Arma;
import ejemploFornite.domain.armamento.ArmaClasica;
import ejemploFornite.domain.armamento.ArmaPremium;

import ejemploFornite.domain.construcciones.Arbol;
import ejemploFornite.domain.construcciones.Casa;
import ejemploFornite.domain.construcciones.Material;

import ejemploFornite.domain.objetos.Botiquin;
import ejemploFornite.domain.objetos.Municion;

public class AppPersonaje
{
	public static void main(String args[]) 
	{

		Personaje.setMundo("Mundo 2022");
		System.out.println(Personaje.VIDA_MAX);

		Personaje personajes[] = new Personaje[10];
		personajes[0] = new Personaje("The Grefg", 100, 50);
		personajes[1] = new Personaje("Ampeter", 100, 0);

		personajes[0].picar(new Arbol(100, 20));
		personajes[1].picar(new Arbol(60, 10));

		personajes[0].picar(new Casa(100, Material.MADERA));
		personajes[1].picar(new Casa(100, Material.LADRILLO));

		personajes[0].addArma(new ArmaClasica("Escopeta", 5, 20, 100));  		// The Grefg tiene una Escopeta con 5 disparos
		personajes[1].addArma(new ArmaClasica("Subfusil de asalto", 10, 10, 200));

		personajes[0].seleccionarArma(new ArmaClasica("Escopeta"));
		personajes[0].disparar(personajes[1]);
		personajes[0].disparar(); 				//Disparos al aire
		personajes[0].disparar(); 				//Disparos al aire
		personajes[0].disparar(); 				//Disparos al aire
		personajes[0].disparar(personajes[1]);  //Último disparo, ya no le queda munición. Le habrá restado 20+20 de vida a Ampeter.
		personajes[0].disparar(personajes[1]);  //No podrá disparar

		personajes[1].disparar(personajes[0]);  //No podrá disparar por no tener el arma seleccionada

		System.out.println("Vida de Ampeter antes de recoger el Botiquin: " + personajes[1].getVida());	

		personajes[1].recogerObjeto(new Botiquin(30));  //Recoge y consumo automáticamente el botiquín: +30 vida
		personajes[0].recogerObjeto(new Municion(new ArmaClasica("Escopeta"), 2));  //Idem con la munición: +2 balas

		for(int i=0;i<personajes.length;i++)
			if(personajes[i] != null)
				System.out.println("Personaje #" + (i+1) + ": " + personajes[i]);
	}
}