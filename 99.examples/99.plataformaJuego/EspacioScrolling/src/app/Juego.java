package app;

import ui.paneles.Tablero;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Juego extends JFrame
{
    public final static int ANCHO = 600;
    public final static int ALTO = 400;
    public static final String DIR_RESOURCES = "resources/";

    public Juego()
    {
        this.add(new Tablero());

        this.setTitle("Juego del Espacio");
        this.setSize(ANCHO, ALTO);

        this. setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        //Se suele poner en aplicaciones "serias" para sincronizar el inicio de la aplicación
        EventQueue.invokeLater(() -> {
            Juego ex = new Juego();
            ex.setVisible(true);
        });
    }
}
