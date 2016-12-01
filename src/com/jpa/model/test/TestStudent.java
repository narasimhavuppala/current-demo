package com.jpa.model.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Student;

public class TestStudent {

	public static void main(String[] args) {

		
		//Connection  start
		
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("StudentORMExample");
		EntityManager em=emf.createEntityManager();
		
		
		
		//DB Insert and find
		
		Student obj=new Student();
		obj.setAddress("Address");
		obj.setAge(10);
		obj.setStudentname("Sample name");
		em.getTransaction().begin();
		System.out.println("id before=" + obj.getId());
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println("id after=" + obj.getId());
		//DB Update and find
		
		//DB remove and find
		
		//connection close
	}

}
