import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;


public class App extends JFrame
{
	
	JMenuItem uno, dos, tres, cuatro, cinco;
	JPanel panel1, panel2;
	
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
		this.getContentPane().add(scroll);

		pnlBase.add(new JScrollPane(this.crearPanel("Uno")));
		pnlBase.add(this.crearPanel("Dos"));
		pnlBase.add(this.crearPanel("Tres"));
		pnlBase.add(this.crearPanel("Cuatro"));
		pnlBase.add(this.crearPanel("Cinco"));
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(true);
		this.setSize(400,400);				
		this.setVisible(true);
	}
	
	JPanel crearPanel(String titulo)
	{
		JButton b = new JButton("Aceptar");
		JTextField jt = new JTextField(titulo);
		
		panel1 = new JPanel(new FlowLayout());
		panel1.setPreferredSize(new Dimension(350, 20));		
		panel1.setMaximumSize(new Dimension(350, 20));		
		panel1.setMinimumSize(new Dimension(350, 20));		
		
		panel1.add(new JLabel("Número de panel: "));
		panel1.add(jt);
		panel1.add(b);
		
		//panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel1.setBorder(BorderFactory.createRaisedBevelBorder());
		
		return panel1;
	}
}