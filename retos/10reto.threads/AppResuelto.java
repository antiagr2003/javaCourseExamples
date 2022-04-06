import java.util.Date;

class App
{
	public static final int numeroIteraciones = 100000; 
	static int numeroHilos = 20;	
	static int numeroHilosRecibidos = 0;	
	static double sumaTotal = 0;	
	static long tiempo0;

	public static void main(String[] args) 
	{
		App.ejecucionUnSoloHilo();
		App.ejecucionMultiHilo();
	}

	private static void ejecucionUnSoloHilo() 
	{
		System.out.println("Empezando ejecucion con un hilo...");
		System.out.println("---esta tarea puede llevar unos segundos---");
		tiempo0 = new Date().getTime();
		double suma = 0.0;

		for(int i=0;i<numeroIteraciones;i++)
			suma += Util.exec(i);
		
		long tiempo1 = new Date().getTime();
		System.out.println(suma);
		System.out.println("Tiempo consumido: " + (tiempo1-tiempo0)/1000 + " seg.");
	}

	private static void ejecucionMultiHilo() 
	{
		System.out.println("Empezando ejecucion con Multihilo...");
		tiempo0 = new Date().getTime();
		double suma = 0.0;

		//ToDo con 20 Threads

		for(int hilo=0;hilo<numeroHilos;hilo++)
			new Calculo(hilo, numeroHilos).start();
		
	}	

	public synchronized static void acumular(double sumaParcial) 
	{
		sumaTotal += sumaParcial;
		numeroHilosRecibidos++;
		if(numeroHilosRecibidos == numeroHilos)
		{
			long tiempo1 = new Date().getTime();
			System.out.println(sumaTotal);
			System.out.println("Tiempo consumido: " + (tiempo1-tiempo0)/1000 + " seg.");	
		}
	}
}