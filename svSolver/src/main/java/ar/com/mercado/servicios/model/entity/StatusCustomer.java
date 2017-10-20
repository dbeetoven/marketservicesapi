/**
 * 
 */
package ar.com.mercado.servicios.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * @author bdesir
 *
 */
@Entity
@Embeddable
public class StatusCustomer {

	@Column(nullable = false)
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
