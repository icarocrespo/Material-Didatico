package modelo;

import java.util.List;

public class Instrutor extends Empregado{

    private Float valorHora;
    private Integer numeroHoras;
    private List<Solicitacao> solicitacoes;
    private List<Treinamento> treinamentos;
    
    public Instrutor(String login, String senha, String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa,
            Float valorHora, Integer numeroHoras, Empresa empresa, Filial filial, Boolean ativo, Lotacao lotacao, Acesso acesso) {
        super(nome, id, endereco, tipoPessoa, login, senha, empresa, filial, ativo, lotacao, acesso);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }
    
    public Instrutor(){
    }

    @Override
    public Float calculaSalario(){
        return (this.valorHora * this.numeroHoras) + SALARIO_BASE;
    }
    
    @Override
    public String toString(){
        return super.id.toString() + "&" + super.nome + "&" + super.login + "&" + super.senha + "&" +
                super.endereco.getCep() + "&" + this.numeroHoras.toString() + "&" + this.valorHora.toString();
    }

}