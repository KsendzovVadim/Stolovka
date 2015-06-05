package usersDAO;

import java.sql.SQLException;

import entity.EntityUsers;

public interface IAvtorizaciya {
	
	public void sravnitLoginIPassSBD(EntityUsers EntityUsers) throws SQLException;
	public void zagruzitNuzhniyJSP() throws SQLException;
	
	

}
