package br.com.eaugusto.services;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientService {

	Boolean registerClient(Client client);

	Client searchByCpf(String cpf);

	void deleteClient(String cpf);
}
