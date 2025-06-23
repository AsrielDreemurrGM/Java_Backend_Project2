package br.com.eaugusto.dao;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientDAO {

	Boolean registerClient(Client client);

	Client searchByCpf(String cpf);

	void deleteClient(String cpf);
}
