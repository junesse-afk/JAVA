package test;

public class Test2 {

	public static void main(String[] args) {
		// 기본자료형 -> 형 변환, 타입변환
		// 형 변환 => 자바의 기본 데이터 타입을 변환
		// boolean 타입을 제외한 기본 데이터 타입 간의 변환
		// 정수와 실수 연산(ex 3+3.14)? 그냥 되는데?!
		
		//1. 묵시적으로 형변환(자동으로 형변환)
		//작은 데이터 타입 -> 큰 데이터 타입으로 변환
		//float long 이런건가보네
		
		int a = 10;
		double b = a;
		System.out.println(b);
		
		byte a1 =10;
		short a2 = 123;
		a2=a1; // 큰형을 먼저 앞에 나둬야 작은게 따라 저장됨 그러나 명시적으로 형변환하면 사용가능
		System.out.println(a2);
		
		//2. 명시적으로 형변환(강제적으로 형변환)
		
		double b1 = 3.7;
		int b2 = (int)b1;
		System.out.println((int)b1);
		System.out.println(b2);
		
		byte c1 =10;
		short c2 =256;
		c1=(byte)c2; // 0으로 표기되는건 넘쳐나기 때문에 근데 당연히 넘치는데 굳이 이렇게 해야되나?
		System.out.println(c2);
		
		short c3 =(byte)c1;
		System.out.println(c3);
		
		/////////////////////////////////////////////////////////////////////////
		// 형이 맞지 않아 자동으로 형변환이 불가능한데 강제적으로 바꿈
		byte d1 = 100;
		char d2 =(char)d1;
		System.out.println(d2);
		
		short e1 = 256;
		char e2 =(char)e1;
		System.out.println(e2);
		
		int f1 = d2;
		System.out.println(f1);
		
		d2 = (char)d2;
		System.out.println(d2);
	
		// double -> float 실수형을 굳이 바꿀필요가 있나 오류가 생기는데
	}

}
