/**
 * 
 */
package ar.com.mercado.servicios.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author bdesir
 *
 */
@Entity
@Table(name = "country")
public class Country {

	@Column(nullable = false)
	private String name;

	@Column(nullable = true)
	private Long zipCode;

	@Column(nullable = true)
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
