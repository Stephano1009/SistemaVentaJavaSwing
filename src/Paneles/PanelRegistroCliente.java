package Paneles;

import Clases.Cliente;
import Consultas.ClienteDao;
import java.awt.Dialog;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class PanelRegistroCliente extends javax.swing.JPanel {

    Cliente cli = new Cliente();
    ClienteDao daoCliente = new ClienteDao();

    public PanelRegistroCliente() {
        initComponents();
        ValidarCampo();
        txtIdCliente.setVisible(false);
    }

    private PanelCliente panelCliente;

    public void setPanelCliente(PanelCliente panelCliente) {
        this.panelCliente = panelCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Nombre Cliente:");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("Apellido Cliente:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("Dni Cliente:");

        btnGuardarCliente.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/guardar.png"))); // NOI18N
        btnGuardarCliente.setText("GUARDAR CLIENTE");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/actualizar.png"))); // NOI18N
        btnActualizarCliente.setText("ACTUALIZAR CLIENTE");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setText("txtIdCliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCliente)
                    .addComponent(txtApellidoCliente)
                    .addComponent(txtDniCliente))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnActualizarCliente)
                    .addComponent(txtIdCliente))
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

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if (validarDatos() == false) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        }
        agregarCliente();
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof Dialog) {
            Dialog dialog = (Dialog) window;
            dialog.dispose();
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        ActualizarCliente();
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            dialog.dispose();
        }
        btnGuardarCliente.setEnabled(false);
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private boolean validarDatos() {
        if (txtNombreCliente.getText().isEmpty()) {
            return false;
        }
        if (txtApellidoCliente.getText().isEmpty()) {
            return false;
        }
        if (txtDniCliente.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void agregarCliente() {
        String nomCli = txtNombreCliente.getText();
        String apeCli = txtApellidoCliente.getText();
        String numCli = txtDniCliente.getText();

        cli.setNombreCliente(nomCli);
        cli.setApellidoCliente(apeCli);
        cli.setIdentificacionCliente(numCli);

        int respuesta = daoCliente.agregarCli(cli);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Cliente agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void ActualizarCliente() {
        String nomCli = txtNombreCliente.getText();
        String apeCli = txtApellidoCliente.getText();
        String dniCli = txtDniCliente.getText();
        cli.setNombreCliente(nomCli);
        cli.setApellidoCliente(apeCli);
        cli.setIdentificacionCliente(dniCli);
        cli.setIdCliente(Integer.valueOf(this.txtIdCliente.getText()));
        int r = daoCliente.actualizarCliente(cli);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Cliente Actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente");
        }
        btnGuardarCliente.setEnabled(false);
    }

    private void ValidarCampo() {
        // Validar campo de DNI
        ((AbstractDocument) txtDniCliente.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("\\d{0,8}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("\\d{0,8}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        // Validar campo de nombre
        ((AbstractDocument) txtNombreCliente.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("[a-zA-Z ]{0,20}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("[a-zA-Z ]{0,20}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        // Validar campo de apellido
        ((AbstractDocument) txtApellidoCliente.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (sb.toString().matches("[a-zA-Z]{0,20}")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (sb.toString().matches("[a-zA-Z]{0,20}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

    public void setDatosEditar(Cliente cl) {
        txtNombreCliente.setText(cl.getNombreCliente());
        txtApellidoCliente.setText(cl.getApellidoCliente());
        txtDniCliente.setText(cl.getIdentificacionCliente());
        txtIdCliente.setText(Integer.toString(cl.getIdCliente()));
        txtIdCliente.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCliente;
    public javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtDniCliente;
    private javax.swing.JLabel txtIdCliente;
    public javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
