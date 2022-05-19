package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class studentsDao {
	@Autowired
	studentsRepositor sr;
	public String bas ( studentsEntity q1) {
		sr. save(q1);
		return "save";
	}public String bal (studentsEntity q2) {
		sr.save (q2);
		return "save";
	}public String bos(@PathVariable int id) {
		sr.deleteById(id);
		return "delet";

	}public List<studentsEntity> getAll() {
		return sr.findAll();
	
		
		}


}
