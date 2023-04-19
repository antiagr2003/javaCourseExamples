import java.util.Date;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reloj extends JFrame
{
    private JLabel lblHora;
    private boolean fin = false;

    public static void main(String[] args) 
    {
        new Reloj();   
    }

    public Reloj()
    {
        lblHora = new JLabel(new Date().toString());
        this.add(lblHora);

        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() 
            {
                while(!fin)
                {
                    try 
                    {
                        Thread.sleep(1000);
                        lblHora.setText(new Date().toString());
                    }
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }                
            }
        });

        hilo.start();

        this.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    fin = true;
                    Reloj.this.dispose();
                    System.exit(0);
                }
            });
        this.pack();
        this.setVisible(true);
    }
    
}
