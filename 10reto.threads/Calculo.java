public class Calculo extends Thread
{
	private int idHilo;
	private int numeroHilos;

	public Calculo(int idHilo, int numeroHilos)
	{
		this.idHilo = idHilo;
		this.numeroHilos = numeroHilos;
	}

	public void run()
	{
		double suma = 0.0;

		for(int i=0;i<App.numeroIteraciones/numeroHilos;i++)
		{
			suma += Util.exec(i+idHilo*App.numeroIteraciones/numeroHilos);
		}

		App.acumular(suma);
	}
}