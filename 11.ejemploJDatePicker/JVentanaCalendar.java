import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.SqlDateModel;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class JVentanaCalendar extends JFrame 
{
	
	private JDatePickerImpl datePicker;

	public static void main(String[] args) 
	{
		new JVentanaCalendar().setVisible(true);
	}

	public JVentanaCalendar() 
	{
		super("Ejemplo de Calendario");
		this.setLayout(new FlowLayout());
	
		UtilDateModel model = new UtilDateModel();
		model.setDate(2021, 4, 26);
		model.setSelected(true);
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		
		datePicker = new JDatePickerImpl(datePanel);
		//Si se quiere trabajar con un modelo de datos:
		//datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		this.add(datePicker);
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event) 
				{
					Date selectedDate = (Date) datePicker.getModel().getValue();
					JOptionPane.showMessageDialog(JVentanaCalendar.this, "Fecha: " + selectedDate);
				}				
			});
		
		this.add(btnVer);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}