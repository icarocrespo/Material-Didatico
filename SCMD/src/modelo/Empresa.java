package modelo;

/**
 *
 * @author icaro
 */
public class Empresa extends Pessoa {

    
    public Empresa(Long id, String nome, Endereco endereco, TipoPessoa tipoPessoa) {
        super(nome, id, endereco, tipoPessoa);
        super.tipoPessoa = new PessoaJuridica();
        
    }    
    
    public Empresa(){
    
    }
}
