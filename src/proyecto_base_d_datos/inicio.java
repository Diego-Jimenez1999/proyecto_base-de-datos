/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base_d_datos;

import Animaton_componentes.AnimationClass;
import clases.Usuario;
import clases.connection_mysql;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

/**
 *
 * @author Asus-PC
 */
public class inicio extends javax.swing.JFrame {

    AnimationClass animacion = new AnimationClass();

    int iterador = 0;
    String color_Lnegroo = "#000000";
    String color_Lfantasta = "#818181";
    connection_mysql mysql = new connection_mysql("root", "", "proyecto");
    Usuario u = new Usuario();

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.M_mensaje();
        this.iniciarJPasswordField();
        jTextFiel_BR1.setCaretPosition(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel1 = new jpanel.Jpanel();
        jpanel2 = new jpanel.Jpanel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jTextFiel_BR1 = new JTextField.jTextFiel_BR();
        jPasswordRound_BD1 = new JPassword.JPasswordRound_BD();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1064, 745));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel1.setBackground(new java.awt.Color(231, 230, 232));
        jpanel1.setPreferredSize(new java.awt.Dimension(333, 467));

        jSeparator6.setBackground(new java.awt.Color(111, 115, 131));

        jButton1.setText("ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFiel_BR1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFiel_BR1FocusLost(evt);
            }
        });
        jTextFiel_BR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFiel_BR1MouseClicked(evt);
            }
        });

        jPasswordRound_BD1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordRound_BD1FocusLost(evt);
            }
        });
        jPasswordRound_BD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordRound_BD1MouseClicked(evt);
            }
        });
        jPasswordRound_BD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordRound_BD1ActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(111, 115, 131));

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFiel_BR1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(jSeparator6))
                    .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPasswordRound_BD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTextFiel_BR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordRound_BD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 169, 204));
        jLabel1.setText("Iniciar sección");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 169, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("               Abajo            ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, -440, 333, 467));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        iterador++;
        if (iterador == 1) {
            animacion.jPanelYabajo(-440, -10, 5, 10, jpanel1);
            jLabel3.setText("Arriba");
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            System.out.println("jpanel Abajo");
        } else {
            animacion.jPanelYArriba(-10, -440, 5, 10, jpanel1);
            System.out.println("jpanel Arriba");
            jLabel3.setText("Arriba");
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            iterador = 0;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        animacion.jPanelYArriba(-10, -440, 5, 10, jpanel1);
        iterador = 0;
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPasswordRound_BD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordRound_BD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordRound_BD1ActionPerformed

    private void jTextFiel_BR1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFiel_BR1FocusLost
        this.M_mensaje();
    }//GEN-LAST:event_jTextFiel_BR1FocusLost

    private void jTextFiel_BR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFiel_BR1MouseClicked
        this.B_mensaje();
        jTextFiel_BR1.setCaretPosition(0);
    }//GEN-LAST:event_jTextFiel_BR1MouseClicked

    private void jPasswordRound_BD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordRound_BD1MouseClicked
        this.B_mensajee();
        jPasswordRound_BD1.setEchoChar('•');
    }//GEN-LAST:event_jPasswordRound_BD1MouseClicked

    private void jPasswordRound_BD1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordRound_BD1FocusLost
        iniciarJPasswordField();
    }//GEN-LAST:event_jPasswordRound_BD1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mysql.MySQL_connection();
        String ID = jTextFiel_BR1.getText();
        String password = jPasswordRound_BD1.getText();
        String tabla = "usuarios";

        u = mysql.getDt_usuario(tabla, ID, password);

        if ((password.trim().length() != 0) && (ID.trim().length() != 0)) {
            if (u != null) {
                jTextFiel_BR1.setText("");
                jPasswordRound_BD1.setText("");

                consulta pr = new consulta();
                this.setVisible(false);
                pr.setVisible(true);

                mysql.cerrar_connection();
            } else {

                jLabel4.setText("usuario no existente");
            }
        } else if (ID.trim().length() == 0) {
            jLabel4.setText("llene los campos vacios");
            jTextFiel_BR1.setBackground(new Color(249, 107, 107));
        } else if (password.trim().length() == 0) {
            jLabel4.setText("llene los campos vacios");
            jPasswordRound_BD1.setBackground(new Color(249, 107, 107));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void M_mensaje() {
        if (jTextFiel_BR1.getText().length() == 0) {

            jTextFiel_BR1.setForeground(Color.decode(color_Lfantasta));
            jTextFiel_BR1.setText("Correo");
        }
    }

    public void M_mensajee() {
        if (jPasswordRound_BD1.getText().length() == 0) {

            jPasswordRound_BD1.setForeground(Color.decode(color_Lfantasta));
            jPasswordRound_BD1.setText("Contreña");
        }
    }

    public void B_mensaje() {
        String l;
        if (jTextFiel_BR1.getText().length() != 0) {
            jTextFiel_BR1.setText("");
            jTextFiel_BR1.setForeground(Color.decode(color_Lnegroo));
        }
    }
    
    
    public void B_mensajee() {
        String l;
        if (jPasswordRound_BD1.getText().length() != 0) {
            jPasswordRound_BD1.setText("");
            jPasswordRound_BD1.setForeground(Color.decode(color_Lnegroo));
        }
    }

    public void iniciarJPasswordField() {

        String mensajePass = jPasswordRound_BD1.getText();
        if (mensajePass.equals(null) || mensajePass.equals("")) {//SOLO SE INICIA EL PLACEHOLDER SI NO EXISTE TEXTO EN EL PASSWORDFIELD

            this.M_mensajee();
            jPasswordRound_BD1.setEchoChar((char) 0); //SE CONVIERTE A LETRAS LO QUE ENVIAMOS AL JPASSWORDFIELD

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private JPassword.JPasswordRound_BD jPasswordRound_BD1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private JTextField.jTextFiel_BR jTextFiel_BR1;
    private jpanel.Jpanel jpanel1;
    private jpanel.Jpanel jpanel2;
    // End of variables declaration//GEN-END:variables
}
