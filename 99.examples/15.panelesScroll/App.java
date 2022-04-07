import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame
{
	
	public static void main(String s[])
	{
		new App();
	}

	public App()
	{
		this.setTitle("Paneles");
		JPanel pnlBase = new JPanel(new GridLayout(5,1));
		JScrollPane scroll = new JScrollPane(pnlBase);
        scroll.setSize(350,100);
		this.add(scroll);

		pnlBase.add(this.crearPanel("Uno"));
		pnlBase.add(this.crearPanel("Dos"));
		pnlBase.add(this.crearPanel("Tres"));
		pnlBase.add(this.crearPanel("Cuatro"));
		pnlBase.add(this.crearPanel("Cinco"));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(400,200);				
		this.setVisible(true);
	}
	
	private JPanel crearPanel(String titulo)
	{
		JButton btnAceptar = new JButton("Aceptar");

		JPanel panel = new JPanel(new FlowLayout());
		panel.setPreferredSize(new Dimension(350, 50));		
		
		panel.add(new JLabel("Número de panel: "+ titulo));
		panel.add(btnAceptar);
		
		panel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		return panel;
	}
}