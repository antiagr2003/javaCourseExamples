import java.util.ArrayList;

record Cuadrado (int x, int y, int lado){}
record Persona (String nombre, int edad){}

public class App
{
    public static final int CHAR = 1;
    public static final int WORD = 2;
    public static final int PHRASE = 3;
    
    public static void main(String[] args) 
    {
        int opcion = PHRASE;

        String linea = "cuadrado, 300, 200, 11";
        ArrayList<String> atributos = new ArrayList<>();
        
        switch(opcion)
        {
            case CHAR:
                String palabraCreada = "";
                boolean palabraNew = false;
                for(int i=0;i<linea.length();i++)
                {
                    char c = linea.charAt(i);
                    if(c != ',' && c != ' ')
                    {
                        if (palabraNew)
                        {
                            atributos.add(palabraCreada);
                            palabraCreada = "";
                            palabraNew = false;
                        }
                        palabraCreada += c;
                    }
                    else
                        palabraNew = true;
                }
                atributos.add(palabraCreada);
                break;
            case WORD:
                palabraCreada = "";

                int posicionInicial = 0;
                int posicionFinal = linea.indexOf(",", posicionInicial);
                while(posicionFinal != -1)
                {
                    palabraCreada = linea.substring(posicionInicial, posicionFinal).trim();
                    atributos.add(palabraCreada);
                    posicionInicial = posicionFinal + 1;
                    posicionFinal = linea.indexOf(",", posicionInicial + 1);
                }
                palabraCreada = linea.substring(posicionInicial, linea.length()).trim();
                atributos.add(palabraCreada);
                break;
            case PHRASE:
                String palabras[] = linea.split(",");
                for(String palabraSucia : palabras)
                    atributos.add(palabraSucia.trim());
                break;
        }

        Object o = App.crearObjeto(atributos);

        System.out.println(o);
    }

    private static Object crearObjeto(ArrayList<String> atributos)
    { 
        Object o = null;
        switch(atributos.get(0))
        {
            case "cuadrado":
                o = new Cuadrado(Integer.parseInt(atributos.get(1)), Integer.parseInt(atributos.get(2))
                                , Integer.parseInt(atributos.get(3)));
                break;
            case "persona":
                o = new Persona(atributos.get(1), Integer.parseInt(atributos.get(2)));
                break;
        }
        return o;
    }
}