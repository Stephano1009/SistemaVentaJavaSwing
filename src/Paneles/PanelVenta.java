package Paneles;

import Clases.Cliente;
import Clases.Conexion;
import Clases.Pago;
import Clases.Producto;
import Consultas.ClienteDao;
import Consultas.PagoDao;
import Consultas.VentaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class PanelVenta extends javax.swing.JPanel {

    PagoDao daoPago = new PagoDao();
    ClienteDao daoCliente = new ClienteDao();
    VentaDao venta = new VentaDao();
    DefaultTableModel modeloDetalleVenta = new DefaultTableModel();
    private int contador = 0;

    public PanelVenta() {
        initComponents(); //método que inicializa los componentes de la interfaz
        CargarCliente(); //Carga los datos en el combo de cliente
        CargarPago(); //Carga los datos en el combo de pago
        cargarCorrelativoSerie();
        validarNombreProductoObtenido();
    }

    public void CargarCliente() {
        List<Cliente> listaCliente = daoCliente.listarCliente();
        for (Cliente ClienteVen : listaCliente) {
            cboClienteVenta.addItem(ClienteVen.getNombreCliente() + " "+ ClienteVen.getApellidoCliente());
        }
    }

    public JComboBox getCboClienteVenta() {
        return cboClienteVenta;
    }

    public void CargarPago() {
        /**
         * Creamos una lista llamada listaPagos del objeto Pago. Luego utlizamos
         * el objeto daoPago de la instancia de clase PagoDao. Posteriormente,
         * llamamos al método listarPago de la clase PagoDao. Finalmente, al
         * llamar al método, consulta la base de datos y devuelve una lista de
         * objetos "Pago" existentes.
         */
        List<Pago> listaPagos = daoPago.listarPago();
        /**
         * Creamos un bucle foreach para recorrer cada objeto "Pago" en la lista
         * llamada listaPagos. Luego, cada iteración del bucle que va a hacer
         * durante la lista, el objeto actual se va a guardar en la variable
         * PagoVen.
         */
        for (Pago PagoVen : listaPagos) {
            /*
            * Agregamos el elemento al cboMetodoVenta, usando el método addItem.
            * El elemento que agregamos es el nombre del pago, que fue obtenido
              en la variable donde se guardo el objeto actual, haciendo uso del
              getter getNombrePago.
             */
            cboMetodoVenta.addItem(PagoVen.getNombrePago());
        }
    }

    /*Creamos un método de tipo JComboBox para acceder al comboBox "cboMetodoVenta"
    desde otra partes del código y poder manipularlo. 
    Esto nos permitirá una forma de obtener y trabajar con el comboBox fuera
    de la clase PanelVenta*/
    public JComboBox getCboMetodoVenta() {
        return cboMetodoVenta;
    }

    private void cargarCorrelativoSerie() {
        this.txtSerieVenta.setText("A0001");
        /*Declaramos una variable 'correlativo' y la inicializamos en 0, 
        con el fin de obtener el valor del correlativo en la BD.*/
        int correlativo = 0;
        try {
            /*Llamamos la método obtenerCorrelativo del objeto 'venta',
            y le asignamos el valor obtenido en la variable correlativo*/
            correlativo = this.venta.obtenerCorrelativo();
            /*Luego establecemos en el TextField el texto '00000' concatenado
            con el valor incrementando de 'Correlativo'. El incremento se realiza
            antes de la concatenación.*/
            this.txtCorrelativoVenta.setText("0000" + (++correlativo));
        } catch (Exception e) {
            System.out.println("Error en tu vida" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboClienteVenta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboMetodoVenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtSerieVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorrelativoVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        btnProductoVenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalleVenta = new javax.swing.JTable();
        btnRegistrarVenta = new javax.swing.JButton();
        btnEliminarRegistro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        txtStockProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("GENERAR VENTA");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERAR NUEVA VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("CLIENTE");

        cboClienteVenta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboClienteVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INGRESE EL NOMBRE DEL CLIENTE" }));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setText("MÉTODO PAGO");

        cboMetodoVenta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboMetodoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE MÉTODO" }));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setText("N° SERIE");

        txtSerieVenta.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setText("N° CORRELATIVO");

        txtCorrelativoVenta.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel7.setText("INGRESE EL PRODUCTO");

        btnProductoVenta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnProductoVenta.setText("BUSCAR PRODUCTO");
        btnProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoVentaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel8.setText("PRECIO");

        txtPrecioVenta.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel9.setText("CANTIDAD");

        btnAgregarVenta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnAgregarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnAgregarVenta.setText("AGREGAR PRODUCTO");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });

        TablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "PRODUCTO", "CANTIDAD", "PRECIO VENTA", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalleVenta);

        btnRegistrarVenta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/reporte.png"))); // NOI18N
        btnRegistrarVenta.setText("REGISTRAR VENTA");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnEliminarRegistro.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/cancelado.png"))); // NOI18N
        btnEliminarRegistro.setText("ELIMINAR REGISTRO");

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel12.setText("TOTAL A PAGAR");

        txtTotalVenta.setEditable(false);

        txtStockProducto.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("STOCK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cboMetodoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerieVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorrelativoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegistrarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarRegistro))
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarVenta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNombreProducto)
                        .addGap(12, 12, 12)
                        .addComponent(btnProductoVenta)
                        .addGap(361, 361, 361))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMetodoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerieVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorrelativoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductoVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnAgregarVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarRegistro)
                    .addComponent(btnRegistrarVenta))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoVentaActionPerformed
        if (validarNombreProducto() == false) {
            JOptionPane.showMessageDialog(null, "¡Debe ingresar el nombre del producto!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            String nombreProducto = this.txtNombreProducto.getText();
            if (nombreProducto != null) {
                try {
                    Producto pro = this.venta.obtenerProducto(nombreProducto);
                    double precioPro = pro.getPrecioProducto();
                    int stockPro = pro.getStockProducto();
                    /*Convertimos el precio del producto a una cadena de texto*/
                    String precioString = String.valueOf(precioPro);
                    this.txtPrecioVenta.setText(precioString);
                    String StockString = String.valueOf(stockPro);
                    this.txtStockProducto.setText(StockString);
                } catch (Exception e) {
                    System.out.println("Ocurrio un error durante la obtencion: "
                            + e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_btnProductoVentaActionPerformed

    private boolean validarNombreProducto() {
        if (txtNombreProducto.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public void validarNombreProductoObtenido() {
        ((AbstractDocument) txtNombreProducto.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("[a-zA-Z\\s]{0,30}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("[a-zA-Z\\s]{0,30}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

    private void actualizarContador() {
        contador++;
    }

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
        if (validarIngresoCantidad() == false) {
            JOptionPane.showMessageDialog(null, "¡Debe ingresar la cantidad que desea llevar!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            String producto = this.txtNombreProducto.getText();
            int cantidadProducto = Integer.parseInt(this.txtCantidadVenta.getText());
            double precioProducto = Double.parseDouble(this.txtPrecioVenta.getText());
            double totalVenta = cantidadProducto * precioProducto;

            // Actualizar el contador
            actualizarContador();

            // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            JTable tabla = TablaDetalleVenta;
            int columnCount = tabla.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

            Object[] DatosDeFila = {contador, producto, cantidadProducto, precioProducto, totalVenta}; // Incluye el total en el arreglo
            modeloDetalleVenta = (DefaultTableModel) tabla.getModel();
            modeloDetalleVenta.addRow(DatosDeFila);

            // Seteamos el valor total
            this.calcularTotalAPagar();

            // Limpiar los campos de texto
            this.txtStockProducto.setText("");
            this.txtNombreProducto.setText("");
            this.txtCantidadVenta.setText("");
            this.txtPrecioVenta.setText("");
        }
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
            
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed
    
    public boolean validarIngresoCantidad() {
        if (txtCantidadVenta.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void calcularTotalAPagar() {
        double totalAPagar = 0.0; //Variable para almacenar el valor total a pagar

        for (int i = 0; i < modeloDetalleVenta.getRowCount(); i++) {
            double ColumnaTotal = (double) modeloDetalleVenta.getValueAt(i, 4);
            totalAPagar += ColumnaTotal;
        }
        this.txtTotalVenta.setText(Double.toString(totalAPagar));
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDetalleVenta;
    public javax.swing.JButton btnAgregarVenta;
    public javax.swing.JButton btnEliminarRegistro;
    public javax.swing.JButton btnProductoVenta;
    public javax.swing.JButton btnRegistrarVenta;
    public javax.swing.JComboBox<String> cboClienteVenta;
    public javax.swing.JComboBox<String> cboMetodoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtCantidadVenta;
    public javax.swing.JTextField txtCorrelativoVenta;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioVenta;
    public javax.swing.JTextField txtSerieVenta;
    public javax.swing.JTextField txtStockProducto;
    public javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables

}
