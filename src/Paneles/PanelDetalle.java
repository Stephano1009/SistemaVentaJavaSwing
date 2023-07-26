package Paneles;

import Clases.ReporteVenta;
import Clases.Venta;
import Consultas.ReporteDao;
import Consultas.VentaDao;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PanelDetalle extends javax.swing.JPanel {

    VentaDao daoVenta = new VentaDao();
    ReporteDao daoReporte = new ReporteDao();
    DefaultTableModel modeloReporte = new DefaultTableModel();

    public PanelDetalle() {
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
        jLabel1.setText("SECCIÓN REGISTRO DE VENTA");

        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CLIENTE", "EMPLEADO", "COMPROBANTE", "TOTAL", "MÉTODO PAGO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaReportes);

        btnVerReporte.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnVerReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes botones/reporte Venta.png"))); // NOI18N
        btnVerReporte.setText("GENERAR REPORTE");
        btnVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReporteActionPerformed(evt);
            }
        });

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

    private JasperViewer jasperViewer;

    private void btnVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReporteActionPerformed
        int filaSeleccionada = TablaReportes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            Object valorCelda = TablaReportes.getValueAt(filaSeleccionada, 0);
            if (valorCelda instanceof Integer) { //verificamos que el valorCelda de la columna sea un entero válido
                int idVenta = (int) valorCelda; //guardamos el valor en la variable idVenta
                List<ReporteVenta> reporteV = daoReporte.reporteVenta(idVenta);
                exportarReporte(reporteV);
            }
        }
    }//GEN-LAST:event_btnVerReporteActionPerformed
    
    public void exportarReporte(List<ReporteVenta> reporteV) {
//        /*inputStream --> flujos de entrada: objetos en java para leer datos de 
//        fuentes, archivos o recursos dentro del proyecto desde el classpath
//        al utilizar el inputStream el código puede acceder a los recursos como 
//        secuencias de bytes, permitiendo que jasperReport los procese adecuadamente*/
//        InputStream logoEmpresa = null; 
//        InputStream logoFooter = null;
//        InputStream reporteJasper = null;
//        double totalAPagar = 0.0;
//        // Obtenemos los recurso del proyecto
//        try {
//            /*getResourceAsStream devuelve un "InputStream"
//            
//            es útil cuando se necesita acceder a recursos internos de la aplicación 
//            que están empaquetados dentro del archivo JAR o dentro de una carpeta 
//            específica en el classpath.
//            
//            El classpath es una lista de ubicaciones (carpetas o archivos JAR) 
//            en las que el intérprete de Java busca las clases y recursos necesarios 
//            para la ejecución del programa. 
//            
//            getResourceAsStream --> Permite cargar estos recursos sin preocuparse 
//            por la ubicación absoluta en el sistema de archivos, lo que hace que 
//            la aplicación sea más portátil y flexible. (es decir, capacidad de 
//            funcionar en diferentes entornos y plataformas sin requerir modificaciones 
//            significativas en el código.)*/ 
//            
//            logoEmpresa = PanelDetalle.class.getResourceAsStream("/imagenes/logoEmpresa.png"); 
//            logoFooter = PanelDetalle.class.getResourceAsStream("/imagenes/footerEmpresa.png");
//            reporteJasper = PanelDetalle.class.getResourceAsStream("/Reportes/Reporte_Venta.jasper");
//
//            if (logoEmpresa != null && logoFooter != null && reporteJasper != null) {
//                for (ReporteVenta rv : reporteV) {
//                    totalAPagar += rv.getTotal();
//                }
//                /*JasperReport --> Representa el diseño y la definición del informe que se va a generar.
//                
//                Cargamos el archvio JasperReport desde el inputStream (ReporteJasper) y lo
//                convertimos a un objeto llamado JasperReport 
//                
//                JRLoader.loadObject() es un método de la clase JRLoader que se 
//                utiliza para cargar un objeto JasperReport desde un flujo de 
//                entrada (InputStream). Toma el InputStream reporteJasper que 
//                contiene el archivo JasperReport, lo procesa y lo convierte en 
//                un objeto JasperReport que se puede utilizar posteriormente para 
//                llenar los datos y generar el informe.*/
//                JasperReport report = (JasperReport) JRLoader.loadObject(reporteJasper);
//                
//                /*JRDataSource --> Interfaz de JasperReports utilizada como 
//                fuente de datos para el informe
//                
//                Al implementar esta interfaz, podemos conectar diferentes fuentes 
//                de datos al informe, como bases de datos, listas, arrays, etc.
//                
//                Utilizamos JRBeanArrayDataSource, que se usa para pasar una matriz 
//                (array) de objetos al informe. 
//                
//                JRBeanArrayDataSource tomará esta matriz y proporcionará una vista 
//                tabular de los objetos que contiene, lo que permitirá a JasperReports 
//                recorrerlos y acceder a sus atributos mediante sus métodos getter. 
//                De esta manera, los datos de los objetos ReporteVenta en reporteV 
//                serán utilizados para llenar el informe.
//                
//                configurado JRDataSource, se utiliza junto con el objeto JasperReport 
//                previamente creado para llenar los datos en el informe y generar el 
//                informe final. Con el diseño del informe (JasperReport) y la fuente 
//                de datos (JRDataSource), JasperReports puede combinar ambos y producir
//                el informe resultante con la información proporcionada en reporteV.
//                
//                El objeto "ds", que es una instancia de JRDataSource, sirve como 
//                fuente de datos para el informe JasperReport. 
//                
//                JRDataSource actúa como un puente entre los datos (en este caso, 
//                la lista de objetos ReporteVenta en reporteV) y el diseño del 
//                informe (JasperReport).
//                
//                JasperReports necesita una fuente de datos para obtener los valores 
//                que se mostrarán en el informe. Cuando se llena el informe, 
//                JasperReports recorrerá el JRDataSource y llamará a sus métodos 
//                para obtener los datos específicos que se utilizarán en cada sección 
//                del informe, como títulos, tablas, gráficos, etc.*/
//                JRDataSource ds = new JRBeanArrayDataSource(reporteV.toArray());
//                
//                Map<String, Object> parameters = new HashMap<>();
//                /*Creamos un objeto map llamado parameters  para almacenar los 
//                parámetros que serán utilizados en el informe JasperReport.
//                
//                Map es una estructura de datos en Java que permite almacenar 
//                datos en pares clave-valor. Cada elemento en el Map consiste en 
//                una clave única y su correspondiente valor asociado. 
//                
//                En este caso, se está utilizando una implementación específica de Map llamada HashMap*/
//                parameters.put("ds", ds);
//                parameters.put("logoEmpresa", logoEmpresa);
//                parameters.put("imagenAlternativa", logoFooter);
//                parameters.put("totalAPagar", totalAPagar);
//                // Generamos el reporte y lo mostramos en el visor
//                JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
//                /*La función fillReport() es un método estático de la clase 
//                JasperFillManager que se utiliza para llenar el informe con datos 
//                y generar el informe final en forma de objeto JasperPrint. Esta 
//                función toma el JasperReport, los parámetros y la fuente de datos 
//                como entrada y produce un objeto JasperPrint.
//                
//                JasperPrint es otro objeto de la librería JasperReports que 
//                representa el informe generado y listo para visualizarse o exportarse.*/
//                JasperViewer.viewReport(jasperPrint);
//            } else {
//                System.out.println("No se puede generar el reporte.");
//            }
//        } catch (Exception e) {
//            System.out.println("Ocurrio un errro al intentar generar el reporte de ventas");
//            e.printStackTrace();
//        } finally {
//            // Cerrar los flujos de recursos en el bloque finally
//            if (logoEmpresa != null) {
//                try {
//                    logoEmpresa.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (logoFooter != null) {
//                try {
//                    logoFooter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (reporteJasper != null) {
//                try {
//                    reporteJasper.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
InputStream logoEmpresa = null; 
        InputStream logoFooter = null;
        InputStream reporteJasper = null;
        double totalAPagar = 0.0;
        try {
            logoEmpresa = PanelDetalle.class.getResourceAsStream("/imagenes/logoEmpresa.png"); 
            logoFooter = PanelDetalle.class.getResourceAsStream("/imagenes/footerEmpresa.png");
            reporteJasper = PanelDetalle.class.getResourceAsStream("/Reportes/Reporte_Venta.jasper");

            if (logoEmpresa != null && logoFooter != null && reporteJasper != null) {
                for (ReporteVenta rv : reporteV) {
                    totalAPagar += rv.getTotal();
                }

                JasperReport report = (JasperReport) JRLoader.loadObject(reporteJasper);
                JRDataSource ds = new JRBeanArrayDataSource(reporteV.toArray());

                Map<String, Object> parameters = new HashMap<>();
                parameters.put("ds", ds);
                parameters.put("logoEmpresa", logoEmpresa);
                parameters.put("imagenAlternativa", logoFooter);
                parameters.put("totalAPagar", totalAPagar);

                JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());

                // Si ya existe una instancia del JasperViewer, lo cerramos antes de mostrar el nuevo informe
                if (jasperViewer != null) {
                    jasperViewer.setVisible(false);
                    jasperViewer.dispose();
                }

                // Creamos un nuevo JasperViewer para mostrar el informe
                jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setVisible(true);
            } else {
                System.out.println("No se puede generar el reporte.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar generar el reporte de ventas");
            e.printStackTrace();
        } finally {
            // Cerrar los flujos de recursos en el bloque finally
            if (logoEmpresa != null) {
                try {
                    logoEmpresa.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (logoFooter != null) {
                try {
                    logoFooter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reporteJasper != null) {
                try {
                    reporteJasper.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void listarVentas(JTable tabla) {
        modeloReporte = (DefaultTableModel) tabla.getModel();
        List<Venta> listaVenta = daoVenta.listarVenta();
        Object[] object = new Object[7];

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

            int idCliente = listaVenta.get(i).getIdCliente();
            String nombreCliente = daoVenta.obtenerNombreClientePorId(idCliente);
            object[1] = nombreCliente;

            int idEmpleado = listaVenta.get(i).getIdEmpleado();
            String nombreEmpleado = daoVenta.obtenerNombreEmpleadoPorId(idEmpleado);
            object[2] = nombreEmpleado;

            object[3] = listaVenta.get(i).getTipoComprobante();

            object[4] = listaVenta.get(i).getTotal();

            int idMetodoPago = listaVenta.get(i).getIdMetodoPago();
            String nombrePago = daoVenta.obtenerNombrePagoPorId(idMetodoPago);
            object[5] = nombrePago;

            object[6] = listaVenta.get(i).getFechaVenta();
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
