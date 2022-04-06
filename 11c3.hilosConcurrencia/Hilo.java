public class Hilo extends Thread
{
	private JVentanaConcurrencia ventana;
	private String nombre;

	public Hilo(String nombre, JVentanaConcurrencia ventana)
	{
		this.nombre = nombre;
		this.ventana = ventana;
	}

	public void run()
	{
		for(int i=0;i<100;i++)
			ventana.actualizarTexto(nombre + ": " + i);
	}
}