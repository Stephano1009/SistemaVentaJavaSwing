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
                prov.setRucProveedor(rs.getString("rucProveedor"));
                prov.setNombreProveedor(rs.getString("nombreProveedor"));     
                prov.setCelularProveedor(rs.getString("celularProveedor"));
                prov.setEstadoProveedor(rs.getBoolean("estadoProveedor"));
                datosProveedor.add(prov);
            }
        } catch (Exception e) {
        }
        return datosProveedor;
    }
    
    /*Método para agregar o guardar proveedor*/
    public int agregarProve(Proveedor prove) {
        String sql = "INSERT INTO proveedor (rucProveedor, nombreProveedor, celularProveedor, estadoProveedor) VALUES (?, ?, ?, ?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, prove.getRucProveedor());
            ps.setString(2, prove.getNombreProveedor());
            ps.setString(3, prove.getCelularProveedor());
            ps.setBoolean(4, prove.isEstadoProveedor());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Retorna 0 en caso de error
        }
    }
    
    public Proveedor leerProveedor(int idProveedor) {
        Proveedor prove = null;
        String sql = "select idProveedor,rucProveedor, nombreProveedor, celularProveedor, "
                + "estadoProveedor from proveedor where idProveedor = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto cargo */
                prove = new Proveedor();
                prove.setIdProveedor(rs.getInt("idProveedor"));
                prove.setRucProveedor(rs.getString("rucProveedor"));
                prove.setNombreProveedor(rs.getString("nombreProveedor"));
                prove.setCelularProveedor(rs.getString("celularProveedor"));
                prove.setEstadoProveedor(rs.getBoolean("estadoProveedor"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return prove;
    }
    
    public int actualizarProveedor(Proveedor prov) {
        int r = 0;
        String sql = "update proveedor set rucProveedor =?, nombreProveedor = ?, celularProveedor =?, estadoProveedor = ? "
                + "where idProveedor = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getRucProveedor());
            ps.setString(2, prov.getNombreProveedor());
            ps.setString(3, prov.getCelularProveedor());
            ps.setBoolean(4, prov.isEstadoProveedor());
            ps.setInt(5, prov.getIdProveedor());
            r= ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage()) ;
        }
        return r;
    }
    
    public void deteleProve(int idprov) {
        String sql = "delete from proveedor where idProveedor = " + idprov;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
