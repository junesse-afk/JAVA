package test;

public class Test5 {

	public static void main(String[] args) {
		//부모클래스 Person
		//메서드 personPrn() "사람이 먹는다" 출력 / 리턴없음
		
		//자식클래스 Student 부모클래스 Person상속
		//메서드 studentPrn() "학생이 공부한다"
		
		Person per = new Person();
		per.personPrn();
		
		Student stu = new Student();
		stu.personPrn();
		stu.studentPrn();

	}

}
