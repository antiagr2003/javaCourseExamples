public class CPNoValidoException extends Exception
{
	private int codigoPostal;

	public CPNoValidoException(int codigoPostal)
	{
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString()
	{
		return "El codigoPostal " + codigoPostal + " no es válido. Debe estar en el intervalo " + Persona.CODIGO_MIN + " y " + Persona.CODIGO_MAX;
	}
}