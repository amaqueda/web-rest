package mx.service;

import mx.vo.UserVo;

import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {
	
	public UserVo getusuario(){
		UserVo userVo = new UserVo();
		userVo.setFirstname("angel");
		userVo.setLastName("aguilar");
		return userVo;
	}

}
