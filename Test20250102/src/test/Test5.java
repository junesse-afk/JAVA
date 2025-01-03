package test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		//Student3 클래스 정의
		//멤버변수 int studentId, studentName,
		//멤버변수 List<subject> subjectList
		//prn() 메서드 출력
		
		Student3 student3 = new Student3();
		student3.studentId = 1;
		student3.studetName = "강감찬";
		student3.subjectList = new ArrayList<Subject>();
		student3.subjectList.add(new Subject(100, "국어"));
		student3.subjectList.add(new Subject(90, "수학"));
		student3.subjectList.add(new Subject(80, "영어"));
		

	}

}
