public class Persona
{
	static String CIUDAD;
	String nombre;
	int edad;

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n===========")
		  .append("\nNombre: ")
		  .append(nombre)
	 	  .append("\nEdad: ")
	 	  .append(edad)
		  .append("\nCIUDAD: ")
		  .append(CIUDAD);
		  return sb.toString();
	}
}