public class Casa
{
	//Atributos
	int cantidadMaterial;
	Material material;

	Casa(int cantidadMaterial, Material material)
	{
		this.cantidadMaterial = cantidadMaterial;
		this.setMaterial(material);
	}

	//métodos
	int getCantidadMaterial()
	{
		return cantidadMaterial;
	}

	void setCantidadMaterial(int cantidadMaterial)
	{
		this.cantidadMaterial = cantidadMaterial;
	}

	Material getMaterial()
	{
		return material;
	}

	void setMaterial(Material material)
	{
		this.material = material;
	}	

	int recibirPico()
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

	boolean isVivo()
	{
		return (cantidadMaterial > 0);
	}

	String getInfo()
	{
		return "Cantidad de Material: " + cantidadMaterial + " Material: " + material;
	}
}