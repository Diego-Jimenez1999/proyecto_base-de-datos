package proyecto_base_d_datos;

import clases.connection_mysql;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Actualizar2 extends javax.swing.JFrame {
    connection_mysql c_MysQl  =new connection_mysql();


private int localidad;
private int problema;

    public Actualizar2() {
        initComponents();
    }
    
    public Actualizar2(String id) {
        //int encuesta = Integer.parseInt(id);
        initComponents();
        setLocationRelativeTo(null);
        jLabel2.setText(id);
        c_MysQl.MySQL_connection("root", "proyecto", "");
        jTextField1.setText(c_MysQl.getDato(id, "Nombre"));
        jTextField2.setText(c_MysQl.getDato(id, "Correo"));
        jTextField3.setText(c_MysQl.getDato(id, "Telefono"));
        jComboBox1.setSelectedItem(mostrarlocalidad(c_MysQl.getDato(id, "Localidad")));
        jComboBox2.setSelectedItem(mostrarProblema(c_MysQl.getDato(id, "Problema")));
        c_MysQl.cerrar_connection();
    }
    
    
     public Actualizar2(String id,int n){
     
        initComponents();
        setLocationRelativeTo(null);
        jLabel2.setText(id);
        c_MysQl.MySQL_connection("root", "proyecto", "");
        jTextField1.setText(c_MysQl.getDato(id, "Nombre"));
        jTextField2.setText(c_MysQl.getDato(id, "Correo"));
        jTextField3.setText(c_MysQl.getDato(id, "Telefono"));
        jComboBox1.setSelectedItem(mostrarlocalidad(c_MysQl.getDato(id, "Localidad")));
        jComboBox2.setSelectedItem(mostrarProblema(c_MysQl.getDato(id, "Problema")));
        c_MysQl.cerrar_connection();
        
        if(n==1){
          jPanel1.setBackground(Color.decode("#212121"));
          jLabel8.setForeground(Color.decode("#FAFBE9"));
          jLabel2.setForeground(new Color(255,255,255));
        
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(580, 355));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 251, 233));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 115, 131));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(111, 115, 131));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(111, 115, 131));
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(111, 115, 131));
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(111, 115, 131));
        jLabel6.setText("Localidad");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(111, 115, 131));
        jLabel7.setText("Problema");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(280, 29));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USAQUEN", "CHAPINERO", "SANTA FE", "SAN CRISTOBAL", "USME", "TUNJUELITO", "BOSA", "KENNEDY", "FONTIBON", "ENGATIVA", "SUBA", "BARRIOS UNIDOS", "TEUSAQUILLO", "LOS MARTIRES", "ANTONIO NARIÑO", "PUENTE ARANDA", "CANDELARIA", "RAFAEL URIBE", "CIUDAD BOLIVAR" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALUD", "ECONOMIA", "SEGURIDAD" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jButton1.setToolTipText("cerrar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1615555872188.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 169, 204));
        jLabel8.setText("Actualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163)
                                .addComponent(jButton1)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
     
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int localidad = 0;
        String eleccion = jComboBox1.getSelectedItem().toString();
        switch (eleccion){
            case "USAQUEN":
                localidad = 1;
                break;
                
            case "CHAPINERO":
                localidad = 2;
                break;
                
            case "SANTA FE":
                localidad = 3;
                break;
                            
            case "SAN CRISTOBAL":
                localidad = 4;
                break;
                
            case "USME":
                localidad = 5;
                break;
                
            case "TUNJUELITO":
                localidad = 6;
                break;
                            
            case "BOSA":
                localidad = 7;
                break;
                
            case "KENNEDY":
                localidad = 8;
                break;
                
            case "FONTIBON":
                localidad = 9;
                break;
                            
            case "ENGATIVA":
                localidad = 10;
                break;
                
            case "SUBA":
                localidad = 11;
                break;
                
            case "BARRIOS UNIDOS":
                localidad = 12;
                break;
                            
            case "TEUSAQUILLO":
                localidad = 13;
                break;
                
            case "LOS MARTIRES":
                localidad = 14;
                break;
                
            case "ANTONIO NARIÑO":
                localidad = 15;
                break;
                            
            case "PUENTE ARANDA":
                localidad = 16;
                break;
                
            case "CANDELARIA":
                localidad = 17;
                break;
                
            case "RAFAEL URIBE":
                localidad = 18;
                break;
             
            case "CIUDAD BOLIVAR":
                localidad = 19;
                break;
        }
        this.localidad = localidad;
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int problema = 0;
        String eleccion = jComboBox2.getSelectedItem().toString();
        switch (eleccion){
            case "SALUD":
                problema = 1;
                break;
                
            case "ECONOMIA":
                problema = 2;
                break;
                
            case "SEGURIDAD":
                problema = 3;
                break;
        }
        this.problema = problema;
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        vaciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c_MysQl.MySQL_connection("root", "proyecto", "");
        c_MysQl.setDato(jLabel2.getText(), "Nombre",jTextField1.getText());
        c_MysQl.setDato(jLabel2.getText(), "Correo",jTextField2.getText());
        int telefono = Integer.parseInt(jTextField3.getText());  
        c_MysQl.setNum(jLabel2.getText(),"Telefono",telefono);
        c_MysQl.setNum(jLabel2.getText(), "Localidad",this.localidad);
        c_MysQl.setNum(jLabel2.getText(), "Problema",this.problema);
        JOptionPane.showMessageDialog(null, "Datos actualizados con exito");
        vaciar();
     
        setVisible(false);
        
        c_MysQl.cerrar_connection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       jButton2.setBackground(Color.decode("#50C850"));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       jButton2.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton2MouseExited

    public String mostrarlocalidad(String localidad){
        String eleccion = "";
        switch (localidad){
            
            case "1":
                eleccion = "USAQUEN";
                break;
                
            case "2":
                eleccion = "CHAPINERO";
                break;
                
            case "3":
                eleccion = "SANTA FE";
                break;
                            
            case "4":
                eleccion = "SAN CRISTOBAL";
                break;
                
            case "5":
                eleccion = "USME";
                break;
                
            case "6":
                eleccion = "TUNJUELITO";
                break;
                            
            case "7":
                eleccion = "BOSA";
                break;
                
            case "8":
                eleccion = "KENNEDY";
                break;
                
            case "9":
                eleccion = "FONTIBON";
                break;
                            
            case "10":
                eleccion = "ENGATIVA";
                break;
                
            case "11":
                eleccion = "SUBA";
                break;
                
            case "12":
                eleccion = "BARRIOS UNIDOS";
                break;
                            
            case "13":
                eleccion = "TEUSAQUILLO";
                break;
                
            case "14":
                eleccion = "LOS MARTIRES";
                break;
                
            case "15":
                eleccion = "ANTONIO NARIÑO";
                break;
                            
            case "16":
                eleccion = "PUENTE ARANDA";
                break;
                
            case "17":
                eleccion = "CANDELARIA";
                break;
                
            case "18":
                eleccion = "RAFAEL URIBE";
                break;
             
            case "19":
                eleccion = "CIUDAD BOLIVAR";
                break;
        }
        return eleccion;
 
    }
    
    public String mostrarProblema(String problema){
        String eleccion = "";
        switch (problema){
            
            case "1":
                eleccion = "SALUD";
                break;
                
            case "2":
                eleccion = "ECONOMIA";
                break;
                
            case "3":
                eleccion = "SEGURIDAD";
                break;
        }
        return eleccion;
    }
    
    public void vaciar (){
        jLabel1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedItem("");
        jComboBox2.setSelectedItem("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
