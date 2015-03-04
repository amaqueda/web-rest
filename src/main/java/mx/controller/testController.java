package mx.controller;

import java.util.Map;

import mx.controller.service.UserService;
import mx.vo.UserVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	@Autowired	
	UserService userService;
	 
	@RequestMapping(value = "/getName",method = RequestMethod.GET)
	public @ResponseBody String getName(){
		return "angel";
	}

	@RequestMapping(value = "/getUserName", method = RequestMethod.GET,headers="Accept=application/json", produces = "application/json")
	public @ResponseBody String getUserName(){
		return userService.getUsername();
	}
	
	@RequestMapping(value="/getUser", method = RequestMethod.GET)
	public @ResponseBody UserVo getUser(){
		UserVo userVo = new UserVo();
		userVo.setFirstname("angel");
		userVo.setLastName("aguilar");
		return userVo;
	}
	
//	public UserService getUserService() {
//		return userService;
//	}
//
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
	
	
}
