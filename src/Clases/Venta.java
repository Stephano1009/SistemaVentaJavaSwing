package Clases;

import java.time.LocalDate;

public class Venta {

    int idVenta;
    String serie;
    String numeroCorrelativo;
    int idComprobante;
    int idEmpleado;
    int idCliente;
    LocalDate fechaVenta;
    boolean estadoVenta;

    public Venta() {
    }

    public Venta(int idVenta, String serie, String numeroCorrelativo, int idComprobante, int idEmpleado, int idCliente, LocalDate fechaVenta, boolean estadoVenta) {
        this.idVenta = idVenta;
        this.serie = serie;
        this.numeroCorrelativo = numeroCorrelativo;
        this.idComprobante = idComprobante;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
        this.estadoVenta = estadoVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(String numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
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
