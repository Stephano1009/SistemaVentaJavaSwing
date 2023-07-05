package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Clases.Conexion;
import Clases.Cargo;

public class CargoDao {

    /*Paso 1: Creamos los métodos para las operaciones de crud y al mismo 
              tiempo conectando a la base de datos*/
 /*Paso 2: Instanciamos la clase Conexion*/
    Conexion conectar = new Conexion();
    /*Paso 3: Creamos una variable de tipo Connection */
    Connection con;
    /*Paso 4: Creamos una variable de tipo PreparedStatement para ejecutar consultas*/
    PreparedStatement ps;
    /*Paso 5: Creamos una variable para recuperar y manipular datos de la consulta*/
    ResultSet rs;

    /*Paso 6*: Creamos el metodo de public de tipo List para listarCargos*/
    public List listarCargo() {
        /*Paso 7: Declaramos una variable de tipo tipo del objeto usuario*/
        List<Cargo> datosCargo = new ArrayList<>();
        String sql = "select * from cargo";
        /*Paso 8: Colocamos un try catch para hacer referencia a la conexion*/
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                /*Paso 9: Instanciamos el objeto cargo*/
                Cargo c = new Cargo();
                c.setIdCargo(rs.getInt(1));
                c.setNombreCargo(rs.getString(2));
                c.setEstadoCargo(rs.getBoolean(3));
                /*Paso 10: Agregamos a la variable datosUsuario*/
                datosCargo.add(c);
            }
        } catch (Exception e) {
        }
        return datosCargo;
    }

    /*Método para agregar o guardar usuarios*/
    public int agregarCar(Cargo c) {
        String sql = "INSERT INTO cargo (nombreCargo, estadoCargo) VALUES (?, ?)";
        try (Connection con = conectar.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getNombreCargo());
            ps.setBoolean(2, c.isEstadoCargo());
            ps.executeUpdate();
            return 1; // Retorna 1 si se agrega correctamente
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Retorna 0 en caso de error
        }
    }
    
    public Cargo leerCargo(int idCargo) {
        Cargo car = null;
        String sql = "select idCargo,nombreCargo, estadoCargo from cargo where idCargo = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCargo);
            rs = ps.executeQuery();
            if (rs.next()) {
                /* Paso 9: Instanciamos el objeto cargo */
                car = new Cargo();
                car.setIdCargo(idCargo);
                car.setIdCargo(rs.getInt("idCargo"));
                car.setNombreCargo(rs.getString("nombreCargo"));
                car.setEstadoCargo(rs.getBoolean("estadoCargo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return car;
    }

    public int actualizarCargo(Cargo c) {
        int r = 0;
        String sql = "update cargo set nombreCargo = ?, estadoCargo = ? where idCargo = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombreCargo());
            ps.setBoolean(2, c.isEstadoCargo());
            ps.setInt(3, c.getIdCargo());
            r= ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            
        }
        return r;
    }

    public void deteleCar(int idcar) {
        String sql = "delete from cargo where idCargo = " + idcar;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
