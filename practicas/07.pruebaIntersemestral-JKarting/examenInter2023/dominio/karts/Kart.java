package examenInter2023.dominio.karts;

public class Kart 
{
    private int id;
    private boolean asignado;

    public Kart(int id)     
    {
        this.id = id;
        this.asignado = false;
    }

    public void asignar()
    {
        this.asignado = true;
    }

    public void liberar()
    {
        this.asignado = false;
    }

    public boolean isLibre()
    {
        return !asignado;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return "id=" + id + "asignado=" + asignado;
    }
}
