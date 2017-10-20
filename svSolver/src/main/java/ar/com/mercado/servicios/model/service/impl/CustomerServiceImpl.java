/**
 * 
 */
package ar.com.mercado.servicios.model.service.impl;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.mercado.servicios.model.entity.Customer;
import ar.com.mercado.servicios.model.entity.filter.CustomerFilter;
import ar.com.mercado.servicios.model.repository.CustomerRepository;
import ar.com.mercado.servicios.model.service.CustomerService;
import javassist.NotFoundException;

/**
 * @author bdesir
 *
 */
@Service
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

	private static final Logger _LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerService customerService;
	
	@Override
	@Transactional
	public Customer save(Customer customer) {
	return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Long idCliente) throws NotFoundException {
		_LOGGER.info("buscando el cliente id: {}",idCliente);
		return customerRepository.findOne(idCliente);
	}

	@Override
	public void delete(Long id) throws NotFoundException {
		// TODO Auto-generated method stub
	}

	@Override
	public Page<Customer> getAll(CustomerFilter customerFilter, Pageable pageable) {
		// TODO filer & specification para el mapeo.
		return null;
	}


}
