package Consultas;

import Clases.Conexion;
import Clases.ReporteVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReporteDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List reporteVenta(int idVenta) {
        List<ReporteVenta> reporteVentas = new ArrayList<>();
        String sql = "select v.idVenta, p.nombreProducto, dv.precioVenta, "
                + "dv.cantidad, dv.cantidad, dv.cantidad * dv.precioVenta as total "
                + "from detalleventa dv inner join venta v "
                + "on dv.idVenta = v.idVenta inner JOIN "
                + "producto p on p.idProducto = dv.idProducto "
                + "where v.idVenta = " + idVenta;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ReporteVenta rv = new ReporteVenta();
                rv.setNombreProducto(rs.getString("nombreProducto"));
                rv.setPrecioVenta(rs.getDouble("precioVenta"));
                rv.setCantidad(rs.getInt("cantidad"));
                rv.setTotal(rs.getDouble("total"));
                reporteVentas.add(rv);

            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return reporteVentas;
    }

   
}
