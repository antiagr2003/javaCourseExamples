public class App
{
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			Aduanero a1 = new Aduanero("Mini David " + i);
			a1.start();
		}

		String s = "hola";
		s = null;
		s.toUpperCase(); //Provoco un error de xxxx in "Main Thread"
	}
}