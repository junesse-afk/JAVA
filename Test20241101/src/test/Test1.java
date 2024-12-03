package test;

public class Test1 {

	public static void main(String[] args) {
//		제어문
//		1. 조건문(if, switch case)
//		2. 반복문(for, while, do while)
		
//		조건문 if : 조건에 따라 문장(명령)을 선택
		
		int a = 10;
		
		if(a>=10) {
			System.out.println("10살 이상이면 학교에 다닙니다.");
		}
		else {
			System.out.println("10살 이하면 학교에 안다닙니다.");
		}
		System.out.println();
		//-----------------------------------------------
		char gender = 'M';
		
		if(gender == 'F') {
			System.out.println("F이면 여자입니다");
		} else {
			System.out.println("F가 아니면 남자입니다");
		}
		System.out.println();
		//------------------------------------------
		char gendera = 'F';
		String s ="";
		System.out.println(s);
		if (gendera == 'F') {
			System.out.println("성별"+gendera);
			System.out.println("여성입니다");
			s="여성";
		} else {
			System.out.println("성별"+gendera);
			System.out.println("남성입니다");
			s="남성";
		}
		System.out.println();
		//------------------------------------------
		int num =7;
//		홀수 : 수에 2로 나누어서 나머지가 1이면 -> 홀수 출력
//		짝수 : 수에 2로 나누어서 나머지가 0이면 -> 짝수 출력
		
		if (num % 2 == 1) {
			System.out.println(num+": 홀수입니다");
		} else {
//			num%2==0
			System.out.println(num+": 짝수입니다");}
//		3의 배수 : 수에 3으로 나누어서 나머지가 0이면 => 3의 배수
		if (num % 3 == 0) {
			System.out.println(num+": 3의 배수");
		} else {
			System.out.println(num+": 3의 배수 아님");
		}System.out.println();
		
		//-------------------------------------------
		//양수, 음수 아님(양수, 영) 출력 => 절대값(부호없애기)구하기
		if (num>=0) {
			System.out.println(num+": 양수입니다.");
		} 
		else {
			System.out.println(num+": 음수입니다.");
		}System.out.println(-num);
		System.out.println();
		
		//두 수를 비교해서 => 최대값 구하기
		int z = 30;
		int x = 20;
		int max = 0;
		
		if (z>x) {
			System.out.println("x보다 z가 크다");
			max = z;
		} else {
			System.out.println("x보다 z가 작다");
			max = x;
		}
		System.out.println("최대값 : "+ max);
		System.out.println();
		
		//정수형 num3 변수 선언, 초기값 저장
		//num3 변수 값이 4~7사이이면 4=<num3>=7 4~7사이수
		//아니면 => 4~7사이 수 아님
		
		int num3 = 5;
		
		if(num3>=4&&num3<=7) {
			System.out.println("4~7사이 수");
		} else {
			System.out.println("4~7사이 수 아님");
		}System.out.println();
		
		int age2 = 5;
		if(age2<5||age2>65) {
			System.out.println("무료입장");
		}else {
			System.out.println("입장료 1,000원");
		}System.out.println();
		
		//num4 변수 3의 배수이면서 5의 배수인 경우, "3의 배수 동시에 5의 배수" 아니면 "3의 배수 동시에 5의 배수 아님"
		//num4 변수 3의 배수이거나 5의 배수인 경우, "3의 배수 이거나 5의 배수" 아니면 " 3의 배수도 5의 배수도 아님"
		
		int num4 = 14;
		if(num4 % 3 ==0 && num4 % 5 ==0) {
			System.out.println("3의 배수 동시에 5의 배수");
		}else {
			System.out.println("3의 배수 동시에 5의 배수 아님");		
		}System.out.println();
		
		int num5 = 110;
		if(num5 % 3 ==0 || num5 % 5 ==0) {
			System.out.println("3의 배수이거나 5의 배수");
		} else{
			System.out.println("3의 배수도 5의 배수도 아님");
		}System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
}