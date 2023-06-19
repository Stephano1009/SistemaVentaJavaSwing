package Clases;

public class Cliente {
   int idCliente;
   String nombreCliente;
   String apellidoCliente;
   char indentificacionCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, char indentificacionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.indentificacionCliente = indentificacionCliente;
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

    public char getIndentificacionCliente() {
        return indentificacionCliente;
    }

    public void setIndentificacionCliente(char indentificacionCliente) {
        this.indentificacionCliente = indentificacionCliente;
    }
   
   
}
