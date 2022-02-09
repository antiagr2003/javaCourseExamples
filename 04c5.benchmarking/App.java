public class App
{
	public static void main(String[] args) 
	{
		double ITERACIONES = Math.pow(10, 6);

		long inicio = System.currentTimeMillis();
		long inicioNano = System.nanoTime();
		
		//Lógica a testear
		double d;
		for(int i=0;i<ITERACIONES;i++)
		    d = Math.sqrt(i*2*1000*1000);

		long fin = System.currentTimeMillis(); 
		long finNano = System.nanoTime();   
		long tiempo = fin - inicio;	
		long nanoTiempo = finNano - inicioNano;	

		//Salida del benchmark
		System.out.printf("Tiempo de ejecucion: %d msec.\n", tiempo);
		System.out.printf("Tiempo de ejecucion: %.2f msec.", (float) (nanoTiempo/(1000*1000.)));
	}
}