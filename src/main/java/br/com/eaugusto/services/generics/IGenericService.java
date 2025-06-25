package br.com.eaugusto.services.generics;

import java.util.Collection;

import br.com.eaugusto.domain.Persistable;

/**
 * Generic Service Interface Defining Standard CRUD Operations For Persistable
 * Entities.
 * 
 * @param <T> The type of entity managed, which must implement
 *            {@link Persistable}
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since June 24, 2025
 */
public interface IGenericService<T extends Persistable> {

	/**
	 * Registers a new entity.
	 * 
	 * @param entity Entity to register
	 * @return true if registration was successful, false if entity already exists
	 */
	Boolean register(T entity);

	/**
	 * Searches an entity by its unique identifier.
	 * 
	 * @param id Unique identifier (CPF, code, etc.)
	 * @return Entity found or null if not found
	 */
	T search(String id);

	/**
	 * Deletes an entity by its unique identifier.
	 * 
	 * @param id Unique identifier (CPF, code, etc.)
	 */
	void delete(String id);

	/**
	 * Updates an existing entity.
	 * 
	 * @param entity Entity with updated data
	 */
	void modify(T entity);

	/**
	 * Retrieves all entities.
	 * 
	 * @return Collection of all entities
	 */
	Collection<T> searchAll();
}
