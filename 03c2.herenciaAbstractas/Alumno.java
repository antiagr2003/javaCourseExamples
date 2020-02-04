/*
 Esta clase define el comportamiento de objetos Persona
*/
public class Alumno extends Persona implements Estudiable//, Cloonable, Comparable, Pintable
{
	String titulo;
	String curso;

	Alumno(String nombre, int edad, String titulo, String curso)
	{
		super(nombre, edad);
		this.curso = curso;
		this.titulo = titulo;
	}

	String getTitulo()
	{
		return titulo;
	}

	String getCurso()
	{
		return curso;
	}	

	void setTitulo(String titulo)
	{
		this.titulo	= titulo;
	}

	void setCurso(String curso)
	{
		this.curso	= curso;
	}

	@Override
	String andar()
	{
		return "andando....";
	}

	@Override
	public String estudiar()
	{
		return "Estudiando";
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + 
		"\nTitulo: " + titulo + 
		"\nCurso: " + curso ;		
	}
}