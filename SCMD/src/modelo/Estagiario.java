package modelo;

/**
 *
 * @author icaro
 */
public class Estagiario extends Pessoa {

    private Float bolsa;

    public Estagiario(Float bolsa, String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa) {
        super(nome, id, endereco, tipoPessoa);
        this.bolsa = bolsa;
    }

    public Estagiario(Float bolsa) {
        this.bolsa = bolsa;
    }

    public Estagiario() {

    }

    public Float getBolsa() {
        return bolsa;
    }

    public void setBolsa(Float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public boolean isTipoValido() {
        return true;
    }
}
