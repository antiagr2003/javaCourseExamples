package ui.objetos;

import app.Juego;

import java.awt.*;
import javax.swing.ImageIcon;

public abstract class Sprite
{
    protected int x;
    protected int y;

    protected float xLogica;

    protected boolean visible;
    protected Image imagen;

    protected float velocidad;
    protected boolean colisionando;

    public Sprite(int x, int y, float velocidad, String ficheroImagen){
        this.init(x, y, velocidad, ficheroImagen);
    }

    public Sprite(String...elementos) 
    {
        this.parse(elementos);
    }

    protected void parse(String[] elementos) {
        int x = Integer.parseInt(elementos[1]);
        int y = Integer.parseInt(elementos[2]);
        float velocidad = -Float.parseFloat(elementos[3]);
        String ficheroImagen = elementos[4];
        this.init(x, y, velocidad, ficheroImagen);
    }

    protected void init(int x, int y, float velocidad, String ficheroImagen)
    {
        this.x = x;
        this.xLogica = x;
        this.y = y;
        this.velocidad = velocidad;
        visible = true;
        this.loadImage(ficheroImagen);
    }

    protected void loadImage(String ficheroImagen)
    {
        java.io.File file = new java.io.File(Juego.DIR_RESOURCES + ficheroImagen);
        if(!file.exists())
            System.out.println("No se encontró el fichero: " + file);
        imagen = new ImageIcon(Juego.DIR_RESOURCES + ficheroImagen).getImage();
        //System.out.println("Ancho x Alto:" + this.getAncho() + ", " + this.getAlto());
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

    public int getAncho()
    {
        return imagen.getWidth(null);
    }

    public int getAlto()
    {
        return imagen.getHeight(null);
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
        else if (x < -this.getAncho()) {
            xLogica = x = Juego.ANCHO;
            visible = true; //Si se eliminó por un misil, se restaura.
        }
    }

    protected Rectangle getRectangulo()
    {
        return new Rectangle(x, y, this.getAncho(), this.getAlto());
    }



    public void pintar(Graphics2D g)
    {
        if(visible) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(imagen, x, y, null);
            //Dibujar Boundbox en modo DEBUG
            if(Juego.DEBUG) {
                Rectangle r = this.getRectangulo();
                g2d.drawRect(r.x, r.y, r.width, r.height);
            }
        }
    }

    public abstract void colision();
}
