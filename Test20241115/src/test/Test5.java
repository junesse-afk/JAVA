package test;

public class Test5 {

	public static void main(String[] args) {
		// sum(여러명의 점수를 전달받아서 저장하는 배열 변수) 함수 정의
		// for 배열 변수 안에 저장된 점수의 합 구하기
		// 점수의 합 리턴값 (리턴할 형 정수형)
		
		int arr2[] = {10, 20, 30, 40};
		System.out.println(sum(arr2));
		
		//배열 변수 선언 = 5개 점수 초기값 저장
		//sum(배열변수 전달) 함수 호출 -> 리턴 배열 점수의 합 출력

		//sum2(여러명의 몸무게를 전달받아서 저장하는 float배열 변수) 함수 정의
		// for 배열 변수 안에 저장된 몸무게의 평균 구하기
		// 몸무게 평균 리턴값 (리턴할형 floast(형)
		
		//배열 변수 선언 = 7개, float 초기값 저장
		// sum(배열 변수 전달 ) 함수 호출 -> 리턴 받은 배열 몸무게 평균 출력
		
		float arr[] = {87.6f, 58.4f, 64.2f, 43.2f, 98f, 55.1f, 77f};
		System.out.println(sum2(arr));
	}
	
	public static int sum(int arr2[]) {
		int a = 0;
		
		for (int i = 0; i<arr2.length; i++) {
			a += arr2[i];
		}
		return a;
	}

	public static float sum2(float arr[]) {
		float b = 0;
		
		for (int i = 0; i<arr.length; i++) {
			b += arr[i];
		}
		return b/arr.length;
	}
}
