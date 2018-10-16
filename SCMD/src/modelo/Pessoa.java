package modelo;

public abstract class Pessoa {
    
    protected String nome;
    protected Long id;
    protected Endereco endereco;
    protected TipoPessoa tipoPessoa;
    protected static final Float SALARIO_BASE = 3500f;
    
    public Pessoa(String nome, Long id, Endereco endereco, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
