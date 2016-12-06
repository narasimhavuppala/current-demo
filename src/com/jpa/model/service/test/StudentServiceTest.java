package com.jpa.model.service.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jpa.model.Department;
import com.jpa.model.Student;
import com.jpa.model.service.StudentService;
import com.jpa.util.Grade;




public class StudentServiceTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	int studentId;
	
	



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
		objSt.setDob(Calendar.getInstance());
		objSt.setGrade(Grade.EXCELLENT);
		
		Department dept=new Department();
		dept.setDepartmentHead("MATHS");
		dept.setDepartmentName("Ramu");
		

		Department dept2=new Department();
		dept2.setDepartmentHead("TECH");
		dept2.setDepartmentName("Sattheesh");
		List<Department> list=new ArrayList<>();
		list.add(dept);
		list.add(dept2);
		objSt.setDepartment(list);
		
		List<String> certificates=new ArrayList<>();
		certificates.add("Java");
		certificates.add("JPA");
		certificates.add("BPM");
		objSt.setCertifications(certificates);
		
		
		
		
		
		
		Student objStudent=objStudentService.createStudent(objSt);
		studentId=objSt.getId();
		//emf.getCache().evictAll();
		//emf.getCache().evict(Student.class);
		System.out.println("Cache=" +emf.getCache().contains(Student.class, objSt.getId()));
		if(objStudent.getId() > 0){
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}

		testFindStudentById_DQ();
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

	//@Test
	public void testFindStudentById_DQ() {
		StudentService objStudentService=new StudentService(em);
		Student objStudent=objStudentService.findStudentById_DQ(studentId);
		
		assertNotNull(objStudent.getDepartment());
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
