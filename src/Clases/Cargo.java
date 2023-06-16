package Clases;

public class Cargo {

    /*Paso 1: Creación de atributos*/
    int idCargo;
    String nombreCargo;
    boolean estadoCargo;

    /*Paso 2: Creamos un constructor vacío*/
    public Cargo() {
    }

    /*Paso 3: Creamos el constructor con parámetros*/
    public Cargo(int idCargo, String nombreCargo, boolean estadoCargo) {
        this.idCargo = idCargo;
        this.nombreCargo = nombreCargo;
        this.estadoCargo = estadoCargo;
    }

    /*Paso 4: Creamos los métodos Getters and Setters*/
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

    public boolean isEstadoCargo() {
        return estadoCargo;
    }

    public void setEstadoCargo(boolean estadoCargo) {
        this.estadoCargo = estadoCargo;
    }

    @Override
    public String toString() {
        return nombreCargo;
    }

}
