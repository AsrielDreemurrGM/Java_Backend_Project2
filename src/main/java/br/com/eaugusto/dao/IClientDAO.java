package br.com.eaugusto.dao;

import br.com.eaugusto.dao.generics.IGenericDAO;
import br.com.eaugusto.domain.Client;

/**
 * Interface that defines DAO operations specific to {@link Client}. Extends the
 * generic interface {@link IGenericDAO}.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public interface IClientDAO extends IGenericDAO<Client> {

}
