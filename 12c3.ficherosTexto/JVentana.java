import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class JVentana extends JFrame
{
    private JTextField txtEdad;
    private JTextField txtNombre;
    private JButton btnAceptar;
    private JLabel lblError;

    private java.util.Collection personas;

	public static void main(String args[])
	{
	   new JVentana();
	}

	public JVentana()
	{
        personas = IOPersona.leerPersonas();
        IOPersona.importPersonasFromTexto(personas);
                
        txtEdad = new JTextField(2);
        txtNombre = new JTextField(10);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setEnabled(false);

        lblError = new JLabel("");
        lblError.setForeground(Color.RED);

        btnAceptar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JVentana.this.crearPersona();
            }
        });

        txtNombre.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    txtEdad.requestFocus();
            }
        });

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

        this.addWindowListener(new WindowAdapter()
        {
        	@Override
        	public void windowClosing(WindowEvent e)
        	{
        		System.out.println(personas);
        		//if desea salir/guardar.....
        		IOPersona.escribirPersonas(personas);
                IOPersona.exportarPersonas2Texto(personas);
                try
                {
                    Runtime.getRuntime().exec("cmd /c output.html");
                }
                catch(java.io.IOException ioe)
                {
                    ioe.printStackTrace();
                }

        		JVentana.this.dispose();
        		System.exit(0);
        	}
        });

        this.setLayout(new BorderLayout());
        
        JPanel pnlFormulario = new JPanel(new BorderLayout());

        JPanel pnlNombre = new JPanel(new FlowLayout());
        pnlNombre.add(new JLabel("Nombre: "));
        pnlNombre.add(txtNombre);

        JPanel pnlEdad = new JPanel(new FlowLayout());
        pnlEdad.add(new JLabel("Edad: "));
        pnlEdad.add(txtEdad);

        pnlFormulario.add(pnlNombre, BorderLayout.NORTH);
        pnlFormulario.add(pnlEdad, BorderLayout.SOUTH);

        pnlEdad.add(btnAceptar);

        JPanel pnlInferior = new JPanel(new BorderLayout());

        JPanel pnlInferiorBoton = new JPanel(new FlowLayout());
        pnlInferiorBoton.add(btnAceptar);

        JPanel pnlInferiorError = new JPanel(new FlowLayout());
        pnlInferiorError.add(lblError);   

        pnlInferior.add(pnlInferiorBoton, BorderLayout.NORTH);
        pnlInferior.add(pnlInferiorError, BorderLayout.SOUTH);

        this.add(pnlFormulario, BorderLayout.NORTH);
        this.add(pnlInferior, BorderLayout.SOUTH);

        this.setSize(300, 175);
        this.setTitle("Gestión de Personas (" + personas.size() + ")");
        this.setResizable(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}

    private void crearPersona()
    {
        try
        {
            int edad = Integer.parseInt(txtEdad.getText());
            Persona p = new Persona(txtNombre.getText(), edad);
            personas.add(p);
            System.out.println(p);
            txtNombre.setText("");
            txtEdad.setText("");
            txtNombre.requestFocus();
            btnAceptar.setEnabled(false);            
        } 
        catch(NumberFormatException nfe)
        {
            txtEdad.selectAll();
            txtEdad.requestFocus();
            lblError.setText("La edad debe ser numérica");
        }
        catch(EdadNoValidaException enve)
        {
            txtEdad.selectAll();
            txtEdad.requestFocus();
            lblError.setText(enve.getMessage());
        }
       

    }
}