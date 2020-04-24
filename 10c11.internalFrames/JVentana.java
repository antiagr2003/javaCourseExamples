import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JVentana extends JFrame
{
	int pos=0;
	JDesktopPane desktop;
	JToolBar toolBar = new JToolBar();
	JButton btnSalir = new JButton("Salir");
	JButton btnNuevo = new JButton("Nueva Internal");
	JButton btnOcultar = new JButton("Eliminar Internal");

	public static void main(String s[])
	{
		new JVentana("Internal Frames & Toolbar");
	}
	
	public JVentana(String titulo)
	{
		this.setTitle(titulo);
		this.setLayout(new BorderLayout());
		JPanel pnlContainer = new JPanel(new BorderLayout());
		//pnlContainer.setPreferredSize(new Dimension(400, 300));
		

		btnOcultar.setEnabled(false);
		
		//-------- Crear un Toolbar -----
		toolBar.add(btnSalir);
		toolBar.add(btnNuevo);
		toolBar.add(btnOcultar);
		//-------- Fin Crear un Toolbar -----
		
		btnNuevo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//-------- Crear un Internal Frame -----
					JInternalFrame ifr1=new JInternalFrame("Internal " + pos/20);
					JPanel pnlInternal = new JPanel(new FlowLayout());
					pnlInternal.add(new JButton("x"));
					pnlInternal.add(new JButton("y"));
					pnlInternal.add(new JButton("z"));
					ifr1.add(new JScrollPane(pnlInternal));
					ifr1.setSize(100,100);
					ifr1.setVisible(true);
					ifr1.setLocation(new Point(pos,pos));
					pos+=20;
					desktop.add(ifr1);
					ifr1.moveToFront();
					if(pos==200)
						btnNuevo.setEnabled(false);
					btnOcultar.setEnabled(true);
					
					//-------- FIN Crear un Internal Frame -----
				}
			});
			
		
		btnOcultar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//-------- Crear un Internal Frame -----
					JInternalFrame lista[]=desktop.getAllFrames();
					if(lista.length>0)
					{
						pos-=20;
						lista[0].setVisible(false);
						desktop.remove(0);
						if(lista.length==1)
							btnOcultar.setEnabled(false);
					}
					
					//-------- FIN Crear un Internal Frame -----
				}
			});

		btnSalir.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					dispose();
					System.exit(0);
				}
			});

		desktop = new JDesktopPane(); 
		desktop.setPreferredSize(new Dimension(400, 300));
		
		pnlContainer.add(desktop, BorderLayout.CENTER);

		this.add(toolBar, BorderLayout.NORTH); 
 		this.add(new JScrollPane(pnlContainer), BorderLayout.CENTER); 
 		this.setSize(400,300);
 		
 		this.setVisible(true);
	}

}