package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Student;

public interface StudentService {
	
	public boolean addStudent(Student student);
	public Student getStudent(int rollno);
	public List<Student>getAll();
	public Student updateStudent(Student student);
	public boolean deleteStudent(int rollno);

}
