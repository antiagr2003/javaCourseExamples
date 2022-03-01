package ejemploFornite.domain.construcciones;

public class Arbol extends Construccion
{
	//atributos
	private int maderaPorPico;

	public Arbol(int maderaTotal, int maderaPorPico)
	{
		super(maderaTotal);
		this.maderaPorPico = maderaPorPico;
	}

	public int getMaderaPorPico()
	{
		return maderaPorPico;
	}

	public void setMaderaPorPico(int unaMadera)
	{
		maderaPorPico = unaMadera;
	}	

	public boolean isVivo()
	{
		return (cantidadMaterial > 0);
	}

	@Override
	public int materialPorPico()
	{
		return maderaPorPico;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Madera: ")
			.append(cantidadMaterial)
			.append(" Madera restada por pico: ")
			.append(maderaPorPico);
		return sb.toString();
	}
}