package chstore.ch;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author gessyca.lm
 */
public enum PersistenceManager {

    INSTANCE;

    private EntityManager em;

    public EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            em = Persistence.createEntityManagerFactory("ch-pu")
                    .createEntityManager();
        }
        return em;
    }
}
