public class AppMapa
{
	public static int NUMERO_MAX = 10;

	public static void main(String args[]) 
	{
		java.util.HashMap<Integer, Integer> numeros = new java.util.HashMap<Integer, Integer>();
		for(int i=0;i<NUMERO_MAX;i++)
		{
			System.out.print("#: ");
			int numero = Integer.parseInt(Leer.porTeclado());
			Integer frecuencia = numeros.get(numero); //AUTOBOXING
			if(frecuencia==null)
				frecuencia = 0; //Autoboxing
			numeros.put(numero, frecuencia+1); //Autoboxing
		}

		java.util.Iterator<Integer> itNums = numeros.keySet().iterator();
		java.util.Iterator<Integer> itFreq = numeros.values().iterator();
		int frecuenciaMax = Integer.MIN_VALUE;
		int modaFinal = 0;		
		while(itNums.hasNext())
		{
			int freq = itFreq.next();
			int moda = itNums.next();
			if(freq>frecuenciaMax)
			{
				frecuenciaMax = freq;
				modaFinal = moda;
			}
		}

		System.out.println("Moda: " + modaFinal + " - Prob: " + frecuenciaMax/(NUMERO_MAX*1.0));
	}
}