package br.com.eaugusto.services;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientService {

	/**
	 * @param client
	 */
	void registerClient(Client client);

	/**
	 * @param cpf
	 * @return
	 */
	Client searchByCpf(String cpf);
}
