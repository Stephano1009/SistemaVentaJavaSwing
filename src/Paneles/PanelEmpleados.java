package Paneles;

import Clases.Empleado;
import Consultas.EmpleadoDao;
import Consultas.UsuarioDao;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class PanelEmpleados extends javax.swing.JPanel {

    EmpleadoDao daoEmpleado = new EmpleadoDao();
    DefaultTableModel modeloEmpleado = new DefaultTableModel();
    UsuarioDao daoUsuario = new UsuarioDao();
    Empleado emp = new Empleado();

    private PanelRegistroEmpleado panelRegistroEmpleado;

    public PanelEmpleados() {
        initComponents();
        listarEmpleado(TablaEmpleados);
        panelRegistroEmpleado = new PanelRegistroEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoEmpleado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        btnListarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE EMPLEADOS");

        btnNuevoEmpleado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/mas.png"))); // NOI18N
        btnNuevoEmpleado.setText("NUEVO EMPLEADO");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 12))); // NOI18N

        TablaEmpleados.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "APELLIDO", "DNI", "CONTACTO", "CORREO", "USUARIO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaEmpleados);

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

        btnListarEmpleado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnListarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/lista.png"))); // NOI18N
        btnListarEmpleado.setText("LISTAR");
        btnListarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/eliminar.png"))); // NOI18N
        btnEliminarEmpleado.setText("ELIMINAR");

        btnEditarEmpleado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/EDITAR.png"))); // NOI18N
        btnEditarEmpleado.setText("EDITAR");

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
                            .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarEmpleado)
                    .addComponent(btnEliminarEmpleado)
                    .addComponent(btnEditarEmpleado))
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

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        PanelRegistroEmpleado panelRegistroEmpleado = new PanelRegistroEmpleado();
        panelRegistroEmpleado.btnActualizarEmpleado.setEnabled(false);
        JOptionPane.showOptionDialog(
                null,
                panelRegistroEmpleado,
                "NUEVO EMPLEADO",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnListarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpleadoActionPerformed
        listarEmpleado(TablaEmpleados);
    }//GEN-LAST:event_btnListarEmpleadoActionPerformed

    public void listarEmpleado(JTable tabla) {
        modeloEmpleado = (DefaultTableModel) tabla.getModel();
        List<Empleado> listaEmpleado = daoEmpleado.listarEmpleado();
        Object[] object = new Object[8];

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        for (int i = 0; i < listaEmpleado.size(); i++) {
            object[0] = listaEmpleado.get(i).getIdEmpleado();
            object[1] = listaEmpleado.get(i).getNombreEmpleado();
            object[2] = listaEmpleado.get(i).getApellidoEmpleado();
            object[3] = listaEmpleado.get(i).getDniEmpleado();
            object[4] = listaEmpleado.get(i).getCelularEmpleado();
            object[5] = listaEmpleado.get(i).getCorreoEmpleado();
            int idUsuario = listaEmpleado.get(i).getIdUsuario();
            String nombreUsuario = daoUsuario.obtenerNombreUsuarioPorId(idUsuario);
            object[6] = nombreUsuario;
            if (listaEmpleado.get(i).isEstadoEmpleado()) {
                object[7] = "Activo";
            } else {
                object[7] = "Inactivo";
            }
            
            modeloEmpleado.addRow(object);
        }
        TablaEmpleados.setModel(modeloEmpleado);
        TableColumnModel columnModel = tabla.getColumnModel();
        
        int anchoApellido = calcularAnchoMaximoContenido(tabla, 2);
        columnModel.getColumn(2).setPreferredWidth(anchoApellido);
        
        // Ajustar ancho de la columna "Correo" al ancho máximo del contenido
        int anchoCorreo = calcularAnchoMaximoContenido(tabla, 5); // Calcular el ancho máximo del contenido de la columna "Correo"
        columnModel.getColumn(5).setPreferredWidth(anchoCorreo);
        
        int anchoEstado = calcularAnchoMaximoContenido(tabla, 6);
        columnModel.getColumn(6).setPreferredWidth(anchoEstado);
        
        
      
    }

    private int calcularAnchoMaximoContenido(JTable tabla, int indiceColumna) {
        int anchoMaximo = 0;
        TableColumn columna = tabla.getColumnModel().getColumn(indiceColumna);
        TableCellRenderer renderer = columna.getHeaderRenderer();
        if (renderer == null) {
            renderer = tabla.getTableHeader().getDefaultRenderer();
        }
        Component comp = renderer.getTableCellRendererComponent(tabla, columna.getHeaderValue(), false, false, 0, 0);
        anchoMaximo = comp.getPreferredSize().width;

        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            renderer = tabla.getCellRenderer(fila, indiceColumna);
            comp = renderer.getTableCellRendererComponent(tabla, tabla.getValueAt(fila, indiceColumna), false, false, fila, indiceColumna);
            anchoMaximo = Math.max(anchoMaximo, comp.getPreferredSize().width);
        }

        return anchoMaximo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaEmpleados;
    public javax.swing.JButton btnEditarEmpleado;
    public javax.swing.JButton btnEliminarEmpleado;
    public javax.swing.JButton btnListarEmpleado;
    public javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
