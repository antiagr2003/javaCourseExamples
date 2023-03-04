package ejemploFornite.domain.objetos;

import ejemploFornite.domain.Personaje;

public class Botiquin implements Objeto
{
	private int vida;

	public Botiquin(int vida)
	{
		this.vida = vida;
	}

	@Override
	public void consumirBy(Personaje personaje)
	{
		personaje.mejorarVida(vida);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Botiquin con ").append(vida).append(" de vida");
		return sb.toString();
	}
}