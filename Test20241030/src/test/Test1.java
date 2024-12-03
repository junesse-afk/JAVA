package test;

public class Test1 {

	public static void main(String[] args) {
		//관계(비교) 연산자
		//1. 나이를 age 변수 정의, 초기값 저장
		//관계식 => 나이가 20세 이상 T
		
		int age=35;
		System.out.println(age >= 20);
		System.out.println(age < 20);
		
		//2. 정수형 변수 num정의, 초기값 저장
		//관계식 => 양수이면 T/F
		
		int num=-15;
		System.out.println(num < 0);
		System.out.println(num >= 0);
		System.out.println();
		
		//논리연산자
		//1. 정수형 변수 num2 정의, 초기값 저장
		//관계연산자 논리연산자 관계연산자
		//num2가 4보다 큰 경우 num2가 7보다 작은 경우
		//두 경우를 모두 만족하면
		
		
		int num2=5;
		System.out.println(num2 < 4&&num2 < 7);
		System.out.println(num2 > 4&&num2 < 7);
		System.out.println();
		
		//2. 정수형 변수 num3 정의, 초기값 저장
		//관계연산자 논리연산자 관계연산자
		//num3이 4보다 작거나 같은 경우, num3이 7보다 크거나 같은 경우
		//두 경우 중 하나의 경우가 만족하면
		
		int num3=2;
		System.out.println(num3 <= 4||num3 >= 7);
		System.out.println(!(num3 >= 4||num3 <= 7));
		System.out.println();
		
		//3. char 변수 ch 정의, 초기값 저장
		//관계식 논리연산자 관계식
		//대문자 A(65) ~ Z(90)이면 true 아니면 false
		
		char ch='A';
		System.out.println(ch >= 65&&ch <= 90);
		System.out.println(ch >= 'A'&&ch <= 'Z');
		System.out.println();
		//4. 성별 정수형 변수 gender 정의 => 1, 2, 3, 4 중에 초기값 저장
		//1, 3남 2, 4여
		//1, 3 중에 하나라도 있으면 남, true
		//2, 4 중에 하나라도 있으면 여, false
		
		int gender=1;
		System.out.println(gender == 1||gender == 3);
		System.out.println(gender == 2||gender == 4);
		System.out.println();
		
	}

}
