package usersDAO;

import java.sql.SQLException;
import java.util.List;

import entity.EntityChatAdminOficiant;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityStatOficiantPovar;
import entity.EntityStatOficiantVidacha;

public interface IOficiantDAO {
	
	public void otpravitPovaruZakazOper(EntityOperOficiantPovar EntityOperOficiantPovar) throws SQLException;
	public void otpravitPovaruZakazStat(EntityStatOficiantPovar EntityStatOficiantPovar) throws SQLException;
	public void zabratUPovaraZakazVStatVidachaBd(EntityStatOficiantVidacha EntityStatOficiantVidacha) throws SQLException;
	public void zabratUPovaraZakazUdalitIzOperBd(EntityOperPovarOficiant EntityOperPovarOficiant) throws SQLException;
	public List posmotretChtoUPovara() throws SQLException;
//	public void posmotretChtoUPovara(EntityOperPovarOficiant EntityOperPovarOficiant) throws SQLException;
	public List posmotChatSPovarom() throws SQLException;
//	public void posmotChatSPovarom(EntityChatOficiantPovar EntityChatOficiantPovar) throws SQLException;
	public void otpravitPovaruSoobshenie(EntityChatOficiantPovar EntityChatOficiantPovar) throws SQLException;
	public List posmotChatSAdminom() throws SQLException;
//	public void posmotChatSAdminom(EntityChatAdminOficiant EntityChatAdminOficiant) throws SQLException;
	public void otpravitAdminuSoobshenie(EntityChatAdminOficiant EntityChatAdminOficiant) throws SQLException;
	

}
