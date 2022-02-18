public class AppSolucion02
{
	static String nombre = "Luis";
	static String apellidos = "Lopez";
	static int edad = 22;

	static final int ITERACIONES = 1000000;
	static final int CONCATENACIONES_MAX = 20;
	static final int CONCATENACIONES_STEP = 1;
	static final String STRING_A_CONCATENAR = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

	public static void main(String[] args) 
	{
		System.out.printf("\nIteraciones: %d.\n", ITERACIONES);
		System.out.printf("String a concatenar: %s.\n", STRING_A_CONCATENAR);

		System.out.println("Tiempo de ejecucion Operador +");
		for(int concatenaciones=0;concatenaciones<CONCATENACIONES_MAX;concatenaciones+=CONCATENACIONES_STEP)		
		{
			long tiempo1 = 0;
			for(int i=0;i<ITERACIONES;i++)	
				tiempo1 += AppSolucion02.concatenarOperadorMas(concatenaciones);
			tiempo1 /= ITERACIONES;
			System.out.printf("%d, %.4f usec\n",concatenaciones, (float) (tiempo1/(1000.)));
		}

		System.out.println("Tiempo de ejecucion StringBuilder");
		for(int concatenaciones=0;concatenaciones<CONCATENACIONES_MAX;concatenaciones+=CONCATENACIONES_STEP)		
		{
			long tiempo1 = 0;
			for(int i=0;i<ITERACIONES;i++)	
				tiempo1 += AppSolucion02.concatenarStringBuilder(concatenaciones);
			tiempo1 /= ITERACIONES;
			System.out.printf("%d, %.4f usec\n",concatenaciones, (float) (tiempo1/(1000.)));
		}
		
	}

	static long concatenarOperadorMas(int concatenaciones)
	{
		long inicioNano = System.nanoTime();
		String s = "";
		for(int i=0;i<concatenaciones;i++)
			s += STRING_A_CONCATENAR;
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}

	static long concatenarStringBuilder(int concatenaciones)
	{
		long inicioNano = System.nanoTime();		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<concatenaciones;i++)
			sb.append(STRING_A_CONCATENAR);
		String s = sb.toString();
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;		
	}	
}