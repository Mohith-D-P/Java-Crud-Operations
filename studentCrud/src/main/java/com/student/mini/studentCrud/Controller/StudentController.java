package com.student.mini.studentCrud.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.mini.studentCrud.Entity.Student;
import com.student.mini.studentCrud.Services.StudentServices;

@RequestMapping("/stud")
@RestController
public class StudentController {
	StudentServices ss;

	public StudentController(StudentServices ss) {
		super();
		this.ss = ss;
	}
	@PostMapping
	public String addStudent(@RequestBody Student s)
	{
		String	msg=ss.addStudent(s);
		return msg;
	}
	@GetMapping(value="{kodid}")
	public Student getStudent(@PathVariable("kodid")String  kodid)
	{
		Student s=ss.getStudent(kodid);
		return s;
	}
	@GetMapping
	public List<Student>getAllStudents() {
		return ss.getAllStudents();
	}

	@PutMapping(value="{kodid}")
	public String updateStudent(@RequestBody Student s)
	{
		String	msg=ss.updateStudent(s);
		return msg;
	}
	@DeleteMapping(value="{kodid}")
	public String deleteStudent(@PathVariable("kodid")String  kodid)
	{
		String msg=ss.deleteStudent(kodid);
		return msg;
	}

}
