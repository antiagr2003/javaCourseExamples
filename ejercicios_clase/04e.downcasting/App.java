public class App
{
	public static void main(String[] args) 
	{
		Persona personas[] = new Persona[2];
		personas[0] = new Alumno("Luis", "POO;Estadística");  //UPCASTING
		personas[1] = new Persona("Ana");

		for(Persona p : personas)
			System.out.println(p.getInfo());	

		//personas[0].getAsignaturas(); //Error, las personas no saben dar las asignaturas.

		for(Persona p : personas)
			if (p instanceof Alumno)
			{
				Alumno alumno = (Alumno) p;
				System.out.println(alumno.getAsignaturas());	
			}

		//Otra forma nueva de hacer Downcastings instance of
		//Pero hay que entender lo que se está pasando por debajo
		for(Persona p : personas)
			if (p instanceof Alumno alumno)
				System.out.println(alumno.getAsignaturas());	
	}
}