package test;

public class Test3 {

	public static void main(String[] args) {
		// p375 Wrapper클래스
		// 기본자료형 => 클래스로 정의한 내장객체 java.lang
		// boolean => Boolean
		
		// byte => Byte
		// char => Character =>
		// short => Short
		// int => Integer =>
		// long => Long
		
		// float => Float
		// double => Double
		
		// 기본자료형
		int i = 100;
		// 참조형 java.lang.Integer 클래스 => 내장객체
		Integer integer = new Integer(100);
		System.out.println(integer.MIN_VALUE); //-2147483648
		System.out.println(integer.MAX_VALUE); //2147483647
		System.out.println("---------------------------1");
		
		//정수형 <= Integer 클래스 변경
		//int i2 = integer; //자동변경
		int i2 = integer.intValue(); //언박싱
		System.out.println(i2); //100
		System.out.println("---------------------------2");
		
		//integer => int 자동으로 변경
		//int sum = i + integer;
		int sum = i + integer.intValue(); // 언박싱(unboxing)
		System.out.println(sum);
		System.out.println("---------------------------3");
		
		//int => Integer
		//Integer integer2 = i; //자동으로 변경
		Integer integer2 = Integer.valueOf(i); // 오토박싱(autoboxing)
		System.out.println(integer2);
		System.out.println("---------------------------4");
		
		//숫자형태의 문자열을 => 정수형으로 변경 static으로 정의되어짐
		int num = integer.parseInt("200");
		System.out.println(num);
		
	

	}

}
