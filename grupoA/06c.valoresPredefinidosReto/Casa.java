public class Casa
{
	//Atributos de clase de ayuda para asignación de valores
	public final static int LADRILLO = 20;
	public final static int MADERA = 10;
	public final static int OTROS = 5;

	//Atributos
	int cantidadMaterial;
	int material;

	Casa(int cantidadMaterial, int material)
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

	int getMaterial()
	{
		return material;
	}

	void setMaterial(int material)
	{
		switch(material)
		{
			case LADRILLO:
			case MADERA:
			case OTROS:
				this.material = material;
				break;
			default:
				this.material = OTROS;
		}
	}	

	int recibirPico()
	{
		int piedraRestada = 0;
		int piedraPorPico = material;
		
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

	String getMaterialAsTexto()
	{
		String texto = "OTROS";
		switch(material)
		{
			case LADRILLO:
				texto = "LADRILLO";
				break;
			case MADERA:
				texto = "MADERA";
				break;
		}
		return texto;
	}

	String getInfo()
	{
		return "Cantidad de Material: " + cantidadMaterial + " Material: " + this.getMaterialAsTexto();
	}
}