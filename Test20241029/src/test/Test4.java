package test;

public class Test4 {

	public static void main(String[] args) {
		// 논리연산자 &&(&)and(논리곱), ㅣㅣ(ㅣ)or(논리합), !not(부정)
		// 결과 true/false
		// 관계연산자 논리연산자 관계연산자
		// 두 피연산자(항) 간의 논리적으로 판별하는 연산자
		
		// &&(&)and (논리곱)
		// 두 피연산자가 모두 true일 경우
		// 하나라도 false이면 => false
		
		int a = 10;
		System.out.println(a > 5&&a < 100); //true
		System.out.println(a < 5&&a < 100); //false
		
		boolean z = true;
		boolean x = false;
		System.out.println(z && z); //true
		System.out.println(z && x); //false
		System.out.println(x && z); //false
		System.out.println(x && x); //false
		
		// ||(|) or (논리합) 하나라도 ture이면 => true
		
		System.out.println(z || z); //true
		System.out.println(z || x); //true
		System.out.println(x || z);	//true
		System.out.println(x || x); //false
		
		// !not(논리부정)
		// -> 단항연산자(피연산자가 하나뿐인 연산자)
		//!F -> T, !T -> F
		System.out.println(!z); //t
		System.out.println(!x); //f
		System.out.println(!z&&x); //f
		System.out.println(!z&&z); //f
		System.out.println(!x&&x); //f
	}

}
