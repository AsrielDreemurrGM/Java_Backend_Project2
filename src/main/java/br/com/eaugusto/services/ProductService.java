package br.com.eaugusto.services;

import br.com.eaugusto.dao.IProductDAO;
import br.com.eaugusto.domain.Product;
import br.com.eaugusto.services.generics.GenericService;

/**
 * Product Service Extending GenericService To Reuse CRUD Logic, Implementing
 * IProductService Interface.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 25, 2025
 */
public class ProductService extends GenericService<Product> implements IProductService {

	public ProductService(IProductDAO productDAO) {
		super(productDAO);
	}
}
