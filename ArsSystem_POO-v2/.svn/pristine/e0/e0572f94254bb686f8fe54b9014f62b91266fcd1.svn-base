/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Vosecretaria;

/**
 *
 * @author Maicon Henrique
 */
public class TableModelSecretaria extends AbstractTableModel{

    // Lista de Médicos a serem exibidos na tabela
    private List<Vosecretaria> linhas;
 
    // Cria um SecretariaTableModel sem nenhuma linha
    public TableModelSecretaria() {
        linhas = new ArrayList<Vosecretaria>();
    }
 
    // Cria um TableModelSecretaria contendo a lista recebida por parâmetro
    public TableModelSecretaria(List<Vosecretaria> listaDeSecs) {
        linhas = new ArrayList<Vosecretaria>(listaDeSecs);
    }
    
    // Array com os nomes das colunas.
    private String[] colunas = new String[] { "ID", "Nome"};
    
    // Constantes representando o índice das colunas
    private static final int ID = 0;
    private static final int NOME = 1;
    
    // Retorna o sócio referente a linha especificada
    public Vosecretaria getSecretaria(int indiceLinha) {
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
        default:
            // Não deve ocorrer, pois só existem 2 colunas
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
        Vosecretaria secretaria = linhas.get(rowIndex);

        switch (columnIndex) {
        case NOME:
            return secretaria.getNome();
        case ID:
            return secretaria.getIdPessoa();
        default:
            // Não deve ocorrer, pois só existem 2 colunas
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
    public void addListaDeSecretarias(List<Vosecretaria> secretarias) {
        // Pega o tamanho antigo da tabela, que servirá
        // como índice para o primeiro dos novos registros
        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(secretarias);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + secretarias.size());
    }   
    
    
    
    
 

     

}
