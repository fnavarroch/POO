package zakaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion
{
    Connection conexion = null;
    
    public Connection hacerConexion() throws SQLException{
        if (conexion == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Importar / Instalar MySQL JDBC Driver");
                return null;
            }

            try {
                conexion = DriverManager.getConnection("jdbc:mysql://209.222.103.210/rurikkcl_zakaz","rurikkcl_user","rurikkUser");
                

            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());            
            }
               
            if (conexion==null)
            {
                try {   
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/rurikkcl_zakaz","root","");
                } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
                }
            } 
            
        }
        return conexion;
    }
    public void cerrarConexion() throws SQLException{
        if (conexion != null) {
         conexion.close();
      }
    }
    public ResultSet consulta(String query) throws SQLException{
        Statement s = (Statement) conexion.createStatement();
        ResultSet rs = s.executeQuery (query);
        return rs;
    
    }
    int updating(String query) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement(query);
        return consulta.executeUpdate();
    }
}
