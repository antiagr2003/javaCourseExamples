public class AppPersona
{
	public static void main(String args[])
	{
		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		//Alumno alumno1 = new Alumno("Jaime", 21, "GITT", "2ºA");

		Persona personas[] = new Persona[3];
		personas[0] = persona1;
		personas[1] = persona2;
		personas[2] = new Alumno("Jaime", 21, "GITT", "2ºA");

		//Ejemplo de UPCASTING
		 Alumno a = new Alumno("Jaime", 21, "GITT", "2ºA");
		 Persona p = a; //UPCASTING

		 a.setCurso("3ºB");
		 p.getInfo(); //"Jaime", 21, "GITT", "3ºB"
		 p.getNombre();
		 a.getNombre();
		 //ERROR: p.getCurso();

		 a = null;

		 if(p instanceof Alumno)
		 {
		 	Alumno a2 = (Alumno) p; //DOWNCASTING
		 	System.out.println(a2.getCurso());		
		 }

		//ERROR: System.out.println(personas[2].getCurso());		

		//ERROR: personas[2].setCurso("3ºA");
		for(Persona persona:personas)
		{
			System.out.println(persona.getInfo());		
			//System.out.println(p.getCurso());
		}

	}
}