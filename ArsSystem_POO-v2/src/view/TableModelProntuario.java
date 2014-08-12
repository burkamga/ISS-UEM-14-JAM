/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.COConsulta;
import control.COPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Voprontuario;
import model.Vodataconsulta;
import control.COMedico;
import model.CRUD_Vopaciente;

/**
 *
 * @author Maicon Henrique
 */
public class TableModelProntuario extends AbstractTableModel{

    // Lista de Médicos a serem exibidos na tabela
    private List<Voprontuario> linhas;
 
    // Cria um MedicoTableModel sem nenhuma linha
    public TableModelProntuario() {
        linhas = new ArrayList<Voprontuario>();
    }
 
    // Cria um TableModelMedico contendo a lista recebida por parâmetro
    public TableModelProntuario(List<Voprontuario> listaDeProntuarios) {
        linhas = new ArrayList<Voprontuario>(listaDeProntuarios);
    }
    
    // Array com os nomes das colunas.
    private String[] colunas = new String[] { "ID Prontuario", "ID Consulta", "Paciente"};
    
    // Constantes representando o índice das colunas
    private static final int ID_PRONT = 0;
    private static final int ID_CONS = 1;
    private static final int PACIENTE = 2;
    
    // Retorna a prontuario referente a linha especificada
    public Voprontuario getProntuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
            
    
    //Overrrides
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    };
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case ID_PRONT:
            return int.class;
        case ID_CONS:
            return int.class;
        case PACIENTE:
            return String.class;
        default:
            // Não deve ocorrer, pois só existem 4 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Voprontuario prontuario = linhas.get(rowIndex);

        switch (columnIndex) {
        case ID_PRONT:
            return prontuario.getIdProntuario();
        case ID_CONS:
            return prontuario.getVoconsulta();
        case PACIENTE:
            String nome = CRUD_Vopaciente.buscarPaciente(prontuario.getVopaciente()).getNome();
            return nome;
        default:
            // Não deve ocorrer, pois só existem 3 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    
    
    
   
    // Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();
 
        // Notifica a mudança.
        fireTableDataChanged();
}   
    
    // Adiciona uma lista de sócios no final da lista.
    public void addListaDeProntuarios(List<Voprontuario> prontuario) {
        // Pega o tamanho antigo da tabela, que servirá
        // como índice para o primeiro dos novos registros
        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(prontuario);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + prontuario.size());
    }   
    
    
    
    
 

     

}
