package model;
// Generated 06/06/2013 17:44:05 by Hibernate Tools 3.2.1.GA




/**
 * Voconsultas generated by hbm2java
 */
public class Voconsultas  {


     private int voconsultasId;
     private int idmedico;
     private int idpaciente;
     private int tipoConsulta;
     private String data;
     private int hora;

    public int getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(int tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }
     
    public int getVoconsultasId() {
        return voconsultasId;
    }

    public void setVoconsultasId(int voconsultasId) {
        this.voconsultasId = voconsultasId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

     
}

