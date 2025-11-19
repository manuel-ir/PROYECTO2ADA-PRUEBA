package vista;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

      public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIconoLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblIconoSobre = new javax.swing.JLabel();
        lblIconoCandado = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoPassword = new javax.swing.JPasswordField();
        lblMensajeRegistro = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoLogin.setText("IconoLogin");
        jPanel1.add(lblIconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, 100));

        btnLogin.setText("Login");
        btnLogin.addActionListener(this::btnLoginActionPerformed);
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 159, 59));

        lblIconoSobre.setText("Contraseña");
        jPanel1.add(lblIconoSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 38));

        lblIconoCandado.setText("Email");
        jPanel1.add(lblIconoCandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 71, 67));

        campoEmail.addActionListener(this::campoEmailActionPerformed);
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 177, 130, -1));

        campoPassword.addActionListener(this::campoPasswordActionPerformed);
        jPanel1.add(campoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 228, 130, -1));

        lblMensajeRegistro.setText("¿No tienes cuenta?");
        jPanel1.add(lblMensajeRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(this::btnRegistroActionPerformed);
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
       
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPasswordActionPerformed
       
    }//GEN-LAST:event_campoPasswordActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       
    }//GEN-LAST:event_btnRegistroActionPerformed

   
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
    
    public javax.swing.JButton getBtnLogin() {
        return btnLogin;
    }

    public javax.swing.JButton getBtnRegistro() {
        return btnRegistro;
    }
            
    public void mostrarMensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIconoCandado;
    private javax.swing.JLabel lblIconoLogin;
    private javax.swing.JLabel lblIconoSobre;
    private javax.swing.JLabel lblMensajeRegistro;
    // End of variables declaration//GEN-END:variables
}
