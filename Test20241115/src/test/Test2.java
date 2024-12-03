package test;

public class Test2 {

	public static void main(String[] args) {
		// 절대값 구하는 함수 abs(전달받은 값이 정수형 변수 정의) 정의
		// 절대값 구해서 리턴(리턴할형 정수형)
		System.out.println(abs(-10));
		
		// 합을 구하는 함수 total(전달받은 값이 정수형 변수) 정의
		// for 1부터 전달받은 값 합을 구해서 리턴(리턴할형 정수형)
		System.out.println(total(10));
	}
	
	public static int abs(int x) {
		int result = x;
		
		if(x < 0) {
			result = -x;
		}
		return result;
	}

	public static int total(int y) {
		
		int result = 0;
		
		for (int i=1; i<=y; i++) {
			result += i;
		}
		return result;
	}
	
}
