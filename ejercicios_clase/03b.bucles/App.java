public class App
{
	public static void main(String args[]) 
	{
		System.out.println("Ejemplo de for");

		for(int i=0; i<10; i++)
			System.out.print(i + ", ");

		System.out.println("\nEjemplo de for con condición");

		for(int i=1; i<10; i++)
			if(i % 3 == 0)
				System.out.println(i + " es múltiplo de 3");

		System.out.println("Otro ejemplo con if/else");

		int numero = (int) (Math.random()*10);  //No hace falta entenderlo
		for(int i=0; i<10; i++)
			if(i < numero)
				System.out.println(i + " es menor que " + numero);
			else
				i = 10;

		System.out.println("Con for optimizado");

		//Versión simplificada de lo aterior
		numero = (int) (Math.random()*10);  //No hace falta entenderlo
		for(int i=0; i<numero; i++)
			System.out.println(i + " es menor que " + numero);

		System.out.println("Con while");

		//Versión con while
		int contador = 0;
		numero = (int) (Math.random()*10);  //No hace falta entenderlo
		while(contador < numero)
		{
			System.out.println(contador + " es menor que " + numero);
			contador++;
		}

		System.out.println("Con while optimizado");

		//Versión con while y utilización optimizada de ++
		contador = 0;
		numero = (int) (Math.random()*10);  //No hace falta entenderlo
		while(contador < numero)
			System.out.println(contador++ + " es menor que " + numero);
	}
}