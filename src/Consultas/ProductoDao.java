package Consultas;

import Clases.Conexion;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listarProducto() {
        List<Producto> datosProducto = new ArrayList<>();
        String sql = "select * from producto";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setDescripcionProducto(rs.getString("descripcionProducto"));
                p.setContenidoProducto(rs.getString("contenidoProducto"));
                p.setPrecioProducto(rs.getDouble("precioProducto"));
                p.setEstadoProducto(rs.getBoolean("estadoProducto"));
                p.setStockProducto(rs.getInt("stockProducto"));
                p.setIdCategoria(rs.getInt("idCategoria"));
                p.setIdProveedor(rs.getInt("idProveedor"));
                datosProducto.add(p);
            }
        } catch (Exception e) {
        }
        return datosProducto;
    }

    /*Método para agregar o guardar productos*/
    public int agregarPro(Producto p) {
        String sql = "INSERT INTO producto (nombreProducto,descripcionProducto, contenidoProducto,precioProducto, estadoProducto,"
                + "stockProducto,idCategoria,idProveedor) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNombreProducto());
            ps.setString(2, p.getDescripcionProducto());
            ps.setString(3, p.getContenidoProducto());
            ps.setDouble(4, p.getPrecioProducto());
            ps.setBoolean(5, p.isEstadoProducto());
            ps.setInt(6, p.getStockProducto());
            ps.setInt(7, p.getIdCategoria());
            ps.setInt(8, p.getIdProveedor());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Retorna 0 en caso de error
        }
    }

    public Producto leerProducto(int idProducto) {
        Producto pro = null;
        String sql = "select nombreProducto, descripcionProducto, contenidoProducto, precioProducto, estadoProducto,"
                + "stockProducto,idCategoria, idProveedor from producto where idProducto = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto usuario */
                pro = new Producto();
                pro.setIdProducto(idProducto);
                pro.setNombreProducto(rs.getString("nombreProducto"));
                pro.setDescripcionProducto(rs.getString("descripcionProducto"));
                pro.setContenidoProducto(rs.getString("contenidoProducto"));
                pro.setPrecioProducto(rs.getDouble("precioProducto"));
                pro.setEstadoProducto(rs.getBoolean("estadoProducto"));
                pro.setStockProducto(rs.getInt("stockProducto"));
                pro.setIdCategoria(rs.getInt("idCategoria"));
                pro.setIdProveedor(rs.getInt("idProveedor"));

                // Obtener nombre de la categoria
                String nombreCategoria = obtenerNombreCategoriaPorId(pro.getIdCategoria());
                pro.setNombreCategoria(nombreCategoria);
                // Obtener nombre del proveedor
                String nombreProveedor = obtenerNombreProveedorPorId(pro.getIdProveedor());
                pro.setNombreCategoria(nombreProveedor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pro;
    }
    
    public int actualizarProducto(Producto p) {
        int r = 0;
        String sql = "update producto set nombreProducto = ?, descripcionProducto = ?, contenidoProducto = ?,"
            + "precioProducto = ?, estadoProducto = ?, stockProducto = ?, idCategoria = ?, idProveedor = ? where idProducto = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombreProducto());
            ps.setString(2, p.getDescripcionProducto());
            ps.setString(3, p.getContenidoProducto());
            ps.setDouble(4, p.getPrecioProducto());
            ps.setBoolean(5, p.isEstadoProducto());
            ps.setInt(6, p.getStockProducto());
            ps.setInt(7, p.getIdCategoria());
            ps.setInt(8, p.getIdProveedor());
            ps.setInt(9, p.getIdProducto());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage()) ;
        }
        return r;
    }
    
    public void detelePro(int idPro) {
        String sql = "delete from producto where idproducto = " + idPro;
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
    
    public String obtenerNombreProveedorPorId(int idProveedor) {
        String nombreProveedor = null;
        String sql = "SELECT nombreProveedor FROM proveedor WHERE idProveedor = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreProveedor = rs.getString("nombreProveedor");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombreProveedor;
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
