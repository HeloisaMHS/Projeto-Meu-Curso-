/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.BDusuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Heloisa Souza
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Login() {
        initComponents();
        Color vinho = new Color(66,0,0);
        this.getContentPane().setBackground(vinho);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        imgLog = new javax.swing.JLabel();
        jlPer = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbLogar = new javax.swing.JButton();
        jtEmail = new javax.swing.JTextField();
        jtSenha = new javax.swing.JPasswordField();
        jbloginps = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(66, 0, 0));

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(77, 51, 25), 6));

        imgLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons8-usuário-100 (2).png"))); // NOI18N

        jlPer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlPer.setForeground(new java.awt.Color(66, 0, 0));
        jlPer.setText("Login");

        jlEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(66, 0, 0));
        jlEmail.setText("Email:");

        jlSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(66, 0, 0));
        jlSenha.setText("Senha:");

        jbCancelar.setBackground(new java.awt.Color(153, 102, 51));
        jbCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setLabel("Cancelar");
        jbCancelar.setMaximumSize(new java.awt.Dimension(70, 25));
        jbCancelar.setMinimumSize(new java.awt.Dimension(70, 25));
        jbCancelar.setPreferredSize(new java.awt.Dimension(88, 25));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbLogar.setBackground(new java.awt.Color(153, 102, 51));
        jbLogar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbLogar.setForeground(new java.awt.Color(255, 255, 255));
        jbLogar.setText("Logar");
        jbLogar.setToolTipText("");
        jbLogar.setPreferredSize(new java.awt.Dimension(88, 25));
        jbLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogarActionPerformed(evt);
            }
        });

        jtEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEmail)
                            .addComponent(jtSenha)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(jlPer)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(imgLog)
                        .addGap(141, 141, 141))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(imgLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        jbloginps.setBackground(new java.awt.Color(153, 102, 51));
        jbloginps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbloginps.setForeground(new java.awt.Color(255, 255, 255));
        jbloginps.setText("Login Psicólogo");
        jbloginps.setMaximumSize(new java.awt.Dimension(70, 25));
        jbloginps.setMinimumSize(new java.awt.Dimension(70, 25));
        jbloginps.setPreferredSize(new java.awt.Dimension(88, 25));
        jbloginps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbloginpsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jbloginps, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbloginps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jbLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogarActionPerformed
        String login = jtEmail.getText();
        String senha = new String(jtSenha.getPassword());
        BDusuario bd = new BDusuario();
        int codigo = -1;
        
        try { // faz a busca no BD
            codigo = bd.verificaUsuario(login, senha);
        } catch (InstantiationException ex) {
            System.err.println(ex);
        }
          if (codigo != -1) { // Administrador do sistema
            // limpa os dados
            jtSenha.setText("");
            jtEmail.setText("");
            // cria a nova janela
            dispose();
            PainelAtividades obj = new PainelAtividades();
            obj.setVisible(this.rootPaneCheckingEnabled);
            
        }
        else{ // Usuário não cadastrado
            JOptionPane.showMessageDialog(rootPane, "Usuário não cadastrado",
                    "Alerta de erro", JOptionPane.ERROR_MESSAGE);
            // Volta o cursor para o campo código
            jtSenha.setText("");
            jtEmail.selectAll();
            jtEmail.requestFocusInWindow();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbLogarActionPerformed

    private void jbloginpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbloginpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbloginpsActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgLog;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLogar;
    private javax.swing.JButton jbloginps;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlPer;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
