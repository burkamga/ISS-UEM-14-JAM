/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Medico;

import control.COConsulta;
import control.COPaciente;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import model.CRUD_Voconsultas;
import model.CRUD_Voprontuario;
import model.Vopaciente;
import model.Voprontuario;
import view.Secretaria.*;
import view.Login;
import view.TableModelPaciente;

/**
 *
 * @author Maicon Henrique
 */
public class TelaAddProntuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecretaria
     */
    public TelaAddProntuario() {
        initComponents();
        cmpIdConsulta.setVisible(false);
    }
    public TelaAddProntuario(int idConsulta) {
        this();
        String id = String.valueOf(idConsulta);
        cmpIdConsulta.setText(id);
        cmpIdConsulta.setVisible(true);
    }
    
    private JTable tbBuscaPaciente = new JTable();
    private JButton SelectPaciente = new JButton();
    private Vopaciente selectedPaciente;
    
    JPopupMenu popup1 = new JPopupMenu();
    
    private TableModelPaciente tbModelPaciente;
    
    private TableModelPaciente getTableModel_NOME(){
        if(tbModelPaciente == null){
            tbModelPaciente = new TableModelPaciente(criaPaciente_NOME());
        }
        return tbModelPaciente;
    }
    
    private List<Vopaciente> criaPaciente_NOME() {
        List<Vopaciente> pacientes = COPaciente.buscaPacientesNome(cmpPaciente.getText());
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

        txTituloProntuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmpPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSintomas = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDiagnostico = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPrescricao = new javax.swing.JTextArea();
        btBuscarPaciente = new javax.swing.JButton();
        txIdConsulta = new javax.swing.JLabel();
        cmpIdConsulta = new javax.swing.JTextField();
        btBuscarIdConsulta = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimparDados = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPacientes = new javax.swing.JMenu();
        smnDadosAdicionais = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        smnNovaConsulta = new javax.swing.JMenuItem();
        smnBuscarConsulta = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        mnutilitarios = new javax.swing.JMenu();
        smnEnvioEmailSms = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        smnLogoff = new javax.swing.JMenuItem();
        smnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARS System");

        txTituloProntuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txTituloProntuario.setText("Prontuário Médico");

        jLabel4.setText("Nome do Paciente:");

        jLabel5.setText("Sintomas:");

        taSintomas.setColumns(20);
        taSintomas.setRows(5);
        jScrollPane1.setViewportView(taSintomas);

        jLabel6.setText("Diagnóstico:");

        taDiagnostico.setColumns(20);
        taDiagnostico.setRows(5);
        jScrollPane2.setViewportView(taDiagnostico);

        jLabel7.setText("Prescrição Médica:");

        taPrescricao.setColumns(20);
        taPrescricao.setRows(5);
        jScrollPane3.setViewportView(taPrescricao);

        btBuscarPaciente.setText("Buscar");
        btBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPacienteActionPerformed(evt);
            }
        });

        txIdConsulta.setText("ID da Consulta:");

        btBuscarIdConsulta.setText("Buscar");
        btBuscarIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarIdConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarPaciente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txIdConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscarIdConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txIdConsulta)
                    .addComponent(cmpIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarIdConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPaciente))
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
                .addContainerGap())
        );

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimparDados.setText("Limpar Campos");
        btLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

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
                    .addComponent(txTituloProntuario)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btSalvar)
                .addGap(112, 112, 112)
                .addComponent(btLimparDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txTituloProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimparDados)
                    .addComponent(btCancelar))
                .addGap(36, 36, 36))
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
        TelaAddProntuario TelaAddProntuario = new TelaAddProntuario();
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

    private void mnutilitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnutilitariosActionPerformed
        //TODO
    }//GEN-LAST:event_mnutilitariosActionPerformed

    private void smnEnvioEmailSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEnvioEmailSmsActionPerformed
        TelaEnvioEmailSMS TelaEnvioMsg = new TelaEnvioEmailSMS();
        TelaEnvioMsg.setLocationRelativeTo(null);
        TelaEnvioMsg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_smnEnvioEmailSmsActionPerformed

    private void btBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPacienteActionPerformed
        tbBuscaPaciente.setModel(getTableModel_NOME());
        tbModelPaciente.limpar();
        tbModelPaciente.addListaDePacientes(criaPaciente_NOME());
        if((tbModelPaciente.getRowCount() == 0) || ("".equals(cmpPaciente.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "Paciente não Encontrada!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            tbBuscaPaciente.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbBuscaPaciente.getColumnModel().getColumn(1).setPreferredWidth(250);
            SelectPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectPacienteActionPerformed(evt);
            }
        });
            SelectPaciente.setText("Selecionar");
            popup1.add(tbBuscaPaciente);
            popup1.add(SelectPaciente);
            popup1.show(btBuscarPaciente, 20, 20);
        }
    }//GEN-LAST:event_btBuscarPacienteActionPerformed

    private void btLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDadosActionPerformed
        taDiagnostico.setText(null);
        taPrescricao.setText(null);
        taSintomas.setText(null);
        cmpPaciente.setText(null);
    }//GEN-LAST:event_btLimparDadosActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        TelaMedico TelaMedico = new TelaMedico();
        TelaMedico.setLocationRelativeTo(null);
        TelaMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Voprontuario NovoProntuario = new Voprontuario();
        int id = Integer.parseInt(cmpIdConsulta.getText());
        NovoProntuario.setVoconsulta(id);
        NovoProntuario.setDiagnostico(taDiagnostico.getText());
        NovoProntuario.setSintomas(taSintomas.getText());
        NovoProntuario.setTratamento(taSintomas.getText());
        NovoProntuario.setVopaciente(selectedPaciente.getIdPessoa().intValue());
        boolean saida = CRUD_Voprontuario.salvar(NovoProntuario);
        if(saida){
            JOptionPane.showMessageDialog(taSintomas, "Prontuário Cadastrado com Sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btBuscarIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarIdConsultaActionPerformed
        TelaBuscaConsulta novaTela = new TelaBuscaConsulta();
        novaTela.setLocationRelativeTo(this);
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBuscarIdConsultaActionPerformed

    private void btSelectPacienteActionPerformed(java.awt.event.ActionEvent evt) {
        int indiceLinha = tbBuscaPaciente.getSelectedRow();
        selectedPaciente = tbModelPaciente.getPaciente(indiceLinha);
        cmpPaciente.setText(selectedPaciente.getNome());
        popup1.setVisible(false);
        
       
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
                TelaAddProntuario telaMedico = new TelaAddProntuario();
                telaMedico.setLocationRelativeTo(null);
                telaMedico.setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarIdConsulta;
    private javax.swing.JButton btBuscarPaciente;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimparDados;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cmpIdConsulta;
    private javax.swing.JTextField cmpPaciente;
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
    private javax.swing.JMenuItem smnDadosAdicionais;
    private javax.swing.JMenuItem smnEnvioEmailSms;
    private javax.swing.JMenuItem smnLogoff;
    private javax.swing.JMenuItem smnNovaConsulta;
    private javax.swing.JMenuItem smnSair;
    private javax.swing.JTextArea taDiagnostico;
    private javax.swing.JTextArea taPrescricao;
    private javax.swing.JTextArea taSintomas;
    private javax.swing.JLabel txIdConsulta;
    private javax.swing.JLabel txTituloProntuario;
    // End of variables declaration//GEN-END:variables

}
