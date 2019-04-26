package ejemploImagenes.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class JVentana extends JFrame
{
	public static void main( String[] args )
	{
		new JVentana();
	}

	public JVentana()
	{

        JLabel lblNombre = new JLabel("Nombre: ");
        JTextField txtNombre = new JTextField(10);
        JButton btnAceptar = new JButton("Aceptar");

        //this.setLayout(new FlowLayout());
        this.setLayout(new BorderLayout());

        this.add(lblNombre, BorderLayout.WEST);
		this.add(txtNombre, BorderLayout.EAST);

        java.net.URL url = this.getClass().getResource("/images/java.png");             
        JLabel labelRotulo = new JLabel("Gestión de Alumnos", new ImageIcon(url), JLabel.CENTER);
        this.add(labelRotulo, BorderLayout.NORTH);
        this.add(btnAceptar, BorderLayout.SOUTH);

        url = this.getClass().getResource("/images/icono.png");
        this.setIconImage(new ImageIcon(url).getImage());

        //Tamaño
        //this.setSize(300, 200);
        this.pack();

        //Cambio de título
        this.setTitle("Otro título");
        //No se cambie de tamaño
        this.setResizable(true);
        //Cierre por defecto
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setLocation(300, 400);
        this.setLocationRelativeTo(null);
        //Última acción
        this.setVisible(true);
	}
}