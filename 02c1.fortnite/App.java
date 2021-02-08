public class App
{
	public static void main(String args[]) 
	{
		//Mensaje método de clase
		//CLASE.metodoDeClase()
		Personaje.setISLA("Mi Isla");

		System.out.println(Personaje.getISLA());
		System.out.println(Personaje.VIDA_MAXIMA);

		//ERROR: Personaje.VIDA_MAXIMA = -77;
		//Mensaje método de instancia
		//objeto.metodo()

		Personaje personaje1 = new Personaje();
		Personaje personaje2 = new Personaje(90);
		Personaje personaje3 = new Personaje(100, 30);


/*
		personaje1.setIsla("Mi ISLA");
		personaje2.setIsla("Mi ISLA");
		personaje3.setIsla("Mi ISLA");
*/

		//Java lo permite, pero es raro: 
		//personaje1.setISLA("Mi Isla");
		//personaje2.setISLA("Mi Isla");
		//personaje3.setISLA("Mi Isla");

		System.out.println(personaje1.getInfo());
		Personaje.setISLA("Mi Nueva Isla");
		System.out.println(personaje2.getInfo());
		System.out.println(personaje3.getInfo());
		System.out.println("---");
		System.out.println(personaje1.getInfo());
	}
}