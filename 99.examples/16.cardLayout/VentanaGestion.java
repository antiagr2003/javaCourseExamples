import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComponent;

public class VentanaGestion extends JFrame
{
	JButton btnGestion;
	JButton btnInforme;
	
	JTextField txtNombre;
	JTextField txtApellidos;
	JTextField txtDireccion;
	
	JTextArea txtInforme;
	JPanel pnlCentro;
	
	
	public static void main(String[] args) 
	{
		new VentanaGestion();
	}
	
	public VentanaGestion()
	{
		Container c = this.getContentPane();
		
		JPanel pnlNorte = new JPanel(new FlowLayout()); 
		btnGestion = new JButton("Gestion");
		btnInforme  = new JButton("Informe");
		pnlNorte.add(btnGestion);
		pnlNorte.add(btnInforme);
		
		pnlCentro = new JPanel(new CardLayout());
		
		JPanel pnlGestion = new JPanel(new BorderLayout()); 
		
		JPanel pnlGestion1 = new JPanel();
		pnlGestion1.setLayout(new BoxLayout(pnlGestion1, BoxLayout.Y_AXIS));
		pnlGestion1.add(new JLabel("Nombre:", JLabel.RIGHT));
		pnlGestion1.add(new JLabel("Apellidos:", JLabel.RIGHT));
		pnlGestion1.add(new JLabel("Dirección:", JLabel.RIGHT));
		
		JPanel pnlGestion2 = new JPanel();
		pnlGestion2.setLayout(new BoxLayout(pnlGestion2, BoxLayout.Y_AXIS));
		txtNombre = new JTextField ();
		txtNombre.setAlignmentX(JComponent.LEFT_ALIGNMENT);
		txtNombre.setMinimumSize(new Dimension(100,18));
		txtNombre.setMaximumSize(new Dimension(100,18));
		txtNombre.setPreferredSize(new Dimension(100,18));

		txtApellidos = new JTextField ();
		txtApellidos.setAlignmentX(JComponent.LEFT_ALIGNMENT);
		txtApellidos.setMinimumSize(new Dimension(200,18));
		txtApellidos.setMaximumSize(new Dimension(200,18));
		txtApellidos.setPreferredSize(new Dimension(200,18));
		
		txtDireccion = new JTextField ();
		txtDireccion.setAlignmentX(JComponent.LEFT_ALIGNMENT);
		txtDireccion.setMinimumSize(new Dimension(250,18));
		txtDireccion.setMaximumSize(new Dimension(250,18));
		txtDireccion.setPreferredSize(new Dimension(250,18));
		
		pnlGestion2.add(txtNombre);
		pnlGestion2.add(txtApellidos);
		pnlGestion2.add(txtDireccion);

		pnlGestion.add(pnlGestion1, BorderLayout.WEST);
		pnlGestion.add(pnlGestion2, BorderLayout.EAST);	
		
		JPanel pnlInforme = new JPanel(new BorderLayout());
		pnlInforme.add(new JLabel("Informe de Objetos"));
		txtInforme = new JTextArea(5, 5);
		JScrollPane sp = new JScrollPane (txtInforme );
		pnlInforme.add(new JLabel("Informe de Objetos"), BorderLayout.NORTH);
		pnlInforme.add(sp, BorderLayout.CENTER);
		
		pnlCentro.add(pnlGestion, "GESTION");
		pnlCentro.add(pnlInforme, "INFORME");
	
		c.setLayout(new BorderLayout());
		c.add(pnlNorte, BorderLayout.NORTH);
		c.add(pnlCentro, BorderLayout.CENTER);


		btnGestion.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					mostrarPanel("GESTION");
				}
			});
			
		btnInforme.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					mostrarPanel("INFORME");
				}
			});


		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.pack();
		this.setTitle("Gestión de Personas");
		this.setResizable(false);
		this.setVisible(true);
	}

	private void mostrarPanel(String panel) 
	{
		CardLayout cl = (CardLayout) pnlCentro.getLayout();
		cl.show(pnlCentro , panel); 
	}
}
