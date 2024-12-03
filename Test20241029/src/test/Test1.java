package test;

public class Test1 {

	public static void main(String[] args) {
		//자바 연산자
		//연산자 : 연산에 사용하는 기호 +-/*%
		//항 : 연산에 사용하는 값 3+4 숫자1개당 1항?! 그래서 이건 2항 연산자라는데
		//단항연산자 1+1 ?
		//이항연산자 22+22 ?
		//삼항연산자 33+33 ?
		//연산자 우선순위 : 1. ()괄호가 우선순위 제일 높음 > 2. 산술연산자 +-*/% > 3. 대입연산자 = > 4. 비교연산자 == != > >= < <= 5. 논리연산자 && ㅣㅣ !(이건 모름)(!=참을 거짓으로 거짓을 참으로)
		//------------------------------------------------------------------------------------------------------------
		//산술연산자
		int a = 100+50;
		int b = 100/50;
		int c = 100*50;
		int d = 100%50;
		int e = 100-50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(a+50);
		System.out.println(b+e);
		
		int h = a+b+c+d;
		System.out.println(h);
		
		int f = 5;
		++f;
		System.out.println(f);
		
		int g = 100;
		--g;
		System.out.println(g);
		//-----------------------------------------------------------------------------------------------------------
		//exam
		int math = 90;
		int eng = 70;
		int kor = 80;
		int total = math+eng+kor;
		float evg = total/3.0f;
		
		System.out.println("총점 "+(math+eng+kor)+" total");
		System.out.println("평균 "+(float)(math+eng+kor)/3+" avg");
		System.out.println(total);
		System.out.println(evg);
		
		//-----------------------------------------------------------------------------------------------------------
		//대입연산자
		
		
	}

}
