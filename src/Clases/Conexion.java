
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    /*conectar a nuestra base de datos*/
    Connection con;
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/sistemaescritorio";
        String user = "root";
        String pass = "";
        /*Paso 2: Hacemos referencia a nuestro JDBC en un try Catch*/
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con; //retorna la variable creada
    }
}
