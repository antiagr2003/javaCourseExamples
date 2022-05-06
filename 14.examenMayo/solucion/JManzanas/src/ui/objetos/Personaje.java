package ui.objetos;

import ui.paneles.Tablero;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Personaje extends Sprite
{
    public static final int X_INICIAL = 50;
    public static final int LADO_DEFAULT = 50;
    public static final int Y_INICIAL = Tablero.Y_BASE - LADO_DEFAULT;
    public static final int SALTO_DEFAULT = 100;
    public static final int VIDA_DEFAULT = 1000;

    private int salto;
    private int dy;
    private int lado;

    public Personaje(int x, int y, int vida, int lado, int salto)
    {
        super(x, y, vida);
        this.lado = lado;
        this.salto = salto;
    }

    public Personaje()
    {
        this(X_INICIAL, Y_INICIAL, VIDA_DEFAULT, LADO_DEFAULT, SALTO_DEFAULT);
    }

    @Override
    public int getAncho()
    {
        return lado;
    }

    public int getAlto()
    {
        return lado;
    }

    @Override
    public void pintar(Graphics g)
    {
         g.setColor(Color.WHITE);
         g.drawRect(x, y, lado, lado);
    }

    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_SPACE -> {
                y = Y_INICIAL - salto;
                vida -= Manzana.VIDA_DEFAULT;
            }
        }
    }

    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_SPACE -> y = Y_INICIAL;
        }
    }

    public void checkImpacto(Sprite sprite)
    {
        if(this.getRectangulo().intersects(sprite.getRectangulo()))
            vida += sprite.getVida();
    }

    public boolean isVivo()
    {
        return vida > 0;
    }
}