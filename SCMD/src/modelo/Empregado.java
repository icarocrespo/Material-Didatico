package modelo;

/**
 *
 * @author icaro
 */
public abstract class Empregado extends Pessoa {

    public Empregado(String login, String senha, String nome, Long id, Endereco ender) {
        super(login, senha, nome, id, ender);
    }

    public Empregado() {

    }

    public abstract Float calculaSalario();

    
}
