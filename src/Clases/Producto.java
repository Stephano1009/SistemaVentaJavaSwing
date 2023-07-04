package Clases;

public class Producto {
   int idProducto;
   String nombreProducto;
   String descripcionProducto;
   String contenidoProducto;
   double precioProducto;
   int stockProducto;
   boolean estadoProducto;
   int idCategoria;
   int idProveedor;
   String nombreCategoria;
   String nombreProveedor;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String descripcionProducto, String contenidoProducto, double precioProducto, int stockProducto, boolean estadoProducto, int idCategoria, int idProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.contenidoProducto = contenidoProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.estadoProducto = estadoProducto;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getContenidoProducto() {
        return contenidoProducto;
    }

    public void setContenidoProducto(String contenidoProducto) {
        this.contenidoProducto = contenidoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
   
    
    
}
