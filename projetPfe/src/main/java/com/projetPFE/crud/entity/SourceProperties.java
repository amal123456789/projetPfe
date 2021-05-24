package com.projetPFE.crud.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class SourceProperties {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSourceprop;
	private String value;
	private String loginModif;
	private Date dateModif;
	
	@ManyToOne
	  @JoinColumn(name="properties")
	  private Properties properties;

	public SourceProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SourceProperties(int idSourceprop, String value, String loginModif, Date dateModif, Properties properties) {
		super();
		this.idSourceprop = idSourceprop;
		this.value = value;
		this.loginModif = loginModif;
		this.dateModif = dateModif;
		this.properties = properties;
	}

	public int getIdSourceprop() {
		return idSourceprop;
	}

	public void setIdSourceprop(int idSourceprop) {
		this.idSourceprop = idSourceprop;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLoginModif() {
		return loginModif;
	}

	public void setLoginModif(String loginModif) {
		this.loginModif = loginModif;
	}

	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
	
}
