/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Vomedico;
import model.CRUD_Vomedico;

/**
 *
 * @author Maicon Henrique
 */
public class COMedico {
    
public static boolean addMedico(String nome, String rg, String cpf, 
                Date dataNascimento, String endereco, String telefone, 
                String celular, String email, String numCRM, 
                String especializacao, String username, String senha){
        
            //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
            Vomedico medico = new Vomedico();
            medico.setIdPessoa(null);
            medico.setNome(nome);
            medico.setRg(rg);
            medico.setCpf(cpf);
            medico.setDataNascimento(dataNascimento);
            medico.setEndereco(endereco);
            medico.setTelefone(telefone);
            medico.setCelular(celular);
            medico.setEmail(email);
            medico.setNumCrm(numCRM);
            medico.setEspecializacao(especializacao);
            medico.setUsename(username);
            medico.setSenha(senha);
    
            boolean resultado = CRUD_Vomedico.salvar(medico);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Médico Adicionado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Adiconar o Médico!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
    }

public static Vomedico buscaMedico(int medico){
   Vomedico retorno = CRUD_Vomedico.buscarMedico(medico);
   return retorno;
}

public static List<Vomedico> buscaMedicosNome (String medico){
    List<Vomedico> lista = CRUD_Vomedico.listar();
    List<Vomedico> saida = new ArrayList<>();
    for(Vomedico medico2 : lista){
        if(medico2.getNome().startsWith(medico)){
            saida.add(medico2);
        }
    }
    return saida;
}

public static boolean attMedico(int id, String nome, String rg, String cpf, 
                Date dataNascimento, String endereco, String telefone, 
                String celular, String email, String numCRM, 
                String especializacao, String username, String senha){
        
            //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
            Vomedico medico = buscaMedico(id);
            
            medico.setNome(nome);
            medico.setRg(rg);
            medico.setCpf(cpf);
            medico.setDataNascimento(dataNascimento);
            medico.setEndereco(endereco);
            medico.setTelefone(telefone);
            medico.setCelular(celular);
            medico.setEmail(email);
            medico.setNumCrm(numCRM);
            medico.setEspecializacao(especializacao);
            medico.setUsename(username);
            medico.setSenha(senha);
    
            boolean resultado = CRUD_Vomedico.atualizar(medico);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Médico Atualizado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Atualizar o Médico!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
    }

public static boolean excluiMedico(int id){
    Vomedico medico = CRUD_Vomedico.buscarMedico(id);
    boolean resultado = CRUD_Vomedico.excluir(medico);
    if(resultado){
                JOptionPane.showMessageDialog(null, "Médico Removido com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Remover o Médico!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
    
}
    
}
