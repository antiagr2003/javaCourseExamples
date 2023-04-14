package ui.objetos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Nave extends Sprite
{
    private static final String NOMBRE_IMAGEN = "nave.png";
    private static final float VELOCIDAD_DEFAULT = 1;

    /** Para que se vea la salida del misil justo en la punta de la nave */
    private final int offset_y = -12;
    private float dx;
    private float dy;
    private List<Misil> misiles;

    public Nave(int x, int y, float velocidad, String ficheroImagen)
    {
        super(x, y, velocidad, ficheroImagen);
    }

    public Nave(int x, int y)
    {
        this(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
    }

    public Nave(String...elementos) {
        super(elementos);
    }

    @Override
    protected void init(int x, int y, float velocidad, String ficheroImagen)
    {
        super.init(x, y, velocidad, ficheroImagen);
        misiles = new ArrayList<>();
    }

    @Override
    public void parse(String[] elementos)
    {
        int x = Integer.parseInt(elementos[1]);
        int y = Integer.parseInt(elementos[2]);
        this.init(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
    }

    @Override
    public void mover()
    {
        xLogica += dx;
        y += dy;
        x = (int) xLogica;
        misiles.forEach(Sprite::mover);
    }

    @Override
    public void pintar(Graphics2D g)
    {
        super.pintar(g);
        misiles.forEach(misil -> misil.pintar(g));
    }

    public List<Misil> getMisiles()
    {
        return misiles;
    }

    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT -> dx = -velocidad;
            case KeyEvent.VK_RIGHT -> dx = velocidad;
            case KeyEvent.VK_UP -> dy = -velocidad;
            case KeyEvent.VK_DOWN -> dy = velocidad;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_SPACE -> misiles.add(new Misil(x + this.getAncho(), y + (this.getAlto() / 2) + offset_y));
            case KeyEvent.VK_LEFT -> dx = 0;
            case KeyEvent.VK_RIGHT -> dx = 0;
            case KeyEvent.VK_UP -> dy = 0;
            case KeyEvent.VK_DOWN -> dy = 0;
        }
    }

    public void checkImpacto(Sprite sprite)
    {
        if(sprite instanceof Asteroide)
        {
            if(this.getRectangulo().intersects(sprite.getRectangulo())
                    && sprite.isVisible())
                this.colision();
            misiles.forEach(misil -> misil.checkImpacto(sprite));
        }
    }

    @Override
    public void colision()
    {
        if(!colisionando) {
            colisionando = true;
            Thread t = new Thread(() ->
            {
                for (int i = 0; i < 6; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    visible = !visible;
                }
                colisionando = false;
            });
            t.start();
        }
    }
}