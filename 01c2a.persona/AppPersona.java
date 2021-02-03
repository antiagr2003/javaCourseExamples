public class AppPersona
{
	public static void main(String args[])
	{
		int numero = 3;
		numero = numero + 1;
		numero++; //incremento de +1
		numero = numero + 2;
		numero++;numero++; //No se hace

		//Son equivalente:
		numero += 2;
		numero = numero + 2;

		//Objetos, ocurrencias o instancias de la clase Persona
		Persona persona1 = new Persona();
		persona1.setNombre("Luis");
		persona1.setEdad(44);
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());

		Persona persona2 = new Persona();
		persona2.setNombre("Miguel");
		persona2.setEdad(33);
		String nombre = persona2.getNombre();
		String salida = "El nombre es: " + nombre;
		//ERROR: String salida = "El nombre es: " + nombre;
		salida = "El nombre es: ";
		salida += nombre;
/* Equivalentes a las anteriores:
		salida = "El nombre es: ";
		salida = salida + nombre;
*/
		System.out.println(salida);
		System.out.println("La edad es: " + persona2.getEdad());

		System.out.println(persona1.getNombre() + " - " + persona1.getEdad());
/*
		System.out.println(salida); 
		El resultado óptimo
		System.out.println("El nombre es: " + nombre);
		*/

		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());
	}
}