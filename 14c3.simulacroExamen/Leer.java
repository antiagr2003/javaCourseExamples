import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Leer
{
    public static String porTeclado()
    {
        String s = "";
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            s = b.readLine();
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
        return s;
    }
} 
