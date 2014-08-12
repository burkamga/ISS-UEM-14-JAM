/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Secretaria;

import javax.swing.JPopupMenu;
import model.Vopaciente;
import view.Login;

/**
 *
 * @author Maicon Henrique
 */
public class TelaBuscaRetornaPacienteParaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecretaria
     */
    public TelaBuscaRetornaPacienteParaConsulta(Vopaciente paciente) {
        initComponents();
        TbBuscaPaciente.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txBuscaPaciente = new javax.swing.JLabel();
        BuscarPaciente = new javax.swing.JPanel();
        txNome = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmpID = new javax.swing.JTextField();
        txID = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscaPaciente = new javax.swing.JTable();
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

        txBuscaPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txBuscaPaciente.setText("Buscar Paciente");

        txNome.setText("Nome:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txID.setText("ID:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ID");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nome");

        jLabel1.setText("Buscar por:");

        TbBuscaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TbBuscaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbBuscaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbBuscaPaciente);

        javax.swing.GroupLayout BuscarPacienteLayout = new javax.swing.GroupLayout(BuscarPaciente);
        BuscarPaciente.setLayout(BuscarPacienteLayout);
        BuscarPacienteLayout.setHorizontalGroup(
            BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarPacienteLayout.createSequentialGroup()
                        .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(100, 100, 100)
                                .addComponent(jButton3))
                            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                                .addComponent(cmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpNome))))
                    .addGroup(BuscarPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap())
        );
        BuscarPacienteLayout.setVerticalGroup(
            BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txID)
                    .addComponent(cmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNome)
                    .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnPacientes.setText("Pacientes");
        mnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPacientesActionPerformed(evt);
            }
        });

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
                    .addComponent(BuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txBuscaPaciente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txBuscaPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void mnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPacientesActionPerformed

    private void TbBuscaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscaPacienteMouseClicked

    }//GEN-LAST:event_TbBuscaPacienteMouseClicked

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TbBuscaPaciente.setVisible(true);
        revalidate();
        JPopupMenu popup = new JPopupMenu();
        popup.add(TbBuscaPaciente);
        popup.show(jButton1, 10, 10);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TbBuscaPaciente.setVisible(false);
        revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //TODO
    }//GEN-LAST:event_jButton3ActionPerformed

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
                new TelaBuscaRetornaPacienteParaConsulta(new Vopaciente()).setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuscarPaciente;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JTable TbBuscaPaciente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cmpID;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnPacientes;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenu mnutilitarios;
    private javax.swing.JMenuItem smnBuscarConsulta;
    private javax.swing.JMenuItem smnBuscarPaciente;
    private javax.swing.JMenuItem smnConsultas;
    private javax.swing.JMenuItem smnEnvioEmail;
    private javax.swing.JMenuItem smnLogoff;
    private javax.swing.JMenuItem smnNovaConsulta;
    private javax.swing.JMenuItem smnNovoPaciente;
    private javax.swing.JMenuItem smnSair;
    private javax.swing.JLabel txBuscaPaciente;
    private javax.swing.JLabel txID;
    private javax.swing.JLabel txNome;
    // End of variables declaration//GEN-END:variables

}