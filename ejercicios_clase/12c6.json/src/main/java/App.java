import com.google.gson.Gson;

public class App
{
    public static void main(String args[])
    {
        String personaJSON = "{\"nombre\":\"Luis\",\"edad\":22}";
        Gson gson = new Gson();
        Persona persona = gson.fromJson(personaJSON, Persona.class);  
        System.out.println(persona);

        persona = new Persona("Javier", 23);
        personaJSON = gson.toJson(persona);
        System.out.println(personaJSON);

        //Pausa para parar la ejecución. Pulsar ENTER para continuar.
        new java.util.Scanner(System.in).next();
    }
} 
