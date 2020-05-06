public class App
{
	public static void main(String args[]) 
	{
		int numeros[] = new int[10];
		for(int i=0;i<numeros.length;i++)
		{
			System.out.print("#: ");
			int numero = Integer.parseInt(Leer.porTeclado());
			numeros[numero]++;
		}

		int frecuenciaMax = Integer.MIN_VALUE;
		int moda = 0;
		for(int i=0;i<numeros.length;i++)
			if(numeros[i]>frecuenciaMax)
			{
				frecuenciaMax = numeros[i];
				moda = i;
			}

		System.out.println("Moda: " + moda + " - Prob: " + frecuenciaMax/(numeros.length*1.0));
	}
}