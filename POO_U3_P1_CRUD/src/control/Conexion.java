package control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JordyUSER
 */
public class Conexion {
    
    private static final String drive = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String url = "jdbc:mysql://localhost:3306/estudiante";
    
    Connection connectar = null;
    
    public Connection coneccion(){
        try{
            Class.forName(drive);
            connectar = (Connection)DriveManager.getConeccion(url, user, pass);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion"+e.getMessage());
        }
        return connectar;
    }
            
}
