package br.com.eaugusto.services;

import br.com.eaugusto.dao.IClientDAO;
import br.com.eaugusto.domain.Client;
import br.com.eaugusto.services.generics.GenericService;

/**
 * Client Service Extending GenericService For Reuse Of CRUD Logic, While
 * Implementing IClientService For Future Client-Specific Methods.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since June 22, 2025
 */
public class ClientService extends GenericService<Client> implements IClientService {

	public ClientService(IClientDAO clientDAO) {
		super(clientDAO);
	}
}
