package modelo;

/**
 *
 * @author icaro
 */
public class GerenteSuporte extends Empregado{

    private Float comissao;

    public GerenteSuporte(Float comissao, String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa, 
            String login, String senha, Empresa empresa, Filial filial, Boolean ativo, Lotacao lotacao) {
        super(nome, id, endereco, tipoPessoa, login, senha, empresa, filial, ativo, lotacao);
        this.comissao = comissao;
    }

    public GerenteSuporte(Float comissao) {
        this.comissao = comissao;
    }
    
    public GerenteSuporte(){
    
    }

    @Override
    public Float calculaSalario() {
        return comissao + SALARIO_BASE;
    }

}