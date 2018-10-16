package dao;

import java.util.ArrayList;
import modelo.GerenteSuporte;

/**
 *
 * @author icaro
 */
public class GerenteSuporteDAO extends GenericDAO<GerenteSuporte, Long>{
    
    public GerenteSuporteDAO(){
        super.list = new ArrayList<>();
        super.obj = new GerenteSuporte();
    }
}
