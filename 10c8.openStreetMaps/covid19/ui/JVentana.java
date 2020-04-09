package covid19.ui;

import covid19.io.LeerDatos;
import covid19.osm.MyWaypoint;
import covid19.osm.FancyWaypointRenderer;

import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JVentana extends JFrame
{
    private Set<MyWaypoint> wpCoronaCountries;
    private String fichero = "coronacases_20200330.csv";

    public static void main(String args[]) 
    {
        new JVentana();
    }

    public JVentana()
    {
        super("Ejemplo de Mapas");

        JXMapKit jXMapKit = new JXMapKit();
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapKit.setTileFactory(tileFactory);

        //Centro en Espana con zoom level de 13
        jXMapKit.getMainMap().setCenterPosition(new GeoPosition(40.416775, -3.703790));
        jXMapKit.setZoom(13);

        Set<MyWaypoint> wpCoronaCountries = LeerDatos.fromCSV();
       
        if(wpCoronaCountries!=null) 
        {
            WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<>();
            waypointPainter.setWaypoints(wpCoronaCountries);
            waypointPainter.setRenderer(new FancyWaypointRenderer());
            jXMapKit.getMainMap().setOverlayPainter(waypointPainter);
        }

        this.add(jXMapKit);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
