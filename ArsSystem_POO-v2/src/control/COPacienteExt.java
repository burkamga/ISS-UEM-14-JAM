/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.CRUD_Vopaciente;
import model.CRUD_Vopacienteext;
import model.Vopaciente;
import model.Vopacienteext;

/**
 *
 * @author Maicon Henrique
 */
public class COPacienteExt {
    
    public static boolean addPaciente(String nome, String rg, String cpf, 
            Date dataNascimento, String endereco, String telefone, String celular, String email, String plano){
        
        //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
        Vopaciente paciente = new Vopaciente();
        paciente.setNome(nome);
        paciente.setRg(rg);
        paciente.setCpf(cpf);
        paciente.setDataNascimento(dataNascimento);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setCelular(celular);
        paciente.setEmail(email);
        paciente.setTipoConvenio(plano);
        
        boolean resultado = CRUD_Vopaciente.salvar(paciente);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Paciente Adicionado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Adiconar o Paciente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
    }
    
    public static boolean attPaciente(int id, String nome, String rg, String cpf, 
            Date dataNascimento, String endereco, String telefone, String celular, String email, String plano){
        
        //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
        Vopaciente paciente = CRUD_Vopaciente.buscarPaciente(id);
        paciente.setNome(nome);
        paciente.setRg(rg);
        paciente.setCpf(cpf);
        paciente.setDataNascimento(dataNascimento);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setCelular(celular);
        paciente.setEmail(email);
        paciente.setTipoConvenio(plano);
        
        boolean resultado = CRUD_Vopaciente.atualizar(paciente);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Paciente Atualizado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Atualizado o Paciente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
    }
    
    public static boolean excluiPaciente(int id){
    Vopaciente medico = CRUD_Vopaciente.buscarPaciente(id);
    boolean resultado = CRUD_Vopaciente.excluir(medico);
    if(resultado){
                JOptionPane.showMessageDialog(null, "Paciente Removido com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Remover o Paciente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return resultado;
}
    
    public static Vopacienteext buscaPaciente(int paciente){
        Vopacienteext retorno = CRUD_Vopacienteext.buscarPaciente(paciente);
   return retorno;
}

public static List<Vopaciente> buscaPacientesNome (String paciente){
    List<Vopaciente> lista = CRUD_Vopaciente.listar();
    List<Vopaciente> saida = new ArrayList<>();
    for(Vopaciente paciente2 : lista){
        if(paciente2.getNome().startsWith(paciente)){
            saida.add(paciente2);
        }
    }
    return saida;
}
    /*
    public static VOPacienteExt attPacienteExt(VOPacienteExt pExt, String nome, String rg, String cpf, 
            Date dataNascimento, String endereco, String telefone, String celular, String email,
            ENTipoConvenio plano, boolean bebe, boolean fuma, boolean colesterol, boolean diabetes,
            boolean doencaCardiaca, String cirurgias, String alergias ){
        
        pExt.setNome(nome);
        pExt.setRg(rg);
        pExt.setCpf(cpf);
        pExt.setDataNascimento(dataNascimento);
        pExt.setEndereco(endereco);
        pExt.setTelefone(telefone);
        pExt.setCelular(celular);
        pExt.setEmail(email);
        pExt.setPlano(plano);
        pExt.setBebe(bebe);
        pExt.setFuma(fuma);
        pExt.setColesterol(colesterol);
        pExt.setDiabetes(diabetes);
        pExt.setDoencaCardiaca(doencaCardiaca);
        pExt.setCirurgias(cirurgias);
        pExt.setAlergias(alergias);
        
        return pExt;
    }
    */
}
