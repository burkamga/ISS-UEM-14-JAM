/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.CRUD_Vosecretaria;
import model.Vosecretaria;

/**
 *
 * @author Maicon Henrique
 */
public class COSecretaria {

    public static boolean addSecretaria(String nome, String rg, String cpf,
            Date dataNascimento, String endereco, String telefone,
            String celular, String email, int salario, String username,
            String senha) {

        //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
        Vosecretaria secretaria = new Vosecretaria();
        secretaria.setIdPessoa(null);
        secretaria.setNome(nome);
        secretaria.setRg(rg);
        secretaria.setCpf(cpf);
        secretaria.setDataNascimento(dataNascimento);
        secretaria.setEndereco(endereco);
        secretaria.setTelefone(telefone);
        secretaria.setCelular(celular);
        secretaria.setEmail(email);
        secretaria.setSalario(salario);
        secretaria.setUsername(username);
        secretaria.setSenha(senha);

        boolean resultado = CRUD_Vosecretaria.salvar(secretaria);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Secretaria Adicionado com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao Adiconar a Secretaria", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public static Vosecretaria buscaSecretaria(int secretaria) {
        Vosecretaria retorno = CRUD_Vosecretaria.buscarSecretaria(secretaria);
        return retorno;
    }

    public static List<Vosecretaria> buscaSecretariasNome(String secretaria) {
        List<Vosecretaria> lista = CRUD_Vosecretaria.listar();
        List<Vosecretaria> saida = new ArrayList<>();
        for (Vosecretaria sec2 : lista) {
            if (sec2.getNome().startsWith(secretaria)) {
                saida.add(sec2);
            }
        }
        return saida;
    }

    public static boolean attSecretaria(int id, String nome, String rg, String cpf,
            Date dataNascimento, String endereco, String telefone,
            String celular, String email, int salario, String username,
            String senha) {

        //Instancia um novo paciente e recebe os campos de cadastro da interfaces      
        Vosecretaria secretaria = buscaSecretaria(id);

        secretaria.setNome(nome);
        secretaria.setRg(rg);
        secretaria.setCpf(cpf);
        secretaria.setDataNascimento(dataNascimento);
        secretaria.setEndereco(endereco);
        secretaria.setTelefone(telefone);
        secretaria.setCelular(celular);
        secretaria.setEmail(email);
        secretaria.setSalario(salario);
        secretaria.setUsername(username);
        secretaria.setSenha(senha);

        boolean resultado = CRUD_Vosecretaria.atualizar(secretaria);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Médico Atualizado com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao Atualizar o Médico!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public static boolean excluiSecretaria(int id) {
        Vosecretaria secretaria = CRUD_Vosecretaria.buscarSecretaria(id);
        boolean resultado = CRUD_Vosecretaria.excluir(secretaria);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Secretaria Removida com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao Remover a Secretaria!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;

    }
}
