
package Clases;

public class Usuario {
    /*Paso 1: Creación de atributos*/
    int idUsuario;
    String nombreUsuario;
    String claveUsuario;
    boolean estadoUsuario;
    int idCargo;
    String nombreCargo;
    String nombreEmpleado;
   
    
    /*Paso 2: Creamos un constructor vacío*/
    public Usuario() {
    }
    
    /*Paso 3: Creamos el constructor con parámetros*/

    public Usuario(int idUsuario, String nombreUsuario, String claveUsuario, boolean estadoUsuario, int idCargo) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.estadoUsuario = estadoUsuario;
        this.idCargo = idCargo;
    }
    
    /*Paso 4: Creamos los métodos Getters and Setters*/

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
       
}
