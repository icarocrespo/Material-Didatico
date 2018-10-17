package modelo;

/**
 *
 * @author icaro
 */
public class PessoaJuridica extends TipoPessoa{
    
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public PessoaJuridica(){
    
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void print(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
