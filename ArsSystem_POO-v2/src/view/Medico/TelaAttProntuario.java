/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Medico;

import model.Vopaciente;
import model.Voprontuario;
import view.Secretaria.*;
import view.Login;

/**
 *
 * @author Maicon Henrique
 */
public class TelaAttProntuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecretaria
     */
    public TelaAttProntuario() {
        initComponents();
    }

    TelaAttProntuario(Voprontuario selectedPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //String id1 = String.valueOf(selectedPaciente.getVoconsulta());
        //String id2 = String.valueOf(selectedPaciente.getIdProntuario());
        //cmpIdConsulta.setText(id2);
        
        
        //cmpIdProntuario.setText(id2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txTituloProntuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmpIdConsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSintomas = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDiagnosticos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPrecriscao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmpIdProntuario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPacientes = new javax.swing.JMenu();
        smnDadosAdicionais = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        smnNovaConsulta = new javax.swing.JMenuItem();
        smnBuscarConsulta = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        smnConsultas = new javax.swing.JMenuItem();
        mnutilitarios = new javax.swing.JMenu();
        smnEnvioEmailSms = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        smnLogoff = new javax.swing.JMenuItem();
        smnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARS System");

        txTituloProntuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txTituloProntuario.setText("Prontuário Médico");

        jLabel2.setText("Consulta Nº");

        jLabel4.setText("Nome do Paciente:");

        jLabel5.setText("Sintomas:");

        taSintomas.setColumns(20);
        taSintomas.setRows(5);
        jScrollPane1.setViewportView(taSintomas);

        jLabel6.setText("Diagnóstico:");

        taDiagnosticos.setColumns(20);
        taDiagnosticos.setRows(5);
        jScrollPane2.setViewportView(taDiagnosticos);

        jLabel7.setText("Prescrição Médica:");

        taPrecriscao.setColumns(20);
        taPrecriscao.setRows(5);
        jScrollPane3.setViewportView(taPrecriscao);

        jButton2.setText("Salvar Alterações");

        jButton3.setText("Limpar Campos");

        jButton4.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpNome))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(73, 73, 73)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setText("Prontuário Nº");

        mnPacientes.setText("Pacientes");

        smnDadosAdicionais.setText("Dados Adicionais");
        smnDadosAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDadosAdicionaisActionPerformed(evt);
            }
        });
        mnPacientes.add(smnDadosAdicionais);

        jMenuBar1.add(mnPacientes);

        mnConsultas.setText("Prontuarios");

        smnNovaConsulta.setText("Novo");
        smnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnNovaConsultaActionPerformed(evt);
            }
        });
        mnConsultas.add(smnNovaConsulta);

        smnBuscarConsulta.setText("Buscar");
        smnBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnBuscarConsultaActionPerformed(evt);
            }
        });
        mnConsultas.add(smnBuscarConsulta);

        jMenuBar1.add(mnConsultas);

        mnRelatorios.setText("Relatórios");

        smnConsultas.setText("Consultas");
        smnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnConsultasActionPerformed(evt);
            }
        });
        mnRelatorios.add(smnConsultas);

        jMenuBar1.add(mnRelatorios);

        mnutilitarios.setText("Utilitários");
        mnutilitarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnutilitariosActionPerformed(evt);
            }
        });

        smnEnvioEmailSms.setText("Envio de Email/SMS");
        smnEnvioEmailSms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEnvioEmailSmsActionPerformed(evt);
            }
        });
        mnutilitarios.add(smnEnvioEmailSms);

        jMenuBar1.add(mnutilitarios);

        mnSistema.setText("Sistema");

        smnLogoff.setText("Logoff");
        smnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnLogoffActionPerformed(evt);
            }
        });
        mnSistema.add(smnLogoff);

        smnSair.setText("Sair");
        smnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnSairActionPerformed(evt);
            }
        });
        mnSistema.add(smnSair);

        jMenuBar1.add(mnSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txTituloProntuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpIdProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTituloProntuario)
                    .addComponent(jLabel1)
                    .addComponent(cmpIdProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_smnSairActionPerformed

    private void smnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnLogoffActionPerformed
       Login TelaLogin = new Login();
       TelaLogin.setLocationRelativeTo(null);
       TelaLogin.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_smnLogoffActionPerformed

    private void smnDadosAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDadosAdicionaisActionPerformed
        TelaAttPacienteDA novaTelaPacienteDA = new TelaAttPacienteDA();
        novaTelaPacienteDA.setLocationRelativeTo(null);
        novaTelaPacienteDA.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_smnDadosAdicionaisActionPerformed

    private void smnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnNovaConsultaActionPerformed
        TelaAttProntuario TelaAddProntuario = new TelaAttProntuario();
        TelaAddProntuario.setLocationRelativeTo(null);
        TelaAddProntuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnNovaConsultaActionPerformed

    private void smnBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnBuscarConsultaActionPerformed
        TelaBuscaConsulta TelaBuscaConsulta = new TelaBuscaConsulta();
        TelaBuscaConsulta.setLocationRelativeTo(null);
        TelaBuscaConsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnBuscarConsultaActionPerformed

    private void smnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnConsultasActionPerformed
        TelaConsultasProxDia TelaProxConsultas = new TelaConsultasProxDia();
        TelaProxConsultas.setLocationRelativeTo(null);
        TelaProxConsultas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnConsultasActionPerformed

    private void mnutilitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnutilitariosActionPerformed
        //TODO
    }//GEN-LAST:event_mnutilitariosActionPerformed

    private void smnEnvioEmailSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEnvioEmailSmsActionPerformed
        TelaEnvioEmailSMS TelaEnvioMsg = new TelaEnvioEmailSMS();
        TelaEnvioMsg.setLocationRelativeTo(null);
        TelaEnvioMsg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnEnvioEmailSmsActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAttProntuario telaMedico = new TelaAttProntuario();
                telaMedico.setLocationRelativeTo(null);
                telaMedico.setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmpIdConsulta;
    private javax.swing.JTextField cmpIdProntuario;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnPacientes;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenu mnutilitarios;
    private javax.swing.JMenuItem smnBuscarConsulta;
    private javax.swing.JMenuItem smnConsultas;
    private javax.swing.JMenuItem smnDadosAdicionais;
    private javax.swing.JMenuItem smnEnvioEmailSms;
    private javax.swing.JMenuItem smnLogoff;
    private javax.swing.JMenuItem smnNovaConsulta;
    private javax.swing.JMenuItem smnSair;
    private javax.swing.JTextArea taDiagnosticos;
    private javax.swing.JTextArea taPrecriscao;
    private javax.swing.JTextArea taSintomas;
    private javax.swing.JLabel txTituloProntuario;
    // End of variables declaration//GEN-END:variables

}