/**
 * 
 */
package ar.com.mercado.servicios.model.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.com.mercado.servicios.model.entity.Customer;
import ar.com.mercado.servicios.model.entity.filter.CustomerFilter;
import javassist.NotFoundException;

/**
 * @author bdesir
 *
 */
public interface CustomerService {

	/**
	 * @param customer
	 *            guarda los datos del nuevo cliente
	 * @exception Exception
	 *
	 */
	public Customer save(Customer customer);

	/**
	 * Busca un cliente por el id
	 * 
	 * @param id
	 * @exception NotFoundException
	 */
	public Customer getCustomerById(Long idCliente) throws NotFoundException;

	/**
	 * Borra un cliente por id.
	 * 
	 * @param id
	 * 
	 */
	public void delete(Long id) throws NotFoundException;

	/**
	 * Busca por pagina todos los clientes...
	 * @param customerFilter
	 * @param pageable
	 */
	
	public Page<Customer> getAll(CustomerFilter customerFilter,Pageable pageable);
}
