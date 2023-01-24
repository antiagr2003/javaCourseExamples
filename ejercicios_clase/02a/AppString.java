public class AppString
{
	public static void main(String args[])
	{
		String cadena1 = "hola";
		char c = cadena1.charAt(0);
		System.out.println(c);

		String cadena2 = "adios";
		System.out.println(cadena1.charAt(0) + cadena2.charAt(0));

		int numero = cadena1.charAt(0) + cadena2.charAt(0);
		System.out.println(numero);

		//ERROR: String output = cadena1.charAt(0) + cadena2.charAt(0);
		/*
		incompatible types: int cannot be converted to String
                String output = cadena1.charAt(0) + cadena2.charAt(0);
        */       
		String output = "Hola" + cadena1.charAt(0) + cadena2.charAt(0);

		System.out.println(12 + 12);
		System.out.println("12" + 12);
		
		output = "" + cadena1.charAt(0) + cadena2.charAt(0);
		System.out.println(output);
		output = "Resultado: " + cadena1.charAt(0) + cadena2.charAt(0);
		System.out.println(output);

		//ERROR: System.out.println(cadena1.charAt(0).toUpperCase());
		/*
			char cannot be dereferenced
                cadena1.charAt(0).toUpperCase();
        */

		output = ("" + cadena1.charAt(0)).toUpperCase();
		System.out.println(output);
		output = String.valueOf(cadena1.charAt(0)).toUpperCase();
		System.out.println(output);
	}
}