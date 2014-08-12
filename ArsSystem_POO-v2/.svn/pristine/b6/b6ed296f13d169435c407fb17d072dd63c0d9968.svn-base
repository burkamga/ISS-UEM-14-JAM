/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.CRUD_Voadm;
import model.CRUD_Vomedico;
import model.CRUD_Vosecretaria;
import model.Vosecretaria;
import view.Medico.TelaMedico;
import view.Secretaria.TelaSecretaria;
import view.adm.TelaAdm;


/**
 *
 * @author Maicon Henrique
 */
public class COLogin {
    
    public static boolean verificaLogin(int tipoPessoa, String username, String password){
        boolean saida = false;
        Vosecretaria saida0 = null;
        
        if(tipoPessoa == 2){
            saida = CRUD_Voadm.verificaLoginAdm(username, password);
            if (saida){
                TelaAdm TelaAdm = new TelaAdm();
                TelaAdm.setLocationRelativeTo(null);
                TelaAdm.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto!");
            }
        }else{
            if(tipoPessoa == 1){
                saida = CRUD_Vomedico.verificaLoginMed(username, password);
                if (saida){
                    TelaMedico TelaMed = new TelaMedico();
                    TelaMed.setLocationRelativeTo(null);
                    TelaMed.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto!");
                }
            }else{
                saida = CRUD_Vosecretaria.verificaLoginSec(username, password);
                if (saida){
                    TelaSecretaria TelaSec = new TelaSecretaria();
                    TelaSec.setLocationRelativeTo(null);
                    TelaSec.setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto!");
                }
            }
        }
        
        return saida;
            
        
    }
    
}
