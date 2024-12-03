package test;

public class Test2 {
//한줄 삭제 단축키는 ctrl+d
	public static void main(String[] args) {
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(20 / 10);
		System.out.println(10 * 20);
		System.out.println();
		
//변수: 기억 장소에 이름을 부여하고 형을 지정하고 값을 저장
//변수를 정의 int a (선언)하고 값을 저장 10; (할당)
//int는 소수점 자리가 없는 정수에만 사용
//String은 문자에만 사용
// =은 오른쪽에 값이나 식을 계산해서 결과값을 왼쪽에 있는 기억장소 변수에 저장
// 변수 선언후 기억장소를 다른값을 사용하고 싶다 예시(int 또는 String 없이 a=100; name="HELLO";)
		int a = 10;
		int b = 20;
		
		String name = "ITWILL : ";
		String bame = "BSACADEMY";
		
		System.out.println(name+a+b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(bame+111);
		System.out.println("b="+20);
		
		a=100;
		b=200;
		
		System.out.println(name+(a+b));
		
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(name+bame+a);
		System.out.println(name+bame+(a-b));
		System.out.println(name+b);
		
		int J = 12;
		System.out.println("바구니에 저장된 사과 "+ J +"개 입니다");
		
		String K = "바구니에 저장된 사과는 ";
		String L = "개 입니다";
		
		System.out.println(K+J+a+L);
		
		System.out.println(name+(a+b));
	}

}
