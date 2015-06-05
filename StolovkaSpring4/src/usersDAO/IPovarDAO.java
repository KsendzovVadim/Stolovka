package usersDAO;

import java.sql.SQLException;
import java.util.List;

import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityStatPovarOficiant;

public interface IPovarDAO {
	
	public List posmotretChtoDalOficiant() throws SQLException;
	//	public void posmotretChtoDalOficiant(EntityOperOficiantPovar EntityOperOficiantPovar) throws SQLException;
	public void otpravitOficiantuZakazOper(EntityOperPovarOficiant EntityOperPovarOficiant) throws SQLException;
	public void otpravitOficiantuZakazStat(EntityStatPovarOficiant EntityStatPovarOficiant) throws SQLException;
	public void udalitZapisIzOperOficiantPovar(EntityOperOficiantPovar EntityOperOficiantPovar) throws SQLException;
	public List posmotChatSOficiantom() throws SQLException;
	//	public void posmotChatSOficiantom(EntityChatOficiantPovar EntityChatOficiantPovar) throws SQLException;
	public void otpravitOficiantuSoobshenie(EntityChatOficiantPovar EntityChatOficiantPovar) throws SQLException;
	public List posmotChatSAdminom() throws SQLException;
	//	public void posmotChatSAdminom(EntityChatAdminPovar EntityChatAdminPovar) throws SQLException;
	public void otpravitAdminuSoobshenie(EntityChatAdminPovar EntityChatAdminPovar) throws SQLException;

}
