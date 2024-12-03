package test;

import java.util.ArrayList;

import Student.Student;
import Student.StudentDAO;


public class Test7 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setNum(1);
		stu.setName("홍길동");
		
		Student stu1 = new Student();
		stu1.setNum(2);
		stu1.setName("이순신");
		
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(stu);
		student.add(stu1);
		
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(student);

	}

}
