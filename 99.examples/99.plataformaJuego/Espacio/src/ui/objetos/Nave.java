package ui.objetos;

import ui.interfaces.Controlable;
import ui.interfaces.Movible;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Nave extends Sprite implements Controlable, Movible
{
    private static final String NOMBRE_IMAGEN = "resources/nave.png";
    /** Para que se vea la salida del misil justo en la punta de la nave */
    private final int offset_y = -12;
    private int dx;
    private int dy;
    private List<Misil> misiles;

    public Nave(int x, int y, String ficheroImagen)
    {
        super(x, y, ficheroImagen);
        misiles = new ArrayList<>();
    }

    public Nave(int x, int y)
    {
        super(x, y, NOMBRE_IMAGEN);
        misiles = new ArrayList<>();
    }

    public static Nave parse(String[] elementos)
    {
        int x = Integer.parseInt(elementos[1]);
        int  y = Integer.parseInt(elementos[2]);
        Nave nave = new Nave(x, y);
        return nave;
    }

    @Override
    public void mover()
    {
        x += dx;
        y += dy;

        misiles.forEach(Misil::mover);
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

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT -> dx = -1;
            case KeyEvent.VK_RIGHT -> dx = 1;
            case KeyEvent.VK_UP -> dy = -1;
            case KeyEvent.VK_DOWN -> dy = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_SPACE -> misiles.add(new Misil(x + ancho, y + (alto / 2) + offset_y));
            case KeyEvent.VK_LEFT -> dx = 0;
            case KeyEvent.VK_RIGHT -> dx = 0;
            case KeyEvent.VK_UP -> dy = 0;
            case KeyEvent.VK_DOWN -> dy = 0;
        }
    }
}