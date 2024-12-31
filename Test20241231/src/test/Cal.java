package test;

public class Cal {
	
	//plus(int x, int y)메서드 리턴 두수 합을 리턴
	public int plus(int x, int y) {
		return x+y;
	}
	
	//plus(double x, double y)메서드 리턴 두수 합을 리턴
	public double plus(double x, double y) {
		return x+y;
	}
	
	//divide(int x, int y)메서드 리턴 두수 나눈 값을 리턴
	public int divide(int x, int y) {
		return x/y;
	}
	//divide(double x, double y)메서드 리턴 두수 나눈 값을 리턴
	public double divide(double x, double y) {
		return x/y;
	}
	
	//원의 면적 구하기
	
	public double areaCircle(double r) {
		System.out.println("Cal 객체의 areaCircle() 실행");
		return 3.14*r*r;
	}
}
