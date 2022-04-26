package ui.paneles;

import io.IOObjetos;
import ui.interfaces.Controlable;
import ui.objetos.Sprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tablero extends JPanel
{
    private static final int FPS = 60;
    private static final int DELAY = 1/FPS * 1000; //En milisegundos

    //Elementos del juego
    private List<Sprite> objetosJuego;

    public Tablero()
    {
        objetosJuego = new ArrayList<Sprite>();

        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        //Lectura del fichero
        objetosJuego = IOObjetos.importarSprites();

        //Se envían las teclas pulsadas a todos los elementos del juego para que se actualicen
        this.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                objetosJuego.forEach(sprite ->
                    {
                        if (sprite instanceof Controlable controlable)
                            controlable.keyReleased(e);
                    });
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                objetosJuego.forEach(sprite ->
                    {
                        if (sprite instanceof Controlable controlable)
                            controlable.keyPressed(e);
                    });
            }
        });

        Timer timerObjetos = new Timer(DELAY, (e) ->
            {
                objetosJuego.forEach(objetos ->
                        {
                            //if(objetos instanceof Sprite movible)
                                objetos.mover();
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
