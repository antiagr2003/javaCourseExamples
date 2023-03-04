package ejemploFornite.domain.objetos;

import ejemploFornite.domain.Personaje;
import ejemploFornite.domain.armamento.Arma;

public class Municion implements Objeto
{
	/** Arma para la cual tiene validez */
	private Arma arma;
	/** Balas nuevas a meter en el cargador*/
	private int balas;

	public Municion(Arma arma, int balas)
	{
		this.arma = arma;
		this.balas = balas;
	}

	@Override
	public void consumirBy(Personaje personaje)
	{
		Arma armaPersonaje = personaje.getArma(arma);
		if(armaPersonaje!=null)
			armaPersonaje.recargar(balas);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Munición para ").append(arma).append(" (").append(balas).append(")");
		return sb.toString();
	}
}