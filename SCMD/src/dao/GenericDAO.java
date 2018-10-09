package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icaro
 */
public abstract class GenericDAO<T, I> {

    List<T> list;

    protected GenericDAO() {

    }

    public Boolean insert(T obj) {
        Boolean retorno = false;

        return retorno;
    }

    public Boolean update(T obj) {
        Boolean retorno = false;

        return retorno;
    }

    public Boolean delete(T obj) {
        Boolean retorno = false;

        return retorno;
    }

    public List<T> list(String parameter) {
        list = new ArrayList<>();
        
        return list;
    }
}
