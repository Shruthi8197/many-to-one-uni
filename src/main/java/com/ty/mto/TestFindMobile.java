package com.ty.mto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFindMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Sim sim=entityManager.find(Sim.class, 1);
		if(sim!=null) {
			System.out.println("Sim id:"+sim.getId());
			System.out.println("Sim name:"+sim.getName());
			System.out.println("Sim provider:"+sim.getProvider());
			System.out.println("*********************");
		}
		Sim sim1=entityManager.find(Sim.class, 2);
		if(sim1!=null) {
			System.out.println("Sim id:"+sim1.getId());
			System.out.println("Sim name:"+sim1.getName());
			System.out.println("Sim provider:"+sim1.getProvider());
			System.out.println("*********************");
		}
		
		Mobile mobile=sim.getMobile();
		if(mobile!=null) {
			System.out.println("Mobile id:"+mobile.getId());
			System.out.println("Mobile name:"+mobile.getName());
			System.out.println("Mobile cost:"+mobile.getCost());
		}

	}

}
