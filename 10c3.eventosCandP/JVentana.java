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
                Point p = null;
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_C:
                        if(e.getModifiersEx()==KeyEvent.CTRL_DOWN_MASK)
                            System.out.println("Ctrl+C");
                        break;

                    case KeyEvent.VK_V:
                        if(e.getModifiersEx()==KeyEvent.CTRL_DOWN_MASK)
                            System.out.println("Ctrl+V");
                        break;

                    case KeyEvent.VK_W:
                        if(e.getModifiersEx()==KeyEvent.CTRL_DOWN_MASK)
                        {
                            System.out.println("Ctrl+W: Saliendo...");
                            JVentana.this.dispose();
                            System.exit(0);
                        }
                        break;

                    case KeyEvent.VK_RIGHT:
                        System.out.println("DERECHA");
                        p = JVentana.this.getLocation();
                        JVentana.this.setLocation((int) p.getX()+10, (int) p.getY());
                        break;

                    case KeyEvent.VK_LEFT:
                        System.out.println("IZQUIERDA");
                        p = JVentana.this.getLocation();
                        JVentana.this.setLocation((int) p.getX()-10, (int) p.getY());
                        break;

                    case KeyEvent.VK_DOWN:
                        System.out.println("ABAJO");
                        p = JVentana.this.getLocation();
                        JVentana.this.setLocation((int) p.getX(), (int) p.getY()+10);
                        break;

                    case KeyEvent.VK_UP:
                        System.out.println("ARRIBA");
                        p = JVentana.this.getLocation();
                        JVentana.this.setLocation((int) p.getX(), (int) p.getY()-10);
                        break;
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