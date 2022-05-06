package ui.objetos;

import app.Juego;

import java.awt.*;

public abstract class SpriteMovimiento extends Sprite
{
    private int velocidad;

    public SpriteMovimiento(int x, int y, int vida, int velocidad)
    {
        super(x, y, vida);
        this.velocidad = velocidad;
    }

    public void mover()
    {
        x -= velocidad;
       if (x < -this.getAncho())
           x = Juego.ANCHO;
    }
}
