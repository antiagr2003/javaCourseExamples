public class AppPersona
{
	public static void main(String args[])
	{
		Persona p1 = new Persona("Luis", 22);
		Object p12 = p1;
		Persona p2 = new Persona("Luis", 23);
		
		System.out.println(p1.equals(p12)  + " ahora con == " + (p1==p12));
		System.out.println(p1.equals(p2) + " ahora con == " + (p1==p2));

		String s1 = new String("A");
		String s2 = new String("A");
		String s3 = s2;

		System.out.println("Ahora con String");
		System.out.println(s1==s2); //FALSE
		System.out.println(s3==s2); //TRUE
		System.out.println(s1.equals(s2)); //TRUE
	}
}