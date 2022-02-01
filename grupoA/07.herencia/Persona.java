public class Persona
{
	int edad;
	String nombre;

	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	void setEdad(int edad)
	{
		this.edad = edad;
	}

	int getEdad()
	{
		return edad;
	}

	String getNombre()
	{
		return nombre;
	}	

	String getInfo()
	{
		return nombre + " ###### " + edad;
	}		
}
