public class App
{
	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla (de las tentaciones)");

		Personaje personaje1 = new Personaje();
		Personaje personaje2 = new Personaje();

		Arbol arbol1 = new Arbol("Tomillo", 10);
		Arbol arbol2 = new Arbol("Olivo", 100);

		personaje1.picar(arbol1);
		personaje2.picar(arbol2);

		System.out.println(personaje1.getInfo());
		System.out.println(personaje2.getInfo());
	}	
}