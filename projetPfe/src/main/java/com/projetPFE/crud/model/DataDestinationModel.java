package com.projetPFE.crud.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class DataDestinationModel {
	
	private int id_Destination;
	private String ipAdressDestination;
	private String portDestination;
	private String descritpionDestination;
	private String numUserDestination;
	private String passwordDestination;
	
	
	@ManyToOne
	  @JoinColumn(name="datasourcemodel")
	  private DataSourceModel datasource;


	public DataDestinationModel() {
		
	}


	public DataDestinationModel(int id_Destination, String ipAdressDestination, String portDestination,
			String descritpionDestination, String numUserDestination, String passwordDestination,
			DataSourceModel datasource) {
		super();
		this.id_Destination = id_Destination;
		this.ipAdressDestination = ipAdressDestination;
		this.portDestination = portDestination;
		this.descritpionDestination = descritpionDestination;
		this.numUserDestination = numUserDestination;
		this.passwordDestination = passwordDestination;
		this.datasource = datasource;
	}


	public int getId_Destination() {
		return id_Destination;
	}


	public void setId_Destination(int id_Destination) {
		this.id_Destination = id_Destination;
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
		return "DataDestinationModel [id_Destination=" + id_Destination + ", ipAdressDestination=" + ipAdressDestination
				+ ", portDestination=" + portDestination + ", descritpionDestination=" + descritpionDestination
				+ ", numUserDestination=" + numUserDestination + ", passwordDestination=" + passwordDestination
				+ ", datasource=" + datasource + "]";
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
		if (id_Destination != other.id_Destination)
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
