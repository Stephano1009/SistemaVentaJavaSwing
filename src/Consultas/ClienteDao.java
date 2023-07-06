package Consultas;

import Clases.Cliente;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarCliente() {
        List<Cliente> datosCliente = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getInt("idCliente"));
                cli.setNombreCliente(rs.getString("nombreCliente"));
                cli.setApellidoCliente(rs.getString("apellidoCliente"));
                cli.setIdentificacionCliente(rs.getString("identificacionCliente"));
                datosCliente.add(cli);
            }
        } catch (Exception e) {
        }
        return datosCliente;
    }
    
    public int agregarCli(Cliente cli) {
        String sql = "INSERT INTO cliente (nombreCliente, apellidoCliente, identificacionCliente) VALUES (?, ?, ?)";
        try (Connection con = conectar.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cli.getNombreCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setString(3, cli.getIdentificacionCliente());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.getMessage();
            return 0; // Retorna 0 en caso de error
        }
    }
    
    public Cliente leerCliente(int idCliente) {
        Cliente cli = null;
        String sql = "select idCliente, nombreCliente, apellidoCliente, identificacionCliente "
            + "from cliente where idCliente = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            if (rs.next()) {
                cli = new Cliente();
                cli.setIdCliente(rs.getInt("idCliente"));
                cli.setNombreCliente(rs.getString("nombreCliente"));
                cli.setApellidoCliente(rs.getString("apellidoCliente"));
                cli.setIdentificacionCliente(rs.getString("identificacionCliente"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return cli;
    }
    
    public int actualizarCliente(Cliente cli) {
        int r = 0;
        String sql = "update cliente set nombreCliente =?, apellidoCliente = ?, identificacionCliente =? "
                + "where idCliente = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombreCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setString(3, cli.getIdentificacionCliente());
            ps.setInt(4, cli.getIdCliente());
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
    
    public void detelecli(int idcli) {
        String sql = "delete from cliente where idCliente = " + idcli;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
