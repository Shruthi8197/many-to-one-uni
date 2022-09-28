package com.ty.mto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveMobile {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("Redmi 10Pro");
		mobile.setCost(25000);
		
		Sim sim = new Sim();
		sim.setName("Airtel sim");
		sim.setProvider("Airtel");

		Sim sim1 = new Sim();
		sim1.setName("BSNL sim");
		sim1.setProvider("BSNL");
		
		sim.setMobile(mobile);
		sim1.setMobile(mobile);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);;
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityTransaction.commit();

	}

}
