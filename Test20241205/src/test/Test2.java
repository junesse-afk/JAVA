package test;

public class Test2 {

	public static void main(String[] args) {
		//부모클래스 Person
		//부모의 기본생성자 없이 이름을 받는 생성자
		// => 메시지 출력 "부모의 이름을 받는 생성자"
		
		//자식클래스 Student
		//기본은 부모의 기본생성자 호출
		//기본 생성자가 없으면 부모의 특정 생성자를 호출 super()=> 자식의 기본생성자
		//부모의 특정 생성자 호출, 메세지 출력 "Student 자식 기본생성자"
		
		Student stu = new Student();
		System.out.println("--------------------");
		stu.personPrn();
		stu.studentPrn();
		
		System.out.println("--------------------");
		Person per = new Student();

	}

}
