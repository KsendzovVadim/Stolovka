package usersDAOImpl;

import java.sql.SQLException;
import java.util.List;

import entity.EntityChatAdminOficiant;
import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import usersDAO.IAdminDAO;

public class AdminImpl implements IAdminDAO {

	@Override
	public List<EntityChatAdminPovar> posmotretChatSPovarom() throws SQLException {
		
		return null;
	}

	@Override
	public List<EntityChatAdminOficiant> posmotretChatSOficiantom() throws SQLException {
		
		return null;
	}

	@Override
	public List<EntityChatOficiantPovar> posmotretChatPovoraSOficiantom() throws SQLException {
		
		return null;
	}

	@Override
	public List posmotretSkvoznuyuStatistiku() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<EntitySkvoznayaStata> posmotretSkvoznuyuStatistiku() throws SQLException {
//		
//		return null;
//	}
	
	

	
}
