public class App
{
	static Personaje lista[] = new Personaje[4];

	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		//Personaje personaje1 = new Personaje();
		PersonajePremium personajePremium1 = new PersonajePremium("Platanito");
		System.out.println(personajePremium1.getInfo());

	}
}