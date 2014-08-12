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
public class CRUD_Voprontuario {
    
    //Salva Objeto Voprontuario no Banco
    public static boolean salvar  (Voprontuario prontuario){
        boolean saida = true;
        Session sessao = null;
        Transaction transacao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(prontuario);
            transacao.commit();
            } catch (HibernateException e) {
                saida = false;
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o Prontuario. Erro: "+
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
    
    
    //Busca o objeto Vomedico através do ID
    public static Voprontuario buscarProntuario(int valor) {
        Voprontuario prontuario = null;
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        try {
            sessao = HibernateUtil.getSessionFactory() .openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Voprontuario where idProntuario = :parametro");
            consulta.setInteger("parametro", valor);
            prontuario = (Voprontuario) consulta.uniqueResult();
            transacao.commit();
            return prontuario;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar Prontuario. Erro: "+
            e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de buscar. Mensagem: "+
                e.getMessage());
            }
        }
        return prontuario;
    }
    
    //Lista todos os médicos
    public static List<Voprontuario> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Voprontuario> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Voprontuario");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar Secretárias. Erro: "+
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
    public static boolean atualizar(Voprontuario prontuario) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(prontuario);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível alterar os dados do Prontuario. Erro: "+
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
    public static boolean excluir(Voprontuario prontuario) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao. delete(prontuario) ;
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir a Prontuario. Erro: "+
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
