package com.ty.mto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("Columbia");
		hospital.setWebsite("www.columbia.com");
		
		Branch branch=new Branch();
		branch.setLocation("Banerghatta");
		branch.setCity("bangalore");
		branch.setPhone(53465644);
		
		Branch branch1=new Branch();
		branch1.setLocation("Hebbal");
		branch1.setCity("bangalore");
		branch1.setPhone(54336533);
		
		branch.setHospital(hospital);
		branch1.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityTransaction.commit();
		
		

	}

}
