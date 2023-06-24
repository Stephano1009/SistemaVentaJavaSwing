package Paneles;

import Clases.Venta;
import Consultas.VentaDao;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PanelReporte extends javax.swing.JPanel {
    
    VentaDao daoVenta = new VentaDao();
    DefaultTableModel modeloReporte = new DefaultTableModel();
    
    public PanelReporte() {
        initComponents();
        listarVentas(TablaReportes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReportes = new javax.swing.JTable();
        btnVerReporte = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("SECCIÓN DE REPORTES");

        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "COMPROBANTE", "PAGO", "EMPLEADO", "CLIENTE", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(TablaReportes);

        btnVerReporte.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnVerReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/reporte Venta.png"))); // NOI18N
        btnVerReporte.setText("VER REPORTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVerReporte)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerReporte)
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

    public void listarVentas(JTable tabla) {
        modeloReporte = (DefaultTableModel) tabla.getModel();
        List<Venta> listaVenta = daoVenta.listarVenta();
        Object[] object = new Object[6];

        // Creamos un objeto DefaultTableCellRenderer para centrar el contenido
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignar el centro renderizador a todas las columnas
        int columnCount = tabla.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < listaVenta.size(); i++) {
            object[0] = listaVenta.get(i).getIdVenta();
            object[1] = listaVenta.get(i).getTipoComprobante();
            
            int idMetodoPago = listaVenta.get(i).getIdMetodoPago();
            String nombrePago = daoVenta.obtenerNombrePagoPorId(idMetodoPago);
            object[2] = nombrePago;
            
            int idEmpleado = listaVenta.get(i).getIdEmpleado();
            String nombreEmpleado = daoVenta.obtenerNombreEmpleadoPorId(idEmpleado);
            object[3] = nombreEmpleado;
            
            int idCliente = listaVenta.get(i).getIdCliente();
            String nombreCliente = daoVenta.obtenerNombreClientePorId(idCliente);
            object[4] = nombreCliente;

            object[5] = listaVenta.get(i).getFechaVenta();
            modeloReporte.addRow(object);
        }
        TablaReportes.setModel(modeloReporte);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaReportes;
    public javax.swing.JButton btnVerReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
