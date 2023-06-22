package Consultas;

import Clases.Conexion;
import Clases.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PagoDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarPago() {
        List<Pago> datosPago = new ArrayList<>();
        String sql = "select * from metodopago";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pago pa = new Pago();
                pa.setIdMetodoPago(rs.getInt("idMetodoPago"));
                pa.setNombrePago(rs.getString("nombrePago"));
                pa.setEstadoPago(rs.getBoolean("estadoPago"));
                datosPago.add(pa);
            }
        } catch (Exception e) {
        }
        return datosPago;
    }
}
