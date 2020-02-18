package practicaPaquetes.dominio;

/*
 Esta clase define el comportamiento de objetos Persona
*/

public class Persona
{
	public final static int EDAD_MIN = 0;
	public final static int EDAD_MAX = 130;
	public final static int MAYORIA_DE_EDAD = 18;

	//Atributos de Clase
	private static String CIUDAD;

	//atributos
	protected String nombre;
	private int edad;

	//Constructores
	public Persona(String nombre)
	{
		this.setNombre(nombre);
	}

	public Persona(int edad, String nombre)
	{
		this(nombre, edad);
	}

	public Persona(String nombre, int edad)
	{
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	//Métodos de clase

	public static String getCIUDAD()
	{
		return CIUDAD;
	}


	public static void setCIUDAD(String _CIUDAD)
	{
		CIUDAD = _CIUDAD;
	}


	//métodos
	public String getNombre()
	{
		return nombre;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre.toUpperCase();
	}

	public void setEdad(int edad) //en un futuro este método deberá lanzar un error en la validación
	{
		if(edad >=EDAD_MIN && edad < EDAD_MAX)
			this.edad = edad;
	}

	public boolean isMayorEdad()
	{
		return (edad >= MAYORIA_DE_EDAD);
	}

	//Este método no forma parte del interfaz. Se invoca de una forma interna.
	private String formatHTML(float f)
	{
		return this.formatHTML(""+f);
		//En un futuro: return this.formatHTML(String.valueOf(f));
	}

	//Este método no forma parte del interfaz. Se invoca de una forma interna.
	private  String formatHTML(int i)
	{
		return this.formatHTML(""+i);
		//En un futuro: return this.formatHTML(String.valueOf(i));
	}

	//Este método no forma parte del interfaz. Se invoca de una forma interna.
	private String formatHTML(String s)
	{
		return "<b><u>" + s + "</u></b>";
	}

	public String getInfoHTML()
	{
		return "<br/>===========" +
			   "<br/>Nombre: " + this.formatHTML(nombre) + 
			   "<br/>Edad: " + this.formatHTML(edad);
	}

	@Override
	public String toString()
	{
		return "\n===========" + 
		"\nNombre: " + nombre +
		"\nEdad: " + edad + 
		"\nCIUDAD: " + CIUDAD;
	}
}