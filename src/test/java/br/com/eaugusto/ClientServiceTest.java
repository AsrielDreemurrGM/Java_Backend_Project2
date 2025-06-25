package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.eaugusto.dao.ClientDAOMock;
import br.com.eaugusto.dao.IClientDAO;
import br.com.eaugusto.domain.Client;
import br.com.eaugusto.services.ClientService;
import br.com.eaugusto.services.IClientService;

/**
 * Unit tests for the {@link ClientService} class. Uses {@link ClientDAOMock} as
 * the data provider.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientServiceTest {

	private IClientService clientService;
	private Client client;

	public ClientServiceTest() {
		IClientDAO dao = new ClientDAOMock();
		clientService = new ClientService(dao);
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
		Client searchedClient = clientService.searchByCpf(client.getCodeOrCPF());
		Assert.assertNotNull(searchedClient);
	}

	@Test
	public void registerClient() {
		Boolean result = clientService.registerClient(client);
		Assert.assertTrue(result);
	}

	@Test
	public void deleteClient() {
		clientService.deleteClient(client.getCodeOrCPF());
	}

	@Test
	public void modifyClient() {
		client.setName("Eduardo Augusto");
		clientService.modifyClient(client);
		Assert.assertEquals("Eduardo Augusto", client.getName());
	}
}
