/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import dao.EmployeeDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Employee;

/**
 *
 * @author Vinícius Giles
 */
public class CriarEmpregado extends javax.swing.JFrame {

    /**
     * Creates new form CriarEmpregado
     */
    public CriarEmpregado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NovoEmpregadoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NovoEmpregadoCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NovoEmpregadoRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NovoEmpregadoSexo = new javax.swing.JComboBox<>();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NovoEmpregadoSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NovoEmpregadoCPFGerente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar novo empregado");

        jLabel1.setText("Nome");

        NovoEmpregadoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoEmpregadoNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("RG");

        NovoEmpregadoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoEmpregadoRGActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo");

        NovoEmpregadoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        NovoEmpregadoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoEmpregadoSexoActionPerformed(evt);
            }
        });

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Salário");

        jLabel6.setText("CPF do Gerente");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cadastro de empregado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NovoEmpregadoCPFGerente)
                            .addComponent(NovoEmpregadoSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NovoEmpregadoRG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NovoEmpregadoCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NovoEmpregadoSalario)
                            .addComponent(NovoEmpregadoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoEmpregadoCPFGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoEmpregadoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoEmpregadoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoEmpregadoRGActionPerformed

    private void NovoEmpregadoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoEmpregadoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoEmpregadoSexoActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // TODO add your handling code here:
        Connection conn;
        try {
            conn = new ConnectionDB().getConnection();
            
            String nome = NovoEmpregadoNome.getText();
            String cpf = NovoEmpregadoCPF.getText();
            String rg = NovoEmpregadoRG.getText();
            String sexo = NovoEmpregadoSexo.getSelectedItem().toString().substring(0,1);
            int salario = Integer.parseInt(NovoEmpregadoSalario.getText());
            String cpf_gerente = NovoEmpregadoCPFGerente.getText();
            
            try {
                EmployeeDAO.adicionaEmpregado(conn, cpf, rg, nome, sexo, salario, cpf_gerente);
                // Alerta usuario e fecha janela de criacao
                JOptionPane.showMessageDialog(null, "Empregado cadastrado com sucesso. Atualize a lista de empregados para visualizar as modificações.");
             
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro! " + e.getMessage());
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CriarEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CriarEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void NovoEmpregadoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoEmpregadoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoEmpregadoNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CriarEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarEmpregado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JTextField NovoEmpregadoCPF;
    private javax.swing.JTextField NovoEmpregadoCPFGerente;
    private javax.swing.JTextField NovoEmpregadoNome;
    private javax.swing.JTextField NovoEmpregadoRG;
    private javax.swing.JTextField NovoEmpregadoSalario;
    private javax.swing.JComboBox<String> NovoEmpregadoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
