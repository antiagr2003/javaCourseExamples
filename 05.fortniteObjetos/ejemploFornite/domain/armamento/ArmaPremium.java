package ejemploFornite.domain.armamento;

public class ArmaPremium extends Arma
{
	private float precio;

	public ArmaPremium(String nombre, int balas, int damage, float precio)
	{
		super(nombre, balas, damage);
		this.precio = precio;
	}

	public ArmaPremium(String nombre)
	{
		super(nombre);
	}	

	public float getPrecio()
	{
		return precio;
	}

	public void setPrecio(float precio)
	{
		this.precio = precio;
	}	

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" - ").append(precio).append("E");
		return sb.toString();
	}
}