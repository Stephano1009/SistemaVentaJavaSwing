package Consultas;

import Clases.Conexion;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao {
   
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarEmpleado() {
        List<Empleado> datosEmpleado = new ArrayList<>();
        String sql = "select * from empleado";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setNombreEmpleado(rs.getString("nombreEmpleado"));
                emp.setApellidoEmpleado(rs.getString("apellidoEmpleado"));
                emp.setDniEmpleado(rs.getInt("dniEmpleado"));
                emp.setCelularEmpleado(rs.getString("celularEmpleado"));
                emp.setEstadoEmpleado(rs.getBoolean("estadoEmpleado"));
                emp.setCorreoEmpleado(rs.getString("correoEmpleado"));
                emp.setIdUsuario(rs.getInt("idUsuario"));
                datosEmpleado.add(emp);
            }
        } catch (Exception e) {
        }
        return datosEmpleado;
    }
}
