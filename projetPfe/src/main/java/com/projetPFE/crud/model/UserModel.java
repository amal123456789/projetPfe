package com.projetPFE.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "user")

public class UserModel {
	@Id
	private int id;
	@Field(type = FieldType.Text)
	private String cin;
	@Field(type = FieldType.Text)

	private String firstName;
	@Field(type = FieldType.Text)

	private String lastName;
	@Field(type = FieldType.Text)

	private String phone;
	@Field(type = FieldType.Text)

	private String mail;
	@Field(type = FieldType.Text)

	private String login;
	@Field(type = FieldType.Text)

	private String password;
	@Field(type = FieldType.Text)

		
	private Role role;

	public UserModel() {
		
	}

	public UserModel(int id, String cin, String firstName, String lastName, String phone, String mail, String login,
			String password, Role role) {
		super();
		this.id = id;
		this.cin = cin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.mail = mail;
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}



	

	
	 
	

}
