package com.jpa.model.inheritance;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentORMExample");
		EntityManager em=emf.createEntityManager();
		
		Address add=new Address();
		add.setCity("Hyd");
		add.setZipcode(12345);
		Bike b=new Bike();
		b.setChasisNumber("BikehasisNumber");
		b.setManufacturer("bikemanufacturer");
		b.setManufacturingDate(new Date());
		b.setAddr(add);
		
		Car c=new Car();
		c.setChasisNumber("CarChasis");
		c.setManufacturer("CARManuf");
		c.setAddr(add);
		
		em.getTransaction().begin();
		em.persist(b);
		em.persist(c);
		em.getTransaction().commit();
		
	}

}
