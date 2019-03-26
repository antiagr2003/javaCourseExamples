import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JVentana extends JFrame
{
    public static void main(String args[]) 
    {
        new JVentana();
    }
    
    public JVentana()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent e) 
            {
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                {
                    System.out.println("DERECHA");
                    Point p = JVentana.this.getLocation();
                    JVentana.this.setLocation((int) p.getX()+10, (int) p.getY());
                }
                else if(e.getKeyCode()==KeyEvent.VK_LEFT)
                {
                    System.out.println("IZQUIERDA");
                    Point p = JVentana.this.getLocation();
                    JVentana.this.setLocation((int) p.getX()-10, (int) p.getY());
                }
                else if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    System.out.println("ABAJO");
                    Point p = JVentana.this.getLocation();
                    JVentana.this.setLocation((int) p.getX(), (int) p.getY()+10);
                }
                else if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    System.out.println("ARRIBA");
                    Point p = JVentana.this.getLocation();
                    JVentana.this.setLocation((int) p.getX(), (int) p.getY()-10);
                }
            }
        });

        this.add(new JLabel("Pulsa en las teclas de cursor", JLabel.CENTER));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        //A tener en cuenta:
        //this.setFocusable(true);
        //this.setFocusTraversalKeysEnabled(false);

        this.setVisible(true);
    }
}