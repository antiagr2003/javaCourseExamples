public class AppPersona
{
	public static void main(String args[])
	{
		System.out.println(Persona.EDAD_MIN);
		//Persona.EDAD_MIN = -55;
		//persona1.edad = -44;

		Persona.setCIUDAD("Madrid");
		
		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		//Persona persona3 = new Persona();

		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());

		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Alumno Miguel");
		alumno1.setEdad(33);
		alumno1.setTitulo("GITT");
		alumno1.setCurso("2ºA");		
		System.out.println(alumno1.getInfo());		

	}
}