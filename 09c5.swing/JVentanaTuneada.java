import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.*;

public class JVentanaTuneada extends JFrame implements ActionListener, KeyListener
{

    private JTextField txtEdad;
    private JButton btnGuardar;
    private JButton btnLimpiar;

    public static void main(String args[])
    {
        new JVentanaTuneada();
    }

    public JVentanaTuneada()
    {
        super("JAgenda");
        this.setLayout(new BorderLayout(5,5)); //Gaps entre zonas

        JLabel lblTitulo = new JLabel("Agenda", new ImageIcon("java.png"), JLabel.CENTER); //Centra el componente en el área
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        //lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setForeground(new Color(50, 90, 168));

        //Se utiliza el constructor que recibe un LayoutManager
        //Se incluyen GAPs entre celdas del Grid
        JPanel pnlCentro = new JPanel(new GridLayout(2,2,5,5)); 
    
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblEdad = new JLabel("Edad:");
        JTextField txtNombre = new JTextField(10);
        txtEdad = new JTextField(2);

        pnlCentro.add(lblNombre);
        pnlCentro.add(txtNombre);
        pnlCentro.add(lblEdad);
        pnlCentro.add(txtEdad);
        
        JPanel pnlSur = new JPanel();
        pnlSur.setLayout(new FlowLayout());

        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");
        pnlSur.add(btnGuardar);
        pnlSur.add(btnLimpiar);

        this.add(lblTitulo, BorderLayout.NORTH); //Si una zona del Layout solo tiene un componente, puede agregarse sin Panel
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH); //Al tener solo un componente, se podría agregar sin Panel. Se deja así para agregar más botones en el futuro.
        
        //this.setTitle("Un titulo");
        //this.setSize(400, 200);


        btnGuardar.addActionListener(this);
        btnLimpiar.addActionListener(this);

        txtNombre.addKeyListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //Ajusta el tamaño de la ventana al tamaño de sus componentes.
        //this.setLocation(500, 10); //Posiciona la ventana en X, Y
        this.setLocationRelativeTo(null); //Posiciona la ventana en el centro de la pantalla
        
        this.setVisible(true); //Último método
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        char c = '\u2039';
        if(e.getSource()==btnLimpiar)
            System.out.println("Limpiar");
        else if(e.getSource()==btnGuardar)
            System.out.println("Guardar");
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
            txtEdad.requestFocus();//System.out.println("Enter");

        //Persona.EDAD_MAX
    }   

    @Override
    public void keyReleased(KeyEvent e)
    {
        //System.out.println("Rele");
    }   

    @Override
    public void keyTyped(KeyEvent e)
    {
        //System.out.println("Type");
    }       


}
