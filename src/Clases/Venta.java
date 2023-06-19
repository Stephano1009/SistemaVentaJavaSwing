package Clases;

import java.time.LocalDate;

public class Venta {
    int idVenta;
    int serie;
    String numeroCorrelativo;
    char tipoDocumento;
    int idEmpleado;
    int idCliente;
    int idMetodoPago;
    LocalDate fechaVenta;
    boolean estadoVenta;

    public Venta() {
    }

    public Venta(int idVenta, int serie, String numeroCorrelativo, char tipoDocumento, int idEmpleado, int idCliente, int idMetodoPago, LocalDate fechaVenta, boolean estadoVenta) {
        this.idVenta = idVenta;
        this.serie = serie;
        this.numeroCorrelativo = numeroCorrelativo;
        this.tipoDocumento = tipoDocumento;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.idMetodoPago = idMetodoPago;
        this.fechaVenta = fechaVenta;
        this.estadoVenta = estadoVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(String numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public char getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(char tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public boolean isEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(boolean estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
    
    
}
