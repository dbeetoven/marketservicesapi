/**
 * 
 */
package ar.com.mercado.servicios.model.entity.dto;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import ar.com.mercado.servicios.model.entity.Cards;
import ar.com.mercado.servicios.model.entity.Country;
import ar.com.mercado.servicios.model.entity.Direction;
import ar.com.mercado.servicios.model.entity.StatusCustomer;

/**
 * @author bdesir
 *
 */
public class CustomerDTO {

	private Long id;

	@NotEmpty
	private String email;

	@NotEmpty
	private String alias;

	@NotEmpty
	private String firstName;

	@NotEmpty(message = "El apellido no puede ser vacio")
	private String lastName;

	@NotNull(message = "La fecha de nacimiento no puede ser vacia")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthday;

	private Direction direction;

	private Country countryOfBirth;

	@NotNull
	private LocalDate dateFrom;

	private LocalDate dateTo;
	private Integer score;
	private StatusCustomer statusCustomer;
	private Set<Cards> cards;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
