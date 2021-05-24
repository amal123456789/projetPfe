package com.projetPFE.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetPFE.crud.entity.DataDestination;
import com.projetPFE.crud.model.DataDestinationModel;
import com.projetPFE.crud.repository.DataDestinationRepository;


@Service
public class DataDestinationService {
	
	@Autowired
	DataDestinationRepository datadestrepo;
	
public List<DataDestinationModel> getAllDataDestinations(){
		
		try {
			List<DataDestination> datadestinations = datadestrepo.findAll();
			List<DataDestinationModel> customDataDestinations = new ArrayList<>();
			datadestinations.stream().forEach(e -> {
				DataDestinationModel datadestination = new DataDestinationModel();
				BeanUtils.copyProperties(e, datadestination);
				customDataDestinations.add(datadestination);
			});
			return customDataDestinations;
		}catch(Exception e) {
			throw e;
		}
	}
	
	public String addData(DataDestination datadetination) {
		try {
			if (!datadestrepo.existsByipAdressDestination(datadetination.getIpAdressDestination())) {
				datadestrepo.save(datadetination);
				return "data added successfully";
			}else {
				return "This data already exists in the database.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String removeData(DataDestination datadetination) {
		try {
			if (datadestrepo.existsByipAdressDestination(datadetination.getIpAdressDestination())) {
				datadestrepo.delete(datadetination);
				return "data deleted successfully.";
			} else {
				return "data does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String updateData(DataDestination datadetination) {
		try {
			if (datadestrepo.existsById(datadetination.getIdDestination())) {
				datadestrepo.save(datadetination);
				return "data updated successfully.";
			} else {
				return "data does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}

}
