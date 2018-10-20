package util;

import java.util.Comparator;
import modelo.PessoaFisica;

/**
 *
 * @author icaro
 */
public class OrderByAdmissao implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        PessoaFisica p1 = (PessoaFisica) o1;
        PessoaFisica p2 = (PessoaFisica) o2;
        int retorno = p1.getAdmissao().compareTo(p2.getAdmissao());
        if (retorno < 0) {
            return -1;
        }
        return 0;
    }

}
