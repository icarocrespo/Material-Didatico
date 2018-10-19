package modelo;

import java.util.Date;

/**
 *
 * @author icaro
 */
public class PessoaFisica extends TipoPessoa {

    private String rg;
    private String cpf;
    private Sexo sexo;
    private Date aniversario;
    private Date admissao;

    public PessoaFisica(String rg, String cpf, Sexo sexo, Date aniversario, Date admissao) {
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.aniversario = aniversario;
        this.admissao = admissao;
    }

    public PessoaFisica() {

    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    
    @Override
    public void print(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
