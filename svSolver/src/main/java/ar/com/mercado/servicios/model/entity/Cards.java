/**
 * 
 */
package ar.com.mercado.servicios.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import ar.com.mercado.servicios.model.enums.TypeAccount;

/**
 * @author bdesir
 *
 */
@MappedSuperclass
public class Cards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "idAccount")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAccount;
	
	private int number;
	
	private TypeAccount typeAccount;
	
	private int numberVerify;
	
	@ManyToOne
	@Column(name="id_customer")
	private Customer customer;

	public Cards() {
		super();
	}

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public TypeAccount getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(TypeAccount typeAccount) {
		this.typeAccount = typeAccount;
	}

	public int getNumberVerify() {
		return numberVerify;
	}

	public void setNumberVerify(int numberVerify) {
		this.numberVerify = numberVerify;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAccount == null) ? 0 : idAccount.hashCode());
		result = prime * result + number;
		result = prime * result + numberVerify;
		result = prime * result + ((typeAccount == null) ? 0 : typeAccount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		if (idAccount == null) {
			if (other.idAccount != null)
				return false;
		} else if (!idAccount.equals(other.idAccount))
			return false;
		if (number != other.number)
			return false;
		if (numberVerify != other.numberVerify)
			return false;
		if (typeAccount != other.typeAccount)
			return false;
		return true;
	}

}
