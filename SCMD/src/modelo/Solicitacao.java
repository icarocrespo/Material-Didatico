package modelo;

import java.util.Date;

public class Solicitacao {
    private Long id;
    private Instrutor instrutor;
    private Treinamento treinamento;
    private Boolean status;
    private Date data;
    private String motivoAlteracao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Treinamento getTreiinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMotivoAlteracao() {
        return motivoAlteracao;
    }

    public void setMotivoAlteracao(String motivoAlteracao) {
        this.motivoAlteracao = motivoAlteracao;
    }
    
    
    @Override
    public String toString(){
        return id.toString() + "&" + instrutor.getNome() + "&" + 
                treinamento.getNome() + "&" + data + "&" + motivoAlteracao + "&" + status.toString();
    }
}