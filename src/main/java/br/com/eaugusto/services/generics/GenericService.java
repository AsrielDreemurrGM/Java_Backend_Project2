package br.com.eaugusto.services.generics;

import java.util.Collection;

import br.com.eaugusto.dao.generics.IGenericDAO;
import br.com.eaugusto.domain.Persistable;

/**
 * Generic Service Implementation That Uses {@link IGenericDAO} For The CRUD
 * Operations.
 * 
 * <p>
 * This class provides a reusable base implementation for service layers that
 * manage entities extending {@link Persistable}. It acts as a bridge between
 * the application logic and the persistence layer, delegating all operations to
 * the configured {@link IGenericDAO} instance.
 * </p>
 * 
 * @param <T> The type of entity managed, which must implement
 *            {@link Persistable}
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since June 24, 2025
 */
public class GenericService<T extends Persistable> implements IGenericService<T> {

	protected final IGenericDAO<T> dao;

	public GenericService(IGenericDAO<T> dao) {
		this.dao = dao;
	}

	@Override
	public Boolean register(T entity) {
		return dao.register(entity);
	}

	@Override
	public T search(String id) {
		return dao.search(id);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public void modify(T entity) {
		dao.updateEntity(entity);
	}

	@Override
	public Collection<T> searchAll() {
		return dao.searchAll();
	}
}
