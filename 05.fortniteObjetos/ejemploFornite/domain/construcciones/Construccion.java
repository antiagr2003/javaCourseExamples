package ejemploFornite.domain.construcciones;

public abstract class Construccion
{
	protected int cantidadMaterial;

	public Construccion(int cantidadMaterial)
	{
		this.cantidadMaterial = cantidadMaterial;
	}

	public abstract int materialPorPico();

	public int getCantidadMaterial()
	{
		return cantidadMaterial;
	}

	public void setCantidadMaterial(int cantidadMaterial)
	{
		this.cantidadMaterial = cantidadMaterial;
	}

	public int recibirPico()
	{
		int materialRestado = 0;
		int materialPorPico = this.materialPorPico();
		
		if((cantidadMaterial - materialPorPico) >= 0)
		{
			cantidadMaterial -= materialPorPico;
			materialRestado = materialPorPico;
		}
		else
		{
			cantidadMaterial = 0;
			materialRestado = cantidadMaterial;
		}

		return materialRestado;
	}

}