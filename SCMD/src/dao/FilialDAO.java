package dao;

import java.util.ArrayList;
import modelo.Filial;

/**
 *
 * @author icaro
 */
public class FilialDAO extends GenericDAO<Filial, Long>{
    
    public FilialDAO(){
        super.list = new ArrayList<Filial>();
        super.obj = new Filial();
    }
}
