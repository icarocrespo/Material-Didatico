package util;

import java.util.Comparator;
import modelo.Empregado;

/**
 *
 * @author icaro
 */
public class AniversarioComparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado arg0, Empregado arg1) {
        return arg0.getAniversario().compareTo(arg1.getAniversario());
    }
}
