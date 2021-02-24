public class App
{
	static Personaje lista[] = new Personaje[4];

	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		Personaje personajes[] = new Personaje[10];

		personajes[0] = new Personaje(50, 50);
		personajes[1] = new PersonajePremium(10, 10, "Platanito");
		personajes[2] = new PersonajePromocion(10, 10, "20-jun-2021", 100);
 
		for(Personaje p:personajes)
			if(p != null)
				System.out.println(p);

		System.out.println(personajes[1]==personajes[2]);
		
		System.out.println(personajes[1].equals(personajes[2]));
	}
}