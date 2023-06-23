package Clases;

public class Comprobante {
   int idComprobante;
   String tipoComprobante;

    public Comprobante() {
    }

    public Comprobante(int idComprobante, String tipoComprobante) {
        this.idComprobante = idComprobante;
        this.tipoComprobante = tipoComprobante;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
  
}
