public class App
{
	public static void main(String args[]) 
	{
		Personaje miPersonaje1 = new Personaje();
		miPersonaje1.setNombre("The Greft");
		miPersonaje1.setVida(100);
		miPersonaje1.setArma("Pistola");

		Personaje miPersonaje2 = new Personaje();
		String nombre = "Luis";
		miPersonaje2.setNombre(nombre);
		miPersonaje2.setVida(100);
		miPersonaje2.setArma(null);

		System.out.println(miPersonaje1.getNombre());
		String arma2 = miPersonaje2.getArma();
		if (arma2 == null)
		{
			System.out.println("Personaje 2 no tiene arma");		
		}
		else
		{
			System.out.println(miPersonaje2.getArma());
		}
	}
}