import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class JFrameImagenFondo extends JFrame
{
    public static void main(String args[])
    {
        new JFrameImagenFondo();
    }

    public JFrameImagenFondo()
    {
        JPanelImagen panel = new JPanelImagen();

        JViewport viewport = new JViewport();
        viewport.setView(panel);
        viewport.setPreferredSize(new Dimension(1000, 500)); //Más grande que el panel, por ejemplo

        JScrollPane scrollpane = new JScrollPane();
        scrollpane.setViewportView(viewport);

        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
 
        this.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent e) 
            {
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                    scrollpane.getHorizontalScrollBar().setValue(scrollpane.getHorizontalScrollBar().getValue() + 50);
                else if(e.getKeyCode()==KeyEvent.VK_LEFT)
                    scrollpane.getHorizontalScrollBar().setValue(scrollpane.getHorizontalScrollBar().getValue() - 50);
                else if(e.getKeyCode()==KeyEvent.VK_DOWN)
                    scrollpane.getVerticalScrollBar().setValue(scrollpane.getVerticalScrollBar().getValue() + 50);
                else if(e.getKeyCode()==KeyEvent.VK_UP)
                    scrollpane.getVerticalScrollBar().setValue(scrollpane.getVerticalScrollBar().getValue() - 50);
            }
        });

        this.add(scrollpane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 300);
        this.setVisible(true);
    }
}
