package test;

public class Test4 {

	public static void main(String[] args) {
		//Student2 클래스 정의
		//멤버변수 int studentId; String studentName;
		//멤버변수 Subject 형의 subject
		//prn() 메서드 출력
		
		Student2 student = new Student2();
		student.studentId = 456;
		student.studentName = "이순신";
		
		student.subject = new Subject(10, "하잉");
		student.subject.subjectName = "영어";
		student.subject.subjectScore= 100;
		
		student.prn();
		student.subject.subjectPrn();
		
	}

}
