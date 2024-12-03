package test;

public class Test1 {

	public static void main(String[] args) {
		// fun1(정수형 값을 전달 받아서 저장하는 변수) 함수정의
		// 받은 수가 양수, 음수, 0 => result 결과 리턴(문자열)
		
		System.out.println(fun1(5));
		
		//fun2(정수형 값을 전달 받아서 저장하는 변수) 함수정의
		// y= 3*x +5
		// 3*전달 받은 값 + 5 => y 결과 리턴(정수형)
		// fun2(값) 호출 => 리턴받으면 출력
		
		System.out.println(fun2(5));
	}
		
		
	public static String fun1(int i) {
		String result = "영";
		
		if (i > 0) {
			result = "양수";
			return result;
		} else if ( i < 0) {
			result = "음수";
			return result;
		}
		return result;
	} 
	
	public static int fun2(int x) {
	
		int y = 3 * x + 5;
		
		return y;
	
	}
	
	

}
