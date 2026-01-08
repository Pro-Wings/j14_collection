package com.prowings.collection.map;

import java.util.Objects;

public class Car {
	
	private int id;
	private String company;

	public Car() {
		super();
	}

	public Car(int id, String company) {
		super();
		this.id = id;
		this.company = company;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(company, other.company) && id == other.id;
	}
	
	

}
