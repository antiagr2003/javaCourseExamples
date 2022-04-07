public class Hilo extends Thread
{
	String nombre;
	GestorHilos gh;

	public Hilo(String nombre, GestorHilos gh)
	{
		this.nombre = nombre;
		this.gh = gh;
	}

	@Override
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			}
			int valor = (int)(Math.random()*10);
			gh.addValor(nombre, valor);
		}
		gh.fin();
	}
}