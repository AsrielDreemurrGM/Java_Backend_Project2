package br.com.eaugusto.services;

import br.com.eaugusto.domain.Client;

/**
 * Interface that defines the client-related business operations.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientService {

	/**
	 * Registers a new client.
	 * 
	 * @param client the client to register
	 * @return true if registration is successful
	 */
	Boolean registerClient(Client client);

	/**
	 * Searches for a client using the CPF.
	 * 
	 * @param cpf the CPF to search
	 * @return the found client or null
	 */
	Client searchByCpf(String cpf);

	/**
	 * Deletes a client using their CPF.
	 * 
	 * @param cpf the CPF of the client to delete
	 */
	void deleteClient(String cpf);

	/**
	 * Updates the data of an existing client.
	 * 
	 * @param client the updated client object
	 */
	void modifyClient(Client client);
}
