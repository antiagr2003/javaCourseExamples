package examenInter2023.dominio;

import examenInter2023.dominio.karts.*;
import java.util.ArrayList;

public class JKarting 
{
    private ArrayList<Kart> karts = new ArrayList<Kart>();
    private ArrayList<Manga> mangas = new ArrayList<Manga>();

    public void addKart(Kart kart)
    {
        karts.add(kart);
    }

    public void addManga(Manga manga)
    {
        mangas.add(manga);
    }

    public Manga getMangasFecha(String fecha)
    {
        for(Manga manga : mangas)
            if(manga.getFecha().equals(fecha))
                return manga;

        return null;
    }

    public Kart asignarKartPorTiempos(Piloto piloto)
    {
        for(Kart kart : karts)
        {
            if(piloto.getMejorTiempo() < 32 && kart.isLibre() &&
                    kart.getClass().getName().equals("examenInter2023.dominio.karts.KartCompeticion"))  //instanceof
            {
                kart.asignar();
                return kart;
            }
            else if (piloto.getMejorTiempo() > 32 && piloto.getMejorTiempo() < 36 && kart.isLibre() &&
                     kart.getClass().getName().equals("examenInter2023.dominio.karts.KartConReglajes"))  //instanceof
            {
                kart.asignar();
                return kart;
            }
            else if (piloto.getMejorTiempo() > 36 && kart.isLibre() &&
                    kart.getClass().getName().equals("examenInter2023.dominio.karts.Kart"))  //instanceof
            {   
                kart.asignar();
                return kart;
            }
        }

        return null;
    }
    
    /*
    public static Kart asignarKart(ArrayList<Kart> karts, Piloto piloto)
    {
        Kart k = getKartPorTiempo(karts, piloto);
        if (k == null)
        {
            System.err.println("No quedan Karts para asignar para " + piloto);
            return null;
        }
        System.out.println( k +" asignado a " + piloto);
        karts.remove(k);
        return k;
    }*/
}
