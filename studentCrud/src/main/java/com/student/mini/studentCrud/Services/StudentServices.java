package com.student.mini.studentCrud.Services;

import java.util.List;

import com.student.mini.studentCrud.Entity.Student;

public interface StudentServices {
	String addStudent(Student s);
	Student getStudent(String kodid);
	List<Student>getAllStudents();
	String updateStudent(Student s);
	String deleteStudent(String kodid);
}
