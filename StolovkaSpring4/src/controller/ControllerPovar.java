package controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dal.CrudDao;
import dalException.DalException;
import entity.EntityChatAdminOficiant;
import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityOperPovarOficiant;
import entity.EntityPolnoeMenu;
import entity.EntitySkvoznayaStata;



@Controller
@RequestMapping(value="/controllerPovar/" , method=RequestMethod.GET)
public class ControllerPovar {
	private Logger LOGGER = Logger.getLogger(ItemController.class
			.getSimpleName());

	@Autowired
	private CrudDao crudDao;

	@RequestMapping("/zapuskPovaraVikachkaInfiBD")
	public String zapuskPovaraVikachkaInfiBD(Model model) throws DalException {
		System.out.println("dlfbmkdf 1111111b");
		model.addAttribute("posmotretChtoPrislalOficiant",crudDao.list(EntityOperOficiantPovar.class));
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		model.addAttribute("vivestiChatAdminPovar",crudDao.list(EntityChatAdminPovar.class));
		model.addAttribute("vivestiChatAdminOficiant",crudDao.list(EntityChatAdminOficiant.class));
		return "povar";
	}
	
	@RequestMapping("/otpravitSoobshenieAdminu")
	public String otpravitSoobshenieAdminu(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "povar";
	String text = request.getParameter("ocomment");
	EntityChatAdminPovar entityChatAdminPovar = new EntityChatAdminPovar();
	entityChatAdminPovar.setChatAdminPovarSotrudnik(sotrudnik);
	entityChatAdminPovar.setChatAdminPovarText(request.getParameter("ocomment"));
	System.out.println(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatAdminPovar",crudDao.merge(entityChatAdminPovar));
	return "forward:/controllerPovar/zapuskPovaraVikachkaInfiBD";
}
	
	@RequestMapping("/otpravitSoobshenieOficiantu")
	public String otpravitSoobshenieOficiantu(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "povar";
	String text = request.getParameter("ocomment");
	EntityChatOficiantPovar entityChatOficiantPovar = new EntityChatOficiantPovar();
	entityChatOficiantPovar.setChatOficiantPovarSotrudnik(sotrudnik);
	entityChatOficiantPovar.setChatOficiantPovarText(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatAdminOficiant",crudDao.merge(entityChatOficiantPovar));
	return "forward:/controllerPovar/zapuskPovaraVikachkaInfiBD";
}
	
	@RequestMapping("/otpravitOficiantuZakaz/{id}" )
	public String otpravitOficiantuZakaz(Model model,@PathVariable String id) throws DalException {
		System.out.println("00000000000000000000000000" + id);
		
		EntityOperOficiantPovar vzyatPoId = crudDao.find(EntityOperOficiantPovar.class, Integer.parseInt(id));
//		EntityPolnoeMenu isPolnogoMenu = crudDao.vzyatVPolnomMenuStrokuPoImeni(vzyatPoId.getOperOficiantPovarBludoName());
		
//		System.out.println(isPolnogoMenu.getPrice() + "  " + isPolnogoMenu.getBludoName());
		EntityOperOficiantPovar isOperOficPovar = crudDao.vzyatIsOperOficPovarPolojitVOperPovarOfic(vzyatPoId.getOperOficiantPovarBludoName());
		System.out.println(isOperOficPovar.getOperOficiantPovarKolichestvo() + isOperOficPovar.getOperOficiantPovarBludoName() + " Название блюда от повара официанту");
		
		EntityOperPovarOficiant polojitVOperPovarOficiant = new EntityOperPovarOficiant();		
		polojitVOperPovarOficiant.setOperPovarOficiantZakaz(isOperOficPovar.getOperOficiantPovarZakaz());
		polojitVOperPovarOficiant.setOperPovarOficiantStolik(isOperOficPovar.getOperOficiantPovarStolik());
		polojitVOperPovarOficiant.setOperPovarOficiantBludoName(isOperOficPovar.getOperOficiantPovarBludoName());
		polojitVOperPovarOficiant.setOperPovarOficiantKolichestvo(isOperOficPovar.getOperOficiantPovarKolichestvo());
		
		model.addAttribute("posmotretChtoPrislalOficiant",crudDao.merge(polojitVOperPovarOficiant));
		crudDao.delete(EntityOperOficiantPovar.class, Integer.parseInt(id));
		return "forward:/controllerPovar/zapuskPovaraVikachkaInfiBD";
	}
	
		
	@RequestMapping("/vivestiChatOficiantPovar")
	public String vivestiChatOficiantPovar(Model model) throws DalException {
		System.out.println("dlfbmkdf 44444444b");
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		return "povar";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam Long id) {
		
		return "forward:/item/list/";
	}

}
