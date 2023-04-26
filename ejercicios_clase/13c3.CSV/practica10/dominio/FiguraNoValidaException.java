package practica10.dominio;

public class FiguraNoValidaException extends Exception
{
	private int valor;
	private String mensaje;

	public FiguraNoValidaException(int valor, String mensaje)
	{
		this.valor = valor;
		this.mensaje = mensaje;
	}

	@Override
	public String toString()
	{
		return "El valor " + valor + " no es v�lido para el " + mensaje;
	}
}