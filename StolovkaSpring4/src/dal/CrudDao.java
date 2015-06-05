package dal;

import java.io.Serializable;
import java.util.List;

import dalException.DalException;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityPolnoeMenu;
import entity.EntityUsers;



/**
 * CRUD interface
 * 
 * @author mihm
 */
public interface CrudDao {

	/**
	 * Creates/updates a new object for the given type.
	 * 
	 * @param <T>
	 *            Entity class
	 * @param t
	 *            entity
	 * @return persisted Object
	 */
	<T> T merge(T t) throws DalException;

	/**
	 * Delete object by id
	 * 
	 * @param <T>
	 * @param <PK>
	 * @param type
	 *            , entity class type
	 * @param id
	 */
	<T, PK extends Serializable> void delete(Class<T> type, PK id)
			throws DalException;

	/**
	 * Find object by id
	 * 
	 * @param <T>
	 * @param <PK>
	 * @param type
	 * @param id
	 * @return the object
	 */
	<T, PK extends Serializable> T find(Class<T> type, PK id)
			throws DalException;

	/**
	 * List of objects
	 * 
	 * @param type
	 * @param <T>
	 * @return
	 */
	<T> List<T> list(Class<T> type) throws DalException;
	
	
	EntityPolnoeMenu vzyatVPolnomMenuStrokuPoImeni(String name)
			throws DalException;
	
	EntityOperPovarOficiant vzyatVOperPovarOficStrokuPoImeni(String name)
			throws DalException;
	
	EntityOperOficiantPovar vzyatIsOperOficPovarPolojitVOperPovarOfic(String name)
			throws DalException;
	
	EntityUsers login(String usersLogin, int usersPass)
			throws DalException;
	
	
	
	
}
