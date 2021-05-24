package com.projetPFE.crud.elasticController;

/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetPFE.crud.RepositoryElastic.StudentRepository;
import com.projetPFE.crud.model.Student;

@RestController*/
public class StudentController {
	/*@Autowired
	StudentRepository repo;
	
	
	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student s) {
		return repo.save(s);
	}
	
	@GetMapping("/student/all")
	public List<Student> getallStudents(){
		Iterator<Student> iterator = repo.findAll().iterator();
		List<Student> students = new ArrayList<Student>();
		while(iterator.hasNext()) {
			students.add(iterator.next());
			
		}
		return students;
	}
	
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id){
		return repo.findById(id);
	}
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable Integer id , @RequestBody Student ss) {
		Optional<Student> std = repo.findById(id);
		if(std.isPresent()) {
			Student s = std.get();
			s.setName(ss.getName());
			return repo.save(s);
			
		}else 
			return null;
		
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable Integer id ) {
		repo.deleteById(id);
		return "document deleted";
		}
	
	*/
	
	
}
