public class AppSolucion03
{
	static String nombre = "Luis";
	static String apellidos = "Lopez";
	static int edad = 22;

	static int ITERACIONES = 1000000;
	static int CONCATENACIONES_MAX = 1;
	static int CARACTERES_MAX = 20;
	static final int CONCATENACIONES_STEP = 1;
	static String STRING_A_CONCATENAR = "A";

	public static void main(String[] args) 
	{
		if(args.length>0)
			CONCATENACIONES_MAX = Integer.parseInt(args[0]);

		System.out.printf("\nIteraciones: %d.\n", ITERACIONES);
		System.out.printf("Concatenaciones: %s.\n", CONCATENACIONES_MAX);
		System.out.println("Tiempo de ejecucion Operador +");
		
		STRING_A_CONCATENAR = "A";

		for(int caracteres=0;caracteres<CARACTERES_MAX;caracteres+=1)		
		{
			long tiempo1 = 0;
			for(int i=0;i<ITERACIONES;i++)	
				tiempo1 += AppSolucion03.concatenarOperadorMas();
			tiempo1 /= ITERACIONES;
			System.out.printf("%d, %.4f\n",caracteres, (float) (tiempo1/(1000.)));
			STRING_A_CONCATENAR += "A";
		}

		STRING_A_CONCATENAR = "A";

		System.out.println("Tiempo de ejecucion StringBuilder");
		for(int caracteres=0;caracteres<CARACTERES_MAX;caracteres+=1)		
		{
			long tiempo1 = 0;
			for(int i=0;i<ITERACIONES;i++)	
				tiempo1 += AppSolucion03.concatenarStringBuilder();
			tiempo1 /= ITERACIONES;
			System.out.printf("%d, %.4f\n",caracteres, (float) (tiempo1/(1000.)));
			STRING_A_CONCATENAR += "A";
		}
		
	}

	static long concatenarOperadorMas()
	{
		long inicioNano = System.nanoTime();
		String s = "";
		for(int i=0;i<CONCATENACIONES_MAX;i++)
			s += STRING_A_CONCATENAR;
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}

	static long concatenarStringBuilder()
	{
		long inicioNano = System.nanoTime();		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<CONCATENACIONES_MAX;i++)
			sb.append(STRING_A_CONCATENAR);
		String s = sb.toString();
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;		
	}	
}