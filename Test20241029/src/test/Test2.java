package test;

public class Test2 {

	public static void main(String[] args) {
		//대입(할당)연산자 ( = ) (확장대입연산자 +=, -=, *=, /=, %= )
		// 좌변 변수에 대입(저장, 할당) = 우변에 데이터(변수, 리터럴, 계산식)
		// 연산 방향 우 -> 좌로 진행
		// x=y=3 -> y변수에 3을 대입하고, x변수에 y변수를 대입
		// 3 -> y -> x 우측에서 좌로 연산
	
		int x;
		int y;
		x=y=3;
		System.out.println(x);
		System.out.println(y);
	
		//대입연산자와 산술연산자 조합한 연산자
		//좌변, 우변의 데이터까지 산술연산을 먼저 수행 -> 결과를 좌변 변수에 대입
		//자동 형변환 일어나지 않음
		
		int b = 10;
		b += 5;
		System.out.println(b);
		
		b  = 20;
		b -= 10;
		System.out.println(b);
		
		b = 10;
		b *= 10;
		System.out.println(b);
		
		b = 100;
		b /= 10;
		System.out.println(b);
		
		b = 100;
		b %= 10;
		System.out.println(b);
		//---------------------------------------------------------
		//byte형 변수 b1, b2 선언하고 10, 20 초기값을 저장
		//b1, b2 더하기 계산하면 (정수형으로 형변환 필요) b1변수에 저장(대입)
		//+= 확장대입연산자 이용해서 연산
		byte b1 = 10;
		byte b2 = 20;
		b1 = (byte)(b1+b2);
		System.out.println(b1);
		b1 += b2;
		System.out.println(b1);
		////////////////////////////////////////////////////////////
		//char형 변수 ch선언하고 초기값 'A'대입
		//ch변수에 3을 더하고 결과 ch변수에 저장
		char ch ='A';
		System.out.println(ch+3);
		ch += 3;
		System.out.println(ch);
		////////////////////////////////////////////////////////////
		
	}

}
