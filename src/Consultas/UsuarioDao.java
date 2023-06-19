package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Clases.Conexion;
import Clases.Usuario;


public class UsuarioDao {

    

    /*Paso 1: Creamos los métodos para las operaciones de crud y al mismo 
              tiempo conectando a la base de datos*/

 /*Paso 2: Instanciamos la clase Conexion*/
    Conexion conectar = new Conexion();
    /*Paso 3: Creamos una variable de tipo Connection */
    Connection con;
    /*Paso 4: Creamos una variable de tipo PreparedStatement para ejecutar consultas*/
    PreparedStatement ps;
    /*Paso 5: Creamos una variable para recuperar y manipular datos de la consulta*/
    ResultSet rs;

    /*Paso 6*: Creamos el metodo de public de tipo List para listar*/
    public List listarUsuario() {
        /*Paso 7: Declaramos una variable de tipo tipo del objeto usuario*/
        List<Usuario> datosUsuario = new ArrayList<>();
        String sql = "select * from usuario";
        /*Paso 8: Colocamos un try catch para hacer referencia a la conexion*/
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                /*Paso 9: Instanciamos el objeto usuario*/
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setClaveUsuario(rs.getString("claveUsuario"));
                u.setEstadoUsuario(rs.getBoolean("estadoUsuario"));
                u.setIdCargo(rs.getInt("idCargo"));
                /*Paso 10: Agregamos a la variable datosUsuario*/
                datosUsuario.add(u);
            }
        } catch (Exception e) {
        }
        return datosUsuario;
    }

    /*Método para agregar o guardar usuarios*/
    public int agregarUsu(Usuario u) {
        String sql = "INSERT INTO usuario (nombreUsuario, claveUsuario, idCargo, estadoUsuario) VALUES (?, ?, ?, ?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getNombreUsuario());
            ps.setString(2, u.getClaveUsuario());
            ps.setInt(3, u.getIdCargo());
            ps.setBoolean(4, u.isEstadoUsuario());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Retorna 0 en caso de error
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
        /*inicializamos y declaramos la variable como null. será utilizada 
                                     para almacenar el nombre del cargo encontrada en la base de datos*/
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
        /*inicializamos y declaramos la variable como null. será utilizada 
        para almacenar el nombre del cargo encontrada en la base de datos*/
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
