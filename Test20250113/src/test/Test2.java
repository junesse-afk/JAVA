package test;

public class Test2 {

	public static void main(String[] args) {
		//Myfunction5<T> 함수형인터페이스
		//T형 하나의 수를 받아서 리턴없음 println(T x) 추상메서드 정의
		
		//람다함수 <String> f1 = x -> 출력
		//람다함수 호출
		//람다함수 <Integer> f2 = x -> 출력
		//람다함수 호출
		
		Myfunction5 <String> f1 = (x) -> {System.out.println(x);};
		f1.println("헬로우");
		
		Myfunction5 <Integer> f2 = (x) -> {System.out.println(x);};
		f2.println(100);
	}

}
