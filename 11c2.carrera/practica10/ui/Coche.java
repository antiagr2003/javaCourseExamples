package practica10.ui;
import practica10.dominio.Circulo;

public class Coche extends Thread
{
	public static final int offset = 30;
	
	private int dorsal;
	private JVentanaDibujo ventana;

	public Coche(int dorsal, JVentanaDibujo v)
	{
		this.dorsal = dorsal;
		this.ventana = v;
	}

	@Override
	public void run()
	{

		Circulo c = new Circulo(1, 100*dorsal, true, java.awt.Color.RED, 30);
		ventana.getDibujo().addFigura("Coche" + dorsal, c);
		ventana.getLienzo().repaint();
		for(int x=1;x<600;x+=1)
		{
			c.setX(x);
			ventana.getLienzo().repaint();
			//Se introduce una carga pequeña de CPU: println para que el planificador deba sacar a alguno de los hilos
			System.out.print("Pintando coche #" + dorsal + " " + " " + " " + " " + " " + " ");
			System.out.print(" " + " ");
			System.out.print(" " + " ");
			System.out.print(" " + " ");
			System.out.print(" " + " ");
			System.out.print("\n");
		}
	}
}