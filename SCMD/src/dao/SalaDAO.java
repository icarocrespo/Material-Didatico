package dao;

import java.util.ArrayList;
import modelo.Sala;

/**
 *
 * @author icaro
 */
public class SalaDAO extends GenericDAO<Sala, Long>{
    
    public SalaDAO(){
        super.list = new ArrayList<Sala>();
        super.obj = new Sala();
    }
}