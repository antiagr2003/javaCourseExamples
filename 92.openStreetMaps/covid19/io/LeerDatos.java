package covid19.io;

import covid19.osm.*;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.jxmapviewer.viewer.GeoPosition;

import java.awt.Color;

import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeerDatos
{
    private static String FICHERO = "coronacases_20200330.csv";

    public static Set<MyWaypoint> fromCSV()
    {
        Set<MyWaypoint> coronaCountries = new HashSet<MyWaypoint>();
        try 
        {
            Reader reader = Files.newBufferedReader(Paths.get(FICHERO));
            CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(reader);
            List<CSVRecord> csvrecords = csvParser.getRecords();

            //Cálculo del valor máximo
            int maxCasos = Integer.MIN_VALUE;
            for (CSVRecord record:csvrecords) 
            {
                int casos = Integer.parseInt(record.get("Cases"));
                if(casos>maxCasos)
                    maxCasos = casos;
            }

            for (CSVRecord record:csvrecords) 
            {
                double latitude = Double.parseDouble(record.get("latitude"));
                double longitude = Double.parseDouble(record.get("longitude"));
                GeoPosition geoPosition = new GeoPosition(latitude, longitude);
                int cases = Integer.parseInt(record.get("Cases"));

                //Uso el espectro HSB de colores de 0 a 120º(0.3) para pintar del rojo al verde dependiendo de la criticidad. Le aplico a los valores x^0.1 para que sean logaritmicos los colores.
                Color color = Color.getHSBColor((float) (0.3f - 0.3f * Math.pow(cases, 0.1) / Math.pow(maxCasos, 0.1)), 1.0f, 0.8f);
                coronaCountries.add(new MyWaypoint(record.get("Cases"), color, geoPosition));
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        return coronaCountries;
    }
}
