package modelo;

/**
 *
 * @author icaro
 */
public class EmpregadoInformatizado extends Empregado {

    public EmpregadoInformatizado(String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa, String login, String senha, 
            Empresa empresa, Filial filial, Boolean ativo, Lotacao lotacao) {
        super(nome, id, endereco, tipoPessoa, login, senha, empresa, filial, ativo, lotacao);
    }

    public EmpregadoInformatizado() {
    }

    @Override
    public Float calculaSalario() {
        return 0f;
    }
}