package br.com.eaugusto.dao;

import java.util.Collection;
import java.util.Collections;

import br.com.eaugusto.domain.Client;

/**
 * Mock implementation of {@link IClientDAO} for unit testing purposes.
 * <p>
 * This class simulates the behavior of a DAO without interacting with a real
 * database or in-memory storage.
 * 
 * All operations are simplified or return stubbed responses. Useful for
 * isolated service layer testing.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientDAOMock implements IClientDAO {

	/**
	 * Simulates registering a client.
	 * 
	 * @param entity the client to register
	 * @return always returns {@code true} to simulate success
	 */
	@Override
	public Boolean register(Client entity) {
		return true;
	}

	/**
	 * Simulates deleting a client by CPF.
	 * 
	 * @param value the CPF of the client to delete
	 */
	@Override
	public void delete(String value) {

	}

	/**
	 * Simulates updating a client.
	 * 
	 * @param entity the client with updated information
	 */
	@Override
	public void updateEntity(Client entity) {

	}

	/**
	 * Simulates searching for a client by CPF.
	 * 
	 * @param value the CPF of the client
	 * @return a new {@link Client} instance with the given CPF
	 */
	@Override
	public Client search(String value) {
		Client client = new Client();
		client.setCpf(value);
		return client;
	}

	/**
	 * Simulates fetching all clients.
	 * 
	 * @return an empty collection of clients
	 */
	@Override
	public Collection<Client> searchAll() {
		return Collections.emptyList();
	}
}
