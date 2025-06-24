package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.eaugusto.dao.ClientDAOMock;
import br.com.eaugusto.dao.IClientDAO;
import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 23, 2025
 */
public class ClientDAOTest {

	private IClientDAO clientDao;

	private Client client;

	public ClientDAOTest() {
		clientDao = new ClientDAOMock();
	}

	@Before
	public void init() {
		client = new Client();

		client.setCpf("12345678910");
		client.setName("Eduardo");
		client.setCity("Java City");
		client.setAddress("Java Street");
		client.setState("Java State");
		client.setAddressNumber(404);
		client.setTelephoneNumber("10 12345-6789");
	}

	@Test
	public void searchClient() {
		Client searchedClient = clientDao.search(client.getCodeOrCPF());

		Assert.assertNotNull(searchedClient);
	}

	@Test
	public void registerClient() {
		Boolean result = clientDao.register(client);
		Assert.assertTrue(result);
	}

	@Test
	public void deleteClient() {
		clientDao.delete(client.getCodeOrCPF());
	}

	@Test
	public void modifyClient() {
		client.setName("Eduardo Augusto");
		clientDao.updateEntity(client);

		Assert.assertEquals("Eduardo Augusto", client.getName());
	}
}
