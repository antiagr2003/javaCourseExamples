import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class JPanelImagen extends JPanel
{
    private BufferedImage imagen;

    public JPanelImagen()
    {
        try
        {
            imagen = javax.imageio.ImageIO.read(new java.io.File("java.jpg"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        this.setLayout(new FlowLayout());
        this.add(new JButton("Bot�n 1"));
        this.add(new JButton("Bot�n 2"));
        this.add(new JButton("Bot�n 3"));        
    }

    public int getAncho()
    {
        return imagen.getWidth();
    }

    public int getAlto()
    {
        return imagen.getHeight();
    }    

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
}
