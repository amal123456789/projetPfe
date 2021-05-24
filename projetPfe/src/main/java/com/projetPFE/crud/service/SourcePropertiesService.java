package com.projetPFE.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetPFE.crud.entity.SourceProperties;
import com.projetPFE.crud.model.SourcePropertiesModel;
import com.projetPFE.crud.repository.SourcePropertiesRepository;

@Service
public class SourcePropertiesService {
	
	
	@Autowired
	SourcePropertiesRepository sourcePropertiesrepository;

	
public List<SourcePropertiesModel> getAllSourcePropertiess(){
		
		try {
			List<SourceProperties> sourcePropertiess = sourcePropertiesrepository.findAll();
			List<SourcePropertiesModel> customSourcePropertiess = new ArrayList<>();
			sourcePropertiess.stream().forEach(e -> {
				SourcePropertiesModel sourceProperties = new SourcePropertiesModel();
				BeanUtils.copyProperties(e, sourceProperties);
				customSourcePropertiess.add(sourceProperties);
			});
			return customSourcePropertiess;
		}catch(Exception e) {
			throw e;
		}
	}
	
	public String addSourceProperties(SourceProperties sourceProperties) {
		try {
			if (!sourcePropertiesrepository.existsByValue(sourceProperties.getValue())) {
				sourcePropertiesrepository.save(sourceProperties);
				return "SourceProperties added successfully";
			}else {
				return "This SourceProperties already exists in the database.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String removeSourceProperties(SourceProperties sourceProperties) {
		try {
			if (sourcePropertiesrepository.existsByValue(sourceProperties.getValue())) {
				sourcePropertiesrepository.delete(sourceProperties);
				return "SourceProperties deleted successfully.";
			} else {
				return "SourceProperties does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String updateSourceProperties(SourceProperties sourceProperties) {
		try {
			if (sourcePropertiesrepository.existsById(sourceProperties.getIdSourceprop())) {
				sourcePropertiesrepository.save(sourceProperties);
				return "SourceProperties updated successfully.";
			} else {
				return "SourceProperties does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
}
