package ui.objetos;

import ui.paneles.Tablero;
import util.Generador;

import java.awt.Graphics;
import java.awt.Color;

public class Ladrillo extends SpriteMovimiento
{
    public static final int VIDA_DEFAULT = -20;
    public static final int ANCHO_DEFAULT = 60;
    public static final int ALTO_DEFAULT = 30;
    public static final int Y_INICIAL = Tablero.Y_BASE - ALTO_DEFAULT;

    public static final Color COLOR = Color.LIGHT_GRAY;

    private int ancho;
    private int alto;

    public Ladrillo(int x)
    {
        super(x, Y_INICIAL, VIDA_DEFAULT, Generador.generaVelocidad());
        this.ancho = ANCHO_DEFAULT;
        this.alto = ALTO_DEFAULT;
    }

    public Ladrillo(int x, int vida, int velocidad, int ancho, int alto)
    {
        super(x, Y_INICIAL, vida, velocidad);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int getAncho()
    {
        return ancho;
    }

    public int getAlto()
    {
        return alto;
    }

    @Override
    public void pintar(Graphics g)
    {
         g.setColor(COLOR);
         g.fillRect(x, y, ancho, alto);
    }
}