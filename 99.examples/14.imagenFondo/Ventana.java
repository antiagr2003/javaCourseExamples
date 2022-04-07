import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame
{
	public static void main(String s[])
	{
		new Ventana("Ejemplo Imagen de Fondo");
	}
	
	public Ventana(String titulo)
	{
		this.setTitle(titulo);

			Image imagen = Toolkit.getDefaultToolkit().getImage("imagen.jpg");
			this.setContentPane(new JPanel() 
			{
				@Override
				public void paintComponent(Graphics g) 
				{
					super.paintComponent(g);
					g.drawImage(imagen, 0, 0, this);
				}
      		});			
		
		this.setLayout(new FlowLayout());
		this.add(new JLabel("Nombre: "));
		this.add(new JTextField(10));
		this.add(new JButton("Aceptar"));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(510, 430);	
		this.setVisible(true);	
	}
}