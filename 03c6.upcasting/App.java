public class App
{
	public static void main(String[] args) 
	{
		Persona persona = new Persona("Luis", 22,"Calle del Pez");
		Trabajador trabajador = new Trabajador("Manolo" , 32, "Calle del Gato", "Teleco" , 25000.45);

		Persona personas[] = new Persona[10];

		personas[0] = trabajador; //UPCASTING
		personas[1] = persona;

		for(Persona p:personas)
			if(p != null)
				System.out.println(p.getInfo());

		System.out.println("===============");

		Persona p2;
		p2 = persona;
		System.out.println(persona.getInfo());
		System.out.println(p2.getInfo());

		System.out.println("===============");
		p2 = trabajador;  //UPCASTING Subimos el interfaz del objeto de la subclase
		System.out.println(trabajador.getInfo());
		System.out.println(p2.getInfo());

		System.out.println(trabajador.getSueldo());

		trabajador = null;

// ERROR:	System.out.println(p2.getSueldo());	
		
		Trabajador t4 = (Trabajador) p2; //DOWNCASTING	
		System.out.println(t4.getSueldo());	

	}
}
