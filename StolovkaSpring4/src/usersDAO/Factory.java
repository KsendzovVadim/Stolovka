package usersDAO;


import usersDAOImpl.AdminImpl;
import usersDAOImpl.AvtorizaciyaImpl;
import usersDAOImpl.OficiantImpl;
import usersDAOImpl.PovarImpl;


public class Factory {
	
	private static IAdminDAO IAdminDAO = null;
	private static IPovarDAO IPovarDAO = null;
	private static IOficiantDAO IOficiantDAO = null;
	private static IAvtorizaciya IAvtorizaciya = null;
	
	private static Factory instance = null;
	
	public static synchronized Factory getInstance(){
		if(instance == null){
			instance = new Factory();
		}
		return instance;		
	}
	
	public static IAdminDAO getIAdminDAO() {
		if (IAdminDAO == null) {
			IAdminDAO = new AdminImpl();
		}
		return IAdminDAO;
	}



	public static IOficiantDAO getIOficiantDAO() {
		if (IOficiantDAO == null) {
			IOficiantDAO = new OficiantImpl();
		}
		return IOficiantDAO;
	}



	public static IAvtorizaciya getIAvtorizaciya() {
		if (IAvtorizaciya == null) {
			IAvtorizaciya = new AvtorizaciyaImpl();
		}
		return IAvtorizaciya;
	}


	public IPovarDAO getIPovarDAO() {
		if (IPovarDAO == null) {
			IPovarDAO = new PovarImpl();
		}
		return IPovarDAO;
	}

	
	
	
	
}

