package com.student.mini.studentCrud.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.mini.studentCrud.Entity.Student;
import com.student.mini.studentCrud.Repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentServices {
	StudentRepository srepo;

	public StudentServiceImplementation(StudentRepository srepo) {
		super();
		this.srepo = srepo;
	}
	@Override
	public String addStudent(Student s) {
		srepo.save(s);
		return "Student Added successfully!";
	}
	@Override
	public Student getStudent(String kodid) {
		Student st=srepo.findById(kodid).get();
		return st;
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> slist=srepo.findAll();
		return slist;
	}
	@Override
	public String updateStudent(Student s) {
		srepo.save(s);
		return "Student Updated successfully!";
	}
	@Override
	public String deleteStudent(String kodid) {
		srepo.deleteById(kodid);
		return "Student Deleted Successfully";
	}
}
