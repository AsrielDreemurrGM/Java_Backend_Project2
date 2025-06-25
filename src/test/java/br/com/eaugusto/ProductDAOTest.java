package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.eaugusto.dao.IProductDAO;
import br.com.eaugusto.dao.ProductDAOMock;
import br.com.eaugusto.domain.Product;

/**
 * Unit tests for ProductDAO using mock implementation.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since June 24, 2025
 */
public class ProductDAOTest {

	private IProductDAO productDao;

	private Product product;

	public ProductDAOTest() {
		productDao = new ProductDAOMock();
	}

	@Before
	public void init() {
		product = new Product("Notebook", "ABC123", "Notebook With Intel i7", 4500.00, "Tech");
	}

	@Test
	public void searchProduct() {
		Product searchedProduct = productDao.search(product.getCodeOrCPF());

		Assert.assertNotNull(searchedProduct);
	}

	@Test
	public void registerProduct() {
		Boolean result = productDao.register(product);
		Assert.assertTrue(result);
	}

	@Test
	public void deleteProduct() {
		productDao.delete(product.getCodeOrCPF());
	}

	@Test
	public void modifyProduct() {
		product.setDescription("Notebook With Intel i9");
		productDao.updateEntity(product);

		Assert.assertEquals("Notebook With Intel i9", product.getDescription());
	}
}
