package Paneles;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Clases.Cargo;
import Consultas.CargoDao;
import Clases.Usuario;
import Consultas.UsuarioDao;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class PanelRegistroUsuario extends javax.swing.JPanel {

    UsuarioDao daoUsuario = new UsuarioDao();
    Usuario u = new Usuario();
    CargoDao cargoDao = new CargoDao();

    public PanelRegistroUsuario() {
        initComponents();
        ValidarCampo();
        cargarCargos();

    }

    public void cargarCargos() {
        List<Cargo> listaCargos = cargoDao.listarCargo();
        for (Cargo cargoUsu : listaCargos) {
            cboCargoUsuario.addItem(cargoUsu.getNombreCargo());
        }
    }

    public JComboBox getCboCargoUsuario() {
        return cboCargoUsuario;
    }

    private PanelUsuario panelUsuario;

    public void setPanelUsuario(PanelUsuario panelUsuario) {
        this.panelUsuario = panelUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboCargoUsuario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        chkActivoUsuario = new javax.swing.JCheckBox();
        btnGuardarUsuario = new javax.swing.JButton();
        pswClaveUsuario = new javax.swing.JPasswordField();
        btnActualizarUsuario = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Código Usuario:");

        txtCodigoUsuario.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("Nombre Usuario:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("Clave Usuario:");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setText("Cargo:");

        cboCargoUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboCargoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CARGO" }));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setText("Estado Usuario:");

        chkActivoUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        chkActivoUsuario.setText("Activo");

        btnGuardarUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/guardar.png"))); // NOI18N
        btnGuardarUsuario.setText("GUARDAR USUARIO");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/actualizar.png"))); // NOI18N
        btnActualizarUsuario.setText("ACTUALIZAR USUARIO");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(250, 250, 250))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chkActivoUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombreUsuario)
                            .addComponent(pswClaveUsuario)
                            .addComponent(cboCargoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoUsuario))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarUsuario)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pswClaveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkActivoUsuario)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarUsuario)
                    .addComponent(btnActualizarUsuario))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        if (validarDatos() == false) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        } else {
            agregarUsuario();
        }
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        actualizarUsuario();
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            dialog.dispose();
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    public void agregarUsuario() {
        String nomUsu = txtNombreUsuario.getText();
        char[] claUsu = pswClaveUsuario.getPassword();
        String claveString = new String(claUsu);
        //int idCargo = cboCargoUsuario.getSelectedIndex(); // Obtener el ID del cargo seleccionado en el JCombox y lo guardamos en idCargo
        Object nombreCargo = cboCargoUsuario.getSelectedItem();
        boolean esUsu = chkActivoUsuario.isSelected();

        int idCargo = this.daoUsuario.obtenerIdCargoPorNombreCargo(nombreCargo.toString());
        u.setNombreUsuario(nomUsu);
        u.setClaveUsuario(claveString);
        u.setIdCargo(idCargo);
        u.setEstadoUsuario(esUsu);

        int respuesta = daoUsuario.agregarUsu(u);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private boolean validarDatos() {
        if (txtNombreUsuario.getText().isEmpty()) {
            return false;
        }
        if (pswClaveUsuario.getPassword().length == 0) {
            return false;
        }
        if (cboCargoUsuario.getSelectedIndex() == 0) {
            return false;
        }
        return true;
    }

    public void actualizarUsuario() {
        int id = Integer.parseInt(txtCodigoUsuario.getText());
        String nombreUsuario = txtNombreUsuario.getText();
        char[] claveUsuario = pswClaveUsuario.getPassword();
        String contraString = new String(claveUsuario);
        Object valor = cboCargoUsuario.getSelectedItem();
        if (valor.toString().equals("SELECCIONE CARGO")) {
            JOptionPane.showMessageDialog(null, "Error, debe debe seleccionar un cargo");
        } else {
            int idCargo = daoUsuario.obtenerIdCargoPorNombreCargo(valor.toString());
            boolean estadoUsuario = chkActivoUsuario.isSelected();
            u.setIdUsuario(id);
            u.setNombreUsuario(nombreUsuario);
            u.setClaveUsuario(contraString);
            u.setIdCargo(idCargo);
            u.setEstadoUsuario(estadoUsuario);
            int r = daoUsuario.actualizarUsuario(u);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar usuario");
            }
            btnGuardarUsuario.setEnabled(false);
        }
    }

    public void setDatosEditar(Usuario u) {
        txtCodigoUsuario.setText(Integer.toString(u.getIdUsuario()));
        txtNombreUsuario.setText(u.getNombreUsuario());
        pswClaveUsuario.setText(u.getClaveUsuario());
        int idCargo = u.getIdCargo();
        String nombreCargo = daoUsuario.obtenerNombreCargoPorId(idCargo);
        cboCargoUsuario.setSelectedItem(nombreCargo);
        chkActivoUsuario.setSelected(u.isEstadoUsuario());
    }

    private void ValidarCampo() {
        //Validar campo de nombre
        ((AbstractDocument) txtNombreUsuario.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("[a-zA-Z]{0,20}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("[a-zA-Z]{0,20}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        // Validar campo de contraseña
        ((AbstractDocument) pswClaveUsuario.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("[a-zA-Z0-9\\p{Punct}]{0,20}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("[a-zA-Z0-9\\p{Punct}]{0,20}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarUsuario;
    public javax.swing.JButton btnGuardarUsuario;
    public javax.swing.JComboBox<String> cboCargoUsuario;
    public javax.swing.JCheckBox chkActivoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField pswClaveUsuario;
    private javax.swing.JTextField txtCodigoUsuario;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
