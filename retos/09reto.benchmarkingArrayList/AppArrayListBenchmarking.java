import java.util.ArrayList;
import java.util.LinkedList;

public class AppArrayListBenchmarking
{
	static int SIZE = 100;
	static int ITERACIONES = 1000*1000;
	static int WARM_UP = 30;

	public static void main(String args[]) 
	{
		if(args.length>0)
			SIZE = Integer.parseInt(args[0]);

		System.out.printf("\nIteraciones: %d.\n", ITERACIONES);
		
		System.out.println("\nADD\n");
		
		for(int agregaciones=0;agregaciones<SIZE;agregaciones+=1)		
		{
			long tiempo1 = 0;
			long tiempoMinimo = Long.MAX_VALUE;
			for(int i=0;i<ITERACIONES+WARM_UP;i++)	
			{
				tiempo1 += AppArrayListBenchmarking.agregarObjeto(agregaciones);
				if(i == WARM_UP)
					tiempo1 = 0;
				//tiempo1 = AppArrayListBenchmarking.agregarObjeto(SIZE);
				//tiempoMinimo = (tiempo1 < tiempoMinimo)?tiempo1:tiempoMinimo;
			}
			tiempo1 /= ITERACIONES;
			//tiempo1 = tiempoMinimo;
			System.out.printf("%d, %.4f\n", agregaciones, (float) (tiempo1/(1000.)));
		}

		System.out.println("\nINSERT\n");	
		
		for(int inserciones=0;inserciones<SIZE;inserciones+=1)		
		{
			long tiempo1 = 0;
			long tiempoMinimo = Long.MAX_VALUE;
			for(int i=0;i<ITERACIONES+WARM_UP;i++)	
			{
				tiempo1 += AppArrayListBenchmarking.insertarObjeto(inserciones);
				if(i == WARM_UP)
					tiempo1 = 0;
				//tiempo1 = AppArrayListBenchmarking.insertarObjeto(inserciones);
				//tiempoMinimo = (tiempo1 < tiempoMinimo)?tiempo1:tiempoMinimo;
			}
			tiempo1 /= ITERACIONES;
			//tiempo1 = tiempoMinimo;
			System.out.printf("%d, %.4f\n", inserciones, (float) (tiempo1/(1000.)));
		}

		System.out.println("\nREMOVE\n");

		for(int borrados=0;borrados<SIZE;borrados+=1)
		{
			long tiempo1 = 0;
			long tiempoMinimo = Long.MAX_VALUE;
			for(int i=0;i<ITERACIONES+WARM_UP;i++)	
			{
				tiempo1 += AppArrayListBenchmarking.eliminarObjeto(borrados);
				if(i == WARM_UP)
					tiempo1 = 0;
				//tiempo1 = AppArrayListBenchmarking.eliminarObjeto(borrados);
				//tiempoMinimo = (tiempo1 < tiempoMinimo)?tiempo1:tiempoMinimo;
			}
			tiempo1 /= ITERACIONES;
			//tiempo1 = tiempoMinimo;
			System.out.printf("%d, %.4f\n", borrados, (float) (tiempo1/(1000.)));
		}	

		System.out.println("\nGET\n");

		for(int devuelto=0;devuelto<SIZE;devuelto+=1)
		{
			long tiempo1 = 0;
			long tiempoMinimo = Long.MAX_VALUE;
			for(int i=0;i<ITERACIONES+WARM_UP;i++)	
			{
				tiempo1 += AppArrayListBenchmarking.devolverObjeto(devuelto);
				if(i == WARM_UP)
					tiempo1 = 0;
				//tiempo1 = AppArrayListBenchmarking.devolverObjeto(devuelto);
				//tiempoMinimo = (tiempo1 < tiempoMinimo)?tiempo1:tiempoMinimo;
			}
			tiempo1 /= ITERACIONES;
			//tiempo1 = tiempoMinimo;
			System.out.printf("%d, %.4f\n", devuelto, (float) (tiempo1/(1000.)));
		}	
	}

	static long agregarObjeto(int agregaciones)
	{
		//ArrayList lista = new ArrayList();
		LinkedList lista = new LinkedList();
		long inicioNano = System.nanoTime();
		for(int i=0;i<agregaciones;i++)
		{
			String objetoAInsertar = String.valueOf(i);
			lista.add(objetoAInsertar);
		}
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}

	static long insertarObjeto(int posicion)
	{
		//ArrayList lista = new ArrayList(SIZE+1);  //Para que no haya que aumentar la capacity
		LinkedList lista = new LinkedList();
		for(int i=0;i<SIZE;i++)
			lista.add(String.valueOf(i));

		long inicioNano = System.nanoTime();
		String objetoAInsertar = String.valueOf(posicion);
		lista.add(posicion, objetoAInsertar);
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}	

	static long eliminarObjeto(int posicion)
	{
		//ArrayList lista = new ArrayList(SIZE);
		LinkedList lista = new LinkedList();
		for(int i=0;i<SIZE;i++)
			lista.add(String.valueOf(i));

		long inicioNano = System.nanoTime();
		lista.remove(posicion);
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}	

	static long devolverObjeto(int posicion)
	{
		//ArrayList lista = new ArrayList(SIZE);
		LinkedList lista = new LinkedList();
		for(int i=0;i<SIZE;i++)
			lista.add(String.valueOf(i));

		long inicioNano = System.nanoTime();
		lista.get(posicion);
		long finNano = System.nanoTime();   
		long nanoTiempo = finNano - inicioNano;	
		return nanoTiempo;
	}	
}