package kr.co.fstudy.UserController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.fstudy.UserService.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService use;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String registerAction(HttpServletRequest req) {
		use.register(req);
		return "register";
	}
	
	
}
