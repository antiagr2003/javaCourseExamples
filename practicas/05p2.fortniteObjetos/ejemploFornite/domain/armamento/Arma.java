package ejemploFornite.domain.armamento;

/**
 * El cargador es infinito. La recarga de balas no tiene límite.
**/

public abstract class Arma
{
	private String nombre;
	/** Balas actuales en el cargador */
	private int balas;
	private int damage;

	public Arma(String nombre, int balas, int damage)
	{
		this.nombre = nombre;
		this.balas = balas;
		this.damage = damage;
	}

	public Arma(String nombre)
	{
		this.nombre = nombre;
	}


	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getBalas()
	{
		return balas;
	}

	public void setBalas(int balas)
	{
		this.balas = balas;
	}	

	public int getDamage()
	{
		return damage;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}	

	public void recargar(int balas)
	{
		this.setBalas(balas);
	}

	public void disparar()
	{
		if(this.canShoot())
			balas--;
	}

	public boolean canShoot()
	{
		return (balas > 0);
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Arma arma)
			return arma.getNombre().equals(this.nombre);
		else
			return false;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(nombre).append(" (").append(balas).append(")")
		  .append(" -> ").append(damage).append(" damage ");
		return sb.toString();
	}
}