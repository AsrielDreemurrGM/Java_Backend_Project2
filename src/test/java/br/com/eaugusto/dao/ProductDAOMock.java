package br.com.eaugusto.dao;

import java.util.Collection;
import java.util.Collections;

import br.com.eaugusto.domain.Product;

/**
 * Mock implementation of IProductDAO for unit testing.
 * 
 * @see IProductDAO
 * @see Product
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since June 24, 2025
 */
public class ProductDAOMock implements IProductDAO {

	@Override
	public Boolean register(Product entity) {
		return true;
	}

	@Override
	public void delete(String value) {
		// mock deletion logic
	}

	@Override
	public void updateEntity(Product entity) {
		// mock update logic
	}

	@Override
	public Product search(String value) {
		return new Product("Mocked", value, "Mocked Description", 0.0, "MockBrand");
	}

	@Override
	public Collection<Product> searchAll() {
		return Collections.emptyList();
	}
}
