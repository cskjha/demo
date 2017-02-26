package com.chandra.stock.persistence.manager.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {
	 private static final String PERSISTENCE_UNIT_NAME = "stock-persistence";
	 
	public EntityManager getStockPersistenceEntityManager() {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		 return factory.createEntityManager();
	}
}
