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
import model.Voconsultas;
import model.Vodataconsulta;
import control.COMedico;

/**
 *
 * @author Maicon Henrique
 */
public class TableModelConsulta extends AbstractTableModel{

    // Lista de Médicos a serem exibidos na tabela
    private List<Voconsultas> linhas;
 
    // Cria um MedicoTableModel sem nenhuma linha
    public TableModelConsulta() {
        linhas = new ArrayList<Voconsultas>();
    }
 
    // Cria um TableModelMedico contendo a lista recebida por parâmetro
    public TableModelConsulta(List<Voconsultas> listaDeConsultas) {
        linhas = new ArrayList<Voconsultas>(listaDeConsultas);
    }
    
    // Array com os nomes das colunas.
    private String[] colunas = new String[] { "Hora", "Paciente", "Medico", "Tipo da Consulta" };
    
    // Constantes representando o índice das colunas
    private static final int HORA = 0;
    private static final int PACIENTE = 1;
    private static final int MEDICO = 2;
    private static final int TIPO = 3;
    
    // Retorna a consulta referente a linha especificada
    public Voconsultas getConsulta(int indiceLinha) {
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
        case HORA:
            return String.class;
        case PACIENTE:
            return String.class;
        case MEDICO:
            return String.class;
        case TIPO:
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
        Voconsultas consulta = linhas.get(rowIndex);

        switch (columnIndex) {
        case HORA:
            return converteHora(consulta.getHora());
        case PACIENTE:
            return convertePaciente(consulta.getIdpaciente());
        case MEDICO:
            return converteMedico(consulta.getIdmedico());
        case TIPO:
            return converteTipo(consulta.getTipoConsulta());
        default:
            // Não deve ocorrer, pois só existem 3 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    public String converteHora(int hora){
        String retorno;
        switch(hora){
            case 0 :
                retorno = "08h00min";
                break;
            case 1 :
                retorno = "08h30min";
                break;
            case 2 :
                retorno = "09h00min";
                break;
            case 3 :
                retorno = "09h30mim";
                break;
            case 4 :
                retorno = "10h00min";
                break;
            case 5 :
                retorno = "10h30min";
                break;
            case 6 :
                retorno = "11h00min";
                break;
            case 7 :
                retorno = "11h30min";
                break;
            case 8 :
                retorno = "12h00min";
                break;
            case 9 :
                retorno = "12h30min";
                break;
            case 10 :
                retorno = "13h00min";
                break;
            case 11 :
                retorno = "13h30min";
                break;
            case 12 :
                retorno = "14h00min";
                break;
            case 13 :
                retorno = "14h30min";
                break;
            case 14 :
                retorno = "15h00min";
                break;
            case 15 :
                retorno = "15h30min";
                break;
            case 16 :
                retorno = "16h00min";
                break;
            case 17 :
                retorno = "16h30min";
                break;
            case 18 :
                retorno = "17h00min";
                break;
            case 19 :
                retorno = "17h30min";
                break;
            default :
                retorno = "00h00min";
                
        }
        return retorno;
    }
    
    public String convertePaciente(int paciente){
        String retorno = COPaciente.buscaPaciente(paciente).getNome();
        
        return retorno;        
    }
    
    public String converteMedico(int medico){
        String retorno = COMedico.buscaMedico(medico).getNome();
        return retorno;        
    }
    
    public String converteTipo(int tipo){
        String retorno;
        if (tipo == 0){
            retorno = "Normal";
        }else{
            retorno = "Retorno";
        }
        return retorno;        
    }
    // Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();
 
        // Notifica a mudança.
        fireTableDataChanged();
}   
    
    // Adiciona uma lista de sócios no final da lista.
    public void addListaDeConsultas(List<Voconsultas> consultas) {
        // Pega o tamanho antigo da tabela, que servirá
        // como índice para o primeiro dos novos registros
        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(consultas);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + consultas.size());
    }   
    
    
    
    
 

     

}
