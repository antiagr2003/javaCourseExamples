/** Clase de funcionalidad variada que proporciona una ayuda al alumno */
package practica09.util;

public class Util
{
	/** 
		Detiene el programa el tiempo especificado
		@param segundos número de segundos a esperar 
	*/
	public static void wait(double segundos)
	{
		try
		{
			Thread.sleep((long) (segundos*1000));
		}
		catch(Exception e)
		{

		}
	}
}
