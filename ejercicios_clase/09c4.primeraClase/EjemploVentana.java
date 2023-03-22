import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Point;
import java.awt.FlowLayout;

public class EjemploVentana extends JFrame
{
	public static void main(String args[]) 
	{
		new EjemploVentana();
	}

	public EjemploVentana()
	{
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnUno = new JButton("Uno");
		JButton btnOtro = new JButton("Otro");

		this.setLayout(new FlowLayout());

		this.add(btnAceptar);
		this.add(btnCancelar);
		this.add(btnUno);
		this.add(btnOtro);

		/*
		Point p = new Point(200, 300)
		this.setLocation(p);
		*/

		this.setLocation(800, 200);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.setVisible(true);
	}
}