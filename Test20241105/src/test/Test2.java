package test;

public class Test2 {

	public static void main(String[] args) {
		// 조건문 switch ~ case 문
		// if 유사, if(조건) =>
		// switch 구문에 조건 포함
		// if 달리 조건식 정수값, 문자열 결과값 비교
		// 순위 1이면 "java"
		// 순위 2이면 "C"
		// 순위 3이면 "html"
		// 나머지 "순위없음"

		int rank = 1;

		if (rank == 1) {
			System.out.println("java");
		} else if (rank == 2) {
			System.out.println("C");
		} else if (rank == 3) {
			System.out.println("html");
		} else {
			System.out.println("순위없음");
		}
		System.out.println();
		// 위와 같이 같냐 같냐가 많을때 스위치 쓰는게 좋음
		// 구문마다 break; 쓰셈, 아무것도 해당안될때 default

		// switch (변수 또는 계산식) {
		// case 값 : 실행문; break;
		// default : 실행문; }

		switch (rank) {
		case 1:
			System.out.println("java");
			break;
		case 2:
			System.out.println("C");
			break;
		case 3:
			System.out.println("html");
			break;
		default:
			System.out.println("순위없음");
		}
		System.out.println();

		int num = 5;
		switch (num) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("요일 아님");
		}
		System.out.println();

		char ch = 'K';
		switch (ch) {
		case 'K':
			System.out.println("KOREA");
			break;
		case 'U':
			System.out.println("USA");
			break;
		case 'C':
			System.out.println("CANADA");
			break;
		default:
			System.out.println("생략가능");
		}
		System.out.println();

		String medal = "Bronze";
		switch (medal) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은메달");
			break;
		case "Bronze":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달없음");
		}
		System.out.println(); // ctrl + shfit + f => 이쁘게 정렬인가봄

		int jumsu = 85;

		switch (jumsu / 10) {
		case 10:
			System.out.println("A");
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}System.out.println();
		
	}
}
