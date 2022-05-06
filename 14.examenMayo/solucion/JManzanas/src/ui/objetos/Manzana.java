package ui.objetos;

import ui.paneles.Tablero;
import util.Generador;

import java.awt.Graphics;
import java.awt.Color;

public class Manzana extends SpriteMovimiento
{
    public static final int VIDA_DEFAULT = +5;
    public static final int RADIO_DEFECTO = 20;
    public static final int Y_INICIAL = Tablero.Y_BASE - RADIO_DEFECTO;

    public static final Color COLOR = Color.GREEN;

    private int radio = RADIO_DEFECTO;

    public Manzana(int x)
    {
        super(x, Y_INICIAL, VIDA_DEFAULT, Generador.generaVelocidad());
        this.radio = RADIO_DEFECTO;
    }

    public Manzana(int x, int vida, int velocidad, int radio)
    {
        super(x, Y_INICIAL, vida, velocidad);
        this.radio = radio;
    }

    @Override
    public int getAncho()
    {
        return radio*2;
    }

    public int getAlto()
    {
        return radio*2;
    }

    @Override
    public void pintar(Graphics g)
    {
        g.setColor(COLOR);
        g.fillOval(x, y, radio, radio);
    }
}