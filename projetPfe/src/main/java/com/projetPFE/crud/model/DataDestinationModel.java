package com.projetPFE.crud.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "datadestination_new", createIndex = true)

public class DataDestinationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDestination;
	@Field(type = FieldType.Text)
	private String ipAdressDestination;
	@Field(type = FieldType.Text)
	private String portDestination;
	@Field(type = FieldType.Text)
	private String descritpionDestination;
	@Field(type = FieldType.Text)
	private String numUserDestination;
	@Field(type = FieldType.Text)
	private String passwordDestination;
	
	
	//@ManyToOne
	  //@JoinColumn(name="datasourcemodel")
	@Field(type = FieldType.Nested)
	  private DataSourceModel datasource;


	public int getIdDestination() {
		return idDestination;
	}


	public void setIdDestination(int idDestination) {
		this.idDestination = idDestination;
	}


	public String getIpAdressDestination() {
		return ipAdressDestination;
	}


	public void setIpAdressDestination(String ipAdressDestination) {
		this.ipAdressDestination = ipAdressDestination;
	}


	public String getPortDestination() {
		return portDestination;
	}


	public void setPortDestination(String portDestination) {
		this.portDestination = portDestination;
	}


	public String getDescritpionDestination() {
		return descritpionDestination;
	}


	public void setDescritpionDestination(String descritpionDestination) {
		this.descritpionDestination = descritpionDestination;
	}


	public String getNumUserDestination() {
		return numUserDestination;
	}


	public void setNumUserDestination(String numUserDestination) {
		this.numUserDestination = numUserDestination;
	}


	public String getPasswordDestination() {
		return passwordDestination;
	}


	public void setPasswordDestination(String passwordDestination) {
		this.passwordDestination = passwordDestination;
	}


	public DataSourceModel getDatasource() {
		return datasource;
	}


	public void setDatasource(DataSourceModel datasource) {
		this.datasource = datasource;
	}


	@Override
	public String toString() {
		return "DataDestinationModel [idDestination=" + idDestination + ", ipAdressDestination=" + ipAdressDestination
				+ ", portDestination=" + portDestination + ", descritpionDestination=" + descritpionDestination
				+ ", numUserDestination=" + numUserDestination + ", passwordDestination=" + passwordDestination
				+ ", datasource=" + datasource + "]";
	}


	public DataDestinationModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DataDestinationModel(int idDestination, String ipAdressDestination, String portDestination,
			String descritpionDestination, String numUserDestination, String passwordDestination,
			DataSourceModel datasource) {
		super();
		this.idDestination = idDestination;
		this.ipAdressDestination = ipAdressDestination;
		this.portDestination = portDestination;
		this.descritpionDestination = descritpionDestination;
		this.numUserDestination = numUserDestination;
		this.passwordDestination = passwordDestination;
		this.datasource = datasource;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataDestinationModel other = (DataDestinationModel) obj;
		if (datasource == null) {
			if (other.datasource != null)
				return false;
		} else if (!datasource.equals(other.datasource))
			return false;
		if (descritpionDestination == null) {
			if (other.descritpionDestination != null)
				return false;
		} else if (!descritpionDestination.equals(other.descritpionDestination))
			return false;
		if (idDestination != other.idDestination)
			return false;
		if (ipAdressDestination == null) {
			if (other.ipAdressDestination != null)
				return false;
		} else if (!ipAdressDestination.equals(other.ipAdressDestination))
			return false;
		if (numUserDestination == null) {
			if (other.numUserDestination != null)
				return false;
		} else if (!numUserDestination.equals(other.numUserDestination))
			return false;
		if (passwordDestination == null) {
			if (other.passwordDestination != null)
				return false;
		} else if (!passwordDestination.equals(other.passwordDestination))
			return false;
		if (portDestination == null) {
			if (other.portDestination != null)
				return false;
		} else if (!portDestination.equals(other.portDestination))
			return false;
		return true;
	}


	
	
}
