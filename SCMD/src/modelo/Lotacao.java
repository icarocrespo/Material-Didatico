package modelo;

import java.util.List;

/**
 *
 * @author icaro
 */
public class Lotacao {
    
    private Long id;
    private String nome;
    private Empresa empresa;
    private Filial filial;
    private List<Empregado> empregados;

    public Lotacao(Long id, String nome, Empresa empresa, Filial filial, List<Empregado> empregados) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.filial = filial;
        this.empregados = empregados;
    }
    
    public Lotacao(Long id, String nome, Empresa empresa, List<Empregado> empregados) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.empregados = empregados;
    }

    public Lotacao(){
    
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }    
}
