package br.com.eaugusto.dao;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientDAO {

	/**
	 * @param client
	 */
	void register(Client client);

	Client searchByCpf(String cpf);
}
