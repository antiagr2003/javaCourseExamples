import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.*;

public class JVentanaConcurrencia extends JFrame
{

    private JTextArea txtWeb;
    private JButton btnAcceder;

    public static void main(String args[])
    {
        new JVentanaConcurrencia();
    }

    public JVentanaConcurrencia()
    {
        super("Concurrencia");
        this.setLayout(new BorderLayout(5,5)); //Gaps entre zonas

        JLabel lblTitulo = new JLabel("Concurrencia", new ImageIcon("java.png"), JLabel.CENTER); //Centra el componente en el área
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(new Color(50, 90, 168));

        JPanel pnlCentro = new JPanel(new FlowLayout()); 
    
        txtWeb = new JTextArea(50, 50);
        pnlCentro.add(new JScrollPane(txtWeb));
        
        JPanel pnlSur = new JPanel();
        pnlSur.setLayout(new FlowLayout());

        btnAcceder = new JButton("Iniciar hilos");
        pnlSur.add(btnAcceder);

        this.add(lblTitulo, BorderLayout.NORTH); 
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH); 
        
        btnAcceder.addActionListener(e ->
                {
                    Hilo hilo1 = new Hilo("A", JVentanaConcurrencia.this);
                    Hilo hilo2 = new Hilo("B", JVentanaConcurrencia.this);
                    Hilo hilo3 = new Hilo("C", JVentanaConcurrencia.this);
                    Hilo hilo4 = new Hilo("D", JVentanaConcurrencia.this);
                    hilo1.start();
                    hilo2.start();
                    hilo3.start();                     
                    hilo4.start();                    
                });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //Ajusta el tamaño de la ventana al tamaño de sus componentes.
        this.setLocationRelativeTo(null); //Posiciona la ventana en el centro de la pantalla
        this.setVisible(true); //Último método
    }

    /* Este modificador evita que entren más de un hilo a la vez en el método */
    public synchronized void actualizarTexto(String texto)
    {
        txtWeb.append(texto + "\n");
    }

}
