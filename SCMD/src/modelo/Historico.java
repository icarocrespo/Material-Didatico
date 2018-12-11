package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author icaro
 */
public class Historico {

//    private Registro registro;
    private List<Registro> registros;
    
    public Historico(List<Registro> registros, Registro registro) {
        this.registros = registros;
//        this.registro = registro;
    }

    public Historico(){
    
    }
    
    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

//    public Registro getRegistro() {
//        return registro;
//    }
//
//    public void setRegistro(Registro registro) {
//        this.registro = registro;
//    }
    
    public void list(){
        for(Registro reg : registros){
            System.out.println("ID: " + reg.getId() +
                    "\nData de criação: " + reg.getCriacao() +
                    "\nAlteração " + reg.getAlteracao() +
                    "\nEmpregado " + (reg.getEmpregado() != null ? reg.getEmpregado().getNome() : "Nulo"));
        }
    }
    
    public boolean add(Registro registro){
        boolean retorno;
        try{
            this.registros.add(registro);
            retorno = true;
        }catch(Exception e){
            retorno = false;
        }
        return retorno;
    }
}