import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame
{
	private JWindow pantallazo;
	
	public static void main(String s[])
	{
		new Ventana("Ejemplo Imagen");
	}
	
	Ventana(String titulo)
	{
		this.setTitle(titulo);

		this.getContentPane().setLayout(new FlowLayout());
		JLabel lblImagen = new JLabel(new ImageIcon("imagenSmall.jpg"));
		JButton btnMostrar = new JButton("Mostrar", new ImageIcon("imagenSmall.jpg"));
		JButton btnOcultar = new JButton("Ocultar");
		btnOcultar.setIcon(new ImageIcon("imagenSmall.jpg"));
		btnOcultar.setEnabled(false);
		
		//ImageIcon imagen = new ImageIcon("imagenSmall.jpg");
		
		btnMostrar.addActionListener(e ->
				{
					JLabel lblTitulo = new JLabel(new ImageIcon("imagen.jpg"));
	
				    pantallazo = new JWindow();
	    			pantallazo.getContentPane().add(lblTitulo);
	    			pantallazo.pack();
	    			Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
	    			pantallazo.setLocation(tamanio.width/2 - pantallazo.getSize().width/2,
				     		tamanio.height/2 - pantallazo.getSize().height/2);
				    pantallazo.setVisible(true);
				    btnOcultar.setEnabled(true);
				    btnMostrar.setEnabled(false);
				});

		btnOcultar.addActionListener(e ->
				{
					pantallazo.setVisible(false);
					pantallazo.dispose();
					pantallazo = null;
					btnMostrar.setEnabled(true);
					btnOcultar.setEnabled(false);
				});

		this.setIconImage(new ImageIcon("imagenIcon.jpg").getImage());

		this.getContentPane().add(lblImagen);
		this.getContentPane().add(btnMostrar);
		this.getContentPane().add(btnOcultar);
		this.setVisible(true);
		this.setResizable(false);
		this.pack();
		
		this.addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
}
