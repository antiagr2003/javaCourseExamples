package io;

import ui.objetos.Sprite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOCongiguracion
{
    private int manzanas;
    private int ladrillos;
    private int fps;

    public void leerConfiguracion()
    {
        try
        {
            List<String> objetos = Files.readAllLines(Path.of("data/configuracion.txt"));
            for(String linea:objetos)
            {
                if(linea!=null)
                {
                    String elementos[] = linea.split(": ");
                    String objeto = elementos[0].toLowerCase().trim();
                    String valor = elementos[1].trim();
                    switch (objeto) {
                        case "manzanas" -> manzanas = Integer.parseInt(valor);
                        case "ladrillos" -> ladrillos = Integer.parseInt(valor);
                        case "fps" -> fps = Integer.parseInt(valor);
                    }
                }
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    public int getNumeroManzanas() {
        return manzanas;
    }

    public int getNumeroLadrillos() {
        return ladrillos;
    }

    public int getFPS() {
        return fps;
    }
}
