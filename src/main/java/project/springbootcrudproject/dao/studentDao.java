package project.springbootcrudproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.springbootcrudproject.entity.student;

public interface studentDao extends JpaRepository<student,Integer> {
 
}
