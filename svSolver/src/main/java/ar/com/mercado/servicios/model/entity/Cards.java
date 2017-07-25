/**
 * 
 */
package ar.com.services.solutions.model.entity;

import java.io.Serializable;

import ar.com.services.solutions.model.enums.TypeAccount;

/**
 * @author bdesir
 *
 */
public class Cards implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idAccount;
	private int number;
	private TypeAccount typeAccount;
	private int numberVerify;

	public Cards() {
		super();
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
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
		result = prime * result + idAccount;
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
		if (idAccount != other.idAccount)
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
