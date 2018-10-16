package dao;

import java.util.ArrayList;
import modelo.Instrutor;

/**
 *
 * @author icaro
 */
public class InstrutorDAO extends GenericDAO<Instrutor, Long>{
    
    public InstrutorDAO(){
        super.list = new ArrayList<Instrutor>();
        super.obj = new Instrutor();
    }
}
