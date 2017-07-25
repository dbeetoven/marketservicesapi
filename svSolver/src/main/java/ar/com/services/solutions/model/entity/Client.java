/**
 * 
 */
package ar.com.services.solutions.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.services.solutions.model.enums.StatusClient;

/**
 * @author bdesir
 *
 */
@Entity
@Table(name = "client")
public class Client extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dateHigh;
	private Date dateLow;

	private StatusClient statusClient;
	private Set<Cards> cards;
	private Integer indiceCredit;
	
	public Date getDateHigh() {
		return dateHigh;
	}
	public void setDateHigh(Date dateHigh) {
		this.dateHigh = dateHigh;
	}
	public Date getDateLow() {
		return dateLow;
	}
	public void setDateLow(Date dateLow) {
		this.dateLow = dateLow;
	}
	public StatusClient getStatusClient() {
		return statusClient;
	}
	public void setStatusClient(StatusClient statusClient) {
		this.statusClient = statusClient;
	}
	public Set<Cards> getCards() {
		return cards;
	}
	public void setCards(Set<Cards> cards) {
		this.cards = cards;
	}
	public Integer getIndiceCredit() {
		return indiceCredit;
	}
	public void setIndiceCredit(Integer indiceCredit) {
		this.indiceCredit = indiceCredit;
	}
	
	
	
}
