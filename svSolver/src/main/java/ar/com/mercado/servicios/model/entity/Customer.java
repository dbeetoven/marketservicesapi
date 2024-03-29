/**
 * 
 */
package ar.com.mercado.servicios.model.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author bdesir
 *
 */
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Email
	@Column(nullable = false, unique = true)
	private String email;

	@JsonIgnore
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String alias;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private LocalDate birthday;

	@Column(nullable = true)
	private Direction direction;

	@Column(nullable = true)
	private Country countryOfBirth;

	@Column(nullable = false)
	private LocalDate dateFrom;

	@Column(nullable = true)
	private LocalDate dateTo;

	@Column(nullable = false)
	private Integer score;

	@Embedded
	private StatusCustomer statusCustomer;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Cards> cards;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Country getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(Country countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public StatusCustomer getStatusCustomer() {
		return statusCustomer;
	}

	public void setStatusCustomer(StatusCustomer statusCustomer) {
		this.statusCustomer = statusCustomer;
	}

	public Set<Cards> getCards() {
		return cards;
	}

	public void setCards(Set<Cards> cards) {
		this.cards = cards;
	}

}
