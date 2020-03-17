import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class JVentana extends JFrame
{
    public static void main(String[] args)
    {
        new JVentana();
    }

	public JVentana()
	{
        //super();
        super("Mi primera Ventana");

        //this.setLayout(new FlowLayout());
        this.setLayout(new GridLayout(3, 2));

        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblEdad = new JLabel("Edad: ");

        JTextField txtNombre = new JTextField(10);
        JTextField txtEdad = new JTextField(10); //Caracteres


        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblEdad);
        this.add(txtEdad);
        this.add(btnAceptar);
        this.add(btnCancelar);
        
        //this.setTitle("Mi primera Ventana");
        this.setSize(800, 600);
        //Este método siempre debe ser el último mensaje
        this.setVisible(true);
	}
}

/*
JDialog
JWindow
JFrame
*/