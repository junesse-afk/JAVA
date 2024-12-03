package Student;

import java.util.ArrayList;

public class StudentDAO {

	
	public void  insertStudent(ArrayList<Student> student) {
		
		
		for (Student stu : student) {
			System.out.println("번호 : " + stu.getNum());
			System.out.println("이름 : " + stu.getName());
			
			System.out.println(stu.getSubject().getName());
			System.out.println(stu.getSubject().getScore());
		}
		
	}
}
