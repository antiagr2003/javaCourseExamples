package examenInter2023.dominio.karts;

import java.util.ArrayList;

public class KartCompeticion extends KartCilindrada
{
    private int caballos;

    public KartCompeticion(int id, int cilindrada, int caballos) 
    {
        super(id, cilindrada);
        this.caballos = caballos;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", caballos=" + caballos;
    }
}
