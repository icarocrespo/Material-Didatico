package modelo;

import java.util.Date;

public class Gerente extends Empregado {

    private Float comissao;

    public Gerente(String login, String senha, String nome, Long id, Endereco endereco, 
            Float comissao, TipoPessoa tipoPessoa, Empresa empresa, Filial filial, Boolean ativo, Lotacao lotacao, Acesso acesso) {
        super(nome, id, endereco, tipoPessoa, login, senha, empresa, filial, ativo, lotacao, acesso);
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
