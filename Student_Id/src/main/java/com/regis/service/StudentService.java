package com.regis.service;

import com.regis.dao.StudentDao;
import com.regis.model.Student;
import com.regis.repository.StudentRepository;

import java.util.List;

public class StudentService implements StudentRepository {
    StudentDao dao=new StudentDao();
    @Override
    public String createStudent(Student student) {
        return dao.createStudent(student);
    }

    @Override
    public String deleteStudent(String id) {
        return dao.deleteStudent(id);
    }

    @Override
    public String updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public Student findStudentById(String id) {
        return dao.findStudentById(id);
    }
}
