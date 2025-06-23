package br.com.eaugusto.dao;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientDAOMock implements IClientDAO {

	@Override
	public Boolean registerClient(Client client) {
		return true;
	}

	@Override
	public Client searchByCpf(String cpf) {
		Client client = new Client();
		client.setCpf(cpf);
		return client;
	}
}
