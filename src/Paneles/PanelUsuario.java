package Paneles;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Consultas.UsuarioDao;
import Clases.Usuario;

public class PanelUsuario extends javax.swing.JPanel {

    UsuarioDao daoUsuario = new UsuarioDao(); //instanciamos la clase UsuarioDao
    DefaultTableModel modeloUsuario = new DefaultTableModel(); //instanciamos el modeloTabla
    private PanelRegistroUsuario panelRegistroUsuario;

    public PanelUsuario() {
        initComponents();
        listarUsuario(TablaUsuario);
        panelRegistroUsuario = new PanelRegistroUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        btnEliminarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnListarUsuario = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE USUARIOS");

        btnNuevoUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevoUsuario.setText("NUEVO USUARIO");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE USUARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "USUARIO", "CARGO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEliminarUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar proveedor.png"))); // NOI18N
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarUsuario.setText("EDITAR");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListarUsuario.setText("LISTAR");
        btnListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuarioActionPerformed(evt);
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
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnListarUsuario))
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

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        PanelRegistroUsuario panelRegistroUsuario = new PanelRegistroUsuario();
        panelRegistroUsuario.btnActualizarUsuario.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroUsuario,
                "NUEVO USUARIO",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarioActionPerformed
        limpiarTabla();
        listarUsuario(TablaUsuario);
    }//GEN-LAST:event_btnListarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        deleteUsuario();
        limpiarTabla();
        listarUsuario(TablaUsuario);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        int filaSeleccionada = TablaUsuario.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            Object valorCelda = TablaUsuario.getValueAt(filaSeleccionada, 0);
            /*declaramos la variable valorCelda de tipo Object para almacenar cualquier
            tipo de objeto en esa variable*/

 /*Se utiliza Object por el método getValueAt de la clase JTable,
            que devuelve un objeto genérico '(Object)', el cual representa el 
            valor de la celda en la posición especificada por los argumentos */
 /*La razon por la cual se devuelve un objeto génerico, es porque la tabla
            puede contener diferentes tipos de datos en sus celdas, permitiendo así 
            realizar las verificaciones y conversiones necesarias según el tipo de dato
            que se espera obtener*/
            if (valorCelda instanceof Integer) {
                /*Se verifica si el valor de la celda es de tipo entero (instanceof Integer).
                Esto se hace para asegurarse de que el valor de la celda sea realmente un 
                identificador de usuario válido*/

                int idUsuario = (int) valorCelda;
                /*Realizamos una conversión de la variable valorCelda que es de tipo Object
                a int, esto con el fin de que el valor de la celda contiene un numero entero
                Y eso se verifico en el instanceof Integer. Si en caso no fuera un entero,
                se producirá una excepción en tiempo de ejecución. Luego si la conversión tiene
                éxito, este valor le asignamos al idUsuario que ahora va a contener el identificador
                del usuario seleccionado*/

                Usuario u = daoUsuario.leerUsuario(idUsuario);
                /*Una vez que se haya verificado, se hace un llamado al objeto daoUsuario, para
                leer los datos correspondientes. el resultado de la llamada se guarda en la 
                variable 'u' que es de tipo Usuario(Clase)*/

                panelRegistroUsuario.setDatosEditar(u);
                /*invocamos al método serDatosEditar del objeto panelRegistroUsuario, pasando 
                como argumento 'u'. Esto probablemente actualiza los campos del panel con los
                datos del usuario seleccionado para editar.*/

                panelRegistroUsuario.btnGuardarUsuario.setEnabled(false);
                JOptionPane.showOptionDialog(
                        null,
                        panelRegistroUsuario,
                        "EDITAR USUARIO",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{},
                        null
                );
            }
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    public void listarUsuario(JTable tabla) {
        modeloUsuario = (DefaultTableModel) tabla.getModel(); //pasamos el modelo de la 
        List<Usuario> listaUsuario = daoUsuario.listarUsuario();
        Object[] object = new Object[4];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        for (int i = 0; i < listaUsuario.size(); i++) {
            object[0] = listaUsuario.get(i).getIdUsuario();
            object[1] = listaUsuario.get(i).getNombreUsuario();
            int idCargo = listaUsuario.get(i).getIdCargo();
            String nombreCargo = daoUsuario.obtenerNombreCargoPorId(idCargo);
            object[2] = nombreCargo;
            if (listaUsuario.get(i).isEstadoUsuario()) {
                object[3] = "Activo";
            } else {
                object[3] = "Inactivo";
            }
            modeloUsuario.addRow(object);
        }
        TablaUsuario.setModel(modeloUsuario);
    }

    public void deleteUsuario() {
        int filaUsuario = TablaUsuario.getSelectedRow();
        if (filaUsuario == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un fila");
        } else {
            int id = Integer.parseInt((String) TablaUsuario.getValueAt(filaUsuario, 0).toString());
            daoUsuario.deteleUsu(id);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado con Exito");
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < TablaUsuario.getRowCount(); i++) {
            modeloUsuario.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaUsuario;
    public javax.swing.JButton btnEditarUsuario;
    public javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnListarUsuario;
    public javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
