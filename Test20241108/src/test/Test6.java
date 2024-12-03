package test;

public class Test6 {
	public static void main(String[] args) {
		//int형 jum 배열변수 선언
		//초기값 85, 95, 100, 80, 75
		//배열변수 안에 있는 점수의 합 구해서 마지막 출력
		int jum[] = {85, 95, 100, 80, 75};
		int sum = 0;
		for (int i = 0; i < jum.length; i++){
			sum += jum[i];
		}
		System.out.println("학생 점수의 합 : " + sum);
		System.out.println("학생 점수의 평균 : " + (float)sum/jum.length);
		//향상된 for문
		sum = 0;
		for(int j : jum) {
			System.out.println(j);
			sum += j;
		}
		System.out.println("학생 점수의 합 : " + sum);
		System.out.println("학생 점수의 평균 : " + (float)sum/jum.length);
	}
}
