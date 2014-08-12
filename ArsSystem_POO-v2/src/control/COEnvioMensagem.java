/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Calendar;


/**
 *
 * @author Helio
 */
public class COEnvioMensagem {
    /*
    public static void enviarMensagem() {
        Calendar amanha = Calendar.getInstance();
        Calendar dt = Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);
        String msg;
        
        for(VOConsulta c : DataBase.getListaConsultas()) {
            msg = "Lembrete: Você tem consulta amanhã, as ";
            dt.setTime(c.getDataHora());
            if(dt.get(Calendar.DAY_OF_MONTH) ==  amanha.get(Calendar.DAY_OF_MONTH)) {
                msg = msg.concat(dt.get(Calendar.HOUR_OF_DAY)+":"+dt.get(Calendar.MINUTE));
                if(!c.getPaciente().getEmail().equals("")) {
                    COEnviarEmail.enviarEmail(c.getPaciente().getEmail(), msg);
                }
                
                if(!c.getPaciente().getCelular().equals("")) {
                    COEnviarSMS.enviarSMS(c.getPaciente().getCelular(), msg);
                }
            }
        }
    }
    */
}
