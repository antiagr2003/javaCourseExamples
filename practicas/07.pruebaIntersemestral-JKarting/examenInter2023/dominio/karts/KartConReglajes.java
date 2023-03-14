package examenInter2023.dominio.karts;

import java.util.ArrayList;

public class KartConReglajes extends KartCilindrada 
{
    private ArrayList<String> reglajes = new ArrayList<>();
    private int cilindrada;

    public KartConReglajes(int id, int cilindrada, ArrayList<String> reglajes) 
    {
        super(id, cilindrada);
        this.reglajes = reglajes;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() 
    {
        return super.toString() +
                ", reglajes=" + reglajes +
                ", cilindrada=" + cilindrada;
    }
}
