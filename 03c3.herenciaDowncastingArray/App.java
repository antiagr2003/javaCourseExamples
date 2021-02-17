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
				System.out.println(p.getInfo());

		for(Personaje p:personajes)
			if(p != null && p instanceof PersonajePremium)
			{
				PersonajePremium personajePremium2 = (PersonajePremium) p; //DOWNCASTING
				System.out.println("La skin del objeto del tipo Premium es " + personajePremium2.getSkins());
			}	
	}
}