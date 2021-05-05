import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

public class App
{
    public static void main(String args[])
    {
/*
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            s = br.readLine();
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Hola, " + s);   
        }
*/

        String s = "desconocido";
        System.out.print("Introduzca su nombre: ");

        try
        {
            /*
            InputStream teclado = System.in;
            InputStreamReader isr = new InputStreamReader(teclado);
            BufferedReader br = new BufferedReader(isr);
            */

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Hola, " + s);   
        }        
    }
} 
