package controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dal.CrudDao;
import dalException.DalException;
import entity.EntityChatAdminOficiant;
import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityUsers;



@Controller
@RequestMapping(value="/controllerLogin/" , method=RequestMethod.GET)
public class ControllerLogin {
	private Logger LOGGER = Logger.getLogger(ItemController.class
			.getSimpleName());

	@Autowired
	private CrudDao crudDao;

	@RequestMapping("/posmotretChtoPrislalOficiant")
	public String zapuskPovaraVikachkaInfiBD(Model model) throws DalException {
		System.out.println("dlfbmkdf 1111111b");
		model.addAttribute("posmotretChtoPrislalOficiant",crudDao.list(EntityOperOficiantPovar.class));
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		model.addAttribute("vivestiChatAdminPovar",crudDao.list(EntityChatAdminPovar.class));
		model.addAttribute("vivestiChatAdminOficiant",crudDao.list(EntityChatAdminOficiant.class));
		return "povar";
	}
	
	@RequestMapping("/sravnitSBDPoslatNaJSP")
	public String sravnitSBDPoslatNaJSP(Model model, HttpServletRequest request) throws DalException {
		String userName = request.getParameter("login");
		int pasS = Integer.parseInt(request.getParameter("pass"));
		String paSs = request.getParameter("pass");
		EntityUsers users = crudDao.login(userName, pasS);
		
		if (users == null && userName.isEmpty() && paSs.isEmpty())
			return "forward:/controllerLogin/zapuskErrorLogin";
		
		if(userName.equals("povar"))
			return "forward:/controllerPovar/zapuskPovaraVikachkaInfiBD";
		
		if(userName.equals("oficiant"))
			return "forward:/controllerOficiant/zapuskOficiantaVikachkaInfiBD";
		
		if(userName.equals("admin"))
			return "forward:/controllerAdmin/zapuskAdmin";
		
		
		return "forward:/controllerLogin/zapuskErrorLogin";
	}
	
	@RequestMapping("/zapuskLogin")
	public String zapuskLogin(Model model) throws DalException {
		
		return "login";
	}
	
	@RequestMapping("/zapuskErrorLogin")
	public String zapuskErrorLogin(Model model) throws DalException {
		
		return "loginError";
	}


	@RequestMapping("/delete")
	public String delete(@RequestParam Long id) {
		
		return "forward:/item/list/";
	}

}
