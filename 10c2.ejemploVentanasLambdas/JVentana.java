import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class JVentana extends JFrame
{
    private JTextField txtEdad;
    private JButton btnAceptar;
    private JLabel lblError;

	public static void main(String args[])
	{
	   new JVentana();
	}

	public JVentana()
	{
        txtEdad = new JTextField(2);
        btnAceptar = new JButton("Aceptar");
        lblError = new JLabel("");

        lblError.setForeground(Color.RED);

        btnAceptar.setEnabled(false);

        //Gestión de eventos basada en Java Lambdas
        btnAceptar.addActionListener(e -> this.crearPersona());

        txtEdad.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent e)
            {
                if(txtEdad.getText().length() > 0)
                {
                    btnAceptar.setEnabled(true);
                    lblError.setText("");

                    if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    {
                        JVentana.this.crearPersona();
                    }
                }
                else
                    btnAceptar.setEnabled(false);
            }
        });

        this.setLayout(new BorderLayout());
        
        JPanel pnlSuperior = new JPanel(new FlowLayout());
        pnlSuperior.add(new JLabel("Edad: "));
        pnlSuperior.add(txtEdad);
        pnlSuperior.add(btnAceptar);

        JPanel pnlInferior = new JPanel(new FlowLayout());
        pnlInferior.add(lblError);

        this.add(pnlSuperior, BorderLayout.NORTH);
        this.add(pnlInferior, BorderLayout.SOUTH);

        this.setSize(300, 95);

        this.setTitle("Otro título");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}

    private void crearPersona()
    {
         try
       {
            int edad = Integer.parseInt(txtEdad.getText());
            Persona p = new Persona(edad);
            System.out.println(p);
            txtEdad.setText("");
            btnAceptar.setEnabled(false);            
       } 
       catch(NumberFormatException nfe)
       {
            txtEdad.selectAll();
            txtEdad.requestFocus();
            lblError.setText("Edad no válida");
       }
       
    }
}