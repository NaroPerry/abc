package br.com.lojadecalcados.model.persistencia;

//public abstract class DAOImplements<T, I extends Serializable> implements DAO<T, I>
import br.com.lojadecalcados.model.persistencia.dao.DAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public abstract class DAOImplements<T, I extends Serializable> implements DAO<T, I> {

    private ConnectionFactory conexao;

    public T save(T entity) {
        T saved = null;
        getEntityManager().getTransaction().begin();
        saved = getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
        return saved;
    }

    public EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new ConnectionFactory();
        }
        return conexao.getEntityManager();
    }

    public List<T> listarTodos(Class<T> classe) {
        return getEntityManager().createQuery("select x from " + classe.getSimpleName() + " x").getResultList();
    }

    public List<T> listByNome(String nome, Class<T> classe) {
        Query q = getEntityManager().createQuery("select a from " + classe.getSimpleName() + " a where a.nome like '"
                + nome + "'"
                , classe);
        List<T> listas = q.getResultList();

        return q.getResultList();
    }

    public T buscarCodigo(Class<T> classe, I pk) {
        try {
            return getEntityManager().find(classe, pk);

        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean remover(Class<T> classe, I pk) {

        T entity = getEntityManager().find(classe, pk);
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();
        return true;
    }
}
