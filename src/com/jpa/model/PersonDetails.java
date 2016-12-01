package com.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PersonDetails
 *
 */
@Entity
@NamedQuery(name="PersonDetails.findAll", query="SELECT s FROM PersonDetails s")
@Table(name="PERSON_DETAILS")
public class PersonDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50,nullable=false,insertable=true,updatable=false,unique=true)
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private String SSN;
	private Double salary;

	
	private static final long serialVersionUID = 1L;

	/*public PersonDetails() {
		super();
	}*/
	public PersonDetails(){}
   
}
