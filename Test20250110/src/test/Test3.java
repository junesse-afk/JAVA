package test;

public class Test3 {

	public static void main(String[] args) {
		// 함수형 인터페이스 정의 MyFunction2
		// 추상메서드 int calc(int x)
		
		// f1 람다함수 {x*x}구현 -> 호출 -> 출력
		
		MyFunction2 f2 = (x) -> {return x*x;};
		System.out.println("f2 결과 " + f2.calc(10));
		
		// 함수형 인터페이스 정의 MyFunction3
		// 추상메서드 void print()
		// f3 람다함수 {"Hello, JAVA"}구현 -> 호출 -> 출력
		
		MyFunction3 f3 = () -> {System.out.println("Hello, JAVA");};
		f3.print();
		
		}

}
