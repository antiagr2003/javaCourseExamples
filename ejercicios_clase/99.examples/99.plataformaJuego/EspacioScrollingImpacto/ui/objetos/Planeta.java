package ui.objetos;

public class Planeta extends Sprite
{
    private static final String NOMBRE_IMAGEN = "planeta.png";
    private static final float VELOCIDAD_DEFAULT = 0.015f;

    public Planeta(int x, int y, float velocidad, String ficheroImagen)
    {
        super(x, y, velocidad, ficheroImagen);
    }

    public Planeta(int x, int y)
    {
        this(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
    }

    public Planeta(String...elementos) 
    {
        super(elementos);
    }

    public void colision()
    {

    }
}