package usersDAO;

import java.sql.SQLException;
import java.util.List;

public interface IAdminDAO {
	
	public List posmotretChatSPovarom() throws SQLException;
	public List posmotretChatSOficiantom() throws SQLException;
	public List posmotretChatPovoraSOficiantom() throws SQLException;
	public List posmotretSkvoznuyuStatistiku() throws SQLException;
	
	

}
