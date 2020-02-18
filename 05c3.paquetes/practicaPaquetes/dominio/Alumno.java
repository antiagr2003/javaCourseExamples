package practicaPaquetes.dominio;

/*
 Esta clase define el comportamiento de objetos Persona
*/
public class Alumno extends Persona
{
	private String titulo;
	private String curso;

	public Alumno(String nombre, int edad, String titulo, String curso)
	{
		super(nombre, edad);
		this.nombre = nombre; //Solo en el caso de que sea extrictamente necesario, se podría modificar porque está declarado como protected. 
		this.curso = curso;
		this.titulo = titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo	= titulo;
	}

	public void setCurso(String curso)
	{
		this.curso	= curso;
	}

	@Override
	public String toString()
	{
		return super.toString() + 
		"\nTitulo: " + titulo + 
		"\nCurso: " + curso ;		
	}
}