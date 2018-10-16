package dao;

import java.util.ArrayList;
import modelo.Treinamento;

/**
 *
 * @author icaro
 */
public class TreinamentoDAO extends GenericDAO<Treinamento, Long> {

    public TreinamentoDAO() {
        super.list = new ArrayList<Treinamento>();
        super.obj = new Treinamento();
    }
}
