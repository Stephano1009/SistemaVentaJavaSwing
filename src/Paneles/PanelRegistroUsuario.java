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

public class PanelRegistroUsuario extends javax.swing.JPanel {

    UsuarioDao daoUsuario = new UsuarioDao(); //instanciamos la clase UsuarioDao
    Usuario u = new Usuario(); //instanciamos la clase Usuario
    CargoDao cargoDao = new CargoDao(); //instanciamos la clase CargoDao

    public PanelRegistroUsuario() {
        initComponents();
      /*Traemos los datos, al ejecutar el programa, método definido 
        en la clase que se encarga de cargar los cargos disponibles 
        en un objeto JComboBox.*/
        cargarCargos(); 
        
    }
    public void cargarCargos() {
        /*Creamos una lista de objetos de la clase Cargo llamada listaCargos,
        y asignamos el resultado de llamar al método listarCargo de la instancia
        cargoDao. Este método devuelve obtiene los cargos almacenados en la base
        de datos y los devuelve como una lista de objetos*/
        List<Cargo> listaCargos = cargoDao.listarCargo();
        
        /*Luego, iteramos cada objeto de la clase Cargo en la lista llamada listaCargos.
        En cada iteración que de, asignaremos el objeto actual en la variable cargoUsu*/
        for (Cargo cargoUsu : listaCargos) {
            
            /*Aqui agregamos un nuevo ítem al ComboBox que se llama cboCargoUsuario,
            El nombre del cargo obtenido a través del método getNombreCargo() del 
            objeto cargoUsu se agrega como un nuevo ítem en el ComboBox.*/
            cboCargoUsuario.addItem(cargoUsu.getNombreCargo());
        }
    }
    
    /*El método getCboCargoUsuario() es un método getter que devuelve el objeto 
    JComboBox cboCargoUsuario*/
    
    /*este método permite obtener una referencia al JComboBox cboCargoUsuario 
    desde fuera de la clase PanelRegistroUsuario. Al llamar a este método, se 
    devuelve el objeto JComboBox, lo que permite acceder a sus propiedades y 
    métodos, como obtener el elemento seleccionado, agregar nuevos elementos, 
    entre otros.*/
    public JComboBox getCboCargoUsuario() {
        return cboCargoUsuario;
    }
    
    
    private PanelUsuario panelUsuario; //Declaramos una variable de tipo PanelUsuario llamada panelUsuario

