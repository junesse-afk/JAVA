package test;

public class Test2 {

	public static void main(String[] args) {
		// if else if else
		//num이 0보다 작으면 음수, 아니면 num 0보다 크면, "양수", 나머지는 "영"
		int num = 0;
		
		if (num < 0) {
			System.out.println(num+" : 음수");
		}
		else if(num > 0){
				System.out.println(num+" : 양수");
			}
		else {
			System.out.println(num+" : 영");
		}
		System.out.println();
		//////////////////////////////////////////////////////////
		//놀이공원 입장료
		//취학 전 아동 (8세 미만) 입장료 1,000원
		//초등학생 (14세 미만) 2,000원
		//중고등학생 (20세 미만) 2,500원
		//19세 이벤트 가격 2,000원
		//성인 (20세 이상) 3,000원
		
		int num2 = 18;
		
		if (num2 < 8) {
			System.out.println("입장료 1,000원");
		} else if (num2 < 14 || num2 < 19) {
			System.out.println("입장료 2,000원");
		} else if (num2 < 20) {
			System.out.println("입장료 2,500원");
		} else {
			System.out.println("입장료 3,000원");
		}
		System.out.println();
		/////////////////////////////////////////////////////////
		//정수형 변수 score 선언 초기값 점수 저장 (0~100)
		// -> 학점 100~90 A, 89~80 B, 79~70 C, 69~60 D, 나머지 F
		
		int num3 = 50;
		if (num3 <= 100 && num3 >= 90) {
			System.out.println("A학점");
		} else if (num3 < 90 && num3 >=80) {
			System.out.println("B학점");
		} else if (num3 < 80 && num3 >=70) {
			System.out.println("C학점");
		} else if (num3 < 70 && num3 >=69) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
