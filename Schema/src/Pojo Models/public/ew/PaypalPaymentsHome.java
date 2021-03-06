package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PaypalPayments.
 * @see ew.PaypalPayments
 * @author Hibernate Tools
 */
@Stateless
public class PaypalPaymentsHome {

	private static final Log log = LogFactory.getLog(PaypalPaymentsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaypalPayments transientInstance) {
		log.debug("persisting PaypalPayments instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaypalPayments persistentInstance) {
		log.debug("removing PaypalPayments instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaypalPayments merge(PaypalPayments detachedInstance) {
		log.debug("merging PaypalPayments instance");
		try {
			PaypalPayments result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaypalPayments findById(PaypalPaymentsId id) {
		log.debug("getting PaypalPayments instance with id: " + id);
		try {
			PaypalPayments instance = entityManager.find(PaypalPayments.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
