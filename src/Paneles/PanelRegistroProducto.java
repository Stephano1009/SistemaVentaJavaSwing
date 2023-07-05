package Paneles;

import Clases.Categoria;
import Clases.Producto;
import Clases.Proveedor;
import Consultas.CategoriaDao;
import Consultas.ProductoDao;
import Consultas.ProveedorDao;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PanelRegistroProducto extends javax.swing.JPanel {

    CategoriaDao catDao = new CategoriaDao();
    ProveedorDao provDao = new ProveedorDao();
    Producto p = new Producto();
    ProductoDao daoProducto = new ProductoDao();

    public PanelRegistroProducto() {
        initComponents();
        CargarCategorias();
        CargarProveedor();
        txtIdProducto.setVisible(false);

    }

    public void CargarCategorias() {
        List<Categoria> listaCategorias = catDao.listarCategoria();
        for (Categoria cargoCat : listaCategorias) {
            cboCategoriaProducto.addItem(cargoCat.getNombreCategoria());
        }
    }

    public void CargarProveedor() {
        List<Proveedor> listaProveedores = provDao.listarProveedor();
        for (Proveedor cargoProv : listaProveedores) {
            cboProveedorProducto.addItem(cargoProv.getNombreProveedor());
        }
    }

    public JComboBox getCboCategoriaProducto() {
        return cboCategoriaProducto;
    }

    private PanelProducto panelProducto;

    public void setPanelProducto(PanelProducto panelProducto) {
        this.panelProducto = panelProducto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContenidoProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStockProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboCategoriaProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboProveedorProducto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chkActivoProducto = new javax.swing.JCheckBox();
        btnGuardarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Nombre Del Producto");

        txtNombreProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("Descripción Del Producto");

        txtDescripcionProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("Contenido");

        txtContenidoProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setText("Precio");

        txtPrecioProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setText("Stock");

        txtStockProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setText("Categoría");

        cboCategoriaProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA CATEGORÍA" }));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel7.setText("Proveedor");

        cboProveedorProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboProveedorProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN PROVEEDOR" }));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel8.setText("Estado Producto");

        chkActivoProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        chkActivoProducto.setText("Activo");

        btnGuardarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/guardar.png"))); // NOI18N
        btnGuardarProducto.setText("GUARDAR PRODUCTO");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/actualizar.png"))); // NOI18N
        btnActualizarProducto.setText("ACTUALIZAR PRODUCTO");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        txtIdProducto.setText("txtIdProducto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtContenidoProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(txtStockProducto)
                                .addComponent(jLabel6)
                                .addComponent(cboCategoriaProducto, 0, 271, Short.MAX_VALUE)
                                .addComponent(cboProveedorProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnActualizarProducto)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chkActivoProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addComponent(txtIdProducto)
                                .addGap(48, 48, 48)))))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContenidoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkActivoProducto)
                    .addComponent(txtIdProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProducto)
                    .addComponent(btnActualizarProducto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        actualizarProducto();
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        if (validarDatos() == false) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        } else {
            agregarProducto();
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private boolean validarDatos() {
        if (txtNombreProducto.getText().isEmpty()) {
            return false;
        }
        if (txtDescripcionProducto.getText().isEmpty()) {
            return false;
        }
        if (txtContenidoProducto.getText().isEmpty()) {
            return false;
        }
        if (txtPrecioProducto.getText().isEmpty()) {
            return false;
        }
        if (txtStockProducto.getText().isEmpty()) {
            return false;
        }
        if (cboCategoriaProducto.getSelectedIndex() == 0) {
            return false;
        }
        if (cboProveedorProducto.getSelectedIndex() == 0) {
            return false;
        }
        return true;
    }

    public void agregarProducto() {
        String nomPro = txtNombreProducto.getText();
        String desPro = txtDescripcionProducto.getText();
        String contPro = txtContenidoProducto.getText();
        String prePro = txtPrecioProducto.getText();
        String stoPro = txtStockProducto.getText();
        Object nombreCategoria = cboCategoriaProducto.getSelectedItem();
        Object nombreProveedor = cboProveedorProducto.getSelectedItem();
        boolean esPro = chkActivoProducto.isSelected();

        int idCategoria = this.catDao.obtenerIdCategoriaPorNombreCategoria(nombreCategoria.toString());
        int idProveedor = this.provDao.obtenerIdProveedorPorNombreProveedor(nombreProveedor.toString());

        p.setNombreProducto(nomPro);
        p.setDescripcionProducto(desPro);
        p.setContenidoProducto(contPro);
        p.setPrecioProducto(Double.parseDouble(prePro));
        p.setStockProducto(Integer.parseInt(stoPro));
        p.setIdCategoria(idCategoria);
        p.setIdProveedor(idProveedor);
        p.setEstadoProducto(esPro);

        int respuesta = daoProducto.agregarPro(p);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Producto agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void actualizarProducto() {
        String nombreProducto = txtNombreProducto.getText();
        String descripcionProducto = txtDescripcionProducto.getText();
        String contenidoProducto = txtContenidoProducto.getText();
        double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
        int stockProducto = Integer.parseInt(txtStockProducto.getText());
        Object valorCategoria = cboCategoriaProducto.getSelectedItem();
        Object valorProveedor = cboProveedorProducto.getSelectedItem();

        if (valorCategoria.toString().equals("SELECCIONE UNA CATEGORÍA")) {
            JOptionPane.showMessageDialog(null, "Error, debe seleccionar una categoría");
        } else if (valorProveedor.toString().equals("SELECCIONE UN PROVEEDOR")) {
            JOptionPane.showMessageDialog(null, "Error, debe seleccionar un proveedor");
        } else {
            int idCategoria = catDao.obtenerIdCategoriaPorNombreCategoria(valorCategoria.toString());
            int idProveedor = provDao.obtenerIdProveedorPorNombreProveedor(valorProveedor.toString());
            boolean estadoProducto = chkActivoProducto.isSelected();

            p.setNombreProducto(nombreProducto);
            p.setDescripcionProducto(descripcionProducto);
            p.setContenidoProducto(contenidoProducto);
            p.setPrecioProducto(precioProducto);
            p.setStockProducto(stockProducto);
            p.setIdCategoria(idCategoria);
            p.setIdProveedor(idProveedor);
            p.setEstadoProducto(estadoProducto);
            p.setIdProducto(Integer.valueOf(this.txtIdProducto.getText()));

            int r = daoProducto.actualizarProducto(p);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Producto actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar producto: ");              
            }
            btnGuardarProducto.setEnabled(false);
        }
    }

    public void setDatosEditar(Producto p) {
        txtNombreProducto.setText(p.getNombreProducto());
        txtDescripcionProducto.setText(p.getDescripcionProducto());
        txtContenidoProducto.setText(p.getContenidoProducto());
        txtPrecioProducto.setText(String.valueOf(p.getPrecioProducto()));
        txtStockProducto.setText(String.valueOf(p.getStockProducto()));
        int idCategoria = p.getIdCategoria();
        String nombreCategoria = daoProducto.obtenerNombreCategoriaPorId(idCategoria);
        cboCategoriaProducto.setSelectedItem(nombreCategoria);
        int idProveedor = p.getIdProveedor();
        String nombreProveedor = daoProducto.obtenerNombreProveedorPorId(idProveedor);
        cboProveedorProducto.setSelectedItem(nombreProveedor);
        chkActivoProducto.setSelected(p.isEstadoProducto());
        txtIdProducto.setText(Integer.toString(p.getIdProducto()));
        txtIdProducto.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarProducto;
    public javax.swing.JButton btnGuardarProducto;
    public javax.swing.JComboBox<String> cboCategoriaProducto;
    public javax.swing.JComboBox<String> cboProveedorProducto;
    public javax.swing.JCheckBox chkActivoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtContenidoProducto;
    public javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JLabel txtIdProducto;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioProducto;
    public javax.swing.JTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}
