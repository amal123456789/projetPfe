package com.projetPFE.crud.elasticController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetPFE.crud.RepositoryElastic.DataSourceRepoElastic;
import com.projetPFE.crud.model.DataSourceModel;
@RestController
@RequestMapping("apidatasource")

@CrossOrigin(origins = "*")
public class DatasourceControllerElastic {

	
	@Autowired
	DataSourceRepoElastic repo;
	
	
	@GetMapping("/allhitsource")
	public List<DataSourceModel> getDataSourceModels(){
		 Iterator<DataSourceModel> iterator= repo.findAll().iterator();
		 List<DataSourceModel> students=new ArrayList<DataSourceModel>();
		 while(iterator.hasNext()){
			 students.add(iterator.next());
		 }
		 return students;
	}
	
	
	@PostMapping("/ajouterdtsource")
	public String addDataSourceModel(@RequestBody DataSourceModel user) {
		try {
			if (!repo.existsById(user.getIdSourceSequence())) {
				repo.save(user);
				return "Employee added successfully";
			}else {
				return "This employee already exists in the database.";
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	

	
	@GetMapping("/getdtsource/{id}")
	public Optional<DataSourceModel> getDataSourceModel(@PathVariable Integer id){
		return repo.findById(id);
	}
	
	
	@PutMapping("/updatedsource/{id}")
	   public DataSourceModel updateDataSourceModel(@PathVariable Integer id,@RequestBody DataSourceModel student){
		   Optional<DataSourceModel> std= repo.findById(id);
		   if(std.isPresent()){
			   DataSourceModel s=std.get();
			   s.setSystemCode(student.getSystemCode());
		   return repo.save(s);
		   }
		   else
			   return null;
	   }
	
	@DeleteMapping("/deletedsource/{id}")
	   public String deleteDataSourceModel(@PathVariable Integer id){
		  repo.deleteById(id);
		  return "Document Deleted";
	   }

	

	
	
	
	
}
