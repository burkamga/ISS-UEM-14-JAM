/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import arssystem_poo.v2.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;


/**
 *
 * @author Maicon Henrique
 */
public class CRUD_Voadm {
    
    public static List<Voadm> listarADM(){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Voadm> resultado = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Voadm");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel buscar o username. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexao ao BD. Erro: " + e.getMessage());
            }
        }
    }
    
    public static boolean verificaLoginAdm(String username, String password){
        boolean saida = false;
        List<Voadm> lista = listarADM();
        for (Voadm adm : lista) {
            if(username.equals(adm.getUsername()) && (password.equals(adm.getSenha()))){
                saida = true;  
            }
        }
        return saida;
    }
    
}
