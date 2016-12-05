package com.jpa.model.inheritance;

import com.jpa.model.inheritance.Vehicle;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity
@DiscriminatorValue("DCAR")
public class Car extends Vehicle implements Serializable {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int CarId;
	
	private String manufacturer;
	
	
	
	private String modelName;
	
	private double mileagge;

	
	private static final long serialVersionUID = 1L;

	public Car() {
		super();
	}

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getMileagge() {
		return mileagge;
	}

	public void setMileagge(double mileagge) {
		this.mileagge = mileagge;
	}
	
	
   
}
