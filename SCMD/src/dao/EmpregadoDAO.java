package dao;

import java.util.ArrayList;
import modelo.Empregado;

/**
 *
 * @author icaro
 */
public class EmpregadoDAO extends GenericDAO<Empregado, Long>{
    
    public EmpregadoDAO(){
        super.list = new ArrayList<Empregado>();
    }
}
