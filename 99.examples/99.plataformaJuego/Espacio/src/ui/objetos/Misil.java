package ui.objetos;

import app.Juego;
import ui.interfaces.Movible;

public class Misil extends Sprite implements Movible
{
    private static final String NOMBRE_IMAGEN = "misil.png";
    private final int VELOCIDAD = 2;

    public Misil(int x, int y)
    {
        super(x, y, NOMBRE_IMAGEN);
    }

    public Misil(int x, int y, String ficheroImagen)
    {
        super(x, y, ficheroImagen);
    }


    @Override
    public void mover()
    {
        x += VELOCIDAD;
        if (x > Juego.ANCHO)
            visible = false;
    }
}
