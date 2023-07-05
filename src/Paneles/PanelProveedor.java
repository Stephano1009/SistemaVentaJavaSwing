package Paneles;

import Consultas.ProveedorDao;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Clases.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class PanelProveedor extends javax.swing.JPanel {

    ProveedorDao daoProveedor = new ProveedorDao();
    DefaultTableModel modeloProveedor = new DefaultTableModel();
    
    private PanelRegistroProveedor panelRegistroProveedor;

    public PanelProveedor() {
        initComponents();
        listarProveedor(TablaProveedor);
        panelRegistroProveedor = new PanelRegistroProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoProveedor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProveedor = new javax.swing.JTable();
        btnListaProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE PROVEEDORES");

        btnNuevoProveedor.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevoProveedor.setText("NUEVO PROVEEDOR");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "LISTADO DE PROVEEDORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaProveedor.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "RUC ", "PROVEEDOR", "CONTACTO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaProveedor);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnListaProveedor.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListaProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListaProveedor.setText("LISTAR");
        btnListaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar proveedor.png"))); // NOI18N
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarProveedor.setText("EDITAR");
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 617, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaProveedor)
                    .addComponent(btnEliminarProveedor)
                    .addComponent(btnEditarProveedor))
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

    private void btnListaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProveedorActionPerformed
        limpiarTabla();
        listarProveedor(TablaProveedor);
    }//GEN-LAST:event_btnListaProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        PanelRegistroProveedor panelRegistroProveedor = new PanelRegistroProveedor();
        panelRegistroProveedor.btnActualizarProveedor.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroProveedor,
                "NUEVO PROVEEDOR",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        int filaSeleccionada = TablaProveedor.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            Object valorCelda = TablaProveedor.getValueAt(filaSeleccionada, 0);
            if (valorCelda instanceof Integer) {
                int idProveedor = (int) valorCelda;
                Proveedor pr = daoProveedor.leerProveedor(idProveedor);
                panelRegistroProveedor.setDatosEditar(pr);
                panelRegistroProveedor.btnGuardarProveedor.setEnabled(false);
                JOptionPane.showOptionDialog(
                        null,
                        panelRegistroProveedor,
                        "EDITAR PROVEEDOR",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{},
                        null
                );
            }
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        deleteProveedor();
        limpiarTabla();
        listarProveedor(TablaProveedor);
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    public void listarProveedor(JTable tabla) {
        modeloProveedor = (DefaultTableModel) tabla.getModel();
        List<Proveedor> listaProveedor = daoProveedor.listarProveedor();
        Object[] object = new Object[5];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < listaProveedor.size(); i++) {
            object[0] = listaProveedor.get(i).getIdProveedor();
            object[1] = listaProveedor.get(i).getRucProveedor();
            int idProveedor = listaProveedor.get(i).getIdProveedor();
            String nombreProveedor = daoProveedor.obtenerNombreProveedorPorId(idProveedor);
            object[2] = nombreProveedor;
            object[3] = listaProveedor.get(i).getCelularProveedor();
            if (listaProveedor.get(i).isEstadoProveedor()) {
                object[4] = "Activo";
            } else {
                object[4] = "Inactivo";
            }
            modeloProveedor.addRow(object);
        }
        TablaProveedor.setModel(modeloProveedor);
    }
    public void deleteProveedor() {
        int filaProveedor = TablaProveedor.getSelectedRow();
        if (filaProveedor == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un fila");
        } else {
            int id = Integer.parseInt((String) TablaProveedor.getValueAt(filaProveedor, 0).toString());
            daoProveedor.deteleProve(id);
            JOptionPane.showMessageDialog(null, "Proveedor Eliminado con Exito");
        }
    }
    
    void limpiarTabla() {
        for (int i = 0; i < TablaProveedor.getRowCount(); i++) {
            modeloProveedor.removeRow(i);
            i = i - 1;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaProveedor;
    public javax.swing.JButton btnEditarProveedor;
    public javax.swing.JButton btnEliminarProveedor;
    public javax.swing.JButton btnListaProveedor;
    public javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
