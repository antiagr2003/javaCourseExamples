public class Trabajador extends Persona
{
	double sueldo;
	String profesion;

	Trabajador(String nombre, int edad, String dir, String profesion, double sueldo)
	{
		super(nombre, edad, dir);
		this.profesion = profesion;
		this.sueldo = sueldo;
	}

	Trabajador(String nombre, String profesion, double sueldo)
	{
		super(nombre);
		this.profesion = profesion;
		this.sueldo = sueldo;
	}	

	void setProfesion(String profesion)
	{
		this.profesion = profesion;
	}

	void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}

	double getSueldo()
	{
		return sueldo;
	}	

	@Override
	String confinar()
	{
		return "Confinando Trabajador => Teletrabajando...";
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + " " + profesion + " (" + sueldo + ")";
	}	

/* NOOOOOOOO
	String getInfoTrabajador()
	{
		return nombre + "-" + edad + "-" + profesion + " (" + sueldo + ")";
	}	
*/
}