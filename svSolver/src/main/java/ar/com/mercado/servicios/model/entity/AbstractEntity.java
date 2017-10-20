/**
 * 
 */
package ar.com.mercado.servicios.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author bdesir
 *
 */
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@CreatedDate
	@Column(nullable = false)
	private Date createdAt;

	@JsonIgnore
	@LastModifiedDate
	@Column(nullable = true)
	private Date updatedAt;

	@JsonIgnore
	@CreatedBy
	@Column(nullable = true)
	private String createdBy;

	@JsonIgnore
	@LastModifiedBy
	@Column(nullable = true)
	private String updatedBy;
}
