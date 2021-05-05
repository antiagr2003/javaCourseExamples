import java.io.*;

public class App
{
	public static void main(String args[])
	{
		App.escribirObjetos(new Persona("Luis", "1111111A", 22));
		App.escribirObjetos(new Persona("Juan", "2222222B", 22));
		App.leerObjetos();
		App.escribirObjetos(new Persona("Manuel", "3333333C", 22));
		System.out.println("-----------------");
		App.leerObjetos();
	}

	private static void escribirObjetos(Persona p)
	{
		try
		{
			File file = new File("personas.obj");
			FileOutputStream fos = new FileOutputStream(file.getName(), true);
			ObjectOutputStream oos;
			if (file.length()>0) 
				oos=new ObjectOutputStreamNoCabecera(fos);
			else
				oos=new ObjectOutputStream(fos); 
			
			oos.writeObject(p);
			oos.close();
		}		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}

	private static void leerObjetos()
	{	
		ObjectInputStream ois=null;
		try
		{
			File file = new File("personas.obj");
			ois=new ObjectInputStream(new FileInputStream(file.getName()));
			
			while(true)
			{
				System.out.println(ois.readObject());
			}
		}		
		catch(EOFException eof)
		{
			try
			{
				ois.close();			
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}				
		catch(ClassNotFoundException eof)
		{
			try
			{
				ois.close();			
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();				
			}
		}						
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}		
		
	}	
}
