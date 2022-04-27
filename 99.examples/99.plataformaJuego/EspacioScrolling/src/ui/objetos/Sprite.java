package ui.objetos;

import app.Juego;

import java.awt.*;
import java.util.Arrays;;
import javax.swing.ImageIcon;

public class Sprite
{
    protected int x;
    protected int y;

    protected float xLogica;

    protected int ancho;
    protected int alto;

    protected boolean visible;
    protected Image imagen;

    protected float velocidad;

    public Sprite(int x, int y, float velocidad, String ficheroImagen)
    {
        this.x = x;
        this.xLogica = x;
        this.y = y;
        this.velocidad = velocidad;
        visible = true;
        this.loadImage(ficheroImagen);
    }

    public static Sprite parse(String[] elementos)
    {
        int x = Integer.parseInt(elementos[1]);
        int y = Integer.parseInt(elementos[2]);
        float velocidad = Float.parseFloat(elementos[3]);
        String ficheroImagen = elementos[4];
        Sprite sprite = new Sprite(x, y, -velocidad, ficheroImagen);
        return sprite;
    }

    private void loadImage(String ficheroImagen)
    {
        java.io.File file = new java.io.File(Juego.DIR_RESOURCES + ficheroImagen);
        if(!file.exists())
            System.out.println("No se encontró el fichero: " + file);
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

    public void mover()
    {
        xLogica += velocidad;
        x = (int) xLogica;

        if (x > Juego.ANCHO)
            visible = false;
        else if (x < 0 - this.ancho)
            xLogica = x = Juego.ANCHO;
    }

    public void pintar(Graphics2D g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagen, x, y, null);
    }
}
