//Definición de la clase que dará vida a los objetos Persona
public class AppPersona
{
    public static void main(String args[]) 
    {
        System.out.println("Hola");

        int i = 4;
        String s1  = "Hola";
        String s2  = new String("Hola");
        char c = 's';

        Persona persona1 = new Persona();
        Persona persona2;
        persona2 = new Persona();
        persona1.setNombre("Armero");
        persona2.setNombre("Oriol");
        persona1.setEdad(21);
        persona2.setEdad(22); 
        
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getEdad());

        String nombre = persona1.getNombre();
        String nombreMayusculas = nombre.toUpperCase();
        persona1.setNombre(nombreMayusculas);
        
        persona1.setNombre(persona1.getNombre().toUpperCase());
        System.out.println(persona1.getNombre());

        //SUSPENSO AUTOMATICO: persona1.edad = -33;
        persona1.setEdad(-33);
        System.out.println(persona1.getEdad()); //edad-> 21
        
        System.out.println(persona1.getInfo());

    }
}
