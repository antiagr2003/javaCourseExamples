/*
 Esta clase define el comportamiento de objetos Persona
*/

public class Persona
{
	//atributos
	String nombre;
	int edad;

	//Constructores

	Persona()
	{

	}


	Persona(String nombre)
	{
		this.setNombre(nombre);
	}

	Persona(int edad, String nombre)
	{
		this(nombre, edad);
	}

	Persona(String nombre, int edad)
	{
		//this.nombre = nombre;
		//this.edad = edad;
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	//métodos
	String getNombre()
	{
		return nombre;
	}

	int getEdad()
	{
		return edad;
	}

	void setNombre(String unNombre)
	{
		nombre = unNombre.toUpperCase();
	}

	void setEdad(int unaEdad)
	{
		if(unaEdad >=0 && unaEdad < 130)
			edad = unaEdad;
	}

	boolean isMayorEdad()
	{
	/*	boolean b = false;
		if (edad >= MAYORIA_DE_EDAD)
			b = true;
		return b;
	*/
		return (edad >= 18);
	}

	//No forman parte del interfaz
	String formatHTML(float f)
	{
		return this.formatHTML(""+f);
	}

	String formatHTML(int i)
	{
		return this.formatHTML(""+i);
	}

	String formatHTML(String s)
	{
		return "<b><u>" + s + "</u></b>";
	}
	//Fin

	String getInfoHTML()
	{
		return "<br/>===========<br/>Nombre: " + 
				this.formatHTML	(nombre) + 
				"<br/>Edad: " + this.formatHTML(edad);
	}

	String getInfo()
	{
		return "===========\nNombre: " + 
				nombre + "\nEdad: " + edad;
	}

}