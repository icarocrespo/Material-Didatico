package modelo;

public class Instrutor extends Empregado{

 private Float valorHora;
    private Integer numeroHoras;
    
    public Instrutor(String login, String senha, String nome, Long id, Endereco ender, Float valorHora, Integer numeroHoras) {
        super(login, senha, nome, id, ender);
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
                super.ender.getCep() + "&" + this.numeroHoras.toString() + "&" + this.valorHora.toString();
    }
}