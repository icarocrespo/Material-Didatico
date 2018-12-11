package modelo;

/**
 *
 * @author icaro
 */
public class Dependente extends Pessoa {

    private Empregado empregado;

    public Dependente(TipoPessoa tipoPessoa, Empregado empregado, String nome, Long id, Endereco endereco) {
        super(nome, id, endereco, tipoPessoa);
        this.empregado = empregado;
    }

    public Dependente(TipoPessoa tipoPessoa, Empregado empregado) {
        this.tipoPessoa = tipoPessoa;
        this.empregado = empregado;
    }

    @Override
    public boolean isTipoValido() {
        return true;
    }

}
