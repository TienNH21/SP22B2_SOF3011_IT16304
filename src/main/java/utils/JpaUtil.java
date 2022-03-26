package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	public static EntityManagerFactory getFactory() {
		EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("SP22B2_SOF3011_IT16304");
		return factory;
	}
	
	public static EntityManager getEntityManager() {
		EntityManager em = JpaUtil.getFactory()
			.createEntityManager();

		return em;
	}
}
