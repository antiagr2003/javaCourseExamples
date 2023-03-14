package examenInter2023.dominio.karts;

public abstract class KartCilindrada extends Kart
{
    private int cc;

    public KartCilindrada(int id, int cc)     
    {
        super(id);
        this.cc = cc;
    }

    public int getCc() 
    {
        return cc;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", cc=" + cc;
    }
}
