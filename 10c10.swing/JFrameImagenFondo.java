import java.awt.*;
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.setSize(panel.getAncho(),panel.getAlto());
        this.setVisible(true);
    }
}
