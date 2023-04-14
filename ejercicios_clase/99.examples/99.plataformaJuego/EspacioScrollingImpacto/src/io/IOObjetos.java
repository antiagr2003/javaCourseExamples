package io;

import ui.objetos.Asteroide;
import ui.objetos.Nave;
import ui.objetos.Planeta;
import ui.objetos.Sprite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IOObjetos{
    public static LinkedList<Sprite> importarSprites(){
        LinkedList<Sprite> objetosJuego = new LinkedList<>();
        try{
            List<String> objetos = Files.readAllLines(Path.of("data/objetos.csv"));
            for(String linea:objetos){
                if(linea!=null) {
                    String elementos[] = linea.split(", ");
                    String tipo = elementos[0].toLowerCase();
                    Sprite sprite = null;
                    switch (tipo) {
                        case "planeta" -> sprite = new Planeta(elementos);
                        case "asteroide" -> sprite = new Asteroide(elementos);
                        case "nave" -> sprite = new Nave(elementos);
                    }
                    objetosJuego.add(sprite);
                }
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        return objetosJuego;
    }
}
