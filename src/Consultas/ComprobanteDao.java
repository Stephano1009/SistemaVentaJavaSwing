package Consultas;

import Clases.Comprobante;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ComprobanteDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarComprobante() {
        List<Comprobante> datosComprobante = new ArrayList<>();
        String sql = "select * from comprobante";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comprobante com = new Comprobante();
                com.setIdComprobante(rs.getInt("idComprobante"));
                com.setTipoComprobante(rs.getString("tipoComprobante"));
                datosComprobante.add(com);
            }
        } catch (Exception e) {
        }
        return datosComprobante;
    }
}
