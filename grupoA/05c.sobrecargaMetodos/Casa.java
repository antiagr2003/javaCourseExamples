public class Casa
{
	//atributos
	int cantidadMaterial;
	String material;

	Casa(int cantidadMaterial, String material)
	{
		this.cantidadMaterial = cantidadMaterial;
		this.material = material;
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

	String getMaterial()
	{
		return material;
	}

	void setMaterial(String material)
	{
		this.material = material;
	}	

	int recibirPico()
	{
		int piedraRestada = 0;
		int piedraPorPico = 0;
		
		switch(material)
		{
			case "LADRILLO":
				piedraPorPico = 10;
				break;
			case "MADERA":
				piedraPorPico = 20;
				break;
			default:
				piedraPorPico = 5;
		}
		
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