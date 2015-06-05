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

import com.opencsv.CSVReader;

import dal.CrudDao;
import dalException.DalException;
import entity.EntityChatAdminOficiant;
import entity.EntityChatAdminPovar;
import entity.EntityChatOficiantPovar;
import entity.EntityOperOficiantPovar;
import entity.EntityPolnoeMenu;
import entity.EntitySkvoznayaStata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

@Controller
@RequestMapping(value="/controllerAdmin/" , method=RequestMethod.GET)
public class ControllerAdmin {
	private Logger LOGGER = Logger.getLogger(ItemController.class
			.getSimpleName());

	@Autowired
	private CrudDao crudDao;
	
	@RequestMapping("/otpravitSoobsheniePovaru")
	public String otpravitSoobsheniePovaru(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "admin";
	String text = request.getParameter("ocomment");
	EntityChatAdminPovar entityChatAdminPovar = new EntityChatAdminPovar();
	entityChatAdminPovar.setChatAdminPovarSotrudnik(sotrudnik);
	entityChatAdminPovar.setChatAdminPovarText(request.getParameter("ocomment"));
	System.out.println(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatAdminPovar",crudDao.merge(entityChatAdminPovar));
	return "forward:/controllerAdmin/zapuskAdmin";
}
	
	@RequestMapping("/otpravitSoobshenieOficiantu")
	public String otpravitSoobshenieOficiantu(Model model, HttpServletRequest request) throws DalException {
	String sotrudnik = "admin";
	String text = request.getParameter("ocomment");
	EntityChatAdminOficiant entityChatAdminOficiant = new EntityChatAdminOficiant();
	entityChatAdminOficiant.setChatAdminOficiantSotrudnik(sotrudnik);
	entityChatAdminOficiant.setChatAdminOficiantText(request.getParameter("ocomment"));
	System.out.println(request.getParameter("ocomment"));
	model.addAttribute("vivestiChatAdminOficiant",crudDao.merge(entityChatAdminOficiant));
	return "forward:/controllerAdmin/zapuskAdmin";
}

	@RequestMapping("/summirovanie")
	public String eposmotretSkvoznuyuStatu(Model model) throws DalException {
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		List<EntitySkvoznayaStata> list = crudDao.list(EntitySkvoznayaStata.class);
		int summAll = 0;
		for (int i = 0; i<list.size(); i++) {
			int summ;
			summ = list.get(i).getSkvoznayaStataObshieZatrati();
			summAll = summAll + summ;
			
			
		}
		System.out.println(summAll);
		model.addAttribute("summa", summAll);
		return "admin";
	}
	
	@RequestMapping("/parsitCSV")
	public String parsitCSV(Model model) throws DalException, IOException {
		
		String csvFile = "E:/Программирование/Java/Java EE/q7.csv";
		char cvsSplitBy = ';';
		CSVReader reader = new CSVReader(new FileReader(csvFile),cvsSplitBy);
		String[] stringOfData;
		int[] intOfData;
		EntityPolnoeMenu entityPolnoeMenu = new EntityPolnoeMenu();
		
		
		
		while ((stringOfData = reader.readNext()) != null) {
			entityPolnoeMenu.setBludoName(stringOfData[0]);
			entityPolnoeMenu.setPrice(Integer.parseInt(stringOfData[1]));
			entityPolnoeMenu.setZatrati(Integer.parseInt(stringOfData[2]));
			entityPolnoeMenu.setPribil(Integer.parseInt(stringOfData[3]));
			model.addAttribute("parsitCSV",crudDao.merge(entityPolnoeMenu));
		  System.out.println(stringOfData[0] + " " + stringOfData[1] + " " + stringOfData[2] + " " + stringOfData[3]);
		}
		
		
		return "admin";
	}
	
	@RequestMapping("/slojitZatrati")
	public String slojitZatrati(Model model) throws DalException {
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		
		return "admin";
	}
	
	@RequestMapping("/posmotretSkvoznuyuStatu")
	public String posmotretSkvoznuyuStatu(Model model) throws DalException {
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		List<EntitySkvoznayaStata> list = crudDao.list(EntitySkvoznayaStata.class);
		int summAll = 0;
		for (int i = 0; i<list.size(); i++) {
			int summ;
			summ = list.get(i).getSkvoznayaStataObshieZatrati();
			summAll = summAll + summ;
			
			
		}
		System.out.println(summAll);
		model.addAttribute("summa", summAll);
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		List<EntitySkvoznayaStata> listp = crudDao.list(EntitySkvoznayaStata.class);
		int summAllp = 0;
		for (int i = 0; i<listp.size(); i++) {
			int summp;
			summp = listp.get(i).getSkvoznayaStataObshayaPribil();
			summAllp = summAllp + summp;
			
			
		}
		System.out.println(summAll);
		model.addAttribute("summap", summAllp);
		
		return "admin";
	}
	
	

	@RequestMapping("/zapuskAdmin")
	public String zapuskAdmin(Model model) throws DalException {

		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		model.addAttribute("vivestiChatAdminPovar",crudDao.list(EntityChatAdminPovar.class));
		model.addAttribute("vivestiChatAdminOficiant",crudDao.list(EntityChatAdminOficiant.class));
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		List<EntitySkvoznayaStata> list = crudDao.list(EntitySkvoznayaStata.class);
		int summAll = 0;
		for (int i = 0; i<list.size(); i++) {
			int summ;
			summ = list.get(i).getSkvoznayaStataObshieZatrati();
			summAll = summAll + summ;
			
			
		}
		System.out.println(summAll);
		model.addAttribute("summa", summAll);
		
		model.addAttribute("posmotretSkvoznuyuStatu",crudDao.list(EntitySkvoznayaStata.class));
		List<EntitySkvoznayaStata> listp = crudDao.list(EntitySkvoznayaStata.class);
		int summAllp = 0;
		for (int i = 0; i<listp.size(); i++) {
			int summp;
			summp = listp.get(i).getSkvoznayaStataObshayaPribil();
			summAllp = summAllp + summp;
			
			
		}
		System.out.println(summAll);
		model.addAttribute("summap", summAllp);
		
		return "admin";
	}
	
		
	@RequestMapping("/vivestiChatOficiantPovar")
	public String vivestiChatOficiantPovar(Model model) throws DalException {
		System.out.println("dlfbmkdf 44444444b");
		model.addAttribute("vivestiChatOficiantPovar",crudDao.list(EntityChatOficiantPovar.class));
		return "forward:/controllerAdmin/zapuskAdmin";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam Long id) {
		
		return "forward:/item/list/";
	}

}
