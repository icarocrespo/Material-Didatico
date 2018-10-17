package modelo;

public class Treinamento {
    private Long id;
    private String nome;
    private String duracao; 
    private Integer num_alunos;
    private String inicio;
    private String fim;
    private String path_apostila;
    private String path_slides;
    private String path_equipNecessario;
    private String path_softwares;
    private String path_instalacao;
    private String path_setup;
    private Instrutor instrutor;

    public Treinamento(Long id, String nome, String duracao, Integer num_alunos, String inicio, String fim, String path_apostila, String path_slides, String path_equipNecessario, String path_softwares, String path_instalacao, String path_setup, Instrutor instrutor) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.num_alunos = num_alunos;
        this.inicio = inicio;
        this.fim = fim;
        this.path_apostila = path_apostila;
        this.path_slides = path_slides;
        this.path_equipNecessario = path_equipNecessario;
        this.path_softwares = path_softwares;
        this.path_instalacao = path_instalacao;
        this.path_setup = path_setup;
        this.instrutor = instrutor;
    }
    
    public Treinamento(){
    
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Integer getNum_alunos() {
        return num_alunos;
    }

    public void setNum_alunos(Integer num_alunos) {
        this.num_alunos = num_alunos;
    }
    
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getPath_apostila() {
        return path_apostila;
    }

    public void setPath_apostila(String path_apostila) {
        this.path_apostila = path_apostila;
    }

    public String getPath_slides() {
        return path_slides;
    }

    public void setPath_slides(String path_slides) {
        this.path_slides = path_slides;
    }

    public String getPath_equipNecessario() {
        return path_equipNecessario;
    }

    public void setPath_equipNecessario(String path_equipNecessario) {
        this.path_equipNecessario = path_equipNecessario;
    }

    public String getPath_softwares() {
        return path_softwares;
    }

    public void setPath_softwares(String path_softwares) {
        this.path_softwares = path_softwares;
    }

    public String getPath_instalacao() {
        return path_instalacao;
    }

    public void setPath_instalacao(String path_instalacao) {
        this.path_instalacao = path_instalacao;
    }

    public String getPath_setup() {
        return path_setup;
    }

    public void setPath_setup(String path_setup) {
        this.path_setup = path_setup;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    

    @Override
    public String toString() {
        return id.toString() + "&" + nome + "&" + duracao + "&" + num_alunos.toString() + 
                "&" + inicio + "&" + fim + "&" + path_apostila + 
                "&" + path_slides + "&" + path_equipNecessario + "&" + path_softwares + 
                "&" + path_instalacao + "&" + path_setup + "&" + instrutor.getNome();
    }
}