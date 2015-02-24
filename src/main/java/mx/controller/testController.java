package mx.controller;

import mx.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	@Service( value= "")
	private UserService userService;
	
	@RequestMapping(value = "/getName",method = RequestMethod.GET)
	public @ResponseBody String getName(){
		return "angel";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
