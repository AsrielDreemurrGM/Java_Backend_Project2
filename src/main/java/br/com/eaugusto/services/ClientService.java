package br.com.eaugusto.services;

import br.com.eaugusto.dao.IClientDAO;
import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientService implements IClientService {

	private IClientDAO clientDAO;

	public ClientService(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	@Override
	public void registerClient(Client client) {
		clientDAO.register(client);
	}

	@Override
	public Client searchByCpf(String cpf) {
		return clientDAO.searchByCpf(cpf);
	}
}
