package io.zerone.fermi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	@RequestMapping(value = "/register", method= RequestMethod.GET)
	public void register() {
	}
	
	@RequestMapping(value = "/signin", method= RequestMethod.GET)
	public void signin() {
	}
	
	@RequestMapping(value = "/recent", method= RequestMethod.GET)
	public String recent() {
		return "fermi";
	}
	
	@RequestMapping(value = "/archive", method= RequestMethod.GET)
	public String archive() {
		return "fermi";
	}
}
