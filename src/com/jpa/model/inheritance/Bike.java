package com.jpa.model.inheritance;

import com.jpa.model.inheritance.Vehicle;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bike
 *
 */
@Entity
@DiscriminatorValue("MyBike")
public class Bike extends Vehicle implements Serializable {
	
	
	//@Id
	//private int bikeId;
	@Column
	private String manufacturer;
	@Column
	private String modelName;
	
	private double mileagge;
	

	
	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
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

	private static final long serialVersionUID = 1L;

	public Bike() {
		super();
	}
   
}
