package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icaro
 */
public abstract class GenericDAO<T, I> {

    List<T> list;
    Object obj;

    protected GenericDAO() {
        list = new ArrayList<T>();

    }

    public Boolean insert(T obj) {
        Boolean retorno = false;

        try {
            list.add(obj);
            retorno = true;
        } catch (Exception e) {
            System.out.println(e.toString());
            retorno = false;
        } finally {
            return retorno;
        }

    }

    public Boolean update(T obj) {
        Boolean retorno = false;

        try {
            for (T control : list) {
                if (control == obj) {
                    list.remove(obj);
                    list.add(obj);
                    break;
                }
            }
            retorno = true;
        } catch (Exception e) {
            System.out.println(e.toString());
            retorno = false;
        } finally {
            return retorno;
        }
    }

    public Boolean delete(T obj) {
        Boolean retorno = false;

        for (T control : list) {
            if (control == obj) {
                list.remove(obj);
                retorno = true;
                break;
            }
        }
        return retorno;
    }

    public void list() {
        for (T controle : list) {
            System.out.println(controle.toString());
        }
    }
}