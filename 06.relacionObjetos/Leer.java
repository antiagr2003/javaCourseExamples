package practica11.util;

import java.io.*;

public class Leer
{
		/** Permite leer por teclado el texto introducido por el usuario
			@return Devuelve un String después de pulsar <ENTER>		
		*/
		public static String porTeclado()
		{
			String s="";
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			try 
			{
				s = b.readLine();
					
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
			return s;
		}
} 


