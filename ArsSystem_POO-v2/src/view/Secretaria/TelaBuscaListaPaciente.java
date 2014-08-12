/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Secretaria;

import control.COPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Vopaciente;
import view.Login;
import view.TableModelPaciente;

/**
 *
 * @author Maicon Henrique
 */
public class TelaBuscaListaPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecretaria
     */
    public TelaBuscaListaPaciente() {
        initComponents();
        TbBuscaPaciente.setVisible(false);
    }
    
    private TableModelPaciente tbModelPaciente;
    
    private TableModelPaciente getTableModel_ID(){
        if(tbModelPaciente == null){
            tbModelPaciente = new TableModelPaciente(criaPaciente_ID());
        }
        return tbModelPaciente;
    }
    
    private TableModelPaciente getTableModel_NOME(){
        if(tbModelPaciente == null){
            tbModelPaciente = new TableModelPaciente(criaPaciente_NOME());
        }
        return tbModelPaciente;
    }
    
    private List<Vopaciente> criaPaciente_ID() {
        List<Vopaciente> pacientes = new ArrayList<>();
        int i = Integer.parseInt(cmpID.getText().toString());
        Vopaciente resultado = COPaciente.buscaPaciente(i);
        pacientes.add(resultado);
        return pacientes;
    }
    
        private List<Vopaciente> criaPaciente_NOME() {
        List<Vopaciente> pacientes = COPaciente.buscaPacientesNome(cmpNome.getText());
        return pacientes;
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
        btBuscar = new javax.swing.JButton();
        btLimparCampos = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        cmpID = new javax.swing.JTextField();
        txID = new javax.swing.JLabel();
        rbID = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        txBuscar = new javax.swing.JLabel();
        spPaciente = new javax.swing.JScrollPane();
        TbBuscaPaciente = new javax.swing.JTable();
        btSelecionaPaciente = new javax.swing.JButton();
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

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btLimparCampos.setText("Limpar Campos");
        btLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparCamposActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txID.setText("ID:");

        buttonGroup1.add(rbID);
        rbID.setText("ID");

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome");

        txBuscar.setText("Buscar por:");

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
        spPaciente.setViewportView(TbBuscaPaciente);

        btSelecionaPaciente.setText("Seleciona Paciente");
        btSelecionaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionaPacienteActionPerformed(evt);
            }
        });

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
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimparCampos)
                                .addGap(100, 100, 100)
                                .addComponent(btCancelar))
                            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                                .addComponent(cmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpNome))))
                    .addGroup(BuscarPacienteLayout.createSequentialGroup()
                        .addComponent(txBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSelecionaPaciente)))
                .addContainerGap())
        );
        BuscarPacienteLayout.setVerticalGroup(
            BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPacienteLayout.createSequentialGroup()
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbID)
                    .addComponent(rbNome)
                    .addComponent(txBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txID)
                    .addComponent(cmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNome)
                    .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btLimparCampos)
                    .addComponent(btCancelar))
                .addGap(18, 18, 18)
                .addComponent(spPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSelecionaPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(BuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(rbID.isSelected()){
            String vid = "";
            if((vid).equals(cmpID.getText())){
                JOptionPane.showMessageDialog(rootPane, "O Campo ID não pode ser Vazio!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }else{
                //Seta o TableModel 
                TbBuscaPaciente.setModel(getTableModel_ID());
                tbModelPaciente.limpar();
                tbModelPaciente.addListaDePacientes(criaPaciente_ID());
                if(criaPaciente_ID() != null){
                    spPaciente.setVisible(true);
                    TbBuscaPaciente.setVisible(true);
                    revalidate();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Paciente não Encontrada!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }

            }
            
        }else{
            if(rbNome.isSelected()){
                TbBuscaPaciente.setModel(getTableModel_NOME());
                tbModelPaciente.limpar();
                tbModelPaciente.addListaDePacientes(criaPaciente_NOME());
                if(tbModelPaciente.getValueAt(0, 0) == null){
                    JOptionPane.showMessageDialog(rootPane, "Paciente não Encontrada!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    spPaciente.setVisible(true);
                    TbBuscaPaciente.setVisible(true);
                    revalidate();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Escolha entre ID ou NOME para Buscar!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparCamposActionPerformed
        cmpID.setText(null);
        cmpNome.setText(null);
        revalidate();
    }//GEN-LAST:event_btLimparCamposActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        TelaSecretaria TelaSecretaria = new TelaSecretaria();
        TelaSecretaria.setLocationRelativeTo(null);
        TelaSecretaria.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSelecionaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaPacienteActionPerformed
        int indiceLinha = TbBuscaPaciente.getSelectedRow();
        //Verifica Linha Selecionada
        if(indiceLinha != -1){
            Vopaciente selectedPaciente = tbModelPaciente.getPaciente(indiceLinha);
            TelaAttPaciente NovaTelaAttPaciente = new TelaAttPaciente(selectedPaciente);
            NovaTelaAttPaciente.setLocationRelativeTo(null);
            NovaTelaAttPaciente.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione ao menos um Paciente!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSelecionaPacienteActionPerformed

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
                new TelaBuscaListaPaciente().setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuscarPaciente;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JTable TbBuscaPaciente;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimparCampos;
    private javax.swing.JButton btSelecionaPaciente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cmpID;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnPacientes;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenu mnutilitarios;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JMenuItem smnBuscarConsulta;
    private javax.swing.JMenuItem smnBuscarPaciente;
    private javax.swing.JMenuItem smnConsultas;
    private javax.swing.JMenuItem smnEnvioEmail;
    private javax.swing.JMenuItem smnLogoff;
    private javax.swing.JMenuItem smnNovaConsulta;
    private javax.swing.JMenuItem smnNovoPaciente;
    private javax.swing.JMenuItem smnSair;
    private javax.swing.JScrollPane spPaciente;
    private javax.swing.JLabel txBuscaPaciente;
    private javax.swing.JLabel txBuscar;
    private javax.swing.JLabel txID;
    private javax.swing.JLabel txNome;
    // End of variables declaration//GEN-END:variables

}