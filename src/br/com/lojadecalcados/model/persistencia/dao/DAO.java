
package br.com.lojadecalcados.model.persistencia.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

public interface DAO <T, I extends Serializable> {
    
    T save (T entity);
    List<T> listarTodos(Class<T> classe);
    EntityManager getEntityManager();
    T buscarCodigo(Class<T> classe, I pk);
    boolean remover(Class<T> classe, I pk);
    List<T> listByNome(String nome, Class<T> classe);
    
}
