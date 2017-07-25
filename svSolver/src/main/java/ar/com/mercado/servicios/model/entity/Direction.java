/**
 * 
 */
package ar.com.services.solutions.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author bdesir
 *
 */
@Embeddable
public class Direction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String street;

	@Column
	private String number;

	@Column
	private String zipCode;

	@Column
	private String city;
	
	

	public Direction() {
		super();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
