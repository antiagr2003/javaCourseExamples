package practica08.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import practica08.dominio.Figura;
import practica08.dominio.Circulo;
import practica08.dominio.Cuadrado;
import practica08.dominio.Dibujo;

import practica08.util.Util;

public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtLadoRadio;

	private Circulo circulo;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		
		txtX = new JTextField("", 4);
		txtY = new JTextField("", 4);
		txtLadoRadio = new JTextField("", 4);

		pnlNorte.add(new JLabel("x:"));
		pnlNorte.add(txtX);
		pnlNorte.add(new JLabel("y:"));
		pnlNorte.add(txtY);
		pnlNorte.add(new JLabel("lado/radio:"));
		pnlNorte.add(txtLadoRadio);		
		pnlNorte.add(new JButton("Círculo"));
		pnlNorte.add(new JButton("Cuadrado"));

		this.addWindowListener(new WindowAdapter()
		{

		});

		txtX.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER && !txtX.getText().equals(""))
				{
					txtY.requestFocus();
				}
			}
		});


		txtY.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER && !txtY.getText().equals("")) 
				{
					txtLadoRadio.requestFocus();
				}
			}
		});

		txtLadoRadio.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					System.out.println(txtX.getText() + ", " + txtY.getText());
					txtX.setText("");
					txtY.setText("");
					txtLadoRadio.setText("");

					txtX.requestFocus();
				}
			}
		});

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
			
		circulo = new Circulo(40, 40, true, Color.BLUE, 50);
		dibujo.pintar("A", circulo);

		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");

		lblMensaje1.setHorizontalAlignment(JLabel.CENTER);
		lblMensaje1.setFont(new Font("Arial", Font.BOLD, 20));
		lblMensaje1.setForeground(new Color(255, 0, 0));
		lblMensaje1.setForeground(Color.RED);

		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);

		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

	public Circulo getCirculo() 
	{
        return circulo;
    }
}