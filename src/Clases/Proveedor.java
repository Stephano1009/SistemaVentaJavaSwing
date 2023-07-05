package Clases;

public class Proveedor {

    int idProveedor;
    String rucProveedor;
    String nombreProveedor;
    String celularProveedor;
    boolean estadoProveedor;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String rucProveedor, String nombreProveedor, String celularProveedor, boolean estadoProveedor) {
        this.idProveedor = idProveedor;
        this.rucProveedor = rucProveedor;
        this.nombreProveedor = nombreProveedor;
        this.celularProveedor = celularProveedor;
        this.estadoProveedor = estadoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCelularProveedor() {
        return celularProveedor;
    }

    public void setCelularProveedor(String celularProveedor){
        this.celularProveedor = celularProveedor;
    }

    public boolean isEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(boolean estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

}
