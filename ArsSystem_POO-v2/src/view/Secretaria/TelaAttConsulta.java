/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Secretaria;

import control.COMedico;
import control.COPaciente;
import model.Voconsultas;
import model.Vosecretaria;
import view.Login;

/**
 *
 * @author Maicon Henrique
 */
public class TelaAttConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecretaria
     */
    public TelaAttConsulta(Voconsultas consulta) {
        initComponents();
        cmpPaciente.setText(COPaciente.buscaPaciente(consulta.getIdpaciente()).getNome());
        cmpMedico.setText(COMedico.buscaMedico(consulta.getIdmedico()).getNome());
        cmpData.setText(consulta.getData());
        cbHorario.setSelectedIndex(consulta.getHora());
        if(consulta.getTipoConsulta()==0){
            rbTipoConsultaNormal.setSelected(true);
            rbTipoConsultaRetorno.setSelected(false);
        }else{
            rbTipoConsultaRetorno.setSelected(true);
            rbTipoConsultaNormal.setSelected(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoConsulta = new javax.swing.ButtonGroup();
        txNovaConsulta = new javax.swing.JLabel();
        NovaConsulta = new javax.swing.JPanel();
        txPaciente = new javax.swing.JLabel();
        cmpPaciente = new javax.swing.JTextField();
        txRG = new javax.swing.JLabel();
        cmpMedico = new javax.swing.JTextField();
        txTipoConsulta = new javax.swing.JLabel();
        btCancelarConsultas = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btBuscarPaciente = new javax.swing.JButton();
        btBuscarMedico = new javax.swing.JButton();
        rbTipoConsultaNormal = new javax.swing.JRadioButton();
        rbTipoConsultaRetorno = new javax.swing.JRadioButton();
        txDataConsulta = new javax.swing.JLabel();
        txDataConsulta3 = new javax.swing.JLabel();
        btSalvarAlterações = new javax.swing.JButton();
        cbHorario = new javax.swing.JComboBox();
        txDataConsulta4 = new javax.swing.JLabel();
        dcDataConsulta = new com.toedter.calendar.JDateChooser();
        cmpData = new javax.swing.JTextField();
        txDataConsulta1 = new javax.swing.JLabel();
        txDataConsulta5 = new javax.swing.JLabel();
        cbHorarioNovo = new javax.swing.JComboBox();
        txDataConsulta6 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        mnPacientes = new javax.swing.JMenu();
        smnNovoPaciente = new javax.swing.JMenuItem();
        smnBuscarPaciente = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        smnNovaConsulta = new javax.swing.JMenuItem();
        smnBuscarConsulta = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        smnConsultas = new javax.swing.JMenuItem();
        mnutilitarios = new javax.swing.JMenu();
        smnEnvioEmail = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        smnLogoff = new javax.swing.JMenuItem();
        smnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARS System");

        txNovaConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txNovaConsulta.setText("Consulta");

        txPaciente.setText("Paciente");

        txRG.setText("Médico");

        txTipoConsulta.setText("Tipo de Consulta:");

        btCancelarConsultas.setText("Cancelar Consulta");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btBuscarPaciente.setText("Buscar");
        btBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPacienteActionPerformed(evt);
            }
        });

        btBuscarMedico.setText("Buscar");

        bgTipoConsulta.add(rbTipoConsultaNormal);
        rbTipoConsultaNormal.setText("Normal");

        bgTipoConsulta.add(rbTipoConsultaRetorno);
        rbTipoConsultaRetorno.setText("Retorno");

        txDataConsulta.setText("A Consulta é para o Dia:");

        txDataConsulta3.setText(", às");

        btSalvarAlterações.setText("Salvar Alterações");

        cbHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:30" }));

        txDataConsulta4.setText("hs.");

        cmpData.setEditable(false);

        txDataConsulta1.setText("Será Alterada para:");

        txDataConsulta5.setText(", às");

        cbHorarioNovo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:30" }));

        txDataConsulta6.setText("hs.");

        javax.swing.GroupLayout NovaConsultaLayout = new javax.swing.GroupLayout(NovaConsulta);
        NovaConsulta.setLayout(NovaConsultaLayout);
        NovaConsultaLayout.setHorizontalGroup(
            NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NovaConsultaLayout.createSequentialGroup()
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpMedico)
                                    .addComponent(cmpPaciente)))
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addComponent(txTipoConsulta)
                                .addGap(30, 30, 30)
                                .addComponent(rbTipoConsultaNormal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTipoConsultaRetorno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscarPaciente)
                            .addComponent(btBuscarMedico)))
                    .addGroup(NovaConsultaLayout.createSequentialGroup()
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addComponent(btSalvarAlterações)
                                .addGap(72, 72, 72)
                                .addComponent(btCancelarConsultas))
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addComponent(txDataConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpData, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addComponent(txDataConsulta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(btCancelar))
                            .addGroup(NovaConsultaLayout.createSequentialGroup()
                                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NovaConsultaLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txDataConsulta3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txDataConsulta4))
                                    .addGroup(NovaConsultaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txDataConsulta5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbHorarioNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txDataConsulta6)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        NovaConsultaLayout.setVerticalGroup(
            NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPaciente)
                    .addComponent(cmpPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txRG)
                    .addComponent(cmpMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarMedico))
                .addGap(12, 12, 12)
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTipoConsultaNormal)
                    .addComponent(rbTipoConsultaRetorno)
                    .addComponent(txTipoConsulta))
                .addGap(21, 21, 21)
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDataConsulta)
                    .addComponent(txDataConsulta3)
                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDataConsulta4)
                    .addComponent(cmpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NovaConsultaLayout.createSequentialGroup()
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDataConsulta1))
                        .addGap(18, 18, 18)
                        .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelarConsultas)
                            .addComponent(btCancelar)
                            .addComponent(btSalvarAlterações)))
                    .addGroup(NovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txDataConsulta5)
                        .addComponent(cbHorarioNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txDataConsulta6)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        mnPacientes.setText("Pacientes");

        smnNovoPaciente.setText("Novo");
        smnNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnNovoPacienteActionPerformed(evt);
            }
        });
        mnPacientes.add(smnNovoPaciente);

        smnBuscarPaciente.setText("Buscar");
        smnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnBuscarPacienteActionPerformed(evt);
            }
        });
        mnPacientes.add(smnBuscarPaciente);

        MenuPrincipal.add(mnPacientes);

        mnConsultas.setText("Consultas");

        smnNovaConsulta.setText("Nova");
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

        MenuPrincipal.add(mnConsultas);

        mnRelatorios.setText("Relatórios");

        smnConsultas.setText("Consultas");
        smnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnConsultasActionPerformed(evt);
            }
        });
        mnRelatorios.add(smnConsultas);

        MenuPrincipal.add(mnRelatorios);

        mnutilitarios.setText("Utilitários");

        smnEnvioEmail.setText("Envio de Email/SMS");
        smnEnvioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEnvioEmailActionPerformed(evt);
            }
        });
        mnutilitarios.add(smnEnvioEmail);

        MenuPrincipal.add(mnutilitarios);

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

        MenuPrincipal.add(mnSistema);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txNovaConsulta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNovaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void smnNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnNovoPacienteActionPerformed
        TelaAddPaciente TelaAdPaciente = new TelaAddPaciente();
        TelaAdPaciente.setLocationRelativeTo(null);
        TelaAdPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnNovoPacienteActionPerformed

    private void smnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnBuscarPacienteActionPerformed
        TelaBuscaListaPaciente TelaBusca = new TelaBuscaListaPaciente();
        TelaBusca.setLocationRelativeTo(null);
        TelaBusca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnBuscarPacienteActionPerformed

    private void smnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnNovaConsultaActionPerformed
        TelaAddConsulta TelaAddConsulta = new TelaAddConsulta();
        TelaAddConsulta.setLocationRelativeTo(null);
        TelaAddConsulta.setVisible(true);
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

    private void smnEnvioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEnvioEmailActionPerformed
        TelaEnvioEmailSMS TelaEnvioMsg = new TelaEnvioEmailSMS();
        TelaEnvioMsg.setLocationRelativeTo(null);
        TelaEnvioMsg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnEnvioEmailActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        TelaSecretaria TelaSecretaria = new TelaSecretaria();
        TelaSecretaria.setLocationRelativeTo(null);
        TelaSecretaria.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPacienteActionPerformed
        TelaBuscaRetornaPaciente TelaBuscaPaciente = new TelaBuscaRetornaPaciente();
        TelaBuscaPaciente.setLocationRelativeTo(null);
        TelaBuscaPaciente.setVisible(true);
    }//GEN-LAST:event_btBuscarPacienteActionPerformed

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
                new TelaAttConsulta(new Voconsultas()).setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JPanel NovaConsulta;
    private javax.swing.ButtonGroup bgTipoConsulta;
    private javax.swing.JButton btBuscarMedico;
    private javax.swing.JButton btBuscarPaciente;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelarConsultas;
    private javax.swing.JButton btSalvarAlterações;
    private javax.swing.JComboBox cbHorario;
    private javax.swing.JComboBox cbHorarioNovo;
    private javax.swing.JTextField cmpData;
    private javax.swing.JTextField cmpMedico;
    private javax.swing.JTextField cmpPaciente;
    private com.toedter.calendar.JDateChooser dcDataConsulta;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnPacientes;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenu mnutilitarios;
    private javax.swing.JRadioButton rbTipoConsultaNormal;
    private javax.swing.JRadioButton rbTipoConsultaRetorno;
    private javax.swing.JMenuItem smnBuscarConsulta;
    private javax.swing.JMenuItem smnBuscarPaciente;
    private javax.swing.JMenuItem smnConsultas;
    private javax.swing.JMenuItem smnEnvioEmail;
    private javax.swing.JMenuItem smnLogoff;
    private javax.swing.JMenuItem smnNovaConsulta;
    private javax.swing.JMenuItem smnNovoPaciente;
    private javax.swing.JMenuItem smnSair;
    private javax.swing.JLabel txDataConsulta;
    private javax.swing.JLabel txDataConsulta1;
    private javax.swing.JLabel txDataConsulta3;
    private javax.swing.JLabel txDataConsulta4;
    private javax.swing.JLabel txDataConsulta5;
    private javax.swing.JLabel txDataConsulta6;
    private javax.swing.JLabel txNovaConsulta;
    private javax.swing.JLabel txPaciente;
    private javax.swing.JLabel txRG;
    private javax.swing.JLabel txTipoConsulta;
    // End of variables declaration//GEN-END:variables

}
