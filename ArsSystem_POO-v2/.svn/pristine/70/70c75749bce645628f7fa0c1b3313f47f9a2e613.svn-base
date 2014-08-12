/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import arssystem_poo.v2.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Maicon Henrique
 */
public class CRUD_Vomedico {
    
    //Salva Objeto Vomedico no Banco
    public static boolean salvar  (Vomedico medico){
        boolean saida = true;
        Session sessao = null;
        Transaction transacao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(medico);
            transacao.commit();
            } catch (HibernateException e) {
                saida = false;
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o médico. Erro: "+
                e.getMessage());
            } finally {
                try {
                    sessao.close();
                } catch (Throwable e) {
                    saida = false;
                    JOptionPane.showMessageDialog(null, "Erro ao fechar operação de inserção, Mensagem: "+
                    e.getMessage());
                }
        }
        return saida;
    }
    
    public static boolean verificaLoginMed(String username, String password){
        boolean saida = false;
        List<Vomedico> lista = listar();
        for (Vomedico med : lista) {
            if(username.equals(med.getUsename()) && (password.equals(med.getSenha()))){
                saida = true;  
            }
        }
        return saida;
    }
    
    //Busca o objeto Vomedico através do ID
    public static Vomedico buscarMedico(int valor) {
        Vomedico medico = null;
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        try {
            sessao = HibernateUtil.getSessionFactory() .openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Vomedico where Pessoa_idPessoa = :parametro");
            consulta.setInteger("parametro", valor);
            medico = (Vomedico) consulta.uniqueResult();
            transacao.commit();
            return medico;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar Médico. Erro: "+
            e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de buscar. Mensagem: "+
                e.getMessage());
            }
        }
        return medico;
    }
    
    //Lista todos os médicos
    public static List<Vomedico> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Vomedico> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Vomedico");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar Médicos. Erro: "+
            e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de consulta. Mensagem: "+
                e.getMessage());
            }
        }
    }
    
    //Atualiza os dados de um médico
    public static boolean atualizar(Vomedico medico) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(medico);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível alterar os dados do médico. Erro: "+
            e.getMessage());
            saida = false;
        } finally {
            try{
                sessao.close();
                } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de atualização. "
                        + "Mensagem: " + e.getMessage());
                saida = false;
            }
        }
        return saida;
        }
    
    //Deleta um médico
    public static boolean excluir(Vomedico medico) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao. delete(medico) ;
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o medico. Erro: "+
            e.getMessage());
            saida = false;
        } finally {
            try{
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: "+
                e.getMessage());
                saida = false;
                }
        }
        return saida;
        }
    
}
