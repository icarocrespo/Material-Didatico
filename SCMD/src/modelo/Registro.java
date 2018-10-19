package modelo;

import java.util.Date;

/**
 *
 * @author icaro
 */
public class Registro {
    private Long id;
    private Empregado empregado;
    private Date criacao;
    private Date alteracao;

    public Registro(Long id, Empregado empregado, Date criacao, Date alteracao) {
        this.id = id;
        this.empregado = empregado;
        this.criacao = criacao;
        this.alteracao = alteracao;
    }

    public Registro(){
    
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Date getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(Date alteracao) {
        this.alteracao = alteracao;
    }
}