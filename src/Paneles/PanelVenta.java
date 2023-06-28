package Paneles;

import Clases.Cliente;
import Clases.DetalleVenta;
import Clases.Pago;
import Clases.Producto;
import Clases.Venta;
import Consultas.ClienteDao;
import Consultas.PagoDao;
import Consultas.VentaDao;
import java.util.ArrayList;
import java.util.Date;
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
    VentaDao ventaDao = new VentaDao();
    DefaultTableModel modeloDetalleVenta = new DefaultTableModel();
    private int contador = 0;

    public PanelVenta() {
        initComponents(); //método que inicializa los componentes de la interfaz
        CargarCliente(); //Carga los datos en el combo de cliente
        CargarPago(); //Carga los datos en el combo de pago
        cargarCorrelativoSerie();
        validarNombreProductoObtenido();
        validarCantidadObtenida();
    }

    public void CargarCliente() {
        List<Cliente> listaCliente = daoCliente.listarCliente();
        for (Cliente ClienteVen : listaCliente) {
            cboClienteVenta.addItem(ClienteVen.getIdCliente() + ". " + ClienteVen.getNombreCliente() + " " + ClienteVen.getApellidoCliente());
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
            cboMetodoVenta.addItem(PagoVen.getIdMetodoPago() + " . " + PagoVen.getNombrePago());
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
        this.txtSerieVenta.setText("B0001");
        /*Declaramos una variable 'correlativo' y la inicializamos en 0, 
        con el fin de obtener el valor del correlativo en la BD.*/
        int correlativo = 0;
        try {
            /*Llamamos la método obtenerCorrelativo del objeto 'venta',
            y le asignamos el valor obtenido en la variable correlativo*/
            correlativo = this.ventaDao.obtenerCorrelativo();
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
        btnBuscarProducto = new javax.swing.JButton();
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
        jLabel10 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();

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

        btnBuscarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnBuscarProducto.setText("BUSCAR PRODUCTO");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
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
                "N°", "CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO VENTA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel12.setText("TOTAL A PAGAR");

        txtTotalVenta.setEditable(false);

        txtStockProducto.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("STOCK");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel10.setText("CÓDIGO DEL PRODUCTO");

        txtIdProducto.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreProducto)
                            .addComponent(cboClienteVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdProducto)
                            .addComponent(cboMetodoVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSerieVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCorrelativoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarProducto)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegistrarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarRegistro))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarVenta)))
                        .addGap(0, 188, Short.MAX_VALUE))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
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

    int stockProductoActual; // Variable para almacenar el stock actual del producto

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        //Verificar si el campo de nombreProdcuto esta vacío
        if (txtNombreProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del producto", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución del método
        }

        String nombreProducto = this.txtNombreProducto.getText();
        if (nombreProducto != null) {
            try {
                Producto pro = this.ventaDao.obtenerProducto(nombreProducto);
                if (pro != null) {
                    double precioPro = pro.getPrecioProducto();
                    //int stockPro = pro.getStockProducto();
                    stockProductoActual = pro.getStockProducto(); // Almacenar el stock actual
                    /*Convertimos el precio del producto a una cadena de texto*/
                    String precioString = String.valueOf(precioPro);
                    this.txtPrecioVenta.setText(precioString);
                    //String StockString = String.valueOf(stockPro);
                    String StockString = String.valueOf(stockProductoActual);
                    this.txtStockProducto.setText(StockString);
                    this.txtIdProducto.setText(String.valueOf(pro.getIdProducto()));
                } else {
                    JOptionPane.showMessageDialog(null, "El producto no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error durante la obtencion: " + e.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

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

    public void validarCantidadObtenida() {
        ((AbstractDocument) txtCantidadVenta.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("-?\\d{0,8}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("-?\\d{0,8}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

    private void actualizarContador() {
        contador++;
    }

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed

        String cantidadVentaText = this.txtCantidadVenta.getText();
        String nombreProductoText = this.txtNombreProducto.getText();

        // Verificar si el campo de nombre del producto está vacío
        if (nombreProductoText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero debes ingresar el nombre del producto que deseas llevar", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantidadVenta.setText("");
            return; // Detener la ejecución del método
        }

        // Verificar si el campo de cantidad está vacío
        if (cantidadVentaText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la cantidad de venta", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución del método
        }

        // Verificamos si el producto se ha buscado antes de ingresar la cantidad
        if (txtIdProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero debes buscar el producto antes de digitar la cantidad que deseas llevar", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución del método
        }

        int idProducto = Integer.parseInt(this.txtIdProducto.getText());
        String producto = this.txtNombreProducto.getText();
        int cantidadProducto = Integer.parseInt(this.txtCantidadVenta.getText());
        double precioProducto = Double.parseDouble(this.txtPrecioVenta.getText());
        double totalVenta = cantidadProducto * precioProducto;

        // Verificar si la cantidad ingresada es menor o igual a 0
        if (cantidadProducto <= 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una cantidad mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución del método
        }

        // Verificar si la cantidad a vender supera el stock actual
        if (cantidadProducto > stockProductoActual) {
            JOptionPane.showMessageDialog(null, "No cuentas con el stock suficiente", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución del método
        }

        // Verificamos si el producto ya existe en la tabla
        DefaultTableModel modeloDetalleVenta = (DefaultTableModel) TablaDetalleVenta.getModel();
        int rowCount = modeloDetalleVenta.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            int idProductoTabla = (int) modeloDetalleVenta.getValueAt(i, 1); // Obtener el ID del producto de la fila actual
            if (idProducto == idProductoTabla) {
                // Si el producto duplicado existe en la tabla
                JOptionPane.showMessageDialog(null, "El producto ya existe en la tabla", "Error", JOptionPane.ERROR_MESSAGE);

                // Mostramos cuadro de diálogo de confirmación que nos permita editar la cantidad
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas editar la cantidad a llevar?");
                if (opcion == JOptionPane.YES_OPTION) {
                    // Obtenemos la fila correspondiente al producto duplicado
                    int fila = i;

                    // Obtenemos la cantidad actual del producto duplicado
                    int cantidadActual = (int) modeloDetalleVenta.getValueAt(fila, 3);

                    // Mostramos una ventana de diálogo para que el usuario ingrese la nueva cantidad
                    String nuevaCantidadTexto = JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad:", cantidadActual);

                    // Verificamos que el valor ingresado sea un dato válido
                    if (nuevaCantidadTexto != null && !nuevaCantidadTexto.isEmpty()) {
                        int nuevaCantidad = Integer.parseInt(nuevaCantidadTexto);

                        // Verificamos si la nueva cantidad es mayor a 0
                        if (nuevaCantidad > 0) {
                            // Actualizamos la cantidad en la tabla
                            modeloDetalleVenta.setValueAt(nuevaCantidad, fila, 3);

                            // Obtenemos el precio del producto ya registrado
                            double precioProductoExistente = precioProducto;
                            // Actualizamos el total en la tabla
                            double nuevoTotal = nuevaCantidad * precioProductoExistente;
                            modeloDetalleVenta.setValueAt(nuevoTotal, fila, 5);

                            // Seteamos el valor total
                            this.calcularTotalAPagar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Debes ingresar una cantidad mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                return;
            }
        }
        // Restar la cantidad vendida al stock actual
        stockProductoActual -= cantidadProducto;

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

        Object[] DatosDeFila = {contador, idProducto, producto, cantidadProducto, precioProducto, totalVenta}; // Incluye el total en el arreglo
        modeloDetalleVenta.addRow(DatosDeFila);

        // Seteamos el valor total
        this.calcularTotalAPagar();

        // Limpiar los campos de texto
        txtNombreProducto.setText("");
        txtIdProducto.setText("");
        txtStockProducto.setText("");
        txtPrecioVenta.setText("");
        txtCantidadVenta.setText("");
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    public String firstNChars(String str, int n) {
        if (str == null) {
            return null;
        }
        return str.length() < n ? str : str.substring(0, n);
    }

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        List<String> mensajesError = validarCampos();
        if (!mensajesError.isEmpty()) {
            String mensaje;
            if (mensajesError.size() == 1) {
                mensaje = mensajesError.get(0);
            } else {
                mensaje = "Debe seleccionar y completar los campos requeridos.";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TablaDetalleVenta.getRowCount() > 0) {
                // Guardar datos de la venta
                Venta venta = new Venta();
                venta.setIdEmpleado(1);
                Object valorCliente = cboClienteVenta.getSelectedItem();
                String idCliente = firstNChars(String.valueOf(valorCliente), 1);
                venta.setIdCliente(Integer.parseInt(idCliente));
                Object valorPago = cboMetodoVenta.getSelectedItem();
                String idPago = firstNChars(String.valueOf(valorPago), 1);
                venta.setIdMetodoPago(Integer.parseInt(idPago));
                venta.setSerie(txtSerieVenta.getText());
                venta.setNumeroCorrelativo(txtCorrelativoVenta.getText());
                venta.setTipoComprobante("B");
                venta.setEstadoVenta(true);
                venta.setFechaVenta(new Date());
                venta.setTotal(Double.parseDouble(txtTotalVenta.getText()));

                // Guardar detalles de la venta
                JTable table = TablaDetalleVenta;
                ArrayList<DetalleVenta> detalleVentas = new ArrayList<>();

                // Recorre cada fila del JTable
                for (int i = 0; i < table.getRowCount(); i++) {
                    DetalleVenta detalleVenta = new DetalleVenta();

                    // Recorre cada columna del JTable
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        // Obtiene el valor de la celda en la fila "i" y columna "j"
                        Object value = table.getValueAt(i, j);

                        // Establece los valores correspondientes en el objeto DetalleVenta
                        switch (j) {
                            case 0: // Columna N°
                                // No hacer nada
                                break;
                            case 1: // Columna CODIGO
                                detalleVenta.setIdProducto((int) value);
                                break;
                            case 2: // Columna PRODUCTO
                                // No hacer nada
                                break;
                            case 3: // Columna CANTIDAD
                                detalleVenta.setCantidad((int) value);
                                break;
                            case 4: // Columna PRECIOVENTA
                                detalleVenta.setPrecioVenta((double) value);
                                break;
                        }
                    }
                    // Agrega el objeto DetalleVenta al ArrayList
                    detalleVentas.add(detalleVenta);
                }
                venta.setDetalles(detalleVentas);
                try {
                    ventaDao.registrar(venta);
                    JOptionPane.showMessageDialog(null, "Venta Registrada con Éxito");
                    //Actualizar el contador
                    contador = 0; // Reiniciar el contador a 0

                    // Actualizar el correlativo
                    cargarCorrelativoSerie();

                    // Limpiar los campos de texto
                    txtStockProducto.setText("");
                    txtNombreProducto.setText("");
                    txtCantidadVenta.setText("");
                    txtPrecioVenta.setText("");
                    txtTotalVenta.setText("");

                    // Restablecer el ComboBox
                    cboClienteVenta.setSelectedIndex(0);
                    cboMetodoVenta.setSelectedIndex(0);

                    // Limpiar la tabla
                    DefaultTableModel model = (DefaultTableModel) TablaDetalleVenta.getModel();
                    model.setRowCount(0);
                } catch (Exception ex) {
                    ex.getMessage();
                }
            } else {
                if (!txtNombreProducto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Primero debes buscar el producto. \n"
                            + "Luego debes agregar la cantidad de venta. \n"
                            + "Después, debes agregar el producto a la tabla. \n"
                            + "Finalmente se registrará la venta", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (txtNombreProducto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del producto.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (txtCantidadVenta.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Falta ingresar la cantidad de venta", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debes ingresar al menos un producto a la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    public List<String> validarCampos() {
        List<String> mensajesError = new ArrayList<>();

        if (cboClienteVenta.getSelectedIndex() == 0) {
            mensajesError.add("Falta seleccionar el cliente.");
        }
        if (cboMetodoVenta.getSelectedIndex() == 0) {
            mensajesError.add("Falta seleccionar el método de venta.");
        }
        return mensajesError;
    }

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        int filaSeleccionada = TablaDetalleVenta.getSelectedRow();
        if (filaSeleccionada >= 0) {
            modeloDetalleVenta.removeRow(filaSeleccionada);
            calcularTotalAPagar();

            // Actualizar el contador
            contador = modeloDetalleVenta.getRowCount(); // Actualizar el contador con la cantidad de filas en el modelo

            if (modeloDetalleVenta.getRowCount() == 0) {
                this.txtTotalVenta.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void calcularTotalAPagar() {
        DefaultTableModel modeloDetalleVenta = (DefaultTableModel) TablaDetalleVenta.getModel();
        int rowCount = modeloDetalleVenta.getRowCount();
        double totalAPagar = 0.0;

        for (int i = 0; i < rowCount; i++) {
            double totalFila = (double) modeloDetalleVenta.getValueAt(i, 5);
            totalAPagar += totalFila;
        }

        // Actualizar el valor total a pagar en el componente correspondiente
        txtTotalVenta.setText(String.valueOf(totalAPagar));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDetalleVenta;
    public javax.swing.JButton btnAgregarVenta;
    public javax.swing.JButton btnBuscarProducto;
    public javax.swing.JButton btnEliminarRegistro;
    public javax.swing.JButton btnRegistrarVenta;
    public javax.swing.JComboBox<String> cboClienteVenta;
    public javax.swing.JComboBox<String> cboMetodoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioVenta;
    public javax.swing.JTextField txtSerieVenta;
    public javax.swing.JTextField txtStockProducto;
    public javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables

}
