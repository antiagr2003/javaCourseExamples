public class Estudiante extends Persona
{
	int clave;
	String titulo;

	Estudiante(String nombre, int edad, String dir, int clave, String titulo)
	{
		super(nombre, edad, dir);
		this.clave = clave;
		this.titulo = titulo;
	}

	Estudiante(String nombre, int clave, String titulo)
	{
		super(nombre);
		this.clave = clave;
		this.titulo = titulo;
	}	

	void setClave(int clave)
	{
		this.clave = clave;
	}

	void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	int getClave()
	{
		return clave;
	}	

	@Override
	String confinar()
	{
		return "Confinando Estudiante => Asistiendo a clases online....";
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + " " + titulo + " (" + clave + ")";
	}	
}