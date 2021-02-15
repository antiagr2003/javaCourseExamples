public class App
{
	static Personaje lista[] = new Personaje[4];

	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		Personaje p1 = new Personaje(50, 50);
		PersonajePremium pp1 = new PersonajePremium(10, 10, "Platanito");
		p1 = pp1; //UPCASTNG
		pp1 = null;
		System.out.println(p1.getInfo());
		//ERROR: System.out.println(p1.getSkins());

		pp1 = (PersonajePremium) p1; //DOWNCASTING
		System.out.println(pp1.getSkins());
	}
}