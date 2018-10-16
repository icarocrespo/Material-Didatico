package dao;

import java.util.ArrayList;
import modelo.Endereco;

/**
 *
 * @author icaro
 */
public class EnderecoDAO extends GenericDAO<Endereco, Long>{
    
    public EnderecoDAO(){
        super.list = new ArrayList<Endereco>();
        super.obj = new Endereco();
    
    }
}
