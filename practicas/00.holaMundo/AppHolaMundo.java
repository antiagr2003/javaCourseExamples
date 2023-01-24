public class AppHolaMundo
{
	public static void main(String args[])
	{
		String nombre1 = "Luis";
		String nombre2 = "Manuel";
		String nombre3 = "Ana";

		int edad1 = 22;
		int edad2 = 20;
		int edad3 = 22;

		System.out.println("- " + nombre1 + "(" + edad1 + ")");
		System.out.println("- " + nombre2 + "(" + edad2 + ")");
		System.out.println("- " + nombre3 + "(" + edad3 + ")");

		System.out.println("Edad media de las personas: " + 
								(edad1 + edad2 + edad3)/3);

		System.out.println("Mostrar las iniciales de las personas:");
		System.out.print(("" + nombre1.charAt(0)).toUpperCase());
		System.out.print(("" + nombre2.charAt(0)).toUpperCase());
		System.out.println(("" + nombre3.charAt(0)).toUpperCase());

		System.out.println("Mostrar los nombres de las personas en mayúsculas junto con su longitud:");
		System.out.println("- " + nombre1 + nombre1.length());
		System.out.println("- " + nombre2 + nombre2.length());
		System.out.println("- " + nombre3 + nombre3.length());

		/*String nombre = "Manolo"; //M4N0L0
		String nombreFinal = nombre.toUpperCase();
		nombreFinal = nombreFinal.replace("A", "4");
		nombreFinal = nombreFinal.replace("E", "E");
		nombreFinal = nombreFinal.replace("I", "1");
		nombreFinal = nombreFinal.replace("O", "0");*/

		System.out.println("Sustituir cada vocal por su número correspondiente en formato leet:");
		String nombreFinal1 = nombre1.toUpperCase();
		nombreFinal1 = nombreFinal1.replace("A", "4")
				     			   .replace("E", "3")
				     			   .replace("I", "1")
				     			   .replace("O", "0");
		System.out.println("- " + nombreFinal1);

		String nombreFinal2 = nombre2.toUpperCase();
		nombreFinal2 = nombreFinal2.replace("A", "4")
				     			   .replace("E", "3")
				     			   .replace("I", "1")
				     			   .replace("O", "0");
		System.out.println("- " + nombreFinal2);

		String nombreFinal3 = nombre3.toUpperCase();
		nombreFinal3 = nombreFinal3.replace("A", "4")
				     			   .replace("E", "3")
				     			   .replace("I", "1")
				     			   .replace("O", "0");
		System.out.println("- " + nombreFinal3);
	}
}