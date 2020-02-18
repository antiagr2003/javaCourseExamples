/*
 Esta clase define el comportamiento de objetos Persona
*/
public class Alumno extends Persona
{
	String titulo;
	String curso;

	Alumno(String nombre, String titulo, String curso)
	{
		super(nombre);
		this.curso = curso;
		this.titulo = titulo;
	}


	void setTitulo(String titulo)
	{
		this.titulo	= titulo;
	}

	void setCurso(String curso)
	{
		this.curso	= curso;
	}

	String getInfo()
	{
		return super.getInfo() + 
		"\nTitulo: " + titulo + 
		"\nCurso: " + curso ;		
	}
}