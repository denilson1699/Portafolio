// proyecto hotel
package persistencia;
import java.sql.*;
public class Conexion {
    
    public Connection getConexion(){
        Connection cn;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_portafolio_personal","root","");
        } catch (Exception e) {
            cn=null;
        }
        return cn;
    }
/*
        try {
            String url="jdbc:mysql://www.infordeveloper.com:3306/denilson_bd_tres_estrellas";
            String usuario="denilson_wrdp2";	
            String pass="123456";
            Connection cn= DriverManager.getConnection (url,usuario,pass);
            return cn;
            
        } catch (Exception e) {
            System.err.println("error en conexion con la base de datos principal: "+e);
        }
        return null;  
    }
*/
}
