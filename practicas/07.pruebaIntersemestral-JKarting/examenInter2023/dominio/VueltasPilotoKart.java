package examenInter2023.dominio;

import examenInter2023.dominio.karts.*;
import java.util.ArrayList;

public class VueltasPilotoKart 
{
    private Piloto piloto;
    private ArrayList<Float> tiempos;
    private Kart kart;

    public VueltasPilotoKart(Piloto piloto, ArrayList<Float> tiempos, Kart kart) 
    {
        this.piloto = piloto;
        this.tiempos = tiempos;
        this.kart = kart;
        piloto.actualizarTiempos(tiempos);
    }

    public Piloto getPiloto() 
    {
        return piloto;
    }

    public ArrayList<Float> getTiempos() 
    {
        return tiempos;
    }

    public Kart getKart() 
    {
        return kart;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Piloto ")
          .append(piloto.getNombre())
          .append(", Kart ")
          .append(kart.getId())
          .append(", ")
          .append(tiempos);
        return sb.toString();
    }
}
