import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ListCellRenderer;

public class ComboColorRender extends DefaultListCellRenderer 
{
    private ListCellRenderer render;

    public ComboColorRender(ListCellRenderer render) 
    {
        this.render = render;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) 
    {
        Component c = render.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        JLabel lbl = (JLabel) c;
        float nota = Float.parseFloat(lbl.getText());
        if (nota >=5) 
            lbl.setBackground(Color.GREEN);
        else if (nota >=4 && nota <= 5) 
            lbl.setBackground(Color.ORANGE);
        else if (nota < 4) 
            lbl.setBackground(Color.RED);

        return c;
    }
}