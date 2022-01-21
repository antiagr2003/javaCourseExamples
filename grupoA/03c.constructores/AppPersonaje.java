public class AppPersonaje
{
	public static void main(String args[]) 
	{
		Personaje personaje1 = new Personaje("The Greft", 9999999, 50);
		Personaje personaje2 = new Personaje("Ampeter", 100, 0);


		//personaje1.vida = 9999999;
		//personaje1.setVida(99999999); 



/*
		System.out.println(personaje1.getUsuario().toUpperCase()); 	
		System.out.println("".toUpperCase()); 
		System.out.println(personaje1.getVida()); 


		personaje1.setVida(90); 

		personaje1.setVida(100); 
		personaje1.setMadera(50); 
		personaje1.setUsuario();


		personaje2.setVida(100); 
		personaje2.setMadera(0); 
		personaje2.setUsuario("Ampeter");
		*/

		System.out.println("personaje1: " + personaje1.getInfo());
		System.out.println("personaje2: " + personaje2.getInfo());




	}
}