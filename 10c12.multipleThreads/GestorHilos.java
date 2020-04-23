import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class GestorHilos
{
	private ArrayList<Integer> valores = new ArrayList<>();
	private HashMap<Integer, Integer> mapaExito = new HashMap<>();

	private int finalizados = 0;

	public GestorHilos()
	{
		Hilo hilos[] = new Hilo[4];
		hilos[0] = new Hilo("Hilo 1", this);
		hilos[1] = new Hilo("Hilo 2", this);
		hilos[2] = new Hilo("Hilo 3", this);
		hilos[3] = new Hilo("Hilo 4", this);

		for(Hilo h:hilos)
			h.start();
	}

	public synchronized void fin()
	{
		if(++finalizados==4)
			System.out.println(mapaExito);
	}

	public synchronized void addValor(String nombreHilo, int valor)
	{
		System.out.println(nombreHilo + ": " + valor );		
		valores.add(valor);
		if(valores.size()==4)
		{
			HashSet<Integer> valoresSet = new HashSet<>(valores);
			int coincidencias = valores.size()-valoresSet.size();
			coincidencias++;
			if(coincidencias > 1)
			{
				System.out.println("Coincidencias: " + (coincidencias));
			}
			else
				System.out.println("Sin coincidencias");

			Integer veces = mapaExito.get(coincidencias);
			if(veces==null)
				veces = 0;
			mapaExito.put(coincidencias, veces+1);

			valores.clear();
			valoresSet.clear();
			System.out.println("--------------------------------------");			
		}
	}
}