package practicaExtra.ui;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import practicaExtra.dominio.Dibujo;

import practicaExtra.util.RGBConversionException;
import practicaExtra.util.Util;

import practicaExtra.io.IODibujo;


/** 
	Facilita la representaci�n gr�fica de objetos creados por el alumno mediante una ventana gr�fica y un lienzo 
*/
public class JVentanaDibujo extends JFrame implements Runnable
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private JToggleButton btnCirculo;
	private JToggleButton btnCuadrado;

	private JTextField txtR;
	private JTextField txtG;
	private JTextField txtB;

	private int fps = 60;

	private boolean fin = false;

	//Es una forma moderna y elegante de realizar algo como...
	enum TipoFiguras{
		CIRCULO,
		CUADRADO
	}

	//...lo siguiente:
	//public final static int FIGURA_CUADRADO = 1;
	//public final static int FIGURA_CIRCULO = 2;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint ICAI");

		this.dibujo = IODibujo.leer();
		if(this.dibujo==null)
			this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());


		JPanel pnlNorte = new JPanel(new FlowLayout());
		txtR = new JTextField(3);
		txtG = new JTextField(3);
		txtB = new JTextField(3);

		JButton btnImport = new JButton("Importar");
		JButton btnExport = new JButton("Exportar");

		this.asignarColoresRandom();

		pnlNorte.add(btnImport);
		pnlNorte.add(btnExport);

		pnlNorte.add(new JLabel("Rojo:"));
		pnlNorte.add(txtR);
		pnlNorte.add(new JLabel("Verde:"));
		pnlNorte.add(txtG);
		pnlNorte.add(new JLabel("Azul:"));
		pnlNorte.add(txtB);

		ButtonGroup btnGrpFiguras = new ButtonGroup();
		btnCirculo = new JToggleButton("Circulo");
		btnCirculo.setSelected(true);
		btnCuadrado = new JToggleButton("Cuadrado");
		btnGrpFiguras.add(btnCirculo);
		btnGrpFiguras.add(btnCuadrado);

		JButton btnJugar = new JButton("Play");

		pnlNorte.add(btnCirculo);
		pnlNorte.add(btnCuadrado);
		pnlNorte.add(btnJugar);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);

		pnlCentro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint");
		JLabel lblMensaje2 = new JLabel("Programaci�n Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);

		//Se incorpora el concepto de Lambdas como ejemplo. Solo v�lidos cuando existe un m�todo.
		btnImport.addActionListener(e -> 
			{
				dibujo = IODibujo.importar();
				lienzo.updateDibujo();
			});

		btnExport.addActionListener(e -> 
			{
				IODibujo.exportar(dibujo);
			});

		btnJugar.addActionListener(e ->
		{
			if(btnJugar.getText().equals("Play")) {
				fin = false;
				Thread hiloJuego = new Thread(JVentanaDibujo.this);
				hiloJuego.start();
				btnJugar.setText("Stop");
			}
			else
			{
				fin = true;
				btnJugar.setText("Play");
			}
		});

		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				IODibujo.guardar(dibujo);
				fin = true;
				System.exit(0);
			}
		});		
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}

	public TipoFiguras getTipoFiguraAPintar()
	{
		if(btnCuadrado.isSelected())
			return TipoFiguras.CUADRADO;
		else 
			return TipoFiguras.CIRCULO;
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

	public void asignarColoresRandom()
	{
		txtR.setText(String.valueOf(Util.getColorRGBRandom()));
		txtG.setText(String.valueOf(Util.getColorRGBRandom()));
		txtB.setText(String.valueOf(Util.getColorRGBRandom()));
	}	

	public Color validarColores() throws NumberFormatException, RGBConversionException
	{
		int r = Integer.parseInt(txtR.getText());
		int g = Integer.parseInt(txtG.getText());
		int b = Integer.parseInt(txtB.getText());
		return Util.rgbToColor(r, g, b);							
	}

	private int calcularDelay()
	{
		return (int) (1/(fps*1.)*1000);
	}

	public void run()
	{
		while(!fin)
		{
			try
			{
				Thread.sleep(this.calcularDelay());
				dibujo.getTodasFiguras().forEach(figura ->
				{
					figura.mover();
					dibujo.checkImpacto(figura);
				});
				lienzo.repaint();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}