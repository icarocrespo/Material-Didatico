package modelo;

public class Gerente extends Empregado {

    private Float comissao;

    public Gerente(String login, String senha, String nome, Long id, Endereco ender, Float comissao) {
        super(login, senha, nome, id, ender);
        this.comissao = comissao;
    }

    public Gerente() {

    }

    @Override
    public Float calculaSalario() {
        return comissao + SALARIO_BASE;
    }

    @Override
    public String toString() {
        return super.id.toString() + "&" + super.nome + "&" + super.login + "&" + super.senha + "&" + this.comissao.toString() + ";";
    }
}
