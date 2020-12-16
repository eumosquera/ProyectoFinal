package BL;
import java.sql.DriverManager;
import java.sql.Connection;

public class clsConexion {
    Connection conn = null;
    String stServidor, stUsuario, stPassword, stBD = "";
    
    public clsConexion(){
        try{
       stServidor = "localhost";
       stUsuario = "User";
       stPassword = "0147";
       stBD = "dbCRM";
       
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String stConexion = "jdbc:sqlserver://" +stServidor + "1433:databaseName=" +stBD;
       
       conn =DriverManager.getConnection(stConexion, stUsuario,stPassword);
        }catch(Exception ex){
            
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    public void closeConexion(){
        try{
        conn.close();
        }catch(Exception ex){
            
        }
    }
}
