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
public class CRUD_Voconsultas {
   
    //Salva Objeto Voconsultas no Banco
    public static boolean salvar (Voconsultas consultas){
        boolean saida = true;
        Session sessao = null;
        Transaction transacao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(consultas);
            transacao.commit();
            } catch (HibernateException e) {
                saida = false;
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar a Consulta. Erro: "+
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
    

    
    //Busca o objeto Voconsulta através do ID
    public static Voconsultas buscarConsulta(int valor) {
        Voconsultas consultas = null;
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        try {
            sessao = HibernateUtil.getSessionFactory() .openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Voconsultas where VOConsultasId = :parametro");
            consulta.setInteger("parametro", valor);
            consultas = (Voconsultas) consulta.uniqueResult();
            transacao.commit();
            return consultas;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar Consulta. Erro: "+
            e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de buscar. Mensagem: "+
                e.getMessage());
            }
        }
        return consultas;
    }
    
    //Lista todos as consultas
    public static List<Voconsultas> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Voconsultas> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Voconsultas");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar a Consulta. Erro: "+
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
    public static boolean atualizar(Voconsultas consultas) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(consultas);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível alterar os dados da consulta. Erro: "+
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
    public static boolean excluir(Voconsultas consultas) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao. delete(consultas) ;
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir a Consulta. Erro: "+
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
