package ui.objetos;

public class Asteroide extends Sprite
{
    private static final String NOMBRE_IMAGEN = "asteroide.png";
    private static final float VELOCIDAD_DEFAULT = 0.5f;

    public Asteroide(int x, int y, float velocidad, String ficheroImagen)
    {
        super(x, y, velocidad, ficheroImagen);
    }

    public Asteroide(int x, int y)
    {
        this(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
    }

    public Asteroide(String...elementos) {
        super(elementos);
    }

    public void colision()
    {
        this.setVisible(false);
    }
}