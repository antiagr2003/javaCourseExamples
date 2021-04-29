public class Hilo extends Thread
{
	private JVentanaConcurrencia ventana;

	public Hilo(JVentanaConcurrencia ventana)
	{
		this.ventana = ventana;
	}

	public void run()
	{
		for(int i=0;i<100;i++)
			ventana.actualizarTexto("Texto: " + i);
	}
}