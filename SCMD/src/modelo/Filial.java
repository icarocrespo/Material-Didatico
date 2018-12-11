package modelo;

/**
 *
 * @author icaro
 */
public class Filial extends Pessoa {

    private Empresa empresa;

    public Filial(Empresa empresa, TipoPessoa tipoPessoa) {
        this.tipoPessoa = new PessoaJuridica();
        this.empresa = empresa;
    }

    public Filial() {
        this.tipoPessoa = new PessoaJuridica();
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean isTipoValido() {
        return true;
    }
}
