package ejemploFornite.domain;

public class Arbol implements Picable
{
	//atributos
	int maderaTotal;
	int maderaPorPico;

	public Arbol(int maderaTotal, int maderaPorPico)
	{
		this.maderaTotal = maderaTotal;
		this.maderaPorPico = maderaPorPico;
	}

	//métodos
	public int getMaderaTotal()
	{
		return maderaTotal;
	}

	public void setMaderaTotal(int unaMadera)
	{
		maderaTotal = unaMadera;
	}

	public int getMaderaPorPico()
	{
		return maderaPorPico;
	}

	public void setMaderaPorPico(int unaMadera)
	{
		maderaPorPico = unaMadera;
	}	

	@Override
	public int recibirPico()
	{
		int maderaRestada = 0;
		
		if((maderaTotal - maderaPorPico) >= 0)
		{
			maderaTotal -= maderaPorPico;
			maderaRestada = maderaPorPico;
		}
		else
		{
			maderaTotal = 0;
			maderaRestada = maderaTotal;
		}

		return maderaRestada;
	}

	public boolean isVivo()
	{
		return (maderaTotal > 0);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Madera: ")
			.append(maderaTotal)
			.append(" Madera restada por pico: ")
			.append(maderaPorPico);
		return sb.toString();
	}
}