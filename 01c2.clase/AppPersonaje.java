public class AppPersonaje
{
	public static void main(String args[]) 
	{
		Personaje p1; //Definción del objeto
		p1 = new Personaje(); //Creación del objeto. Llamando al constructor de la clase.

		Personaje p2 = new Personaje(); //Definición y creación del objeto

		p1.setVida(22); //Mensajes 
		p1.disparar(p2);

		/*
		RETO 1
		Inicializa los atributos de los objetos y comprueba el valor de los mismos
		después de hacer variaciones con los métodos de su interfaz 
		*/


		/* 
		Ejemplo de la mismas operaciones, 
		pero con otro tipo de objeto:String 
		*/
		String s;
		s = "Hola";

		String s2 = "Hola";
		s2.toUpperCase();


/*
		MAL
		if(p1.getVida()<=0)
		{
			System.out.println("P1 está muerto");
		}

*/

		//if(p1.isVivo())
		if(p1.isVivo()==true)			
			System.out.println("P1 esta vivo");

/*
		MAL
		if(p1.getVida()<100)
			p1.setVida(20);
*/

		p1.addVida(20);

		System.out.println(p1.getVida());
		System.out.println(p1.getMadera());


		System.out.println("P1: " + p1.getInfo());
		System.out.println("P2: " + p2.getInfo());




	}
}