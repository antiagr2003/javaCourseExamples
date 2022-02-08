public class Universidad implements Premiable
{
	String nombre;
	String ciudad;

	Universidad(String nombre, String ciudad)
	{
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	void setEdad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	String getCiudad()
	{
		return ciudad;
	}

	String getNombre()
	{
		return nombre;
	}	

	String getInfo()
	{
		return nombre + " - " + ciudad;
	}	

	@Override
	public String premiar(String premio)
	{
		return "Premiada la universidad " + nombre + " con " + premio;
	}	
}
