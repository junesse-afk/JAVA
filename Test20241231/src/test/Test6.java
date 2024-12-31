package test;

public class Test6 {

	public static void main(String[] args) {
		//메서드 오버로딩 : 하나의 클래스에 메서드 이름을 동일하게 여러개 만듬
		//               => 매개 변수 개수 틀림, 형 틀림 => 다른 메서드로 인식
		//Cal 클래스
		
		//plus(int x, int y)메서드 리턴 두수 합을 리턴
		//plus(double x, double y)메서드 리턴 두수 합을 리턴
		//divide(int x, int y)메서드 리턴 두수 나눈 값을 리턴
		
		Cal cal = new Cal();
		
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.plus(20.5, 30.3));
		System.out.println(cal.divide(100, 50));
		System.out.println(cal.divide(30.7, 15.3));
	}

}
