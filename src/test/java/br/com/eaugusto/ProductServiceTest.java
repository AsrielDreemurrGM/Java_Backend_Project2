package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.eaugusto.dao.IProductDAO;
import br.com.eaugusto.dao.ProductDAOMock;
import br.com.eaugusto.domain.Product;
import br.com.eaugusto.services.IProductService;
import br.com.eaugusto.services.ProductService;

/**
 * Unit Tests For The {@link ProductService} Class.
 * 
 * <p>
 * This class tests the CRUD operations of the ProductService, ensuring that
 * registering, searching, deleting, and modifying Product entities behave as
 * expected.
 * </p>
 * 
 * <p>
 * Uses a {@link ProductDAOMock} as the data source to isolate the service layer
 * from persistence concerns during testing.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 25, 2025
 */
public class ProductServiceTest {

	private IProductService productService;
	private Product product;

	public ProductServiceTest() {
		IProductDAO dao = new ProductDAOMock();
		productService = new ProductService(dao);
	}

	@Before
	public void init() {
		product = new Product();
		product.setCode("10987654321");
		product.setName("Laptop Lenovo");
		product.setDescription("Laptop With Windows");
		product.setBrand("Lenovo");
		product.setValue(1599.99);
	}

	@Test
	public void searchProduct() {
		Product searchedClient = productService.search(product.getCodeOrCPF());
		Assert.assertNotNull(searchedClient);
	}

	@Test
	public void registerProduct() {
		Boolean result = productService.register(product);
		Assert.assertTrue(result);
	}

	@Test
	public void deleteProduct() {
		productService.delete(product.getCodeOrCPF());
	}

	@Test
	public void modifyProduct() {
		product.setName("Eduardo Augusto");
		productService.modify(product);
		Assert.assertEquals("Eduardo Augusto", product.getName());
	}
}
