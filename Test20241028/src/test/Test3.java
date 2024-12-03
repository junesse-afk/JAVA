package test;

public class Test3 {

	public static void main(String[] args) {
		//연산 과정에서 자동형변환
		//연산을 수행할 때 데이터 타입을 일치 시킨 후 연산 수행(자동으로 형변환)
		
		//int 타입보다 작은 타입끼리 연산 // <작은타입> <int타입으로 자동변환> int <int타입보다 큰 타입으로 자동변환> <큰타입>
		// 연결할때 ,
		
		byte b1 = 10, b2 = 20, b3;
		System.out.println(b1+b2); //30 출력
		//b3 = b1+b2; //  int로 변환했기때문에 b1+b2 만들었을때 오류가 발생
		b3 = (byte)(b1+b2); // 연산 적용시 ()표기해야함
		System.out.println(b3);
		
		char c1 = 'A';
		System.out.println("A = "+(int)c1+3); // 문자열 + 숫자+ 연산은 어떻게 표현하냐 결과값 A = 68
		
		int i1 = 100;
		long l1 = 200L;
		
		System.out.println(i1+l1); //출력 형태는 long
		
		int i2 = (int)(i1+l1); // int형태로 변경
		System.out.println(i2);
		
		float f2 = 0.1f;
		double d2 = 0.1;
		
		System.out.println(f2+d2); // double이 큰데 더블에 집어넣으니 용량이 커서 오류가뜸

		System.out.println(f2+(float)d2);
		//byte b5 = 100+20;(리터럴 끼리 연산 -> 인트인트를 써도 형변환이 안이루어짐)
		
		byte b6 =(byte)(100+30);
		System.out.println(b6); // 오버플로우
		
		double d5 = 1.2;
		float f5 = 0.9f;
		int i5 = (int)d5+(int)f5;
		System.out.println(i5);
		
		int i6 = (int)(d5+f5);
		System.out.println(i6);
		
		int i7 = 5;
		int i8 = 2;
		System.out.println((double)i7/i8);
		
	}
		
}
