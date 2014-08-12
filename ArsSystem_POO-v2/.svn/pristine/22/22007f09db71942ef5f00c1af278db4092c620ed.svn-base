/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Vomedico;

/**
 *
 * @author Maicon Henrique
 */
public class TableModelMedico extends AbstractTableModel{

    // Lista de Médicos a serem exibidos na tabela
    private List<Vomedico> linhas;
 
    // Cria um MedicoTableModel sem nenhuma linha
    public TableModelMedico() {
        linhas = new ArrayList<Vomedico>();
    }
 
    // Cria um TableModelMedico contendo a lista recebida por parâmetro
    public TableModelMedico(List<Vomedico> listaDeMedicos) {
        linhas = new ArrayList<Vomedico>(listaDeMedicos);
    }
    
    // Array com os nomes das colunas.
    private String[] colunas = new String[] { "ID", "Nome", "Especialidade" };
    
    // Constantes representando o índice das colunas
    private static final int ID = 0;
    private static final int NOME = 1;
    private static final int ESPEC = 2;
    
    // Retorna o sócio referente a linha especificada
    public Vomedico getMedico(int indiceLinha) {
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
        case NOME:
            return String.class;
        case ID:
            return int.class;
        case ESPEC:
            return String.class;
        default:
            // Não deve ocorrer, pois só existem 3 colunas
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
        Vomedico medico = linhas.get(rowIndex);

        switch (columnIndex) {
        case NOME:
            return medico.getNome();
        case ID:
            return medico.getIdPessoa();
        case ESPEC:
            return medico.getEspecializacao();
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
    public void addListaDeMedicos(List<Vomedico> medicos) {
        // Pega o tamanho antigo da tabela, que servirá
        // como índice para o primeiro dos novos registros
        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(medicos);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + medicos.size());
    }   
    
    
    
    
 

     

}