    public void setPanelUsuario(PanelUsuario panelUsuario) { //Definimos un método llamado setPanelUsuario que toma un parámetro de tipo PanelUsuario llamado panelUsuario
        this.panelUsuario = panelUsuario; //Asignamos el valor del parámetro panelUsuario al atributo panelUsuario de la clase
        //Con esto, se establece la referencia al objeto PanelUsuario
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
        //verificamos si los datos ingresados son válidos. Si el resultado de validarDatos() es false, significa que faltan datos o no son válidos.
        if (validarDatos() == false) {
            //Si faltan datos o no son válidos, se muestra un mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        }
        agregarUsuario(); //Si los datos son válidos, se llama a un método llamado 
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        actualizarUsuario(); //Este método se encarga de realizar la actualización de los datos del usuario en base de datos.
        Window window = SwingUtilities.getWindowAncestor(this); // Utilizamos la clase SwingUtilities para obtener la ventana padre del panel actual. 
        if (window instanceof JDialog) { // Verificamos si la ventana padre es una instancia de JDialog, es decir, si es un cuadro de diálogo.
            JDialog dialog = (JDialog) window; //Si la ventana padre es un JDialog, se realiza un casting para convertir la ventana en un objeto JDialog 
            //y se guarda en una variable llamada dialog.
            dialog.dispose(); // Cierra el cuadro de diálogo
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    public void agregarUsuario() {
        String nomUsu = txtNombreUsuario.getText(); //obtenemos el texto ingresado y lo asignamos el nomUsu
        char[] claUsu = pswClaveUsuario.getPassword(); //obtenemos la contraseña ingresada y lo guardamos en un arreglo de caracteres en claUsu
        String claveString = new String(claUsu); //Convertimos el arreglo de caracteres en un objeto de tipo String 'claveString', representando la contraseña en una cadena de texto
        int idCargo = cboCargoUsuario.getSelectedIndex(); // Obtener el ID del cargo seleccionado en el JCombox y lo guardamos en idCargo
        boolean esUsu = chkActivoUsuario.isSelected(); //verifica si el Checkbox esta seleccionado y lo guarda en la variable esUsu

        u.setNombreUsuario(nomUsu);
        u.setClaveUsuario(claveString);
        u.setIdCargo(idCargo);
        u.setEstadoUsuario(esUsu);

        /*llamamos al metood agregarUsu en el objeto daoUsuario pasándole como argumento el objeto 'u'. 
        Este método se encarga de agregar el usuario en la base de datos y devuelve una respuesta*/
        int respuesta = daoUsuario.agregarUsu(u);
        
        /*si la respuesta de agregarUsu(u) es igual a 1, muestra un mensaje de éxito
        indicando que el usuario se agregó correctamente. Si la respuesta no es 1, 
        muestra un mensaje de error.*/
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private boolean validarDatos() {
        if (txtNombreUsuario.getText().isEmpty()) { //si el campo de texto txtNombreUsuario esta vació
            return false; //retorna un false, indicando que los datos no son válidos
        }
        if (pswClaveUsuario.getPassword().length == 0) { //si el campo de contraseña no tiene caracteres, es decir la longitud es 0
            return false; //retorna un false, indicando que el campo está vacío
        }
        if (cboCargoUsuario.getSelectedIndex() == -1) { //si no se ha seleccionado ningun item del combo
            return false; //retorna un false, indicando que no se ha seleccionado un item del comboBox
        }
        return true; //Si ninguna de las condiciones anteriores se cumple, retorna true, indicando que los datos son válidos
    }

    public void actualizarUsuario() {
        int id = Integer.parseInt(txtCodigoUsuario.getText()); //Obtiene el texto del campo y lo convierte a un entero, guardando el valor en la variable "id".
        String nombreUsuario = txtNombreUsuario.getText(); //Obtiene el texto del campo y lo guarda en la variable "nombreUsuario".
        char[] claveUsuario = pswClaveUsuario.getPassword(); // Obtiene la contraseña ingresada por el usuario y la guarda en una matriz de caracteres llamada "claveUsuario".
        String contraString = new String(claveUsuario); //Creamos una nueva instancia de la clase String a partir de la matriz de caracteres "claveUsuario"
        //permite obtener la contraseña como una cadena de caracteres en la variable "contraString".
        Object valor = cboCargoUsuario.getSelectedItem(); // Obtener el valor seleccionado de una lista desplegable y guarda en la variable "valor".
        //El tipo de datos de "valor" es Object, por lo que es necesario realizar una conversión si se desea utilizar de alguna manera específica.
        int idCargo = daoUsuario.obtenerIdCargoPorNombreCargo(valor.toString()); //Utilizamos el objeto llamado daoUsuario, para invocar al método obtenerIdCargoPorNombreCargo.
        //El valor seleccionado es convertido a una cadena de caracteres utilizando el método "toString() y se guarda en la variable "idCargo".
        boolean estadoUsuario = chkActivoUsuario.isSelected(); //Obtiene el estado del checkbox y lo guarda en la variable "estadoUsuario".

        u.setIdUsuario(id);
        u.setNombreUsuario(nombreUsuario);
        u.setClaveUsuario(contraString);
        u.setIdCargo(idCargo);
        u.setEstadoUsuario(estadoUsuario);

        int r = daoUsuario.actualizarUsuario(u); //Utilizamos el objeto "daoUsuario" para llamar al método "actualizarUsuario()" y pasarle como argumento el objeto "u"
        //que contiene los datos actualizados del usuario. El resultado de la actualización se guarda en la variable "r" que indica la cantidad de filas afectadas por la actualización.
        
        
        //Se muestra un mensaje de éxito o error en una ventana emergente (JOptionPane) dependiendo del valor de "r".
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario");
        }
        
        //deshabilita el botón "btnGuardarUsuario", presumiblemente para evitar múltiples actualizaciones repetidas o no deseadas.
        btnGuardarUsuario.setEnabled(false);
    }
    
    public void setDatosEditar(Usuario u) {
        txtCodigoUsuario.setText(Integer.toString(u.getIdUsuario())); //Establecemos el texto del campo con el valor del identificador único del usuario
        //El valor se convierte a una cadena de caracteres utilizando "Integer.toString()" antes de establecerlo en el campo.
        txtNombreUsuario.setText(u.getNombreUsuario()); //Establecemos el texto del campo con el valor del nombre del usuario, obtenido a través del método 
        //"getNombreUsuario()" del objeto "u".
        pswClaveUsuario.setText(u.getClaveUsuario()); //Establecemos el texto del campo de contraseña con el valor de la contraseña del usuario, obtenido a 
        //través del método "getClaveUsuario()" del objeto "u".

        // Cargar nombre del cargo en el comboBox
        int idCargo = u.getIdCargo(); //obtienemos el identificador único del cargo del usuario, a través del método "getIdCargo()" del objeto "u", y lo guarda en la variable "idCargo".
        String nombreCargo = daoUsuario.obtenerNombreCargoPorId(idCargo); //Utilizamos el objeto llamado "daoUsuario" para llamar al método "obtenerNombreCargoPorId()"
        //y le pasamos como argumento el identificador único del cargo. Obtiene el nombre del cargo asociado al identificador y lo guarda en la variable "nombreCargo".
        cboCargoUsuario.setSelectedItem(nombreCargo); //Seleccionamos el ítem en el componente de lista desplegable "cboCargoUsuario" que coincide con el nombre del cargo 

        // Establecer estado del usuario
        chkActivoUsuario.setSelected(u.isEstadoUsuario()); //Establecemos el estado del checkbox en función del valor del estado del usuario, obtenido a través del método "isEstadoUsuario()
        //del objeto "u". Si el estado es true, el checkbox se seleccionará; de lo contrario, no estará seleccionado.
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
    public javax.swing.JTextField txtCodigoUsuario;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
 }
