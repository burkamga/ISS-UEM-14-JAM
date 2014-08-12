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
public class CRUD_Vodataconsulta {

    //Salva Objeto Vodataconsulta no Banco
    public static boolean salvar(Vodataconsulta consulta) {
        boolean saida = true;
        Session sessao = null;
        Transaction transacao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(consulta);
            transacao.commit();
        } catch (HibernateException e) {
            saida = false;
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar a Consulta. Erro: "
                    + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                saida = false;
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de inserção, Mensagem: "
                        + e.getMessage());
            }
        }
        return saida;
    }

    public static boolean salvarNovaData(int intHora, Vodataconsulta diaConsulta, int idNovaCunsulta) {
        boolean retorno = false;
        switch (intHora) {
            case 0:
                diaConsulta.setA(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 1:
                diaConsulta.setB(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 2:
                diaConsulta.setC(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 3:
                diaConsulta.setD(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 4:
                diaConsulta.setE(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 5:
                diaConsulta.setF(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 6:
                diaConsulta.setG(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 7:
                diaConsulta.setH(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 8:
                diaConsulta.setI(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 9:
                diaConsulta.setJ(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 10:
                diaConsulta.setK(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 11:
                diaConsulta.setL(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 12:
                diaConsulta.setM(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 13:
                diaConsulta.setN(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 14:
                diaConsulta.setO(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 15:
                diaConsulta.setP(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 16:
                diaConsulta.setQ(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 17:
                diaConsulta.setR(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 18:
                diaConsulta.setS(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;
            case 19:
                diaConsulta.setT(idNovaCunsulta);
                salvar(diaConsulta);
                retorno = true;
                ;
                break;

            default:
                retorno = false;
                break;
        }
        return retorno;
    }

    public static boolean salvarDataConsulta(int intHora, Vodataconsulta diaConsulta, int idNovaCunsulta) {
        boolean retorno = false;
        switch (intHora) {
            case 0:
                diaConsulta.setA(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 1:
                diaConsulta.setB(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 2:
                diaConsulta.setC(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 3:
                diaConsulta.setD(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 4:
                diaConsulta.setE(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 5:
                diaConsulta.setF(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 6:
                diaConsulta.setG(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 7:
                diaConsulta.setH(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 8:
                diaConsulta.setI(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 9:
                diaConsulta.setJ(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 10:
                diaConsulta.setK(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 11:
                diaConsulta.setL(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 12:
                diaConsulta.setM(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 13:
                diaConsulta.setN(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 14:
                diaConsulta.setO(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 15:
                diaConsulta.setP(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 16:
                diaConsulta.setQ(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 17:
                diaConsulta.setR(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 18:
                diaConsulta.setS(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;
            case 19:
                diaConsulta.setT(idNovaCunsulta);
                atualizar(diaConsulta);
                retorno = true;
                ;
                break;

            default:
                retorno = false;
                break;
        }
        return retorno;
    }

    public static int getHoraId(int intHora, Vodataconsulta consulta) {
        Integer retorno;
        switch (intHora) {
            case 0:
                retorno = consulta.getA();
                break;
            case 1:
                retorno = consulta.getB();
                break;
            case 2:
                retorno = consulta.getC();
                
                break;
            case 3:
                retorno = consulta.getD();
                
                break;
            case 4:
                retorno = consulta.getE();
                
                break;
            case 5:
                retorno = consulta.getF();
                
                break;
            case 6:
                retorno = consulta.getG();
                
                break;
            case 7:
                retorno = consulta.getG();
                
                break;
            case 8:
                retorno = consulta.getI();
                
                break;
            case 9:
                retorno = consulta.getJ();
                
                break;
            case 10:
                retorno = consulta.getK();
                
                break;
            case 11:
                retorno = consulta.getL();
                
                break;
            case 12:
                retorno = consulta.getM();
                
                break;
            case 13:
                retorno = consulta.getN();
                
                break;
            case 14:
                retorno = consulta.getO();
                
                break;
            case 15:
                retorno = consulta.getP();
                
                break;
            case 16:
                retorno = consulta.getQ();
                
                break;
            case 17:
                retorno = consulta.getR();
                
                break;
            case 18:
                retorno = consulta.getS();
                
                break;
            case 19:
                retorno = consulta.getT();
                
                break;

            default:
                retorno = 0;
                break;
        }
        if (retorno == null){
            return 20;
        }else{
        return retorno;
        }
    }

    public static boolean retornaHoraLivre(int intHora, Vodataconsulta diaConsulta) {
        boolean retorno = false;
        switch (intHora) {
            case 0:
                if (diaConsulta.getA() != null) {
                    retorno = true;
                }
                ;
                break;
            case 1:
                if (diaConsulta.getB() != null) {
                    retorno = true;
                }
                ;
                break;
            case 2:
                if (diaConsulta.getC() != null) {
                    retorno = true;
                }
                ;
                break;
            case 3:
                if (diaConsulta.getD() != null) {
                    retorno = true;
                }
                ;
                break;
            case 4:
                if (diaConsulta.getE() != null) {
                    retorno = true;
                }
                ;
                break;
            case 5:
                if (diaConsulta.getF() != null) {
                    retorno = true;
                }
                ;
                break;
            case 6:
                if (diaConsulta.getG() != null) {
                    retorno = true;
                }
                ;
                break;
            case 7:
                if (diaConsulta.getH() != null) {
                    retorno = true;
                }
                ;
                break;
            case 8:
                if (diaConsulta.getI() != null) {
                    retorno = true;
                }
                ;
                break;
            case 9:
                if (diaConsulta.getJ() != null) {
                    retorno = true;
                }
                ;
                break;
            case 10:
                if (diaConsulta.getK() != null) {
                    retorno = true;
                }
                ;
                break;
            case 11:
                if (diaConsulta.getL() != null) {
                    retorno = true;
                }
                ;
                break;
            case 12:
                if (diaConsulta.getM() != null) {
                    retorno = true;
                }
                ;
                break;
            case 13:
                if (diaConsulta.getN() != null) {
                    retorno = true;
                }
                ;
                break;
            case 14:
                if (diaConsulta.getO() != null) {
                    retorno = true;
                }
                ;
                break;
            case 15:
                if (diaConsulta.getP() != null) {
                    retorno = true;
                }
                ;
                break;
            case 16:
                if (diaConsulta.getQ() != null) {
                    retorno = true;
                }
                ;
                break;
            case 17:
                if (diaConsulta.getR() != null) {
                    retorno = true;
                }
                ;
                break;
            case 18:
                if (diaConsulta.getS() != null) {
                    retorno = true;
                }
                ;
                break;
            case 19:
                if (diaConsulta.getT() != null) {
                    retorno = true;
                }
                ;
                break;

            default:
                retorno = false;
                break;
        }
        return retorno;
    }

    //Busca o objeto Vomedico através do ID
    public static Vodataconsulta buscarDataConsulta(String valor) {
        Vodataconsulta Dataconsulta = null;
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Vodataconsulta where Data = :parametro");
            consulta.setString("parametro", valor);
            Dataconsulta = (Vodataconsulta) consulta.uniqueResult();
            transacao.commit();
            return Dataconsulta;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar a Data Consulta. Erro: "
                    + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de buscar. Mensagem: "
                        + e.getMessage());
            }
        }
        return Dataconsulta;
    }

    //Lista todos as DataConsultas
    public static List<Vodataconsulta> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Vodataconsulta> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Vodataconsulta");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar DataConsulta. Erro: "
                    + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de DataConsulta. Mensagem: "
                        + e.getMessage());
            }
        }
    }

    //Atualiza os dados de Dataconsulta
    public static boolean atualizar(Vodataconsulta Dataconsulta) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(Dataconsulta);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível alterar os dados da Dataconsulta. Erro: "
                    + e.getMessage());
            saida = false;
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de atualização. "
                        + "Mensagem: " + e.getMessage());
                saida = false;
            }
        }
        return saida;
    }

    //Deleta um Dataconsulta
    public static boolean excluir(Vodataconsulta Dataconsulta) {
        Session sessao = null;
        Transaction transacao = null;
        boolean saida = true;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(Dataconsulta);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir a Dataconsulta. Erro: "
                    + e.getMessage());
            saida = false;
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: "
                        + e.getMessage());
                saida = false;
            }
        }
        return saida;
    }
}
