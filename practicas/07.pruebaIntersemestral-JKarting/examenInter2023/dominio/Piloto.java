package examenInter2023.dominio;

import java.util.LinkedList;
import java.util.ArrayList;

public class Piloto 
{
    public static final int NUM_TIEMPOS_TOP = 5;

    private String dni;
    private String nombre;
    private LinkedList<Float> mejoresTiempos;
    private ArrayList<Float> tiemposUltimaManga;

    public Piloto(String dni, String nombre) 
    {
        this.dni = dni;
        this.nombre = nombre;
        this.mejoresTiempos = new LinkedList<Float>();
        for(int i=0; i<NUM_TIEMPOS_TOP; i++)
            mejoresTiempos.add(Float.MAX_VALUE);
        this.tiemposUltimaManga = new ArrayList<Float>();
    }

    public float getMejorTiempo()
    {
        return mejoresTiempos.get(0);
    }

    public LinkedList<Float> getMejoresTiempos() 
    {
        return mejoresTiempos;
    }

    public ArrayList<Float> getTiemposUltimaManga() 
    {
        return tiemposUltimaManga;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getDni() 
    {
        return dni;
    }

    public void actualizarTiempos(ArrayList<Float> tiemposUltimaManga) 
    {
        this.tiemposUltimaManga = tiemposUltimaManga;

        for(float tiempo : tiemposUltimaManga)
        {
            boolean insertado = false;
            for (int i=0; i<mejoresTiempos.size() && !insertado; i++)
                if(tiempo < mejoresTiempos.get(i))
                {
                    mejoresTiempos.add(i, tiempo);
                    insertado = true;
                }
            mejoresTiempos.remove(mejoresTiempos.size()-1);
        }
    }

    @Override
    public String toString() 
    {
        return "Piloto{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mejorTiempo='" + this.getMejorTiempo() + '\'' +
                '}';
    }
}
