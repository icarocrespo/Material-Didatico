package modelo;

/**
 *
 * @author icaro
 */
public class PessoaFisica extends TipoPessoa{
    
    private String rg;
    private String cpf;

    public PessoaFisica(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(){
    
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void print(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
    