package project.springbootcrudproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.springbootcrudproject.entity.student;
import project.springbootcrudproject.service.studentService;

@RestController

public class studentController {
	@Autowired
	public studentService studentservice;

	@PostMapping("/add")
	public String addStudent(@RequestBody student student) {
		return studentservice.addStudent(student);
	}

	@PostMapping("/bulkAdd")
	public String addStudents(@RequestBody List<student> student) {
		return studentservice.addStudents(student);
	}

	@DeleteMapping("/delete/{roll}")
	public String deleteStudent(@PathVariable int roll) {
		return studentservice.deleteStudent(roll);
	}

	@PutMapping("/update")
	public String updateStudent(@RequestBody student student) {
		return studentservice.updateStudents(student);
	}

	@RequestMapping("/get/{roll}")
	public student getStudent(@PathVariable int roll) {
		return studentservice.getStudent(roll);
	}

}