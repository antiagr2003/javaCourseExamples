import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JVentanaCombo extends JFrame
{
    public static void main(String args[]) throws Exception 
    {
        new JVentanaCombo();
    }

    public JVentanaCombo() 
    {
        JComboBox cmbNotas = new JComboBox();
        cmbNotas.addItem("4");
        cmbNotas.addItem("7");
        cmbNotas.addItem("1");

        cmbNotas.setRenderer(new ComboColorRender(cmbNotas.getRenderer()));
        cmbNotas.setEditable(false);

        this.add(cmbNotas, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}