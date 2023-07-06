package Clases;

public class Cliente {
   int idCliente;
   String nombreCliente;
   String apellidoCliente;
   String identificacionCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String identificacionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.identificacionCliente = identificacionCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }
   
   
}
