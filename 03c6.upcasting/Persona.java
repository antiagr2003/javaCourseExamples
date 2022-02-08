public class Persona
{
	String nombre;
	int edad;
	String dir;

	Persona(String nombre, int edad, String dir)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dir = dir;
	}

	Persona(String nombre)
	{
		this.nombre = nombre;
		this.edad = 18;
	}

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
		return nombre + " - " + edad + " - "+ dir;
	}		
}
