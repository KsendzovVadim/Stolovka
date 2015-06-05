package controller;

import java.util.List;
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
@RequestMapping(value="/controllerOficiant/" , method=RequestMethod.GET)
public class ControllerOficiant {
	private Logger LOGGER = Logger.getLogger(ItemController.class
			.getSimpleName());

	@Autowired
	private CrudDao crudDao;

	@RequestMapping("/zapuskOficiantaVikachkaInfiBD")
	public String zapuskOficiantaVikachkaInfiBD(Model model) throws DalException {
		System.out.println("Говно2");
		model.addAttribute("posmotretChtoPrislalPovar",crudDao.list(EntityOperPovarOficiant.class));
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		model.addAttribute("vivestiChatAdminOficiant",crudDao.list(EntityChatAdminOficiant.class));
		model.addAttribute("vivestiPolnoeMenu",crudDao.list(EntityPolnoeMenu.class));
		System.out.println("Говно3");
		return "oficiant";
	}
	
		
	@RequestMapping("/vivestiChatOficiantPovar")
	public String vivestiChatOficiantPovar(Model model) throws DalException {
		System.out.println("dlfbmkdf 44444444b");
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		return "oficiant";
	}
	
	@RequestMapping("/otpravitSoobshenieAdminu")
	public String otpravitSoobshenieAdminu(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "oficiant";
	String text = request.getParameter("ocomment");
	EntityChatAdminOficiant entityChatAdminOficiant = new EntityChatAdminOficiant();
	entityChatAdminOficiant.setChatAdminOficiantSotrudnik(sotrudnik);
	entityChatAdminOficiant.setChatAdminOficiantText(request.getParameter("ocomment"));
	System.out.println(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatAdminOficiant",crudDao.merge(entityChatAdminOficiant));
	return "forward:/controllerOficiant/zapuskOficiantaVikachkaInfiBD";
}
	
	
	@RequestMapping("/otpravitSoobsheniePovaru")
	public String otpravitSoobsheniePovaru(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "oficiant";
	String text = request.getParameter("ocomment");
	EntityChatOficiantPovar entityChatOficiantPovar = new EntityChatOficiantPovar();
	entityChatOficiantPovar.setChatOficiantPovarSotrudnik(sotrudnik);
	entityChatOficiantPovar.setChatOficiantPovarText(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatOficiantPovar",crudDao.merge(entityChatOficiantPovar));

	return "forward:/controllerOficiant/zapuskOficiantaVikachkaInfiBD";
}
	
	@RequestMapping("/zabratUPovaraZakaz/{id}" )
	public String zabratUPovaraZakazVSkvoznayaBD(Model model,@PathVariable String id) throws DalException {
		System.out.println("00000000000000000000000000" + id);
//		model.addAttribute("posmotretChtoPrislalPovar");
		
		EntityOperPovarOficiant vzyatId = crudDao.find(EntityOperPovarOficiant.class, Integer.parseInt(id));
		EntityPolnoeMenu isPolnogoMenu = crudDao.vzyatVPolnomMenuStrokuPoImeni(vzyatId.getOperPovarOficiantBludoName());
		
		System.out.println(isPolnogoMenu.getPrice() + "  " + isPolnogoMenu.getBludoName());
		EntityOperPovarOficiant isOperPovarOfic = crudDao.vzyatVOperPovarOficStrokuPoImeni(vzyatId.getOperPovarOficiantBludoName());
		System.out.println(isOperPovarOfic.getOperPovarOficiantKolichestvo() * isPolnogoMenu.getPrice() + " Выручка");
		
		EntitySkvoznayaStata polojitVSkvoznuyuStatu = new EntitySkvoznayaStata();
		
		polojitVSkvoznuyuStatu.setSkvoznayaStataBludoName(isPolnogoMenu.getBludoName());
		polojitVSkvoznuyuStatu.setSkvoznayaStataPrice(isPolnogoMenu.getPrice());
		polojitVSkvoznuyuStatu.setSkvoznayaStataZatrati(isPolnogoMenu.getZatrati());
		polojitVSkvoznuyuStatu.setSkvoznayaStataPribil(isPolnogoMenu.getPribil());
		polojitVSkvoznuyuStatu.setSkvoznayaStataKolichestvo(isOperPovarOfic.getOperPovarOficiantKolichestvo());
		polojitVSkvoznuyuStatu.setSkvoznayaStataObshieZatrati(isPolnogoMenu.getZatrati() * isOperPovarOfic.getOperPovarOficiantKolichestvo());
		polojitVSkvoznuyuStatu.setSkvoznayaStataObshayaPribil(isPolnogoMenu.getPribil() * isOperPovarOfic.getOperPovarOficiantKolichestvo());
		
		model.addAttribute("vivestiPolnoeMenu",crudDao.merge(polojitVSkvoznuyuStatu));
		crudDao.delete(EntityOperPovarOficiant.class, Integer.parseInt(id));
		return "forward:/controllerOficiant/zapuskOficiantaVikachkaInfiBD";
	}
	

	
	@RequestMapping("/otpravitZakazPovaru")
	public String otpravitZakazPovaruz(Model model, HttpServletRequest request) throws DalException {

	List<EntityPolnoeMenu> list = crudDao.list(EntityPolnoeMenu.class);
	String zakaz = request.getParameter("nzakaz");
	String stolik = request.getParameter("nstolik");
	EntityOperPovarOficiant entityOperPovarOficiant = new EntityOperPovarOficiant();
	EntityOperOficiantPovar entityOperOficiantPovar = new EntityOperOficiantPovar();
	System.out.println(request.getParameter("send") + "!!!!!!!!!!!!!!!!!!!" + request.getParameter("nzakaz") + " )))" + request.getParameter("nstolik"));
	
	for (EntityPolnoeMenu entityPolnoeMenu : list) {
//		System.out.println(entityPolnoeMenu.getBludoName() + " " + request.getParameter(entityPolnoeMenu.getBludoName()));
		if(request.getParameter(entityPolnoeMenu.getBludoName()) != null && !request.getParameter(entityPolnoeMenu.getBludoName()).isEmpty()){
			System.out.println("Говно4");
			entityOperOficiantPovar.setOperOficiantPovarZakaz(Integer.parseInt(request.getParameter("nzakaz")));
			entityOperOficiantPovar.setOperOficiantPovarStolik(Integer.parseInt(request.getParameter("nstolik")));
			entityOperOficiantPovar.setOperOficiantPovarBludoName(request.getParameter("send"));
			entityOperOficiantPovar.setOperOficiantPovarKolichestvo(Integer.parseInt(request.getParameter(entityPolnoeMenu.getBludoName())));
			
			model.addAttribute("vivestiPolnoeMenu",crudDao.merge(entityOperOficiantPovar));
			

			System.out.println(Integer.parseInt(request.getParameter(entityPolnoeMenu.getBludoName())) + 500);

		}
			
	}
	
		System.out.println("Говно1");
	return "forward:/controllerOficiant/zapuskOficiantaVikachkaInfiBD";
}
	

	@RequestMapping("/delete")
	public String delete(@RequestParam Long id) {
		
		return "forward:/item/list/";
	}

}
