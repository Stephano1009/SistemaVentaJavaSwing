package Clases;

public class Cargo {
   
    int idCargo;
    String nombreCargo;
    boolean estadoCargo;
 
    public Cargo() {
    }
   
    public Cargo(int idCargo, String nombreCargo, boolean estadoCargo) {
        this.idCargo = idCargo;
        this.nombreCargo = nombreCargo;
        this.estadoCargo = estadoCargo;
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

