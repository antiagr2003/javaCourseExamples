public class AppDibujo02
{
	static int NUMERO_FIGURAS = 10;
	static int OFFSET = 30;
	static int RADIO = 200;

	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();

		//Figura figura = new Figura(1, 1, true, java.awt.Color.RED);

		for(int i=0;i<NUMERO_FIGURAS;i++)
		{
			dibujo.pintar(new Circulo(i*OFFSET, i*OFFSET, false, java.awt.Color.BLUE, RADIO));
			Util.wait(1);
		}
	}
}