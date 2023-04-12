import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaBordes extends JFrame
{
    public static void main(String[] args) 
    {
        new VentanaBordes();
    }

    public VentanaBordes()
    {
        JTextField txt = new JTextField(10);
        
        this.add(txt);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e)
            {
                txt.setBorder(BorderFactory.createLineBorder(Color.RED));
            }

            @Override
            public void windowActivated(WindowEvent e)
            {
                txt.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            }
        });
        this.setSize(300, 300);
        this.setVisible(true);
    }
}