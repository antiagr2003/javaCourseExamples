package ejemploFornite.domain;

public class Casa implements Picable
{
	//Atributos
	int cantidadMaterial;
	Material material;

	public Casa(int cantidadMaterial, Material material)
	{
		this.cantidadMaterial = cantidadMaterial;
		this.setMaterial(material);
	}

	//métodos
	public int getCantidadMaterial()
	{
		return cantidadMaterial;
	}

	public void setCantidadMaterial(int cantidadMaterial)
	{
		this.cantidadMaterial = cantidadMaterial;
	}

	public Material getMaterial()
	{
		return material;
	}

	public void setMaterial(Material material)
	{
		this.material = material;
	}	

	@Override
	public int recibirPico()
	{
		int piedraRestada = 0;
		int piedraPorPico = material.getValor();
		
		if((cantidadMaterial - piedraPorPico) >= 0)
		{
			cantidadMaterial -= piedraPorPico;
			piedraRestada = piedraPorPico;
		}
		else
		{
			cantidadMaterial = 0;
			piedraRestada = cantidadMaterial;
		}

		return piedraRestada;
	}

	public boolean isVivo()
	{
		return (cantidadMaterial > 0);
	}

	@Override
	public String toString()
	{
		return "Cantidad de Material: " + cantidadMaterial + " Material: " + material;
	}
}