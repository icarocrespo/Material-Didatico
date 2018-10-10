package modelo;

/**
 *
 * @author icaro
 */
public abstract class Empregado extends Pessoa {

    protected static float SALARIO_BASE = 450.5f;
    
    public Empregado(String login, String senha, String nome, Long id, Endereco ender, TipoPessoa tipoPessoa) {
        super(login, senha, nome, id, ender, tipoPessoa);
        //tipoPessoa = new PessoaFisica();
        
    }

    public Empregado() {
        tipoPessoa = new PessoaFisica();
    }

    public abstract Float calculaSalario();

    
}
