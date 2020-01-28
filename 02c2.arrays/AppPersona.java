public class AppPersona
{
	public static void main(String args[])
	{
		int numeros[] = new int[10];
		numeros[0] = 12;
		numeros[1] = 22;

		System.out.println("Numeros:");
		for(int i=0;i<10;i++) 
		{
			int numero = numeros[i];
			System.out.println(numero);
		}

		for(int numero:numeros) 
			System.out.println(numero);

		System.out.println(Persona.EDAD_MAX);
		Persona.setCIUDAD("Madrid");
		
		/*Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		Persona persona3 = new Persona("Jaime", 19);*/
		
		/*System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());
		System.out.println(persona3.getInfo());*/



		Persona personas[] = new Persona[10];
		//Persona personas = new Persona(10);
		personas[0] = new Persona("Luis", 22);;
		personas[1] = new Persona("Manolo", 44);
		personas[2] = new Persona("Ana", 33);
		personas[3] = new Persona("Manuel", 23);
		personas[4] = new Persona("Jaime", 19);

		for(int i=0;i<10;i++)
			if(personas[i]!=null)
				System.out.println("Persona #" + i + ": " + personas[i].getInfo());

		for(Persona persona:personas)
			if(persona!=null)
					System.out.println(persona.getInfo());



	}
}