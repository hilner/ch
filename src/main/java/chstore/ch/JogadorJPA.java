package chstore.ch;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author gessyca.lm
 */
@Transactional
public class JogadorJPA {

    @PersistenceContext(unitName = "ch-pu")
    private EntityManager em;

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public <T> void salvar(T t) {
        em.persist(t);
    }

    public <T> void atualizar(T t) {
        em.merge(t);
    }

    public <T> void remover(T t) {
        em.remove(em.merge(t));
    }
}
