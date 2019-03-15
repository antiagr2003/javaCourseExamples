import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
                this.add(btnAceptar, BorderLayout.SOUTH);


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