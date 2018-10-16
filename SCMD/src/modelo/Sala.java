package modelo;

import java.util.List;

/**
 *
 * @author icaro
 */
public class Sala {
    private Long id;
    private String nome;
    private Integer numero;
    private List<Maquina> maquinas;
    
    public Sala(Long id, String nome, Integer numero, List<Maquina> maquinas){
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.maquinas = maquinas;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
    
    
}
