package com.projetPFE.crud.elasticController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetPFE.crud.elasticService.UserServiceElastic;
import com.projetPFE.crud.entity.User;
import com.projetPFE.crud.model.UserModel;

@RestController
@CrossOrigin(origins = "*")
public class UserControllerElastic {
	@Autowired
	UserServiceElastic serviceElastic ;
	
	
	@RequestMapping("/aa")
    public String SpringBootESExample() {
        return "Welcome to Spring Boot Elastic Search Example";
    }
	
	@RequestMapping(value = "/user/_search", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUSERSs(){
		return serviceElastic.getAllUsers();
	}
	
	@RequestMapping(value = "/user/adddocu", method = RequestMethod.POST)
	public String addUser(@RequestBody UserModel user) {
		return serviceElastic.addUser(user);
	}
	
	@RequestMapping(value = "/user/_doc/{id}/_update?pretty", method = RequestMethod.PUT)
	public String updateUser(@RequestBody UserModel user) {
		return serviceElastic.updateUser(user);
	}
	
	@RequestMapping(value = "/user/_doc/{id}", method = RequestMethod.DELETE)
	public String removeUser(@RequestBody UserModel user) {
		return serviceElastic.removeUser(user);
	}
	
	
	
}
