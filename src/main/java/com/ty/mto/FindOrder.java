package com.ty.mto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		

		Item item = entityManager.find(Item.class, 1);
		if (item != null) {
			System.out.println("Item id:" + item.getId());
			System.out.println("Item name:" + item.getName());
			System.out.println("Quantity:" + item.getQuantity());
			System.out.println("Cost is:" + item.getCost());
			System.out.println("**********************");
		}
		Item item1 = entityManager.find(Item.class, 2);
		if (item1 != null) {
			System.out.println("Item id:" + item1.getId());
			System.out.println("Item name:" + item1.getName());
			System.out.println("Quantity:" + item1.getQuantity());
			System.out.println("Cost is:" + item1.getCost());
			System.out.println("**********************");
		}
		
		FoodOrder foodOrder = item.getFoodOrder();
		if(foodOrder!=null) {
			System.out.println("Food id:"+foodOrder.getId());
			System.out.println("Order Name:"+foodOrder.getToName());
			System.out.println("Order status:"+foodOrder.getStatus());
			
		}
		

	}

}
