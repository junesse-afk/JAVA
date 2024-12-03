package test;

public class Test1 {

	public static void main(String[] args) {
		//정수 score 변수 선언(0~100)
		//1) 조건 : 점수가 60점 이상이고 100점 이하이면 "합격" 출력
		//2) 아니면 0점 이상이고 59점 이하이면 "불합격" 출력
		//3) 1, 2qjs 조건이 모두 아니면 "점수 입력 오류" 출력
		
		int score = 77;
		if (score>60&&score<=100) {
			System.out.println("합격");
		} else if (score<60&&score>=0){
			System.out.println("불합격");
		} else if (score<0||score>100)
			System.out.println("점수 입력 오류");
		System.out.println();
	
		
		// char형 ch변수 정의, 초기값
		// 'A' ~ 'Z' => "대문자" 출력
		// 'a' ~ 'z' => "소문자" 출력
		// '0' ~ '9' => "숫자" 출력
		// 아니면 => "기타문자" 출력
	
		char ch = 'A';
		if(ch>='A'&&ch<='Z') {
			System.out.println("대문자");
		} else if (ch>='a'&&ch<='z') {
			System.out.println("소문자");
		} else if (ch>=0&&ch<=9) {
			System.out.println("숫자");
		} else if (ch<'A'||ch>'z') {
			System.out.println("기타문자");
		}System.out.println();
		
		
		//
		int num = 5;
		System.out.println(num);
		//"양수", "음수", "영"
		
		
		
		
	}
}
