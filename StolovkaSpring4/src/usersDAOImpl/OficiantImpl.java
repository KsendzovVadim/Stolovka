package usersDAOImpl;

import java.sql.SQLException;
import java.util.List;

import entity.EntityChatAdminOficiant;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityStatOficiantPovar;
import entity.EntityStatOficiantVidacha;
import usersDAO.IOficiantDAO;

public class OficiantImpl implements IOficiantDAO {

	@Override
	public void otpravitPovaruZakazOper(
			EntityOperOficiantPovar EntityOperOficiantPovar)
			throws SQLException {
		
		
	}

	@Override
	public void otpravitPovaruZakazStat(
			EntityStatOficiantPovar EntityStatOficiantPovar)
			throws SQLException {
		
		
	}

	@Override
	public void zabratUPovaraZakazVStatVidachaBd(
			EntityStatOficiantVidacha EntityStatOficiantVidacha)
			throws SQLException {
		
		
	}

	@Override
	public void zabratUPovaraZakazUdalitIzOperBd(
			EntityOperPovarOficiant EntityOperPovarOficiant)
			throws SQLException {
		
		
	}


	@Override
	public void otpravitPovaruSoobshenie(
			EntityChatOficiantPovar EntityChatOficiantPovar)
			throws SQLException {
		
		
	}


	@Override
	public void otpravitAdminuSoobshenie(
			EntityChatAdminOficiant EntityChatAdminOficiant)
			throws SQLException {
		
		
	}

	@Override
	public List<EntityOperPovarOficiant> posmotretChtoUPovara() throws SQLException {
		
		return null;
	}

	@Override
	public List<EntityChatOficiantPovar> posmotChatSPovarom() throws SQLException {
		
		return null;
	}

	@Override
	public List<EntityChatAdminOficiant> posmotChatSAdminom() throws SQLException {
		
		return null;
	}



}
