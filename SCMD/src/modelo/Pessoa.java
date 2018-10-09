package modelo;

public abstract class Pessoa {
    
    protected String login;
    protected String senha;
    protected String nome;
    protected Long id;
    protected Endereco ender;
    protected static final Float SALARIO_BASE = 3500f;
    
    public Pessoa(String login, String senha, String nome, Long id, Endereco ender) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.id = id;
        this.ender = ender;
    }
    
    public Pessoa(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
}
