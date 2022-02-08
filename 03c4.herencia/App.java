public class App
{
	public static void main(String[] args) 
	{
		Persona persona = new Persona();
		Trabajador trabajador = new Trabajador();

		persona.setEdad(22);
		persona.setNombre("Luis");
		System.out.println(persona.getInfo());

		trabajador.setEdad(32);
		trabajador.setNombre("Manolo");
		trabajador.setProfesion("Teleco");
		trabajador.setSueldo(25000.56);

		System.out.println(trabajador.getInfo());
	}
}
