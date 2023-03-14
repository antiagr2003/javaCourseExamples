package examenInter2023.ui;

import examenInter2023.dominio.*;
import examenInter2023.dominio.karts.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main(String[] args) 
    {
        Piloto p1 = new Piloto("1111","Paco");
        Piloto p2 = new Piloto("2222","María");
        Piloto p3 = new Piloto("3333","Pepe");

        JKarting jKarting = new JKarting();
        jKarting.addKart(new Kart(1));
        jKarting.addKart(new Kart(2));
        jKarting.addKart(new Kart(3));
        jKarting.addKart(new KartConReglajes(2, 200, new ArrayList<String>(List.of("Suspensión", "Alerón"))));
        jKarting.addKart(new KartCompeticion(3, 200, 22));


        //Apartado D
        VueltasPilotoKart vpk1 = new VueltasPilotoKart(p1, new ArrayList<Float>(List.of(35.0f, 34.3f, 30.3f)), 
            jKarting.asignarKartPorTiempos(p1));
        VueltasPilotoKart vpk2 = new VueltasPilotoKart(p2, new ArrayList<Float>(List.of(31.0f, 32.3f, 29.3f, 35.0f, 32.3f, 29.3f)), 
            jKarting.asignarKartPorTiempos(p2));
        VueltasPilotoKart vpk3 = new VueltasPilotoKart(p3, new ArrayList<Float>(List.of(29.0f, 30.0f)),
            jKarting.asignarKartPorTiempos(p3));

        Manga m1 = new Manga("08/03/2023");
        m1.addVueltasPiloto(vpk1);
        m1.addVueltasPiloto(vpk2);
        m1.addVueltasPiloto(vpk3);

        jKarting.addManga(m1);

        //Apartado A
        System.out.println("-----------");
        System.out.println("Tiempos de la última Manga del Piloto #2: " + p2.getTiemposUltimaManga());
        System.out.println("Mejores 5 tiempos del Piloto #2: " + p2.getMejoresTiempos());
        System.out.println("Mejor tiempo del Piloto #2: " + p2.getMejorTiempo());

        //Apartado B
        System.out.println("-----------");
        String fecha = "08/03/2023";
        System.out.println("Mangas del día " + fecha + ": " + jKarting.getMangasFecha(fecha));

        //Apartado C
        System.out.println("-----------");
        System.out.println(m1);
    }
}