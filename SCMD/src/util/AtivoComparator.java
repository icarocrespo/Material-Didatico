package util;

import java.util.Comparator;
import modelo.Empregado;

/**
 *
 * @author icaro
 */
public class AtivoComparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado arg0, Empregado arg1) {
        return arg0.getAtivo().compareTo(arg1.getAtivo());
    }
}
