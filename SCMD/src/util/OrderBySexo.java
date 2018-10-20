package util;

import java.util.Comparator;
import modelo.PessoaFisica;

/**
 *
 * @author icaro
 */
public class OrderBySexo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        PessoaFisica p1 = (PessoaFisica) o1;
        PessoaFisica p2 = (PessoaFisica) o2;
        int indexp1 = p1.getSexo().ordinal();
        int indexp2 = p2.getSexo().ordinal();
        if (indexp2 < indexp1) {
            return -1;
        }
        return 0;
    }

}
