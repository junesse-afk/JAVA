package test;

import p1.Person;
import p2.Student;

public class Test5 {

	public static void main(String[] args) {
		//Person 클래스 정의
		//멤버변수 privateVar packageVar protectedVar publicVar
		
		Person prs = new Person();
		//prs.privateVar = "private변수"; //같은 클래스 아니라서 에러
		//prs.packageVar = "package변수"; //같은 폴더가 아니라서 에러
		//prs.protectedVar = "protected변수"; // 다른 폴더 또는 상속관계가 아니라서 에러
		prs.publicVar = "public변수"; //모두 접근 가능함
		System.out.println(prs.publicVar);
		prs.personPrn();
		System.out.println("-------------------");
		
		Student stu = new Student();
		//stu.privateVar = "private변수";
		//stu.packageVar = "package변수";
		//stu.protectedVar = "protected변수";
		stu.publicVar ="부모 public변수"; //다른 폴더 모두 접근
		stu.publicVar2 ="자식 public변수"; //다른 폴더 모두 접근
		stu.personPrn();
		stu.personPrn2();
		
		System.out.println("-------------------");
		
		stu.publicVar ="부모A";
		stu.setPrivateVar("부모B");
		stu.setPackageVar("부모C");
		stu.personPrn();

	}

}
