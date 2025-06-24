package br.com.eaugusto.dao;

import br.com.eaugusto.dao.generics.GenericMapDAO;
import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class ClientDAO extends GenericMapDAO<Client> implements IClientDAO {

	public ClientDAO() {
		super();
	}

	@Override
	public Class<Client> getClassType() {
		return Client.class;
	}

	@Override
	public void updateRegisteredEntityWithNewData(Client newEntity, Client registeredEntity) {

	}
}
