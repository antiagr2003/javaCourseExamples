import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class JVentana extends JFrame
{
        private JTextField txtEdad = new JTextField(2);

	public static void main(String args[])
	{
	       new JVentana();
	}

	public JVentana()
	{
                JLabel lblEdad = new JLabel("Edad: ");
                
                JButton btnAceptar = new JButton("Aceptar");


                btnAceptar.addActionListener(new ActionListener()
                {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                               try
                               {
                                        int edad = Integer.parseInt(txtEdad.getText());
                                        System.out.println(edad);
                               } 
                               catch(NumberFormatException nfe)
                               {
                                        System.out.println("ERRORR");
                               }
                               
                        }
                });

                //this.setLayout(new FlowLayout());
                this.setLayout(new BorderLayout());

                this.add(lblEdad, BorderLayout.WEST);
                this.add(txtEdad, BorderLayout.EAST);
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