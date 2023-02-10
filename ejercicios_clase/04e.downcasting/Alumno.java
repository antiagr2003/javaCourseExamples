public class Alumno extends Persona
{
	String asignaturas;

	Alumno(String nombre, String asignaturas)
	{
		super(nombre);
		this.asignaturas = asignaturas;
	}

	String getAsignaturas()
	{
		return asignaturas;
	}

	String getInfo()
	{
		return super.getInfo() + " -> " + asignaturas;
	}
}