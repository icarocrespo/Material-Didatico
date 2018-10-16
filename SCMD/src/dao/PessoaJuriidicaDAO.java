package dao;

import java.util.ArrayList;
import modelo.PessoaJuridica;

/**
 *
 * @author icaro
 */
public class PessoaJuriidicaDAO extends GenericDAO<PessoaJuridica, Long>{
    
    public PessoaJuriidicaDAO(){
        super.list = new ArrayList<PessoaJuridica>();
        super.obj = new PessoaJuridica();
    }
}
