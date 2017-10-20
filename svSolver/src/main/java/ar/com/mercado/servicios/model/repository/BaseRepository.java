/**
 * 
 */
package ar.com.mercado.servicios.model.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author bdesir
 *
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Long>,JpaSpecificationExecutor<T>,Serializable{

}
