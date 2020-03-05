package practica11.util;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

import practica11.obj.Espesores;
import practica11.obj.Estacion;

public class ImportDatos 
{	
	public static Collection leer(Estacion estacion)
	{
	    if(estacion.equals(new Estacion("Baqueira")))
	        return ImportDatos.leerEspesoresBaqueira();
        else 
            return null;
    }
    
    public static Collection leerEspesoresBaqueira()
    {
        String url = "http://www.baqueira.es/parte-de-nieve/parte.php";
        ArrayList espesores = new ArrayList();
		try
		{
			URL miURL = new URL(url);
			InputStream is = miURL.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String s = br.readLine();
			boolean fin = false;
			while(s!=null && fin==false)
			{
                //System.out.println(s);
                int posCota=s.indexOf("COTA");
				if(posCota!=-1)
				{
                    int cota = Integer.parseInt(s.substring(posCota+5, posCota+9).trim());
                    s = br.readLine();
					int pos = s.indexOf("<td>");
					int max = Integer.parseInt(s.substring(pos+4, pos+7).trim());
					s = br.readLine();
					pos = s.indexOf("<td>");
                    int min = Integer.parseInt(s.substring(pos+4, pos+7).trim());
                    espesores.add(new Espesores(cota, min, max));
				}
                s = br.readLine();
			}
		}
		catch(Exception e )
		{}
		
        return espesores;
	}

}
