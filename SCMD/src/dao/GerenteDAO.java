package dao;

import java.util.ArrayList;
import modelo.Gerente;

/**
 *
 * @author icaro
 */
public class GerenteDAO extends GenericDAO<Gerente, Long> {

    public GerenteDAO() {
        super.list = new ArrayList<Gerente>();
        super.obj = new Gerente();
    }
}
