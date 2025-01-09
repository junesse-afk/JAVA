package test;

public class A {
	//기본생성자
	public A() {
		System.out.println("A 생성자");
	}
	//인스턴스 클래스 B
	class B{
		
		//멤버변수 int field1, static int field2,
		int field1;
		static int field2;
		
		//=> B생성자
		public B() {
			System.out.println("B 생성자");
		}
		
		//=> 메서드 method1,
		public void method1() {
			System.out.println("B클래스 method1");
		}
		//=>static 메서드 method2
		public static void method2() {
			System.out.println("B클래스 method2");
		}
	}
	//인스턴스 클래스 C
	static class C{
		//멤버변수 int field1, static int field2,
		int field1;
		static int field2;
		
		//=> C생성자
		public C() {
			System.out.println("C 생성자");
		}
		
		//=> 메서드 method1,
		public void method1() {
			System.out.println("C클래스 method1");
		}
		//=>static 메서드 method2
		public static void method2() {
			System.out.println("C클래스 method2");
		}
	}
	
	//리턴값없음 method 메서드 (클래스D)
	public void method() {
		//D클래스
		class D{
		//=>int field1, static int field2
			int field1;
			//static int field2;
		
		//=> D생성자
			public D() {
				System.out.println("D 생성자");
			}
		
		//=> 메서드 method1,
			public void method1() {
				System.out.println("D클래스 method1");
			}
		//=>static 메서드 method2
//			public static void method2() {
//				System.out.println("D클래스 method2");
//			}
		}//D클래스끝
		
		D d = new D();
		d.field1=3;
		d.method1();

	}//method클래스끝
	
}//A클래스끝


