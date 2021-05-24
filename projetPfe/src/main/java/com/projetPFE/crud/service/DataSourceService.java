package com.projetPFE.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetPFE.crud.entity.DataSource;
import com.projetPFE.crud.model.DataSourceModel;
import com.projetPFE.crud.repository.DataSourceRepository;

@Service
public class DataSourceService {
	@Autowired
	DataSourceRepository dataSourceRepository;
	
public List<DataSourceModel> getAllDataSources(){
		
		try {
			List<DataSource> datasources = dataSourceRepository.findAll();
			List<DataSourceModel> customDataSources = new ArrayList<>();
			datasources.stream().forEach(e -> {
				DataSourceModel datasource = new DataSourceModel();
				BeanUtils.copyProperties(e, datasource);
				customDataSources.add(datasource);
			});
			return customDataSources;
		}catch(Exception e) {
			throw e;
		}
	}
	
	public String addData(DataSource dataSource) {
		try {
			if (!dataSourceRepository.existsBySchemaUrl(dataSource.getSchemaUrl())) {
				dataSourceRepository.save(dataSource);
				return "data added successfully";
			}else {
				return "This data already exists in the database.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String removeData(DataSource dataSource) {
		try {
			if (dataSourceRepository.existsBySchemaUrl(dataSource.getSchemaUrl())) {
				dataSourceRepository.save(dataSource);
				return "data deleted successfully.";
			} else {
				return "data does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public String updateData(DataSource dataSource) {
		try {
			if (dataSourceRepository.existsBySchemaUrl(dataSource.getSchemaUrl())) {
				dataSourceRepository.save(dataSource);
				return "data updated successfully.";
			} else {
				return "data does not exist.";
			}
		}catch (Exception e) {
			throw e;
		}
	}

}
