package test;

public class Student2 {
	
	//Student2 객체 생성
	//멤버변수에 값을 저장
	//prn()메서드 호출
	
	int studentId;
	String studentName;
	Subject subject;
	
	public void prn() {
		System.out.println(studentId + " : " + studentName + " : ");
		subject.subjectPrn();
	}
	
	

}
