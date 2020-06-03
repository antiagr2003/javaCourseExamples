package examenMayo2020.ui;

import examenMayo2020.dominio.Alumno;
import examenMayo2020.dominio.Asignatura;
import examenMayo2020.io.IONotas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.util.HashMap;
import java.util.Collection;

//------------------------------------------------------------------------
// ToDo: compilar y ejecutar el programa
//------------------------------------------------------------------------

    //javac examenMayo2020\ui\JVentana.java

    //java examenMayo2020.ui.JVentana

//----------------------------------------------------
// FIN de los comandos de compilación y ejecución
//----------------------------------------------------


public class JVentana extends JFrame
{
    //---------------------------------------------
    // ToDo: si debes definir algún atributo, aquí:
    //---------------------------------------------
        private HashMap<Alumno, Collection<Asignatura>> mapaAlumnos;
    //---------------------
    // FIN de los atributos
    //---------------------
	
	public static void main(String[] args)
    {
        new JVentana();
    }

	public JVentana()
	{
        super("JAlumnos - Examen mayo 2020");

        JPanel pnlNorte = new JPanel(new FlowLayout());
        JLabel lblAplicacion = new JLabel("Notas de alumnos");
        lblAplicacion.setFont(new Font("Arial", Font.BOLD, 16));
        lblAplicacion.setForeground(new Color(112, 146, 190));
        
        pnlNorte.add(lblAplicacion);

        JPanel pnlCentroArriba = new JPanel(new FlowLayout());
        JButton btnMostrar = new JButton("Mostrar");
        JLabel lblClave = new JLabel("Clave de alumno: ");
        JTextField txtClave = new JTextField("20180001");
        JLabel lblTitulo = new JLabel("Título: ");
        JTextField txtTitulo = new JTextField("GITT");

        pnlCentroArriba.add(lblClave);
        pnlCentroArriba.add(txtClave);
        pnlCentroArriba.add(lblTitulo);
        pnlCentroArriba.add(txtTitulo);
        pnlCentroArriba.add(btnMostrar);

        JPanel pnlCentro = new JPanel(new BorderLayout());
        pnlCentro.add(pnlCentroArriba, BorderLayout.NORTH);

        JPanel pnlSur = new JPanel(new GridLayout(1, 2));
        pnlSur.add(new JLabel("Examen de mayo 2020"));
        JLabel lblBy = new JLabel("by Nombre del alumno");
        lblBy.setHorizontalAlignment(JLabel.RIGHT); //Alineación a la derecha
        
        pnlSur.add(lblBy);

        //---------------------------------------------------------------------------
        // ToDo: escribir aquí el código del EVENTO BOTÓN MOSTRAR mediante Clases Anónimas
        //---------------------------------------------------------------------------

        mapaAlumnos = IONotas.importTexto();

        btnMostrar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Alumno alumno = new Alumno(txtClave.getText(), txtTitulo.getText());
                	Collection<Asignatura> asignaturas = mapaAlumnos.get(alumno);
                	int numeroNotas = asignaturas.size();
                    JPanel pnlCentroAbajo = new JPanel(new GridLayout(numeroNotas, 1, 10, 10));
                    for(Asignatura asignatura:asignaturas)
                    {
                    	JLabel lblNota = new JLabel(asignatura.toString());
                    	lblNota.setForeground(new Color(112, 146, 190));
                    	pnlCentroAbajo.add(lblNota);
                    }
                    pnlCentro.add(pnlCentroAbajo, BorderLayout.CENTER);
                    JVentana.this.pack();
                }
            });

        //---------------------------------------------------------------------------
        // FIN del código del EVENTO BOTÓN MOSTRAR mediante Clases Anónimas
        //---------------------------------------------------------------------------

		//------------------------------------------------------------------------
        // ToDo: escribir aquí el código del EVENTO CERRAR VENTANA mediante Clases Anónimas
        //------------------------------------------------------------------------
        this.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)   
                {
                    IONotas.writeObjects(mapaAlumnos);
                    JVentana.this.dispose();
                    System.exit(0);
                }
            });

		//----------------------------------------------------
        // FIN del código del EVENTO CERRAR VENTANA
        //----------------------------------------------------


        this.setLayout(new BorderLayout(10, 10));
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}

}