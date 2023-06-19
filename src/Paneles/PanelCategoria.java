
package Paneles;

import Clases.Categoria;
import Consultas.CategoriaDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class PanelCategoria extends javax.swing.JPanel {
    
    CategoriaDao daoCategoria = new CategoriaDao();
    DefaultTableModel modeloCategoria = new DefaultTableModel();
    
    private PanelRegistroCategoria panelRegistroCategoria;
    
    public PanelCategoria() {
        initComponents();
        listarCategorias(TablaCategoria);
        panelRegistroCategoria = new PanelRegistroCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevaCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        btnListarCategoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCategoria = new javax.swing.JTable();
        btnEditarCategoria = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(839, 639));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE CATEGORÍAS");

        btnNuevaCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevaCategoria.setText("NUEVA CATEGORÍA");
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });

        btnEliminarCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar.png"))); // NOI18N
        btnEliminarCategoria.setText("ELIMINAR");

        btnListarCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListarCategoria.setText("LISTAR");
        btnListarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCategoriaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE CATEGORÍAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CATEGORÍA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaCategoria);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditarCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarCategoria.setText("EDITAR");

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
                        .addComponent(btnListarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaCategoria))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaCategoria)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCategoria)
                    .addComponent(btnListarCategoria)
                    .addComponent(btnEditarCategoria))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCategoriaActionPerformed
        listarCategorias(TablaCategoria);
    }//GEN-LAST:event_btnListarCategoriaActionPerformed

    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        PanelRegistroCategoria panelRegistroCategoria = new PanelRegistroCategoria();
        panelRegistroCategoria.btnActualizarCategoria.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroCategoria,
                "NUEVO CATEGORÍA",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    public void listarCategorias(JTable tabla) {
        modeloCategoria = (DefaultTableModel) tabla.getModel();
        List<Categoria> listaCategorias = daoCategoria.listarCategoria();
        Object[] object = new Object[3];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < listaCategorias.size(); i++) {
            object[0] = listaCategorias.get(i).getIdCategoria();
            object[1] = listaCategorias.get(i).getNombreCategoria();
            if (listaCategorias.get(i).isEstadoCategoria()) {
                object[2] = "Activo";
            } else {
                object[2] = "Inactivo";
            }
            modeloCategoria.addRow(object);
        }
        TablaCategoria.setModel(modeloCategoria);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaCategoria;
    public javax.swing.JButton btnEditarCategoria;
    public javax.swing.JButton btnEliminarCategoria;
    public javax.swing.JButton btnListarCategoria;
    public javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
