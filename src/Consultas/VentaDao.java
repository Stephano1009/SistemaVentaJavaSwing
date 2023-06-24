package Consultas;

import Clases.Conexion;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int obtenerCorrelativo() throws Exception {
        int correlativo = 0;
        //ResultSet rs = null;
        String sql = "SELECT v.numeroCorrelativo FROM VENTA V ORDER BY "
                + "V.idVenta DESC LIMIT 1";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next() == true) {
                correlativo = rs.getInt("numeroCorrelativo");
            }
        } catch (Exception e) {
            throw e;
        }
        return correlativo;
    }

    public Producto obtenerProducto(String nombreProducto) throws Exception {
        Producto prod = null;
        String sql = "SELECT idProducto, nombreProducto, precioProducto, "
                + "stockProducto FROM producto WHERE nombreProducto = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProducto);
            rs = ps.executeQuery();
            if(rs.next()){
                prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setPrecioProducto(rs.getDouble("precioProducto"));
                prod.setStockProducto(rs.getInt("stockProducto"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return prod;
    }
}
