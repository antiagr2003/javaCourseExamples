import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class JVentanaFile 
{
    public static void main(String args[]) 
    {
    	File miHome = FileSystemView.getFileSystemView().getHomeDirectory();
        JFileChooser jfc = new JFileChooser("."); //Se podría poner miHome
        int resultado = jfc.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) 
        {
            File fichero = jfc.getSelectedFile();
            System.out.println(fichero.getAbsolutePath());
        }
    }
}