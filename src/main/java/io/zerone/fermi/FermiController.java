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

@Controller
public class FermiController {
	@Autowired
	FermiDAO dao;

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
		ra.addAttribute("request", "archive");
		return "redirect:selectFermiList";
	}

	// 리다이렉트 시 파라미터 받기
	@RequestMapping(value = "/selectFermiList", method = RequestMethod.GET)
	public String selectFermiList(@RequestParam(value = "request", defaultValue = "defalutValue") String request, HttpSession session, Model model) {
		ArrayList<FermiQuestion> fermiList = dao.selectFermiList();
		for (FermiQuestion fermiQuestion : fermiList) { ////
			System.out.println(fermiQuestion.toString()); ////
		} ////
		model.addAttribute("fermiList", fermiList);

		if (request.equals("recent")) {
			model.addAttribute("request", "recent");
		} else if (request.equals("archive")) {
			model.addAttribute("request", "archive");
		}
		if (session.getAttribute("user_id").equals("admin")) {
			System.out.println("여기로 갈 수 없는가? admin인데?"); ////
			return "admin";
		}
		return "fermi";
	}

	@RequestMapping(value = "/updateFermi", method = RequestMethod.GET)
	public String updateFermi(FermiQuestion fermi, HttpSession session) {

		// TODO:
		if (session.getAttribute("user_id").equals("admin")) {

		}
		return "admin";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String deleteFermi(int fermi_id, HttpSession session) {
		// TODO
		if (session.getAttribute("user_id").equals("admin")) {

		}
		return "admin";
	}
}
