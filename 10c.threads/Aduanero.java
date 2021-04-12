public class Aduanero extends Thread
{
	private String nombre;

	public Aduanero(String nombre)
	{
		this.nombre = nombre;
	}

	public void run()
	{
		for(int i=0;i<30;i++)
			System.out.println("Procesando....." + i + " by " + nombre);
	}
}