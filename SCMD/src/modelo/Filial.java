package modelo;

/**
 *
 * @author icaro
 */
public class Filial extends Pessoa{
    
    public Filial(TipoPessoa tipoPessoa){
        this.tipoPessoa = new PessoaJuridica();
    }
    
    public Filial(){
        this.tipoPessoa = new PessoaJuridica();
    }
}
