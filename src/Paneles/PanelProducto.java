package Paneles;

import Clases.Producto;
import Consultas.CategoriaDao;
import Consultas.ProductoDao;
import java.awt.Dialog;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import javax.swing.SwingUtilities;


public class PanelProducto extends javax.swing.JPanel {
    
    ProductoDao daoProducto = new ProductoDao();
    DefaultTableModel modeloProducto = new DefaultTableModel();
    CategoriaDao daoCategoria = new CategoriaDao();
    
    private DecimalFormat formatoMoneda = new DecimalFormat("S/ #,##0.00"); // Formato de moneda
    
    private PanelRegistroProducto panelRegistroProducto;
    
    public PanelProducto() {
        initComponents();
        listarProducto(TablaProducto);
        panelRegistroProducto = new PanelRegistroProducto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        btnListarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE PRODUCTOS");

        btnNuevoProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevoProducto.setText("NUEVO PRODUCTO");
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "LISTADO DE PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PRODUCTO", "DESCRIPCIÓN", "CONTENIDO", "PRECIO", "STOCK", "CATEGORÍA"
            }
        ));
        jScrollPane1.setViewportView(TablaProducto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        btnListarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListarProducto.setText("LISTAR");
        btnListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("ELIMINAR");

        btnEditarProducto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarProducto.setText("EDITAR");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(636, 636, 636))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoProducto)
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarProducto)
                    .addComponent(btnEliminarProducto)
                    .addComponent(btnEditarProducto))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        PanelRegistroProducto panelRegistroProducto = new PanelRegistroProducto();
        panelRegistroProducto.btnActualizarProducto.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroProducto,
                "NUEVO PRODUCTO",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof Dialog) {
            Dialog dialog = (Dialog) window;
            dialog.dispose();
        }
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductoActionPerformed
        limpiarTabla();
        listarProducto(TablaProducto);
    }//GEN-LAST:event_btnListarProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        int filaSeleccionada = TablaProducto.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            Object valorCelda = TablaProducto.getValueAt(filaSeleccionada, 0);
            if (valorCelda instanceof Integer){
                int idProducto = (int) valorCelda;
                Producto p = daoProducto.leerProducto(idProducto);
                panelRegistroProducto.setDatosEditar(p);
                panelRegistroProducto.btnGuardarProducto.setEnabled(false);
                JOptionPane.showOptionDialog(
                        null,
                        panelRegistroProducto,
                        "EDITAR PRODUCTO",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{},
                        null
                );
            }
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    public void listarProducto(JTable tabla) {
        modeloProducto = (DefaultTableModel) tabla.getModel();
        List<Producto> listaProducto = daoProducto.listarProducto();
        Object[] object = new Object[7];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < listaProducto.size(); i++) {
            object[0] = listaProducto.get(i).getIdProducto();
            object[1] = listaProducto.get(i).getNombreProducto();
            object[2] = listaProducto.get(i).getDescripcionProducto();
            object[3] = listaProducto.get(i).getContenidoProducto();
            object[4] = formatoMoneda.format(listaProducto.get(i).getPrecioProducto());
            object[5] = listaProducto.get(i).getStockProducto();
            int idCategoria = listaProducto.get(i).getIdCategoria();
            String nombreCategoria = daoCategoria.obtenerNombreCategoriaPorId(idCategoria);
            object[6] = nombreCategoria;         
            modeloProducto.addRow(object);
        }
        TablaProducto.setModel(modeloProducto);
    }
    
    void limpiarTabla() {
        for (int i = 0; i < TablaProducto.getRowCount(); i++) {
            modeloProducto.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaProducto;
    public javax.swing.JButton btnEditarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnListarProducto;
    public javax.swing.JButton btnNuevoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
