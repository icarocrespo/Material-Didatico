package modelo;

/**
 *
 * @author icaro
 */
public abstract class TipoPessoa {

    private PessoaFisica fisica;
    private PessoaJuridica juridica;

    protected Boolean ativa;

    public abstract void print(int option);

    public PessoaFisica getFisica() {
        return fisica;
    }

    public void setFisica(PessoaFisica fisica) {
        this.fisica = fisica;
    }

    public PessoaJuridica getJuridica() {
        return juridica;
    }

    public void setJuridica(PessoaJuridica juridica) {
        this.juridica = juridica;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

}
