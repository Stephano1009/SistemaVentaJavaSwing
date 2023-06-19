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
    
}
