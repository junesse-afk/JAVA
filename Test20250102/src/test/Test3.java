package test;

public class Test3 {

	public static void main(String[] args) {
		// Student 클래스 정의
		// 멤버변수 int studentID, studentName, koreaScore, mathScore
		
		// prn() 메서드 출력 studentID : studentName koreaScore, mathScore
		// Student 객체 생성
		// 멤버변수 값 저장
		// prn() 메서드 호출
		
		Student stu = new Student();
		
		stu.studentID = 123;
		stu.studentName = "홍길동";
		stu.koreaScore = 88;
		stu.mathScore = 74;
		stu.koreaSubject = "국어";
		stu.mathSubject = "수학";
		
		stu.prn();

	}

}
