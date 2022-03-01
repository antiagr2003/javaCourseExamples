package ejemploFornite.domain.armamento;

public class ArmaClasica extends Arma
{
	private int usos;

	public ArmaClasica(String nombre, int balas, int damage, int usos)
	{
		super(nombre, balas, damage);
		this.usos = usos;
	}

	public ArmaClasica(String nombre)
	{
		super(nombre);
	}	

	public int getUsos()
	{
		return usos;
	}

	public void setUsos(int usos)
	{
		this.usos = usos;
	}	

	@Override
	public void disparar()
	{
		super.disparar();
		usos--;
	}

	@Override
	public boolean canShoot()
	{
		return super.canShoot() && (usos > 0);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Usos:").append(usos);
		return sb.toString();
	}
}