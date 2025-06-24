package br.com.eaugusto.dao;

import java.util.Collection;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientDAOMock implements IClientDAO {

	@Override
	public Boolean register(Client entity) {
		return true;
	}

	@Override
	public void delete(String value) {

	}

	@Override
	public void updateEntity(Client entity) {

	}

	@Override
	public Client search(String value) {
		Client client = new Client();
		client.setCpf(value);
		return client;
	}

	@Override
	public Collection<Client> searchAll() {
		return null;
	}
}
