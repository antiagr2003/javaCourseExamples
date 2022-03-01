package ejemploFornite.domain.construcciones;

public class Casa extends Construccion
{
	private Material material;

	public Casa(int cantidadMaterial, Material material)
	{
		super(cantidadMaterial);
		this.setMaterial(material);
	}

	public Material getMaterial()
	{
		return material;
	}

	public void setMaterial(Material material)
	{
		this.material = material;
	}	

	public boolean isVivo()
	{
		return (cantidadMaterial > 0);
	}

	@Override
	public int materialPorPico()
	{
		return material.getValor();
	}

	@Override
	public String toString()
	{
		return "Cantidad de Material: " + cantidadMaterial + " Material: " + material;
	}
}