package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Clases.Conexion;
import Clases.Usuario;

public class UsuarioDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarUsuario() {
        List<Usuario> datosUsuario = new ArrayList<>();
        String sql = "select * from usuario";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setClaveUsuario(rs.getString("claveUsuario"));
                u.setEstadoUsuario(rs.getBoolean("estadoUsuario"));
                u.setIdCargo(rs.getInt("idCargo"));
                datosUsuario.add(u);
            }
        } catch (Exception e) {
        }
        return datosUsuario;
    }

    
    public int agregarUsu(Usuario u) {
        String sql = "INSERT INTO usuario (nombreUsuario, claveUsuario, idCargo, estadoUsuario) VALUES (?, ?, ?, ?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getNombreUsuario());
            ps.setString(2, u.getClaveUsuario());
            ps.setInt(3, u.getIdCargo());
            ps.setBoolean(4, u.isEstadoUsuario());
            ps.executeUpdate();
            return 1; 
        } catch (Exception e) {
            e.printStackTrace();
            return 0; 
        }
    }

    public Usuario leerUsuario(int idUsuario) {
        Usuario usu = null;
        String sql = "select idUsuario,nombreUsuario, claveUsuario, estadoUsuario, idCargo from usuario where idUsuario = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto usuario */
                usu = new Usuario();
                usu.setIdUsuario(rs.getInt("idUsuario"));
                usu.setNombreUsuario(rs.getString("nombreUsuario"));
                usu.setClaveUsuario(rs.getString("claveUsuario"));
                usu.setEstadoUsuario(rs.getBoolean("estadoUsuario"));
                usu.setIdCargo(rs.getInt("idCargo"));

                // Obtener nombre del cargo
                String nombreCargo = obtenerNombreCargoPorId(usu.getIdCargo());
                usu.setNombreCargo(nombreCargo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return usu;
    }

    public int actualizarUsuario(Usuario u) {
        int r = 0;
        String sql = "update usuario set nombreUsuario = ?, claveUsuario = ?, idCargo = ?, estadoUsuario = ? where idUsuario = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNombreUsuario());
            ps.setString(2, u.getClaveUsuario());
            ps.setInt(3, u.getIdCargo());
            ps.setBoolean(4, u.isEstadoUsuario());
            ps.setInt(5, u.getIdUsuario());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    public void deteleUsu(int idusu) {
        String sql = "delete from usuario where idUsuario = " + idusu;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String obtenerNombreCargoPorId(int idCargo) {
        String nombreCargo = null;
        String sql = "SELECT nombreCargo FROM cargo WHERE idCargo = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCargo);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreCargo = rs.getString("nombreCargo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombreCargo;
    }
    
    public int obtenerIdCargoPorNombreCargo(String nombreCargo) {
        int idCargo = 0;
        String sql = "SELECT idCargo FROM cargo WHERE nombreCargo = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCargo);
            rs = ps.executeQuery();
            if (rs.next()) {
                idCargo = rs.getInt("idCargo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return idCargo;
    }
    
    public String obtenerNombreUsuarioPorId(int idUsuario) {
        String nombreUsuario = null;
        String sql = "SELECT nombreUsuario FROM usuario WHERE idUsuario = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreUsuario = rs.getString("nombreUsuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombreUsuario;
    }
}
