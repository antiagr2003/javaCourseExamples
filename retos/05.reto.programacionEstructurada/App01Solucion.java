/*
Solución 
*/

public class App01Solucion
{
	static int numeros[];

	public static void main(String[] args) 
	{
		int longitud = 10;
		if(args.length > 0)
			longitud = Integer.parseInt(args[0]);
		
		numeros = new int[longitud];

		int numero_buscado = App01Solucion.init();

		for(int numero:numeros)
			System.out.print(numero + ", ");

		System.out.println();
		int index = 0;
		//Código a mejorar:

		while(index < numeros.length && numeros[index++] != numero_buscado);

		if(numeros[--index] == numero_buscado)
			System.out.println("El numero " + numero_buscado + " esta en la " + (index + 1) + "a posicion");
		else
			System.out.println("El numero " + numero_buscado + " no esta en la lista");
	}

	static int init() 
	{
		for(int i=0;i<numeros.length;i++)
			numeros[i] = (int) (Math.random()*10);

		int numero_buscado = (int) (Math.random()*10);

		return numero_buscado;
	}
		
}