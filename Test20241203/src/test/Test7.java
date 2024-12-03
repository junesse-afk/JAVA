package test;

import java.util.ArrayList;

import Student.Student;
import Student.StudentDAO;
import Student.Subject;


public class Test7 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setNum(1);
		stu.setName("홍길동");
		
		Subject sub = new Subject();
		sub.setName("국어점수");
		sub.setScore(100);
		stu.setSubject(sub);
		
		Student stu1 = new Student();
		stu1.setNum(2);
		stu1.setName("이순신");
		
		Subject sub2 = new Subject();
		sub2.setName("영어점수");
		sub2.setScore(90);
		stu1.setSubject(sub2);
	
			
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(stu);
		student.add(stu1);
		
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(student);

	}

}
