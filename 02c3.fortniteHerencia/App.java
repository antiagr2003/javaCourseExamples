public class App
{
	static Personaje lista[] = new Personaje[4];

	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		PersonajePremium personajePremium1 = new PersonajePremium(100, 50, "Platanito");
		System.out.println(personajePremium1.getInfo());
	}
}