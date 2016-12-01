/**
 * 
 */
package com.jpa.model.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jpa.model.Student;

/**
 * @author Vuppala Narasimha
 *
 */
public class StudentService {

	/***
	 * This will persist the data
	 * 
	 * @param objStudent
	 * @return
	 */

	private EntityManager em;

	public StudentService(EntityManager em) {

		this.em = em;
	}

	/***
	 * 
	 * @param objStudent
	 * @return
	 */
	public Student createStudent(Student objStudent) {

		em.getTransaction().begin();
		em.persist(objStudent);
		em.getTransaction().commit();
		return objStudent;
	}

	/***
	 * 
	 * @param objStudent
	 * @return
	 */
	public Student updateStudent(Student objStudent) {
		
		Student returnCopy=null;
		// Check whether this is present in the database
		if (em.contains(objStudent) == true) {
			em.getTransaction().begin();
			returnCopy=em.merge(objStudent);
			em.getTransaction().commit();
		} else {
			// Make it managaed
		  Student	objStudentUpdated = findStudentById_DQ(objStudent.getId());
		  //Copy properties
		  //Bean Utils
		  returnCopy=em.merge(objStudentUpdated);
			// Make the Changes

		}
		return returnCopy;
	}

	/*** Remove has two flavours ************/
	public Student removeStudent(int studentId) {
		//em.find
		//em.remove(arg0);
		return null;
	}

	public Student removeStudent(Student objStudent) {
		//em.remove
		return null;
	}

	// *****Dynamic Queries-

	public Student findStudentById_DQ(int StudentId) {
		//JPQL
		//HQL"

//		Query objQuery = em.createQuery("Select s FROM Student s Where s.id = ?1");
		Query objQuery = em.createQuery("Select s FROM Student s Where s.id = :id");
		
		//objQuery.setParameter(1, StudentId);
		objQuery.setParameter("id", StudentId);
		List Students=objQuery.getResultList();
		
		if(Students ==null){
			
		}
		//No Resuls
		else if(Students !=null && Students.size() ==1){
			
		}
		//Single res
		else{
			
		}
		//Multiple resuls
		
		
		Student objStudent = (Student) objQuery.getResultList().get(0);

		return objStudent;
	}

	public Student findStudentByName_DQ(int StudentId) {
		return null;
	}

	// *****Native Queries-

	public Student findStudent_NQ(int StudentId) {
		em.createNativeQuery("SELECT * FROM Student");
	    TypedQuery<Student> tq=	em.createNamedQuery("Query", Student.class);
	
		
		return null;
	}

	public Student findStudentByName_NQ(int StudentId) {
		return null;
	}

	// * Named Queries--DQ and Typed

	public Student findStudentById_NAMQ(String StudentName) {
		//em.createNamedQuery(arg0, arg1)
		Query q=em.createNamedQuery("Student.findAll");
		//q.getSin
		return null;
	}

	public Student findStudentByName_NAMQ(String studentName) {
		return null;
	}

}
