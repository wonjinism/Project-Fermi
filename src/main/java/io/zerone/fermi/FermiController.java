package io.zerone.fermi;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import io.zerone.fermi.DAO.FermiDAO;
import io.zerone.fermi.VO.FermiQuestion;
import io.zerone.fermi.util.PageNavigator;

@Controller
public class FermiController {
	@Autowired
	FermiDAO dao;
	private static final int postPerPage = 5;
	private static final int pagePerGroup = 3;

	@RequestMapping(value = "/admin", method= RequestMethod.GET)
	public String admin() {
		return "redirect:selectFermiList";
	}
	
	// 리다이렉트 시 파라미터 던져주기
	@RequestMapping(value = "/insertFermi", method = RequestMethod.POST)
	public String insertFermi(FermiQuestion fermi, RedirectAttributes ra) {
		System.out.println(fermi.getFermi_title()); //// 
		System.out.println(fermi.getFermi_question()); ////
		int result = dao.insertFermi(fermi);
		return "redirect:selectFermiList";
	}

	// 리다이렉트 시 파라미터 받기
	@RequestMapping(value = "/selectFermiList", method = RequestMethod.GET)
	public String selectFermiList(Model model, String search, @RequestParam(defaultValue="1") int currentPage) {
		System.out.println(search); ////
		int totalPost = dao.countTotalPost(search);
		System.out.println(totalPost); ////
		PageNavigator pn = new PageNavigator(postPerPage, pagePerGroup, currentPage, totalPost);
		
		ArrayList<FermiQuestion> fermiList = dao.selectFermiList(pn, postPerPage, search);
		
		model.addAttribute("fermiList", fermiList);
		model.addAttribute("navi", pn);
		model.addAttribute("search", search);
		return "fermi";
	}
	
	@RequestMapping(value = "/goPage", method = RequestMethod.GET)
	public String goPage(int page, Model model, String search) {
		int totalPost = dao.countTotalPost(search);
		
		PageNavigator pn = new PageNavigator(postPerPage, pagePerGroup, page, totalPost);
		
		ArrayList<FermiQuestion> fermiList = dao.selectFermiList(pn, postPerPage, search);
		
		model.addAttribute("fermiList", fermiList);
		model.addAttribute("navi", pn);
		model.addAttribute("search", search);
		
		return "fermi";
	}
	
	@RequestMapping(value = "/fermiDetails", method = RequestMethod.GET)
	public String fermiDetails(int fermi_id, Model model) {
		FermiQuestion fermi = dao.selectFermi(fermi_id);
		model.addAttribute("fermi", fermi);
		return "details";
	}

	@RequestMapping(value = "/updateFermi", method = RequestMethod.GET)
	public String updateFermi(FermiQuestion fermi, HttpSession session) {

		// TODO:
		if (session.getAttribute("user_id").equals("admin")) {

		}
		return "";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String deleteFermi(int fermi_id, HttpSession session) {
		// TODO
		if (session.getAttribute("user_id").equals("admin")) {

		}
		return "";
	}
	
	

}
