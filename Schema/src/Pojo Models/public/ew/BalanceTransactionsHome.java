package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BalanceTransactions.
 * @see ew.BalanceTransactions
 * @author Hibernate Tools
 */
@Stateless
public class BalanceTransactionsHome {

	private static final Log log = LogFactory.getLog(BalanceTransactionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BalanceTransactions transientInstance) {
		log.debug("persisting BalanceTransactions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BalanceTransactions persistentInstance) {
		log.debug("removing BalanceTransactions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BalanceTransactions merge(BalanceTransactions detachedInstance) {
		log.debug("merging BalanceTransactions instance");
		try {
			BalanceTransactions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BalanceTransactions findById(int id) {
		log.debug("getting BalanceTransactions instance with id: " + id);
		try {
			BalanceTransactions instance = entityManager.find(BalanceTransactions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
