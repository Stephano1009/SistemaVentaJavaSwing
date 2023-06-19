package Clases;

public class Empleado {
    int idEmpleado;
    String nombreEmpleado;
    String apellidoEmpleado;
    int dniEmpleado;
    String celularEmpleado;
    String correoEmpleado;
    boolean estadoEmpleado;
    int idUsuario;

    public Empleado() {
    }
    
    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, int dniEmpleado, String celularEmpleado, String correoEmpleado, boolean estadoEmpleado, int idUsuario) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.dniEmpleado = dniEmpleado;
        this.celularEmpleado = celularEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.estadoEmpleado = estadoEmpleado;
        this.idUsuario = idUsuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public int getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(int dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public String getCelularEmpleado() {
        return celularEmpleado;
    }

    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
     
}
