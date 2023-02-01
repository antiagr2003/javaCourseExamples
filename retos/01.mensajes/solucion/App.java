public class App
{
	public static void main(String args[]) 
	{
		Personaje miPersonaje1 = new Personaje();
		miPersonaje1.setNombre("The Greft");
		miPersonaje1.setVida(100);
		miPersonaje1.setArma("Pistola");

		Personaje miPersonaje2 = new Personaje();
		String nombre = "Luis";
		miPersonaje2.setNombre(nombre);
		miPersonaje2.setVida(100);
		miPersonaje2.setArma(null);

		System.out.println(miPersonaje1.getNombre());
		String arma2 = miPersonaje2.getArma();

		if (arma2 == null)
			System.out.println("Personaje 2 no tiene arma");	
			int a = 4;	
		else
			System.out.println(miPersonaje2.getArma());

		int vida = miPersonaje2.getVida(); 
		int disparo = 1;
		while (vida == 100)
		{
			System.out.println("Disparo #" + disparo);
			miPersonaje1.disparar(miPersonaje2);
			vida = miPersonaje2.getVida(); 
			disparo++;
		}

		System.out.println("Le di!");
		System.out.println("Vida de Personaje 2: " + vida);
	}
}