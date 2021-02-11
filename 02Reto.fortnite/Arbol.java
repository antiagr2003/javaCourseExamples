public class Arbol
{
	private String nombre;
	private int material;

	public Arbol(String nombre, int material)
	{
		this.nombre = nombre;
		this.material = material;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}	

	public int getMaterial()
	{
		return material;
	}

	public void setMaterial(int material)
	{
		this.material = material;
	}

	public int picar()
	{
		if(material > 0)
		{
			this.material = 25;
			return 25;
		}
		else 
			return 0;
	}

	public String getInfo()
	{
		return nombre + "-" + material;
	}
}