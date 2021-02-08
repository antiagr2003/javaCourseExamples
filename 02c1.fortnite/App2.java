public class App2
{
	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		


		//ARRAYS es como una lista, pero tonta

		//Array
		Personaje lista[] = new Personaje[4];
		//Objeto: Personaje lista = new Personaje(4);

		Personaje personaje1 = new Personaje();

		lista[0] = personaje1;
		lista[1] = new Personaje(90);
		//OJO, en lista[2] hay null
		lista[3] = new Personaje(100, 30);

		for(Personaje p:lista)
		{
			if(p!=null)
				System.out.println(p.getInfo());
		}

		for(int i=0;i<lista.length;i++)
		{
			if(lista[i]!=null)
				System.out.println("Personaje #" + (i + 1) + ": " + lista[i].getInfo());
		}		

/*
		System.out.println(lista[0].getInfo());
		if(lista[2]!=null)
			System.out.println(lista[2]);
		if(lista.length>4)
			System.out.println(lista[4]);
*/
	}
}