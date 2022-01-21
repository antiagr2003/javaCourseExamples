public class AppPersonaje
{
	public static void main(String args[]) 
	{
		Personaje personaje1 = new Personaje("The Grefg", 9999999, 50);
		Personaje personaje2 = new Personaje("Ampeter", 100, 0);

		//personaje1.vida = 9999999; //No se debe acceder nunca directamente a un atributo
		personaje1.setVida(99999999); 

		System.out.println("personaje1: " + personaje1.getInfo());
		System.out.println("personaje2: " + personaje2.getInfo());
	}
}