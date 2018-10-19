package util;

import modelo.PessoaFisica;

/**
 *
 * @author icaro
 */
public class OrderByAniversario implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        PessoaFisica p1 = (PessoaFisica) o1;
        PessoaFisica p2 = (PessoaFisica) o2;
        int retorno = p1.getAniversario().compareTo(p2.getAniversario());
        if (retorno < 0) {
            return -1;
        }
        return 0;
    }
}
