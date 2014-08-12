/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.enums;

/**
 *
 * @author Helio
 */
public enum ENTipoConsulta {
    CONSULTA (60),
    RETORNO (30);
    
    private final int duracaoConsulta;
    
    public int duracaoConsulta() {
        return this.duracaoConsulta;
    }

    private ENTipoConsulta(int duracaoConsulta) {
        this.duracaoConsulta = duracaoConsulta;
    }
    
}
