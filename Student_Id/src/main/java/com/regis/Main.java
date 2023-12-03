package com.regis;

import com.regis.model.Student;
import com.regis.service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        StudentService studentService = new StudentService();
        String result;

        //Creating Student 1
        Student student = new Student();
        student.setId("24044");
        student.setName("NDAHIRO Ngoga Regis");
        student.setFaculty("IT");
        result = studentService.createStudent(student);
        System.out.println(result);

        //Creating Student 2
        Student student1 = new Student();
        student1.setId("23032");
        student1.setName("GIHOZO ines");
        student1.setFaculty("Education");
        result = studentService.createStudent(student1);
        System.out.println(result);

        //Creating Student 3
        Student student2 = new Student();
        student2.setId("23432");
        student2.setName("GIRAMATA T");
        student2.setFaculty("Education");
        result = studentService.createStudent(student2);
        System.out.println(result);

        //Creating Student 4
        Student student3 = new Student();
        student3.setId("23444");
        student3.setName("GIRAMATA JDD");
        student3.setFaculty("Business");
        result = studentService.createStudent(student3);
        System.out.println(result);

        //Creating Student 5
        Student student4 = new Student();
        student4.setId("20000");
        student4.setName("Test");
        student4.setFaculty("Test1");
        result = studentService.createStudent(student4);
        System.out.println(result);

        //get all students
        printStudents();

        //delete student
        result= studentService.deleteStudent("23432");
        System.out.println(result);
        printStudents();

        // Update student
        Student studentToUpdate = new Student();
        studentToUpdate.setId("24044");
        studentToUpdate.setName("NDAHIRO N Regis");
        studentToUpdate.setFaculty("Information Technology");
        result = studentService.updateStudent(studentToUpdate);
        System.out.println(result);
        printStudents();

        // Find student by ID
        String studentIdToFind = "23032";
        Student foundStudent = studentService.findStudentById(studentIdToFind);
        if (foundStudent != null) {
            System.out.println("Found Student by ID: " + foundStudent.getName());
        } else {
            System.out.println("No student found with ID: " + studentIdToFind);
        }
    }
    public static void printStudents(){
        StudentService studentService =new StudentService();
        List<Student> students = studentService.getAllStudents();
        if (!students.isEmpty()) {
            System.out.println("Student List\n" + "------------");
            for (Student stud : students) {
                System.out.printf("%s\t%s\t%s%n", stud.getId(), stud.getName(), stud.getFaculty());
            }
            System.out.println();
        }
    }
}