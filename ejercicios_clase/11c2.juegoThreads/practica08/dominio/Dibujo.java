package practica08.dominio;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;


public class Dibujo
{
	public static final String ENEMIGOS = "Enemigos";
	public static final String NAVE = "Nave";

	private String nombre;
	private java.util.HashMap<String, Collection<Figura>> figuras = new java.util.HashMap<String, Collection<Figura>>();

	public Dibujo(String nombre)
	{
		this.nombre = nombre;
	}

	public void pintar(String grupo, Figura figura)
	{
		Collection<Figura> figurasGrupo = figuras.get(grupo);
		if(figurasGrupo == null)
			figurasGrupo = new ArrayList<Figura>();

		figurasGrupo.add(figura);
		figuras.put(grupo, figurasGrupo);
	}

	public void setVisibleGrupo(String grupo, boolean visible)
	{
		Collection<Figura> figurasGrupo = figuras.getOrDefault(grupo, new ArrayList<Figura>());
		figurasGrupo.forEach(figura -> figura.setVisible(visible));
	}
	
	public Collection<Figura> getEnemigos()
	{
		Collection<Figura> enemigos = figuras.getOrDefault(ENEMIGOS, new ArrayList<Figura>());
		return enemigos;
	}

	public void setVisibleTodasFiguras(boolean visible)
	{
		figuras.values()
			.stream()
			.flatMap(Collection::stream)
			.forEach(figura -> figura.setVisible(visible));
	}	

	public void pintar(Graphics g)
	{
		figuras.values()
			.stream()
			.flatMap(Collection::stream)
			.forEach(figura -> figura.pintar(g));
	}
}