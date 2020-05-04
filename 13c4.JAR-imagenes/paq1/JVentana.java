package paq1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class JVentana extends JFrame
{
	private JWindow pantallazo;
	
	public static void main(String s[])
	{
		new JVentana("Ejemplo Imagenes en JAR");
	}
	
	public JVentana(String titulo)
	{
		this.setTitle(titulo);

		this.setLayout(new FlowLayout());
		JButton btnMostrar = new JButton("Mostrar");
		JButton btnOcultar = new JButton("Ocultar");
		
		btnMostrar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//JLabel lblImagen = new JLabel(new ImageIcon("images/imagen.jpg"));
					URL urlImagen = this.getClass().getResource("/images/imagen.jpg");
					JLabel lblImagen = new JLabel(new ImageIcon(urlImagen));
	
				    pantallazo = new JWindow();
	    			pantallazo.add(lblImagen);
	    			pantallazo.pack();
	    			Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
	    			pantallazo.setLocation(tamanio.width/2 - pantallazo.getSize().width/2,
				     						tamanio.height/2 - pantallazo.getSize().height/2);
				    pantallazo.setVisible(true);
				}
			});

		btnOcultar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					pantallazo.setVisible(false);
					pantallazo.dispose();
					pantallazo = null;
				}
			});	

		this.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});				

		this.add(btnMostrar);
		this.add(btnOcultar);
		this.setVisible(true);
		this.setResizable(false);
		this.pack();	
	}
}
