package test;

import test.A.B;
import test.A.C;

public class Test1 {

	public static void main(String[] args) {
		//내부클래스, 중첩클래스, 중첩인터페이스
		//멤버클래스(인스턴스 멤버클래스, 정적 멤버클래스)
		//로컬클래스(메서드 실행할 때 동작하는 클래스)
		
		//A클래스 객채생성
		A a = new A();
		
		
		//B클래스 객체생성, 멤버변수 field1 = 3, method1() 호출
		A.B b = a.new B();
		b.field1=3;
		System.out.println(b.field1);
		b.method1();

		A.C c = new A.C();
		c.field1 = 3;
		A.C.field2 = 3;
		c.method1();
		A.C.method2();
		
		a.method();
	}

}
