package br.com.lojadecalcados.model.persistencia;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionFactory {

    private static final String UNIT_NAME = "Avaliacao3JPAPU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
