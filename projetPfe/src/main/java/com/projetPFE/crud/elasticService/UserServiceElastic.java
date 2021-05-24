package com.projetPFE.crud.elasticService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetPFE.crud.RepositoryElastic.UserRepoElastic;
import com.projetPFE.crud.entity.User;
import com.projetPFE.crud.model.UserModel;
@Service
public class UserServiceElastic {
	@Autowired
	UserRepoElastic userRepoElastic ;
	
	
	public List<User> getAllUsers(){
		 try {
			 List<UserModel> users = (List<UserModel>) userRepoElastic.findAll();
			 List<User> customUsers = new ArrayList<>();
			 users.stream().forEach(e -> {
				 User user = new User();
				 BeanUtils.copyProperties(e, user);
				 customUsers.add(user);
			 });
			 return customUsers;
			 
		 }catch(Exception e) {
			 throw e;
		 }
		 
	 }
	 
	 public String addUser(UserModel user) {
			try {
				if (!userRepoElastic.existsByLastName(user.getLastName())) {
					userRepoElastic.save(user);
					return "Employee added successfully";
				}else {
					return "This employee already exists in the database.";
				}
			}catch (Exception e) {
				throw e;
			}
		}
		
		public String removeUser(UserModel user) {
			try {
				if (userRepoElastic.existsByLastName(user.getLastName())) {
					userRepoElastic.delete(user);
					return "Employee deleted successfully.";
				} else {
					return "Employee does not exist.";
				}
			}catch (Exception e) {
				throw e;
			}
		}
		
		public String updateUser(UserModel user) {
			try {
				if (userRepoElastic.existsById(user.getId())) {
					userRepoElastic.save(user);
					return "Employee updated successfully.";
				} else {
					return "Employee does not exist.";
				}
			}catch (Exception e) {
				throw e;
			}
		} 
	 
	

}
