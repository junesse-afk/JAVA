package test;

public class Test4 {

	public static void main(String[] args) {
		// sum(정수형 두수를 저장하는 변수, 변수) 함수 정의
		// 두수의 합 구하기
		// 리턴할 값이 두수의 합

		System.out.println(sum(10, 20));
		
		// evenSum(정수형 수를 저장하는 변수) 함수 정의
		// 1~ 전달받은 정수 반복 => 짝수의 합 구하기
		// 리턴할 값 짝수의 합(리턴할 형 정수형)
		
		System.out.println(evenSum(9));
		
	}

	public static int sum(int a, int b) {
		
		int result = a + b;
		return result;
		
	}
	
	public static int evenSum(int c) {
		
		int result = 0;
		
		for (int i = 0; i < c; i++) {
			if (i%2==0) {
				result += i;
			}
		} return result;
		
		
	}
}
