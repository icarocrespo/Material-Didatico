package modelo;

/**
 *
 * @author icaro
 */
public class Sala {
    private Long id;
    private String nome;
    
    public Sala(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Sala(){
    
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
    
    
}
