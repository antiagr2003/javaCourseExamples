package io;

import ui.objetos.Nave;
import ui.objetos.Sprite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IOObjetos
{
    public static List<Sprite> importarSprites()
    {
        List<Sprite> objetosJuego = new ArrayList<Sprite>();
        try
        {
            List<String> objetos = Files.readAllLines(Path.of("data/objetos.csv"));
            for(String linea:objetos)
            {
                String elementos[] = linea.split(", ");
                String tipo = elementos[0].toLowerCase();
                Sprite objeto = null;
                switch (tipo)
                {
                    case "sprite" -> objeto = Sprite.parse(elementos);
                    case "nave" -> objeto = Nave.parse(elementos);
                }
                objetosJuego.add(objeto);
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return objetosJuego;
    }
/*
    public static List<Sprite> importarFondo()
    {
        Fondo fondo = null;
        try
        {
            List<String> objetos = Files.readAllLines(Path.of("data/fondo.csv"));
            for(String linea:objetos)
            {
                String elementos[] = linea.split(", ");
                fondo = Fondo.parse(elementos);
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return fondo;
    }
    */
}
