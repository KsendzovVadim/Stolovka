package controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dal.CrudDao;
import dalException.DalException;
import entity.EntityChatAdminPovar;



@Controller
@RequestMapping(value="/item/" , method=RequestMethod.GET)
public class ItemController {
	private Logger LOGGER = Logger.getLogger(ItemController.class
			.getSimpleName());

	@Autowired
	private CrudDao crudDao;

	@RequestMapping("/list")
	public String list(Model model) throws DalException {
		System.out.println("dlfbmkdf b");
		model.addAttribute("list",crudDao.list(EntityChatAdminPovar.class));
		return "povar";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam Long id) {
		
		return "forward:/item/list/";
	}

}
