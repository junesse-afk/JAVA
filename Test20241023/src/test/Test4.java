package test;

public class Test4 {

	public static void main(String[] args) {
		//3. 문자형 : 글자 한자 저장 - 컴퓨터 내부 정수형으로 저장
		//			char(2byte) 글자한자 표시
		//			컴퓨터 내용 0,1 조합 A를 표현 -> 컴퓨터에는 65으로 저장
		//			왜 65냐? 아스키(ASCII)코드 문자 인코팅 : 문자를 정해진 코드 값으로 변환, 영문자 숫자 특수문자를 나타내는 문자세트
		//			아스키코드 1byte(256개)? 대문자, 소문자, 특수문자, 기호
		//			한글, 다른 언어 문자 복잡 -> 2byte
		
		char ch1 ='A';
		System.out.println(ch1);
		//'A' 정해진 코드값 변환 -> int 형으로 변환
		System.out.println((int)ch1);
		
		char ch2 ='a';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 =66;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//////////////////////////////
		
		char ch5 = 'Z';
		System.out.println(ch5);
		System.out.println((int)ch5);
		
		char ch6 = 38;
		System.out.println(ch6);
		System.out.println((int)ch6);
		
		int ch7 = 97;
		System.out.println(ch7);
		System.out.println((char)ch7);
		
		////////////////////////////////
		//여러개 문자를 저장 = 문자열(String) -> 참조형
		
		String str = "A";
		str="AAA";
		System.out.println(str);
		
		//rhem
		
		char ch8 = '\uD55C';
		System.out.println(ch8);
		System.out.println((int)ch8);
		
		int ch9 = 54620;
		System.out.println(ch9);
		System.out.println((char)ch9);
		
		int a = 65;
		int b = -65;
		char a2 = 65;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a2);
		
	}

}
