package test;

public class Test4 {

	public static void main(String[] args) {
		//인터페이스 Calc 정의
		//추상메서드 정의 int add(int num1, int num2)
		//추상메서드 정의 int sub(int num1, int num2)
		//추상메서드 정의 int mul(int num1, int num2)
		//추상메서드 정의 int div(int num1, int num2)
		
		//상속받은 클래스 Calculator
		
		Calc cc = new Calculator();
		System.out.println(cc.add(1, 2));
		System.out.println(cc.sub(3, 4));
		System.out.println(cc.mul(5, 6));
		System.out.println(cc.div(7, 8));
		
		Calc2 calc2 = new Calculator();
		calc2.prn();
	}

}
