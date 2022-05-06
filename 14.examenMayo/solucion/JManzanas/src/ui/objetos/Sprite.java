package ui.objetos;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Sprite
{
    protected int x;
    protected int y;
    protected int vida;

    protected boolean visible;

    public Sprite(int x, int y, int vida)
    {
        this.x = x;
        this.y = y;
        this.vida = vida;
        this.visible = true;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getVida()
    {
        return vida;
    }

    public Rectangle getRectangulo()
    {
        return new Rectangle(x, y, this.getAncho(), this.getAlto());
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public abstract int getAncho();
    public abstract int getAlto();
    public abstract void pintar(Graphics g);
}
