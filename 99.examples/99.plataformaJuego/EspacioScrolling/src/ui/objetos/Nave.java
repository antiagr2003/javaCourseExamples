package ui.objetos;

import ui.interfaces.Controlable;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Nave extends Sprite implements Controlable
{
    private static final String NOMBRE_IMAGEN = "nave.png";
    private static final String NOMBRE_IMAGEN_MISIL = "misil.png";
    private static final int VELOCIDAD_DEFAULT = 1;

    /** Para que se vea la salida del misil justo en la punta de la nave */
    private final int offset_y = -12;
    private float dx;
    private float dy;
    private List<Sprite> misiles;

    public Nave(int x, int y, float velocidad, String ficheroImagen)
    {
        super(x, y, velocidad, ficheroImagen);
        misiles = new ArrayList<>();
    }

    public Nave(int x, int y)
    {
        this(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
        misiles = new ArrayList<>();
    }

    public static Nave parse(String[] elementos)
    {
        int x = Integer.parseInt(elementos[1]);
        int y = Integer.parseInt(elementos[2]);
        Nave nave = new Nave(x, y);
        return nave;
    }

    @Override
    public void mover()
    {
        xLogica += dx;
        y += dy;

        x= (int) xLogica;

        misiles.forEach(Sprite::mover);
    }

    @Override
    public void pintar(Graphics2D g)
    {
        super.pintar(g);
        misiles.forEach(misil -> misil.pintar(g));
    }


    public List<Sprite> getMisiles()
    {
        return misiles;
    }

    @Override
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

    @Override
    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_SPACE -> misiles.add(new Sprite(x + ancho, y + (alto / 2) + offset_y, 2, NOMBRE_IMAGEN_MISIL));
            case KeyEvent.VK_LEFT -> dx = 0;
            case KeyEvent.VK_RIGHT -> dx = 0;
            case KeyEvent.VK_UP -> dy = 0;
            case KeyEvent.VK_DOWN -> dy = 0;
        }
    }
}