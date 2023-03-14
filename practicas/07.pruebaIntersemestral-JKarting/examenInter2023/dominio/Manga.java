package examenInter2023.dominio;

import java.util.ArrayList;

public class Manga 
{
    private String fecha;
    private ArrayList<VueltasPilotoKart> vueltasPiloto;

    public Manga(String fecha)
    {
        this.fecha = fecha;
        this.vueltasPiloto = new ArrayList<VueltasPilotoKart>();
    }

    public void addVueltasPiloto(VueltasPilotoKart vpk)
    {
        vueltasPiloto.add(vpk);
    }

    public String getFecha() 
    {
        return fecha;
    }

    public ArrayList<VueltasPilotoKart> getVueltasPilotoKart() 
    {
        return vueltasPiloto;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(VueltasPilotoKart vpk : vueltasPiloto){
            sb.append(vpk).append("\n");
        }
        return sb.toString();
    }


}