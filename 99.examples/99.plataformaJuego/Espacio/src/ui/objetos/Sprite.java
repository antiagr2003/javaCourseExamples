package ui.objetos;

import app.Juego;

import java.awt.*;
import javax.swing.ImageIcon;

public class Sprite
{
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    protected boolean visible;
    protected Image imagen;

    public Sprite(int x, int y, String ficheroImagen)
    {
        this.x = x;
        this.y = y;
        visible = true;
        this.loadImage(ficheroImagen);
    }

    public static Sprite parse(String[] elementos)
    {
        int x = Integer.parseInt(elementos[1]);
        int  y = Integer.parseInt(elementos[2]);
        String ficheroImagen = elementos[3];
        Sprite sprite = new Sprite(x, y, ficheroImagen);
        return sprite;
    }

    private void loadImage(String ficheroImagen)
    {
        imagen = new ImageIcon(Juego.DIR_RESOURCES + ficheroImagen).getImage();
        ancho = imagen.getWidth(null);
        alto = imagen.getHeight(null);
    }    

    public Image getImagen()
    {
        return imagen;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public void pintar(Graphics2D g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagen, x, y, null);
    }
}
