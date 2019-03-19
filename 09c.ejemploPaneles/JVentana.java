import javax.swing.JFrame;
import javax.swing.JPanel;
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
                this.initComponents();
                this.initFrame();
	}

        private void initComponents()
        {

                JLabel lblNombre = new JLabel("Nombre: ");
                JTextField txtNombre = new JTextField(10);
                JButton btnAceptar = new JButton("Aceptar");
                JButton btnCancelar = new JButton("Cancelar");

                //this.setLayout(new FlowLayout());
                this.setLayout(new BorderLayout());

                JPanel pnlNorte = new JPanel(new FlowLayout());

                pnlNorte.add(lblNombre);
                pnlNorte.add(txtNombre);

                JPanel pnlSur = new JPanel(new FlowLayout());

                pnlSur.add(btnAceptar);
                pnlSur.add(btnCancelar);

                this.add(pnlNorte, BorderLayout.NORTH);
                this.add(pnlSur, BorderLayout.SOUTH);

        }

        private void initFrame()
        {
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