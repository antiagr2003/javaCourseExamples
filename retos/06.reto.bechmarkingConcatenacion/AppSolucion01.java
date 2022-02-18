public class AppSolucion01
{
	static String nombre = "Luis";
	static String apellidos = "Lopez";
	static int edad = 22;

	static final int ITERACIONES = 100000000;

	public static void main(String[] args) 
	{

		long tiempo1 = 0;
		for(int i=0;i<ITERACIONES;i++)		
			tiempo1 += AppSolucion01.concatenarOperadorMas();

		tiempo1 /= ITERACIONES;

		long tiempo2 = 0;
		for(int i=0;i<ITERACIONES;i++)		
			tiempo2 += AppSolucion01.concatenarStringBuilder();

		tiempo2 /= ITERACIONES;

		long tiempo3 = 0;
		for(int i=0;i<ITERACIONES;i++)		
			tiempo3 += AppSolucion01.concatenarStringFormat();

		tiempo3 /= ITERACIONES;

		System.out.printf("\nIteraciones: %d.\n", ITERACIONES);
		
		System.out.printf("\nTiempo de ejecucion Operador +: %.4f usec.", (float) (tiempo1/(1000.)));
		System.out.printf("\nTiempo de ejecucion StringBuilder: %.4f usec.", (float) (tiempo2/(1000.)));
		System.out.printf("\nTiempo de ejecucion String.format: %.4f usec.", (float) (tiempo3/(1000.)));
	}

	static long concatenarOperadorMas()
	{
		long inicioNano = System.nanoTime();
		String s = "Nombre ";
		s += nombre;
		s += " Apellidos ";
		s += apellidos;
		s += " Edad ";
		s += edad;
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}

	static long concatenarStringBuilder()
	{
		long inicioNano = System.nanoTime();		
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre ");
		sb.append(nombre);
		sb.append(" Apellidos ");
		sb.append(apellidos);
		sb.append(" Edad ");
		sb.append(edad);
		String s = sb.toString();
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;		
	}	

	static long concatenarStringFormat()
	{
		long inicioNano = System.nanoTime();
		String s = String.format("Nombre %s Apellidos %s Edad %d", nombre, apellidos, edad);
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;	
	}		
}