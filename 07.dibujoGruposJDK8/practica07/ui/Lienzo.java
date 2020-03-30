package practica07.ui;

import practica07.dominio.Figura;

import java.awt.Canvas;
import java.awt.Graphics;

import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;


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

	/*
	interface Stream
	void forEach(Consumer<? super T> action) --> acción
	*/
	public void setVisibleGrupo(String grupo, boolean visible)
	{
		Collection<Figura> figurasGrupo = figuras.get(grupo);
		if(figurasGrupo!=null)
			figurasGrupo.stream()
				.forEach(figura -> figura.setVisible(visible));
	}	

	public void setVisibleTodasFiguras(boolean visible)
	{
		figuras.values()
			.stream()
			.flatMap(Collection::stream)
			.forEach(figura -> figura.setVisible(visible));
	}

	/*

	filter(Predicate<? super T> predicate) --> condición
	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
	*/
	@Override
	public void paint(Graphics g)
	{
		figuras.values()
			   .stream()
			   .flatMap(Collection::stream)
   			   .filter(figura -> figura.isVisible())
			   .forEach(figura -> figura.pintar(g));
	}
}
