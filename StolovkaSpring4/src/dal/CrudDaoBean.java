package dal;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import util.HibernateUtil;
import dalException.DalException;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityPolnoeMenu;
import entity.EntityUsers;



/**
 * Hibernate crud dao interface implementation
 * 
 * @author harchevnikov_m Date: 18.09.11 Time: 21:20
 */
@Repository
@Transactional
public class CrudDaoBean implements CrudDao {
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Default constructor
	 */
	public CrudDaoBean() {
	}

	@SuppressWarnings("unchecked")
	public <T> T merge(T t) throws DalException {
		try {
			return (T) currentSession().merge(t);
		} catch (HibernateException e) {
			throw new DalException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T, PK extends Serializable> T find(Class<T> type, PK bludoName)
			throws DalException {
		try {	
			return (T) currentSession().get(type, bludoName);
		} catch (HibernateException e) {
			throw new DalException(e);
		}
	}

	public EntityPolnoeMenu getPriceByName(String bludoName) throws SQLException {
		Session session = null;
		EntityPolnoeMenu polnoeMenu = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			polnoeMenu = (EntityPolnoeMenu) session.load(EntityPolnoeMenu.class, bludoName);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Œ·Â 2 ’ÛÈÌË I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return polnoeMenu;
	}
	
	public <T, PK extends Serializable> void delete(Class<T> type, PK id)
			throws DalException {
		try {
			Session currentSession = currentSession();
			Object object = currentSession.get(type, id);
			currentSession.delete(object);
		} catch (HibernateException e) {
			throw new DalException(e);
		}

	}

	@SuppressWarnings({ "unchecked" })
	public <T> List<T> list(Class<T> type) throws DalException {
		try {
			return currentSession().createCriteria(type).list();			
		} catch (HibernateException e) {
			throw new DalException(e);
		}
	}

	private Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();		
		//Session currentSession = sessionFactory.openSession();
		return currentSession;
	}

	@Override
	public EntityPolnoeMenu vzyatVPolnomMenuStrokuPoImeni(String name)
			throws DalException {
		Query query = currentSession().createQuery("from EntityPolnoeMenu where BLUDONAME = :name");
		query.setParameter("name", name);
		EntityPolnoeMenu entityPolnoeMenu = (EntityPolnoeMenu) query.uniqueResult();
		return entityPolnoeMenu;
	}
	
	@Override
	public EntityOperPovarOficiant vzyatVOperPovarOficStrokuPoImeni(String name)
			throws DalException {
		Query query = currentSession().createQuery("from EntityOperPovarOficiant where BLUDONAME = :name");
		query.setParameter("name", name);
		EntityOperPovarOficiant entityOperPovarOficiant = (EntityOperPovarOficiant) query.uniqueResult();
		return entityOperPovarOficiant;
		
	}
	
	@Override
	public EntityOperOficiantPovar vzyatIsOperOficPovarPolojitVOperPovarOfic(
			String name) throws DalException {
		Query query = currentSession().createQuery("from EntityOperOficiantPovar where BLUDONAME = :name");
		query.setParameter("name", name);
		EntityOperOficiantPovar entityOperOficiantPovar = (EntityOperOficiantPovar) query.uniqueResult();
		return entityOperOficiantPovar;
	}

	@Override
	public EntityUsers login(String usersLogin, int usersPass)
			throws DalException {
		Query query = currentSession().createQuery("from EntityUsers where login = :login and pass = :pass");
		query.setParameter("login", usersLogin);
		query.setParameter("pass", usersPass);
		EntityUsers entityUsers = (EntityUsers) query.uniqueResult();
		return entityUsers;
	}




}