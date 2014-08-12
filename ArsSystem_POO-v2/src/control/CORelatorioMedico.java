/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 *
 * @author Helio
 */
public class CORelatorioMedico {
    /*
    public static String geraReceita(VOProntuario p, VOMedico m) {
        String ret = "";
        ret = ret.concat("Receita Médica do Dr. "+m.getNome()+" - CRM: "+m.getNumCRM()+'\n');
        ret = ret.concat("Ao paciente: "+p.getPaciente().getNome()+'\n');
        ret = ret.concat("Prescrição: "+p.getTratamento()+'\n');
        
        return ret;
    }
    
    public static String geraAtestado(VOProntuario p, VOMedico m, int numDias) {
        String ret = "";
        ret = ret.concat("Atesto para os devidos fins que "+p.getPaciente().getNome()+" ");
        ret = ret.concat("ficará imcapacitado de exercer suas atividades por um prazo de "+numDias+" dia(s), ");
        ret = ret.concat("devido a "+p.getDiagnostico()+".\n");
        ret = ret.concat("Dr. "+m.getNome()+" - CRM: "+m.getNumCRM());
        
        return ret;
    }
    
    public static String geraDeclaracaoAcompanhamento(VOProntuario p, VOMedico m, String nomeAcompanhante) {
        String ret = "";
        ret = ret.concat("Atesto para os devidos fins que "+nomeAcompanhante+" ");
        ret = ret.concat("precisou acompanhar "+p.getPaciente().getNome()+" ");
        ret = ret.concat("em uma consulta médica.\n");
        ret = ret.concat("Dr. "+m.getNome()+" - CRM: "+m.getNumCRM());
        
        return ret;
    }
    
    public static List<VOPaciente> geraRelatorioPacientesNoMes(Calendar mes) {
        List<VOPaciente> ret = new ArrayList<>();
        Calendar dtConsulta = Calendar.getInstance();
        for(VOConsulta c : DataBase.getListaConsultas()) {
            dtConsulta.setTime(c.getDataHora());
            if(dtConsulta.get(Calendar.MONTH) == mes.get(Calendar.MONTH)) {
                ret.add(c.getPaciente());
            }
        }
        
        return ret;
    }
    */
}
