import java.awt.Canvas;
import java.awt.Graphics;


public class Lienzo extends Canvas
{
	java.util.ArrayList figuras = new java.util.ArrayList();

	void pintar(Figura figura)
	{
		figuras.add(figura);
	}

	@Override
	public void paint(Graphics g)
	{
		for(int i=0;i<figuras.size();i++)
		{
			Figura f = (Figura) figuras.get(i);
			f.pintar(g);
		}
	}
}
