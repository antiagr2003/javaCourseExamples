import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class JCalculadora extends JFrame
{
	private JButton btnIgual;
	private JButton btnC;

	private JTextField txtResultado;

	public static void main(String[] args) 
	{
		new JCalculadora("JCalculadora v1.0");
	}

	public JCalculadora(String titulo)
	{
		super(titulo);

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		JPanel pnlCentro = new JPanel(new GridLayout(4,3));
		JPanel pnlDerecha = new JPanel(new GridLayout(4,1));
		JPanel pnlSur = new JPanel(new FlowLayout());

		txtResultado = new JTextField("0", 30);
		txtResultado.addKeyListener( new KeyAdapter()
			{
				@Override
				public void keyPressed(KeyEvent e)
				{
					//CHAR: 'A'->65
					//getKeyCode();--> 65

					Object o = e.getSource();
					if(o==txtResultado)
					{
						if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
							txtResultado.setText("0");
						else if(e.getKeyCode()==KeyEvent.VK_ENTER)
							JCalculadora.this.calcularOperacion();
					}
				}
			});
		pnlNorte.add(txtResultado);

		JLabel lblMensaje1 = new JLabel("JCalculadora");
		/*Font fuente01 = new Font("Verdana", Font.BOLD, 14);
		lblMensaje1.setFont(fuente01);*/

		lblMensaje1.setFont(new Font("Verdana", Font.BOLD, 16));
		Color colorRosaOscuro = new Color(201, 54, 189);
		lblMensaje1.setForeground(colorRosaOscuro);


		JLabel lblMensaje2 = new JLabel("   - 2º GITT - POO -    ");
		JLabel lblMensaje3 = new JLabel("ICAI");
		lblMensaje3.setForeground(colorRosaOscuro);
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		for(int i=1;i<10;i++)
			this.crearBoton(String.valueOf(i), pnlCentro);

		btnC = new JButton("C");
		//componenteQueRecibeElEvento.addTIPO_EVENTO(objetoGestorEvento)
		btnC.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JCalculadora.this.limpiarOperacion();
				}
			});
		pnlCentro.add(btnC);

		this.crearBoton("0", pnlCentro);

		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JCalculadora.this.calcularOperacion();
				}
			});
		pnlCentro.add(btnIgual);

		this.crearBoton("+", pnlDerecha);
		this.crearBoton("-", pnlDerecha);
		this.crearBoton("*", pnlDerecha);
		this.crearBoton("/", pnlDerecha);
		
		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);
		this.add(pnlDerecha, BorderLayout.EAST);
		
		this.addWindowListener( new WindowAdapter ()
			{
				@Override
				public void	windowClosing(WindowEvent e)
				{
					System.out.println("¿Desea Salir?");
				}
			});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}

	private void crearBoton(String label, JPanel panel)
	{
		JButton btnNumeroAux = new JButton(label);
		btnNumeroAux.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String label = e.getActionCommand();
				if(txtResultado.getText().equals("0"))
					txtResultado.setText("");
				txtResultado.setText(txtResultado.getText() + label);
			}
		});
		panel.add(btnNumeroAux);
	}

	private void limpiarOperacion()
	{
		txtResultado.setText("0");	
	}

	private void calcularOperacion()
	{
		//Recurro a un truco para evaluar la operación matemática gracias a la implementación de Javascript que posee Java desde la 1.6
		try
		{
			ScriptEngineManager scriptManager = new ScriptEngineManager();
		    ScriptEngine engineJavaScript = scriptManager.getEngineByName("JavaScript");
	    	txtResultado.setText(engineJavaScript.eval(txtResultado.getText()).toString());
	    }
	    catch(ScriptException error)
	    {
	    	txtResultado.setText(error.getMessage());
	    }

	}


}