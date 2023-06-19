package Consultas;

import Clases.Categoria;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {
    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List listarCategoria() {
        List<Categoria> datosCategoria = new ArrayList<>();
        String sql = "select * from categoria";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombreCategoria(rs.getString("nombreCategoria"));
                cat.setEstadoCategoria(rs.getBoolean("estadoCategoria"));
                datosCategoria.add(cat);
            }
        } catch (Exception e) {
        }
        return datosCategoria;
    }
    
    public String obtenerNombreCategoriaPorId(int idCategoria) {
        String nombreCategoria = null;
        String sql = "SELECT nombreCategoria FROM categoria WHERE idCategoria = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreCategoria = rs.getString("nombreCategoria");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombreCategoria;
    }
    
    public int obtenerIdCategoriaPorNombreCategoria(String nombreCategoria) {
        int idCategoria = 0;
        String sql = "SELECT idCategoria FROM categoria WHERE nombreCategoria = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                idCategoria = rs.getInt("idCategoria");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return idCategoria;
    }
}
