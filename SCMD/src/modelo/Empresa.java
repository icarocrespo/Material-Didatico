package modelo;

/**
 *
 * @author icaro
 */
public class Empresa extends Pessoa {

    
    public Empresa(Long id, String nome, Endereco endereco, TipoPessoa tipoPessoa, Acesso acesso) {
        super(nome, id, endereco, tipoPessoa, acesso);
        super.tipoPessoa = new PessoaJuridica();
        
    }    
    
    public Empresa(){
    
    }
}
