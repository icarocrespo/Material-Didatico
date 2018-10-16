package dao;

import java.util.ArrayList;
import modelo.Maquina;

/**
 *
 * @author icaro
 */
public class MaquinaDAO extends GenericDAO<Maquina, Long>{
    
    public MaquinaDAO(){
        super.list = new ArrayList<Maquina>();
        super.obj = new Maquina();
    }
    
}
