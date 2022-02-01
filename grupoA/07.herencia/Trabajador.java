public class Trabajador extends Persona
{
	double sueldo;
	String profesion;

	void setProfesion(String profesion)
	{
		this.profesion = profesion;
	}

	void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}

	@Override
	String getInfo()
	{
		return nombre + "-" + edad + "-" + profesion + "(" + sueldo + ")";
	}	

/* NOOOOOOOO
	String getInfoTrabajador()
	{
		return nombre + "-" + edad + "-" + profesion + "(" + sueldo + ")";
	}	

*/
}