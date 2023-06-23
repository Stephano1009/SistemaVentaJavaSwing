package Consultas;

import Clases.Conexion;
import Clases.DetalleVenta;
import Clases.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VentaDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
   
    
      public int obtenerCorrelativo(String tipo) throws Exception {
        int correlativo = 0;
        ResultSet rs = null;
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

}
