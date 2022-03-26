package practica07.ui;

import practica07.dominio.Figura;

import java.awt.Canvas;
import java.awt.Graphics;

import java.util.ArrayList;
import java.util.Collection;

public class Lienzo extends Canvas
{
	private java.util.HashMap<String, Collection<Figura>> figuras = new java.util.HashMap<String, Collection<Figura>>();

	public void pintar(String grupo, Figura figura)
	{
		Collection<Figura> figurasGrupo = figuras.get(grupo);
		if(figurasGrupo==null)
		{
			figurasGrupo = new java.util.ArrayList<Figura>();
			figurasGrupo.add(figura);
			figuras.put(grupo, figurasGrupo);
		}
		else
			figurasGrupo.add(figura);		
	}

	public void setVisibleGrupo(String grupo, boolean visible)
	{
		Collection<Figura> figurasGrupo = figuras.getOrDefault(grupo, new java.util.ArrayList<Figura>());
		for(Figura figura:figurasGrupo)
			figura.setVisible(visible);
	}	

	public void setVisibleTodasFiguras(boolean visible)
	{
		for(Collection<Figura> todasFiguras:figuras.values())
			for(Figura figura:todasFiguras)
				figura.setVisible(visible);
	}

	@Override
	public void paint(Graphics g)
	{
		for(Collection<Figura> todasFiguras:figuras.values())
			for(Figura figura:todasFiguras)
				if(figura.isVisible())
					figura.pintar(g);
	}
}
