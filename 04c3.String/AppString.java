public class AppString
{
	public static void main(String args[])
	{
		String s1 = new String("A");
		String s2 = new String("A");
		String s3 = s2;
		String s4 = "Hola";
		String s5 = "Hola";

		System.out.println("Ahora cdasdasdasdasd asdason String"); 
		System.out.println((s1==s2) + " con equals " + s1.equals(s2)); //FALSE & TRUE
		System.out.println((s4==s5) + " con equals " + s4.equals(s5)); //TRUE & TRUE
		


		String s = "Hola";
		s = s + " Adios";
		s += " 11111";
		s += " 22222";
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" Adios");
		sb.append(" 11111");
		sb.append(" 22222");
		System.out.println(sb.toString());


		StringBuilder sb2 = new StringBuilder("Hola");
		sb2.append(" Adios")
		  .append(" 11111")
		  .append(" 22222");

		System.out.println(sb.toString());
	}
}