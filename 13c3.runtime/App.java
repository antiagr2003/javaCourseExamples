public class App
{
	public static void main(String args[]) 
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process proceso = rt.exec("notepad");
			//proceso = rt.exec("cmd /c pp.txt"); //Abre el progarama asociado a esta extensión
			System.out.println("Abriendo el editor y esperando a que se cierre....");
			proceso.waitFor(); //Espera opcional, es un ejemplo....
			System.out.println("Se ha cerrado el editor y continua el flujo del programa");
		}
		catch(java.io.IOException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}				
	}
}
