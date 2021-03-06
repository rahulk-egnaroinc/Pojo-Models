package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Notifications.
 * @see gsrc1.Notifications
 * @author Hibernate Tools
 */
@Stateless
public class NotificationsHome {

	private static final Log log = LogFactory.getLog(NotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Notifications transientInstance) {
		log.debug("persisting Notifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Notifications persistentInstance) {
		log.debug("removing Notifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Notifications merge(Notifications detachedInstance) {
		log.debug("merging Notifications instance");
		try {
			Notifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Notifications findById(NotificationsId id) {
		log.debug("getting Notifications instance with id: " + id);
		try {
			Notifications instance = entityManager.find(Notifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
