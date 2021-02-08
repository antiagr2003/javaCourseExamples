public class App
{
	public static void main(String args[]) 
	{
		Personaje personaje1 = new Personaje();
		Personaje personaje2 = new Personaje(90);
		Personaje personaje3 = new Personaje(100, 30);

		personaje1.setIsla("Mi ISLA");
		personaje2.setIsla("Mi ISLA");
		personaje3.setIsla("Mi ISLA");

		System.out.println(personaje1.getInfo());
		System.out.println(personaje2.getInfo());
		System.out.println(personaje3.getInfo());
	}
}