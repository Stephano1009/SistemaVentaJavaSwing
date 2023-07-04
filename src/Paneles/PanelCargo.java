package Paneles;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Consultas.CargoDao;
import Clases.Cargo;

public class PanelCargo extends javax.swing.JPanel {

    CargoDao daoCargo = new CargoDao();
    DefaultTableModel modeloCargo = new DefaultTableModel();

    private PanelRegistroCargo panelRegistroCargo;

    public PanelCargo() {
        initComponents();
        listarCargo(TablaCargo);
        panelRegistroCargo = new PanelRegistroCargo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoCargo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCargo = new javax.swing.JTable();
        btnEliminarCargo = new javax.swing.JButton();
        btnEditarCargo = new javax.swing.JButton();
        btnListarCargos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE CARGOS");

        btnNuevoCargo.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevoCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevoCargo.setText("NUEVO CARGO");
        btnNuevoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCargoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE CARGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaCargo.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaCargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CARGO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaCargo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEliminarCargo.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar.png"))); // NOI18N
        btnEliminarCargo.setText("ELIMINAR");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });

        btnEditarCargo.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarCargo.setText("EDITAR");
        btnEditarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCargoActionPerformed(evt);
            }
        });

        btnListarCargos.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListarCargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListarCargos.setText("LISTAR");
        btnListarCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCargosActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListarCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCargo)
                    .addComponent(btnEditarCargo)
                    .addComponent(btnListarCargos))
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

    private void btnNuevoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCargoActionPerformed
        PanelRegistroCargo panelRegistroCargo = new PanelRegistroCargo();
        panelRegistroCargo.btnActualizarCargo.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroCargo,
                "NUEVO CARGO",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
        //panelRegistroCargo.btnActualizarCargo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoCargoActionPerformed

    private void btnListarCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCargosActionPerformed
        limpiarTabla();
        listarCargo(TablaCargo);
    }//GEN-LAST:event_btnListarCargosActionPerformed

    private void btnEliminarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCargoActionPerformed
        deleteCargo();
        limpiarTabla();
        listarCargo(TablaCargo);
    }//GEN-LAST:event_btnEliminarCargoActionPerformed

    private void btnEditarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCargoActionPerformed
        int filaSeleccionada = TablaCargo.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            Object valorCelda = TablaCargo.getValueAt(filaSeleccionada, 0);
            if (valorCelda instanceof Integer) {
                int idCargo = (int) valorCelda;
                Cargo c = daoCargo.leerCargo(idCargo);
                panelRegistroCargo.setDatosEditar(c);
                panelRegistroCargo.btnGuardarCargo.setEnabled(false);
                JOptionPane.showOptionDialog(
                        null,
                        panelRegistroCargo,
                        "EDITAR USUARIO",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{},
                        null
                );
            }
        }
    }//GEN-LAST:event_btnEditarCargoActionPerformed

    public void listarCargo(JTable tabla) {
        modeloCargo = (DefaultTableModel) tabla.getModel();
        List<Cargo> listaCargo = daoCargo.listarCargo();
        Object[] object = new Object[3];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < listaCargo.size(); i++) {
            object[0] = listaCargo.get(i).getIdCargo();
            object[1] = listaCargo.get(i).getNombreCargo();
            object[2] = listaCargo.get(i).isEstadoCargo();
            if (listaCargo.get(i).isEstadoCargo()) {
                object[2] = "Activo";
            } else {
                object[2] = "Inactivo";
            }
            modeloCargo.addRow(object);
        }
        TablaCargo.setModel(modeloCargo);
    }

    public void deleteCargo() {
        int filaUsuario = TablaCargo.getSelectedRow();
        if (filaUsuario == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un fila");
        } else {
            int id = Integer.parseInt((String) TablaCargo.getValueAt(filaUsuario, 0).toString());
            daoCargo.deteleCar(id);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado con Exito");
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < TablaCargo.getRowCount(); i++) {
            modeloCargo.removeRow(i);
            i = i - 1;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaCargo;
    public javax.swing.JButton btnEditarCargo;
    public javax.swing.JButton btnEliminarCargo;
    public javax.swing.JButton btnListarCargos;
    public javax.swing.JButton btnNuevoCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
