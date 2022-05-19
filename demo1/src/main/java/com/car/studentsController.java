package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class studentsController {
	@Autowired
	studentsService ss;
	@PutMapping(value="/save")
	public String bas (@RequestBody studentsEntity q1) {
		return ss.bas(q1);
	}

	@PostMapping(value="/creat")
	public String bal (@RequestBody studentsEntity q2) {
		return ss.bal(q2);
	}
	@DeleteMapping(value="delet/{id}")
	public String bos(@PathVariable int id) {
		return ss.bos(id);
	}
	@GetMapping(value="/getall")
	public List<studentsEntity> getAll() {
	return ss.getAll();
	
	}
}

