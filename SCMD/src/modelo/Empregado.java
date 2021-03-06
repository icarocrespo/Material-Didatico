package modelo;

import java.util.Date;

/**
 *
 * @author icaro
 */
public abstract class Empregado extends Pessoa {

    protected static float SALARIO_BASE = 450.5f;
    protected String login;
    protected String senha;
    protected Empresa empresa;
    protected Filial filial;
    protected Boolean ativo;
    protected Date admissao;
    protected Date aniversario;
    protected Lotacao lotacao;
    protected Acesso acesso;

    public Empregado(String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa, String login, String senha,
            Empresa empresa, Filial filial, Boolean ativo, Lotacao lotacao, Acesso acesso) {
        super(nome, id, endereco, tipoPessoa);
        this.login = login;
        this.senha = senha;
        this.tipoPessoa = new PessoaFisica();
        this.empresa = empresa;
        this.filial = filial;
        this.ativo = ativo;
        this.lotacao = lotacao;
    }

    public Empregado() {
        tipoPessoa = new PessoaFisica();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public abstract Float calculaSalario();

//    public abstract void emitirRegistro(Boolean ativo);
//    
//    public abstract void emitirRegistro(Date admissao, int op);
//    
//    public abstract void emitirRegistro(Date aniversario);
//        
//    public abstract void emitirRegistro(Lotacao lotacao);
    
    @Override
    public boolean isTipoValido() {
        return true;
    }
}
