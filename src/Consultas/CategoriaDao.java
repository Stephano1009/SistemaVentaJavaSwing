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

    public int agregarCate(Categoria cate) {
        String sql = "INSERT INTO categoria (nombreCategoria, estadoCategoria) VALUES (?, ?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cate.getNombreCategoria());
            ps.setBoolean(2, cate.isEstadoCategoria());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Retorna 0 en caso de error
        }
    }

    public Categoria leerCategoria(int idCategoria) {
        Categoria cat = null;
        String sql = "select idCategoria, nombreCategoria, estadoCategoria "
                + "from categoria where idCategoria = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto categoria */
                cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombreCategoria(rs.getString("nombreCategoria"));
                cat.setEstadoCategoria(rs.getBoolean("estadoCategoria"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cat;
    }

    public int actualizarCategoria(Categoria cate) {
        int r = 0;
        String sql = "update categoria set nombreCategoria =?, estadoCategoria = ? "
                + "where idCategoria = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cate.getNombreCategoria());
            ps.setBoolean(2, cate.isEstadoCategoria());
            ps.setInt(3, cate.getIdCategoria());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return r;
    }

    public void deteleCate(int idCate) {
        String sql = "delete from categoria where idCategoria = " + idCate;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
