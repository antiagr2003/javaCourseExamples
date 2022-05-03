package ui.paneles;

import io.IOObjetos;
import ui.objetos.Nave;
import ui.objetos.Sprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Tablero extends JPanel
{
    private static final int FPS = 60;
    private static final int DELAY = 1/FPS * 1000;      //En milisegundos

    //Elementos del juego
    private LinkedList<Sprite> objetosJuego;
    private Nave nave;

    public Tablero()
    {
        objetosJuego = new LinkedList<Sprite>();

        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        objetosJuego = IOObjetos.importarSprites();     //Lectura del fichero
        nave = (Nave) objetosJuego.peekLast();          //Tomamos el último elemento que es la Nave

        this.addKeyListener(new KeyAdapter()            //Se envían las teclas pulsadas a la Nave
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                nave.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                nave.keyPressed(e);
            }
        });

        Timer timerObjetos = new Timer(DELAY, (e) ->
        {
            objetosJuego.forEach(objeto ->
            {
                objeto.mover();
                nave.checkImpacto(objeto);
            });
            this.repaint();
        });

        timerObjetos.start();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        objetosJuego.forEach(objeto -> objeto.pintar(g2d));

        Toolkit.getDefaultToolkit().sync();
    }
}
