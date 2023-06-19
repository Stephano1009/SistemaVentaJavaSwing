package Consultas;

import Clases.Conexion;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario login(String userName, String passName) {
        Usuario usu = null;
        String sql = "SELECT u.nombreUsuario, u.claveUsuario, c.nombreCargo, "
                + "e.nombreEmpleado, e.apellidoEmpleado FROM usuario u "
                + "INNER JOIN cargo c ON u.idCargo = c.idCargo "
                + "INNER JOIN empleado e ON e.idUsuario = u.idUsuario "
                + "WHERE u.nombreUsuario = ? AND u.claveUsuario = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, passName);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto cargo */
                usu = new Usuario();
                usu.setNombreUsuario(rs.getString("nombreUsuario"));
                usu.setClaveUsuario(rs.getString("claveUsuario"));
                usu.setNombreCargo(rs.getString("nombreCargo"));
                usu.setNombreEmpleado(rs.getString("nombreEmpleado") + " "
                        + rs.getString("apellidoEmpleado"));
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getLocalizedMessage());
        }
        return usu;
    }
}
