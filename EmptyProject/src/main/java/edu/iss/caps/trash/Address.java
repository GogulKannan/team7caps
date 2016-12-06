package edu.iss.caps.trash;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="addresses")
public class Address {
	@Id
	private int idAddress;
	private String streetName;
	private String city;
	private String postalCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	

}
