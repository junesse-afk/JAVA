package test;

public class Test3 {

	public static void main(String[] args) {
		// 반복문 for / while / do~while
		// 반복문 : 조건이 true이면 반복하고 조건이 false이면 반복문이 빠져 나옴
		// for문 : 처음과 마지막을 알고 있으면 선택
		// while문 : 반복 횟수가 정해져 있지 않은 반복문
		// 예시) 밥을 10번 드세요 => 횟수가 정해짐 => for
		// 예시) 밥을 그릇이 빌때까지 드세요 => 횟수가 정해지지 않음 => while
		// 반복문 구성요소 => 카운트 변수 정의 초기값, 조건문, 실행문, 증가값

		/*
		 * for(카운트 변수 정의 초기값; 조건문; 증가값;) { 실행문; }
		 */
		int i = 1;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();

		int a = 1;
		for (a = 1; a <= 5; a++) {
			System.out.println(a + " : Hello, World!");
		}
		System.out.println();

		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println();

		for (i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();

		for (i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("------------------");

		int min = 1;
		int max = 9;

		for (i = min; i <= max; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");

		int dan = 2;
		for (i = min; i <= max; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		System.out.println("------------------");

		int sum = 0;
		for (i = 1; i <= 5; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
