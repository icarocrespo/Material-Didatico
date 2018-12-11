package util;

import java.util.Comparator;
import modelo.Empregado;

/**
 *
 * @author icaro
 */
public class LotacaoComparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado arg0, Empregado arg1) {
        return arg0.getLotacao().toString().compareTo(arg1.getLotacao().toString());
    }

}
