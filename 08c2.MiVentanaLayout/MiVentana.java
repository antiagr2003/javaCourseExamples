import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame
{
	public static void main(String[] args) 
    {
	   new MiVentana();
    }

	public MiVentana()
	{
		this.setTitle("Ejemplo de Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new BorderLayout());

		JLabel lblTitulo = new JLabel("JPersona maker", JLabel.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setForeground(Color.BLUE);
		this.add(lblTitulo, BorderLayout.NORTH);

		JPanel pnlCentral = new JPanel(new FlowLayout());
		JLabel lblNombre = new JLabel("Nombre:");
		JTextField txtNombre = new JTextField(10);
		pnlCentral.add(lblNombre);
		pnlCentral.add(txtNombre);

		this.add(pnlCentral, BorderLayout.CENTER);

		//Agregación de componentes
		JPanel pnlBotonesSur = new JPanel(new FlowLayout());
		//pnlBotonesSur.setLayout(new FlowLayout()); Se podría hacer en dos pasos.
		JButton btnCrear = new JButton("Crear Persona");
		JButton btnLimpiar = new JButton("Limpiar");
		btnCrear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLimpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlBotonesSur.add(btnLimpiar);
		pnlBotonesSur.add(btnCrear);

		this.add(pnlBotonesSur, BorderLayout.SOUTH);
		//No agrega correctamente componentes porque no utiliza ningún Layout

		this.setResizable(false);
		this.setTitle("Creación de Personas");
		//this.setSize(300, 300);
		this.pack();
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}
    
}
