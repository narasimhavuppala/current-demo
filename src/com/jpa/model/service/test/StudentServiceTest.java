package com.jpa.model.service.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jpa.model.Student;
import com.jpa.model.service.StudentService;

public class StudentServiceTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	
	



	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Class Setup");
		emf=Persistence.createEntityManagerFactory("StudentORMExample");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Class Teardown");
		emf=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Method setup");
		em=emf.createEntityManager();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Method TearDown");
		em.close();
	}

	@Test
	public void testCreateStudent() {
		
		
		StudentService objStudentService=new StudentService(em);
		Student objSt=new Student();
		objSt.setAge(34);
		objSt.setStudentname("Laxman");
		objSt.setAddress("Hyd");
		Student objStudent=objStudentService.createStudent(objSt);
		if(objStudent.getId() > 0){
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}

	}

	@Test
	public void testUpdateStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStudentInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStudentStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentById_DQ() {
		StudentService objStudentService=new StudentService(em);
		Student objStudent=objStudentService.findStudentById_DQ(1);
		assertNotNull(objStudent);
	}

	@Test
	public void testFindStudentByName_DQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentById_NQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentByName_NQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentById_NAMQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentByName_NAMQ() {
		fail("Not yet implemented");
	}

}
