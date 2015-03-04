package mx.controller.service;

import java.util.HashMap;
import java.util.Map;

import mx.vo.UserVo;

import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {
	  
	public Map<String, String> getusuario(){
		Map< String, String> map = new HashMap<String, String>();
		map.put("user", "angel");
		return map;
	}
	
	public UserVo getusuarioVo(){
		UserVo userVo = new UserVo();
		userVo.setFirstname("angel");
		userVo.setLastName("aguilar");
		return userVo;
	}
	
	public String getUsername(){
		return "testService";
	}

}
