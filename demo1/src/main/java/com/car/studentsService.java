package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class studentsService {
	@Autowired
	studentsDao sd;
	public String bas ( studentsEntity q1) {
		return sd.bas(q1);
	}public String bal (studentsEntity q2) {
		return sd.bal(q2);
	}public String bos(@PathVariable int id) {
		return sd.bos(id);
	}public List<studentsEntity> getAll() {
		return sd.getAll();
		
		}


}
