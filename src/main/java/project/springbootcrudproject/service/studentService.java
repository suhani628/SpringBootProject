package project.springbootcrudproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.springbootcrudproject.dao.studentDao;
import project.springbootcrudproject.entity.student;
@Service
public class studentService {
	@Autowired
	public studentDao dao;
 public String addStudent(student student) {
	 dao.save(student);
       return "new student has been added , roll no:"+student.getRollno();
 }
 public String addStudents(List<student> students) {
	 dao.saveAll(students);
       return "new student has been added";
 }
 
 public String deleteStudent(int roll){ 
	student student=dao.getReferenceById(roll);
	 dao.delete(student);
       return " student has been deleted";
 }
 public String updateStudents(student student) {
	 dao.save(student);
       return "student has been updated";
 }

public student getStudent(int roll){ 
	        return dao.findById(roll).get();
 }
 
  
 
 }
