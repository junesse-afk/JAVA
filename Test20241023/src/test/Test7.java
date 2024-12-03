package test;

public class Test7 {

	public static void main(String[] args) {
		// 리터럴(데이터 값) : 프로그램에서 사용하는 숫자값, 문자값, 논리값
		
		char ch = 'A';
		int num = 10;
		double d = 3.4;
		
		System.out.println(ch+num+d);
		////////////////////////////////////////
		// 상수 : 변하지 않는 수, 대문자?
		// 원면적: 반지름*반지름*3.14(3.14가 변하지 않기때문에 상수)
		int r = 10;
		r = 20;
		// 값을 변경할 수 없게
		final double PI=3.14; // final은 최종으로 값을 바꿀 수 없게 3.14가 더블형이기에 PI 변하지 않는 상수
		
		System.out.println(r*r*PI);
		
		r=30;
		System.out.println(r*r*PI);
		
		r=40;
		System.out.println(r*r*PI);
		
		r=50;
		System.out.println(r*r*PI);
		
		
		final String MY_AGE;
		final int Year;
		MY_AGE="나이";
		Year=2024 ;
		int l= 24;
		
		System.out.println(MY_AGE);
		System.out.println("Year"+"MY_AGE");
		System.out.println(Year+l+MY_AGE); //문자+숫자혼용해서 결과값을 나타내려면 어떻게?
		
	}

}
