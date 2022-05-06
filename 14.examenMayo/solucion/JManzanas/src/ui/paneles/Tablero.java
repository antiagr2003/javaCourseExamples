package ui.paneles;

import app.Juego;
import io.IOCongiguracion;
import ui.objetos.*;
import util.Generador;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Tablero extends JPanel implements Runnable
{
    public static final int Y_BASE = Juego.ALTO - 50;

    /** Valor por defecto 60 FPS */
    private int fps = 60;

    //Elementos del juego
    private ArrayList<SpriteMovimiento> objetosMovimiento;
    private Personaje personaje;
    private boolean comienzaJuego = false;

    public Tablero()
    {
        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        this.init();

        this.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                personaje.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                comienzaJuego = true;
                personaje.keyPressed(e);
            }
        });

        Thread hilo = new Thread(this);
        hilo.start();
    }

    private void init()
    {
        objetosMovimiento = new ArrayList<>();
        IOCongiguracion configuracionJuego = new IOCongiguracion();
        configuracionJuego.leerConfiguracion();
        int numeroManzanas = configuracionJuego.getNumeroManzanas();
        int numeroLadrillos = configuracionJuego.getNumeroLadrillos();
        fps = configuracionJuego.getFPS();
        personaje = new Personaje();
        for(int i=0;i<numeroManzanas;i++)
            objetosMovimiento.add(new Manzana(Generador.generaX(200, Juego.ANCHO)));
        for(int i=0;i<numeroLadrillos;i++)
            objetosMovimiento.add(new Ladrillo(Generador.generaX(200, Juego.ANCHO)));
    }

    /** En milisegundos */
    private int calcularDelay()
    {
        return (int) (1/(fps*1.)*1000);
    }

    @Override
    public void run()
    {
        while(personaje.isVivo())
        {
            try
            {
                Thread.sleep(this.calcularDelay());
                objetosMovimiento.forEach(objeto ->
                {
                    objeto.mover();
                    personaje.checkImpacto(objeto);
                });
                this.repaint();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if(!comienzaJuego && personaje.isVivo())
        {
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            String texto = "BARRA ESPACIADORA PARA SALTAR";
            g.drawString(texto, Juego.ANCHO/2 - texto.length()/2*13, Juego.ALTO/2);
        }

        if(personaje.isVivo()) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.PLAIN, 15));
            g.drawString("Vida: " + personaje.getVida(), 25, 25);
            objetosMovimiento.forEach(objeto -> objeto.pintar(g));
            personaje.pintar(g);
        }
        else{
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.PLAIN, 30));
            String texto = "GAME OVER";
            g.drawString(texto, Juego.ANCHO/2 - texto.length()/2*20, Juego.ALTO/2);
        }
    }
}
