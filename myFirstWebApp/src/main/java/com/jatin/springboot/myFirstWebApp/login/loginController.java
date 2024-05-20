package com.jatin.springboot.myFirstWebApp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	private AuthenticationService authenticationService;
	
	public loginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String gotoLogin() {
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	
		public String gotowelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
			if(authenticationService.authenticate(name,password)) {
			model.put("name",name);
			model.put("password",password);
			return "welcome";
			}
			model.put("errorMessage","invalid credentials, please try again.");
			return "login";
		}

	
	}
