import javax.swing.JFrame;
import javax.swing.JButton;

public class MiVentana extends JFrame
{
	public static void main(String[] args) 
    {
	   new MiVentana();
    }

	public MiVentana()
	{
		this.setLocation(400, 0);
		this.setTitle("Ejemplo de Ventana");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Agregación de componentes
		JButton btnAceptar = new JButton("Aceptar");
		this.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		this.add(btnCancelar);

		//No agrega correctamente componentes porque no utiliza ningún Layout

		this.setVisible(true);
	}
    
}
