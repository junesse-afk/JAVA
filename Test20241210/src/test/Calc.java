package test;

public interface Calc{
	//인터페이스에서 선언한 변수는 컴파일 과정에서
	//상수로 변환
	
	public static final int a = 10;
	//public int a = 10; 위에꺼랑 똑같음 인터페이스에서는
	//public static final 생략되어있음
		
	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int mul(int num1, int num2);
	public int div(int num1, int num2);
	
}
