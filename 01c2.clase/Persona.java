/*
 Esta clase define el comportamiento de objetos Persona
*/

public class Persona
{
	//atributos
	String nombre;
	int edad;

	//Constructores

	Persona(String x, int y)
	{
		nombre = x;
		edad = y;
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

	String getInfo()
	{
		return "===========\nNombre: " + this.getNombre() + "\nEdad: " + edad;
	}

}