package Clases;

public class Pago {
    int idMetodoPago;
    String nombrePago;
    boolean estadoPago;

    public Pago() {
    }

    public Pago(int idMetodoPago, String nombrePago, boolean estadoPago) {
        this.idMetodoPago = idMetodoPago;
        this.nombrePago = nombrePago;
        this.estadoPago = estadoPago;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombrePago() {
        return nombrePago;
    }

    public void setNombrePago(String nombrePago) {
        this.nombrePago = nombrePago;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }
    
    
}
