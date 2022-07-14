package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		
		//create one employee
		Employee employee = new Employee();  // object : employee
		employee.setName("Amit");
		employee.setSalary(50000); 
		em.persist(employee);  // insert
	
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Kuveskar");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);   // insert
		
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}