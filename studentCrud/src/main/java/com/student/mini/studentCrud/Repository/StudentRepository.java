package com.student.mini.studentCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mini.studentCrud.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
