package test;

public class Test3 {

	public static void main(String[] args) {
		// 조건연산자(삼항연산자)
		// 항의 개수가 3개 필요
		// 조건? 결과값1 : 결과값2
		// 조건 = true 결과값1 노출 /false 결과값2 노출
		// 조건 : 관계연산자 논리연산자 관계연산자 (관계연산자 한개만 사용해도됨) => true/false
		// 결과값1 : 조건의 결과 true이면 선택할 값
		// 결과값2 : 조언의 결과 false이면 선택할 값
		// 조건에 따라 둘 중 하나의 결과를 선택
		
		int age = 35;
		//나이가 20보다 크거나 같으면 true, 아니면(20보다 작으면) false
		boolean b = age>=20 ? true : false;
		System.out.println(b);
		System.out.println();
		
		//나이가 20보다 크거나 같으면 "성인", 아니면(20보다 작으면) "미성년자"
		String c = age>=20 ? "성인" : "미성년자";
		System.out.println(c);
		System.out.println();
		
		int num = -8;
		System.out.println(num>=0 ? "양수" : "음수");
	    
		String d = num>=0 ? "양수" : "음수";
	    System.out.println(d);
	    System.out.println();
	    
	    int num2 = 101;
	    //조건 : num2 0보다 크거나 같으면 , num2가 100보다 작거나 같으면
	    // 두개 동시에 만족한다면
		/* int num3 = 80; */
	    /*System.out.println(num2 >=num3 ? "0~100 입력함" : "0~100 범위 넘어감");
*/	   
	    String z = num2 >= 0 && num2 <= 100 ? "0~100 입력함" : "0~100 범위 넘어감";
	    
	    System.out.println(z);
	    
	    //성별 구분 1,3남 / 2,4여
	    int num4 = 5;
	    String x = num4 ==1||num4==3 ? "남자": "여자";
	    System.out.println(x);
	    
	    //연산자 우선순위
	    // 1. ()괄호 우선 순위 가장 높음
	    // 2. 단항연산자 이항연산자(산술, 관계, 논리), 삼항연산자
	    // 3. 대입연산자 우선순위 가장 낮음
	    
	    // 우선순위가 동일하면 왼쪽 -> 오른쪽으로 계산됨
	    // 1. ()괄호, []배열, .참조연산자
	    // 2. 단항연산자 +, -, ++, --, !<-not 왼쪽<-오른쪽
	    // 3. 산술연산자 %, /, *
	    // 4. 산술연산자 +, -
	    // 5. 비트 <<, >>
	    // 6. 관계연산자 <, <=, >, >=
	    // 7. 관계연산자 ==, !=
	    // 8. 비트곱 &
	    // 9. 비트차 ^
	    // 10. 비트합 |<-or
	    // 11. 논리곱 &&
	    // 12. 논리합 ||
	    // 13. 조건(삼항)연산자 조건 ? 참 : 거짓
	    // 14. 대입연산자 왼쪽 <- 오른쪽
	    
	}
}
