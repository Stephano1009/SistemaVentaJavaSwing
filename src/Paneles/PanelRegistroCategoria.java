package Paneles;

import Clases.Categoria;
import Consultas.CategoriaDao;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PanelRegistroCategoria extends javax.swing.JPanel {
    
    CategoriaDao daoCategoria = new CategoriaDao();
    Categoria cate = new Categoria();
    
    public PanelRegistroCategoria() {
        initComponents();
        txtIdCategoria.setVisible(false);
    }
    
    private PanelCategoria panelCategoria;
    
    public void setPanelCategoria(PanelCategoria panelCategoria) {
        this.panelCategoria = panelCategoria;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        chkActivoCategoria = new javax.swing.JCheckBox();
        btnGuardarCategoria = new javax.swing.JButton();
        btnActualizarCategoria = new javax.swing.JButton();
        txtIdCategoria = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DATOS DE LA CATEGORÍA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Nombre Categoría:");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("Estado Categoría:");

        chkActivoCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        chkActivoCategoria.setText("Activo");

        btnGuardarCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnGuardarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/guardar.png"))); // NOI18N
        btnGuardarCategoria.setText("GUARDAR CATEGORÍA");
        btnGuardarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCategoriaActionPerformed(evt);
            }
        });

        btnActualizarCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnActualizarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/actualizar.png"))); // NOI18N
        btnActualizarCategoria.setText("ACTUALIZAR CATEGORÍA");
        btnActualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCategoriaActionPerformed(evt);
            }
        });

        txtIdCategoria.setText("txtIdCategoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chkActivoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(txtIdCategoria)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombreCategoria)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarCategoria)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkActivoCategoria)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCategoria)
                    .addComponent(btnActualizarCategoria))
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

    private void btnGuardarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCategoriaActionPerformed
        if (validarDatos() == false) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        }
        agregarCategoria();
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            dialog.dispose();
        }
    }//GEN-LAST:event_btnGuardarCategoriaActionPerformed

    private void btnActualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCategoriaActionPerformed
        ActualizarCategoria();
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            dialog.dispose();
        }
        btnGuardarCategoria.setEnabled(false);
    }//GEN-LAST:event_btnActualizarCategoriaActionPerformed

    public void agregarCategoria() {
        String nombreCate = txtNombreCategoria.getText();
        boolean esCate = chkActivoCategoria.isSelected();

        cate.setNombreCategoria(nombreCate);
        cate.setEstadoCategoria(esCate);

        int respuesta = daoCategoria.agregarCate(cate);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Categoria agregada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void ActualizarCategoria() {
        String nomCat = txtNombreCategoria.getText();
        boolean esCat = chkActivoCategoria.isSelected();
        cate.setNombreCategoria(nomCat);
        cate.setEstadoCategoria(esCat);
        cate.setIdCategoria(Integer.valueOf(this.txtIdCategoria.getText()));
        int r = daoCategoria.actualizarCategoria(cate);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Categoría Actualizada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar Categoría");
        }
        btnGuardarCategoria.setEnabled(false);
    }
    
    private boolean validarDatos() {
        if (txtNombreCategoria.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public void setDatosEditar(Categoria cat) {
        txtNombreCategoria.setText(cat.getNombreCategoria());
        chkActivoCategoria.setSelected(cat.isEstadoCategoria());
        txtIdCategoria.setText(Integer.toString(cat.getIdCategoria()));
        txtIdCategoria.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCategoria;
    public javax.swing.JButton btnGuardarCategoria;
    public javax.swing.JCheckBox chkActivoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtIdCategoria;
    public javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
