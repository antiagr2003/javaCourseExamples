package practica07.ui;

import practica07.dominio.Figura;

import java.awt.Canvas;
import java.awt.Graphics;

import java.util.Iterator;
import java.util.Collection;
import java.util.Map.Entry;


public class Lienzo extends Canvas
{
	private java.util.HashMap figuras = new java.util.HashMap();

	public void pintar(String grupo, Figura figura)
	{
		Collection figurasGrupo = (Collection) figuras.get(grupo);
		if(figurasGrupo==null)
		{
			figurasGrupo = new java.util.ArrayList();
			figurasGrupo.add(figura);
			figuras.put(grupo, figurasGrupo);
		}
		else
			figurasGrupo.add(figura);
	}

	public void setVisibleGrupo(String grupo, boolean visible)
	{
		Collection figurasGrupo = (Collection) figuras.get(grupo);
		if(figurasGrupo!=null)
		{
			Iterator it = figurasGrupo.iterator();
			while(it.hasNext())
			{
				Figura figura = ((Figura) it.next());
				figura.setVisible(visible);
			}
		}
	}	

	public void setVisibleTodasFiguras(boolean visible)
	{
		Iterator it = figuras.values().iterator();
		while(it.hasNext())
		{
			Iterator itFigurasGrupo = ((Collection) it.next()).iterator();
			while(itFigurasGrupo.hasNext())
				((Figura) itFigurasGrupo.next()).setVisible(visible);
		}
	}

	@Override
	public void paint(Graphics g)
	{
		Iterator it = figuras.values().iterator();
		while(it.hasNext())
		{
			Iterator itFigurasGrupo = ((Collection) it.next()).iterator();
			while(itFigurasGrupo.hasNext())
			{
				Figura figura = (Figura) itFigurasGrupo.next();
				if(figura.isVisible())
					figura.pintar(g);
			}
		}
	}
}
