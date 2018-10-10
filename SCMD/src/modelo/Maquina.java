package modelo;

/**
 *
 * @author icaro
 */
public class Maquina {

    private Integer numero;
    private Integer qtd;
    private String softwares;
    private String conf_hardware;
    private String so;

    public Maquina(Integer numero, Integer qtd, String softwares, String conf_hardware, String so) {
        this.numero = numero;
        this.qtd = qtd;
        this.softwares = softwares;
        this.conf_hardware = conf_hardware;
        this.so = so;
    }
    
    public Maquina(){
    
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public String getSoftwares() {
        return softwares;
    }

    public void setSoftwares(String softwares) {
        this.softwares = softwares;
    }

    public String getConf_hardware() {
        return conf_hardware;
    }

    public void setConf_hardware(String conf_hardware) {
        this.conf_hardware = conf_hardware;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

}
