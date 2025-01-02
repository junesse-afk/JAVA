package test;

public class Test1 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.color = "BLACK"; //인스턴스 멤버변수
		Calculator.pi = 5.42; //스태틱 멤버변수
		cal.prn();
		
		System.out.println(Calculator.plus(1, 2));
		System.out.println(Calculator.minus(2, 1));
		

	}

}
