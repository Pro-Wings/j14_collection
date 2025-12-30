package com.prowings.collection.set;

public class Car {
	
	private int carId;
	private String comapny;
	private int price;

	public Car() {
		super();
	}

	public Car(int carId, String comapny, int price) {
		super();
		this.carId = carId;
		this.comapny = comapny;
		this.price = price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getComapny() {
		return comapny;
	}

	public void setComapny(String comapny) {
		this.comapny = comapny;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", comapny=" + comapny + ", price=" + price + "]";
	}
	
	

}
