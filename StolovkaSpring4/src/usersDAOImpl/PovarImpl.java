package usersDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import org.hibernate.Criteria;
import org.hibernate.Session;
import util.HibernateUtil;

import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityStatPovarOficiant;
import usersDAO.IPovarDAO;


public class PovarImpl implements IPovarDAO {


	@Override
	public void otpravitOficiantuZakazOper(
			EntityOperPovarOficiant EntityOperPovarOficiant)
			throws SQLException {
		
		
	}

	@Override
	public void otpravitOficiantuZakazStat(
			EntityStatPovarOficiant EntityStatPovarOficiant)
			throws SQLException {
		
		
	}

	@Override
	public void udalitZapisIzOperOficiantPovar(
			EntityOperOficiantPovar EntityOperOficiantPovar)
			throws SQLException {
		
	}


	@Override
	public void otpravitOficiantuSoobshenie(
			EntityChatOficiantPovar EntityChatOficiantPovar)
			throws SQLException {
		
		
	}


	@Override
	public void otpravitAdminuSoobshenie(
			EntityChatAdminPovar EntityChatAdminPovar) throws SQLException {
		
		
	}

	@Override
	public List<EntityOperOficiantPovar> posmotretChtoDalOficiant() throws SQLException {
		Session session = null;
		List<EntityOperOficiantPovar> smotritChtoDalOficiant = new ArrayList<EntityOperOficiantPovar>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			smotritChtoDalOficiant = session.createCriteria(EntityOperOficiantPovar.class).list();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "posmotretChtoDalOficiant Не получается посмотреть что дал официант", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return null;
	}

	@Override
	public List<EntityChatOficiantPovar> posmotChatSOficiantom() throws SQLException {
		
		return null;
	}

	@Override
	public List<EntityChatAdminPovar> posmotChatSAdminom() throws SQLException {
		
		return null;
	}

}
