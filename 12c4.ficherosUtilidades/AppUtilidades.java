import java.util.Arrays;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;

public class AppUtilidades
{
    public static void main(String args[]) throws java.io.IOException
    {
		/*AppUtilidades.m("Luis", "Ana");
		AppUtilidades.m("Luis", "Ana", "Manu", "Javi");
		AppUtilidades.m("Luis");
		*/

		List<Integer> numeros = Arrays.asList(1, 2, 4, 5);
		System.out.println(numeros);

		List<String> ficheroLineas = Files.readAllLines(Path.of("datos/personas.csv"));
		System.out.println(ficheroLineas);
    }

    private static void m(String... nombres)
    {
    	System.out.println(nombres);
    }

}