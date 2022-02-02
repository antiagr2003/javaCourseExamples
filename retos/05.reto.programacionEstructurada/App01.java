/*
Modificar el programa siguiente para que esté estructurado y 
funcione correctamente. Hay varios fallos de lógica.
*/

public class App01
{
	public static void main(String[] args) 
	{
		int numeros[] = new int[10];
		for(int i=0;i<10;i++)
			numeros[i] = (int) (Math.random()*10);

		int numero_buscado = (int) (Math.random()*10);
		int index = 0;

		for(int numero:numeros)
			System.out.print(numero + ", ");

		System.out.println();
		//Código a mejorar:

		while(true)
		{
			if(numeros[index++] == numero_buscado)
			{
				System.out.println("El numero " + numero_buscado + " esta en la posicion: " + index);
				break;
			}
			if(index == numeros.length)
				break;
		}
		System.out.println("El numero " + numero_buscado + " no esta en la lista");
	}
}