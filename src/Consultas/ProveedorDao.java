package Consultas;

import Clases.Conexion;
import Clases.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarProveedor() {
        List<Proveedor> datosProveedor = new ArrayList<>();
        String sql = "select * from proveedor";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRucProveedor(rs.getInt("rucProveedor"));
                prov.setNombreProveedor(rs.getString("nombreProveedor"));     
                prov.setCelularProveedor(rs.getString("celularProveedor"));
                prov.setEstadoProveedor(rs.getBoolean("estadoProveedor"));
                datosProveedor.add(prov);
            }
        } catch (Exception e) {
        }
        return datosProveedor;
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
    
    public int obtenerIdProveedorPorNombreProveedor(String nombreProveedor) {
        int idProveedor = 0;
        String sql = "SELECT idProveedor FROM proveedor WHERE nombreProveedor = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProveedor);
            rs = ps.executeQuery();
            if (rs.next()) {
                idProveedor = rs.getInt("idProveedor");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return idProveedor;
    }
}
