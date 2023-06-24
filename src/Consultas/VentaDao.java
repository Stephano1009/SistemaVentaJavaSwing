package Consultas;

import Clases.Conexion;
import Clases.DetalleVenta;
import Clases.Producto;
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

    /*
    Creamos el metodo para obtener el valor del último correlativo
    de una venta almacenada en la base de datos
     */
    public int obtenerCorrelativo() throws Exception {
        /*Declaramos una variable el valor correlativo de BD y la inicializamos en 0*/
        int correlativo = 0;
        /*
        - Definimos la consulta para obtener el numero correlativo de la tabla venta.
        - En la consulta seleccionamos el campo "numeroCorrelativo" de la tabla venta
          y ordenamos los resultados por campo "idVenta" de forma descentente.
        - Luego, utilizamos 'LIMIT 1' para obtener solo el primer resultado
         */
        String sql = "SELECT v.numeroCorrelativo FROM VENTA V ORDER BY "
                + "V.idVenta DESC LIMIT 1";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            /*Si existe algún resultado en el rs*/
            if (rs.next() == true) {
                /*Obtenemos el valor del campo 'numeroCorrelativo' y le 
                asignamos a la variable 'correlativo' como un entero*/
                correlativo = rs.getInt("numeroCorrelativo");
            }
        } catch (Exception e) {
            throw e;
        }
        return correlativo; //retornamos el valor del resultado del método.
    }

    public Producto obtenerProducto(String nombreProducto) throws Exception {
        /*Declaramos la variable prod de tipo Producto, esta variable 
          será utlizada para almacenar el objeto Producto obtenido en la BD*/
        Producto prod = null;
        String sql = "SELECT idProducto, nombreProducto, precioProducto, "
                + "stockProducto FROM producto WHERE nombreProducto = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProducto);
            rs = ps.executeQuery();
            if (rs.next()) {
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

    public List listarVenta() {
        List<Venta> ReporteVenta = new ArrayList<>();
        String sql = "select * from venta";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta v = new Venta();
                v.setIdVenta(rs.getInt("idVenta"));
                v.setSerie(rs.getString("serie"));
                v.setNumeroCorrelativo(rs.getString("numeroCorrelativo"));
                v.setTipoComprobante(rs.getString("tipoComprobante"));
                v.setIdMetodoPago(rs.getInt("idMetodoPago"));
                v.setIdEmpleado(rs.getInt("idEmpleado"));
                v.setIdCliente(rs.getInt("idCliente"));
                java.sql.Date sqlFechaVenta = rs.getDate("fechaVenta");
                LocalDate fechaVenta = sqlFechaVenta.toLocalDate();
                v.setFechaVenta(fechaVenta);
                v.setEstadoVenta(rs.getBoolean("estadoVenta"));
                ReporteVenta.add(v);
            }
        } catch (Exception e) {
        }
        return ReporteVenta;
    }
    
    public String obtenerNombreEmpleadoPorId(int idEmpleado) {
        String nombreEmpleado = null;
        String sql = "SELECT nombreEmpleado FROM Empleado WHERE idEmpleado = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreEmpleado = rs.getString("nombreEmpleado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombreEmpleado;
    }
    
    public String obtenerNombreClientePorId(int idCliente) {
        String nombreCliente = null;
        String sql = "SELECT nombreCliente FROM Cliente WHERE idCliente = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreCliente = rs.getString("nombreCliente");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombreCliente;
    }
    
    public String obtenerNombrePagoPorId(int idMetodoPago) {
        String nombrePago = null;
        String sql = "SELECT nombrePago FROM metodopago WHERE idMetodoPago = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMetodoPago);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombrePago = rs.getString("nombrePago");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return nombrePago;
    }
    
    public void registrar(Venta venta) throws Exception{
        int codigoVenta;
        String sql = "insert into venta(serie,numeroCorrelativo, tipoComprobante,"
                + "fechaVenta,idMetodoPago,idEmpleado, idCliente, estadoVenta)"
                + "values('"+ venta.getSerie()+ "', '"+ venta.getNumeroCorrelativo() +"',"
                + "'"+ venta.getFechaVenta()+ "','"+ venta.getIdMetodoPago() + "',"
                + "'"+ venta.getIdEmpleado()+ "','"+ venta.getIdCliente() +"',"
                + "'"+ venta.isEstadoVenta()+"')";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery("select @@IDENTITY AS Codigo"); //obtiene el codigo generado
            codigoVenta = rs.getInt("Codigo");
            for (DetalleVenta detalle : venta.getDetalles()) {
                sql = "insert into detalleventa (idVenta, idProducto,cantidad,precioVenta)"
                        + "values ("+ codigoVenta +", "+ detalle.getIdProducto()+","
                        + " "+ detalle.getCantidad() + ", "+ detalle.getPrecioVenta()+")";
                rs = ps.executeQuery(sql);
                sql = "update producto set stockProducto = (stockProducto - "+ detalle.getCantidad()+ ")"
                        + "where idProducto = " + detalle.getIdProducto();
                rs = ps.executeQuery(sql);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
