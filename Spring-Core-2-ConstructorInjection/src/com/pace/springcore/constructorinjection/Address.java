package com.pace.springcore.constructorinjection;

public class Address {

	int flatno;
	String appartmentName;
	String area;
	String city;
	
	public String getAppartmentName() {
		return appartmentName;
	}

	public void setAppartmentName(String appartmentName) {
		this.appartmentName = appartmentName;
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
