package modelo;

/**
 *
 * @author icaro
 */
public abstract class TipoPessoa {
    
    private Long id;
    
    public abstract void print(int option);

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
