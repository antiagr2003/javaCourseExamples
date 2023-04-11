import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class VentanaMenu extends JFrame
{
    public static void main(String args[])
    {
        new VentanaMenu();
    }

    public VentanaMenu() 
    {

        this.crearMenu();
        this.init();
    }

    private void crearMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menArchivo = new JMenu("Archivo");
        JMenu menAyuda = new JMenu("Ayuda");
        menuBar.add(menArchivo);
        menuBar.add(menAyuda);

        JMenuItem menNuevo = new JMenuItem("Nuevo");
        JMenuItem menAbrir = new JMenuItem("Abrir");
        menArchivo.add(menNuevo);
        menArchivo.add(menAbrir);

        JMenuItem menAcercaDe = new JMenuItem("Acerca de...");
        menAyuda.add(menAcercaDe);

        menNuevo.addActionListener(e -> JOptionPane.showMessageDialog(VentanaMenu.this, "Nuevo"));
        menAbrir.addActionListener(e -> JOptionPane.showMessageDialog(VentanaMenu.this, "Abrir"));
        menAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(VentanaMenu.this, "Acerca de"));
    }

    private void init()
    {
        this.setLayout(null); 
        this.setTitle("Ventana con menú"); 
        this.setSize(300, 200); 
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
    }
}