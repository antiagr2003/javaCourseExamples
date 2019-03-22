import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class JVentana extends JFrame implements ActionListener, Windowistener
{

        private JLabel lblNombre;
        private JTextField txtNombre = new JTextField(10);
        private JButton btnAceptar = new JButton("Aceptar");
        private JButton btnCancelar = new JButton("Cancelar");

	public static void main(String args[])
	{
		new JVentana();
                new JVentana();
	}

	public JVentana()
	{
                this.initComponents();
                this.initFrame();
	}

        private void initComponents()
        {

                lblNombre = new JLabel("Nombre: ");

                //componenteRecebirElEvento.addActionListener(gestorEvento);
                btnAceptar.addActionListener(this);
                btnCancelar.addActionListener(this);

                this.addWindowListener(this);

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

        @Override
        public void actionPerformed(ActionEvent e)
        {
                Object target = e.getSource();
                if(target == btnAceptar)
                        System.out.println("Boton Aceptar pulsado");
                else if(target == btnCancelar)
                        System.out.println("Boton Cancelar pulsado");
        }

        public void    windowActivated(WindowEvent e){}
        public void    windowClosed(WindowEvent e){}
        public void    windowClosing(WindowEvent e)
        {
                System.out.println("DEseas Salir...");
                //JOptionPane
        }
        public void    windowDeactivated(WindowEvent e){}
        public void    windowDeiconified(WindowEvent e){}
        public void    windowIconified(WindowEvent e){}
        public void    windowOpened(WindowEvent e){}
}