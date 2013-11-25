package br.com.lojadecalcados.model.persistencia;

import br.com.lojadecalcados.model.Funcionario;
import br.com.lojadecalcados.model.persistencia.dao.FuncionarioDAO;
import java.util.List;
import javax.persistence.Query;

public class FuncionarioDAOImplements extends DAOImplements<Funcionario, Integer> implements FuncionarioDAO {

    public boolean procurarLogin(String txLoginAutentica, String txSenhaAutentica) {
        Query q = getEntityManager().createQuery("select a from Funcionario a where a.login = '" + txLoginAutentica
                + "' and a.senha = '" + txSenhaAutentica + "'");
        List<Funcionario> funcionarios = q.getResultList();
        for (Funcionario a : funcionarios) {
            return true;
        }
        return false;
    }
}

